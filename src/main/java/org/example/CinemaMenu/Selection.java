package org.example.CinemaMenu;

import org.example.Utils.*;
import org.example.UsersMenu.Admin;
import org.example.UsersMenu.Buyer;
import org.example.UsersMenu.MainMenu;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.Utils.TimerCinema.timerBookings;


public class Selection {

    static MainMenu mainMenu = new MainMenu();
    static Admin admin = new Admin();
    static Buyer buyer = new Buyer();

    public static void selectionMenu(SelectionDto selectionDto) throws IOException {
        Scanner sc = new Scanner(System.in);
        switch(mainMenu.menu()){
            case 1:
                switch (admin.menu()){
                    case 1:
    //                        System.out.println("Booking expiration time in minutes : ");
    //                        TimerCinema timerCinema = new TimerCinema();
    //                        timerCinema.setDelay(sc.nextInt());
                        mainMenu.menu();
                    case 2:
                        System.out.println(selectionDto.getReservedSeats().toString());

                }

            case 2:
                switch (buyer.menu()){
                    case 1:
                        Arrays.stream(selectionDto.getCinemaSeat()).forEach(s -> System.out.println(Arrays.toString(s)));
                        buyer.menu();

                    case 2:
                        CinemaDto seatDetails = new CinemaDto();
                        System.out.println("To reserve a seat kindly enter show number<space>phone number<space>seat number (comma separated): " );
                        String bookingDetails = sc.nextLine();;
                        seatDetails.setSeat(bookingDetails.trim().split("\\s+")[2]);
                        seatDetails.setMobileNo(bookingDetails.trim().split("\\s+")[1]);
                        seatDetails.setShowNo(bookingDetails.trim().split("\\s+")[0]);
                        try {
                            for(CinemaDto cinemaDto : selectionDto.getReservedSeats()){
                                if(cinemaDto.getMobileNo().equals(seatDetails.getMobileNo()) && cinemaDto.getShowNo().equals(seatDetails.getShowNo())){
                                    System.out.println("Only one mobile number per show is only allowed to book.");
                                    exitPage(selectionDto);
                                }
                            }
                            for(String seatReserved : seatDetails.getSeat().split(",")) {

                                seatDetails.setSeatRow(seatReserved.substring(0, 1));
                                seatDetails.setSeatNo(seatReserved.substring(1, 2));
                                selectionDto.getCinemaSeat()[InitializeValues.mapLetterToNumber(seatDetails.getSeatRow())][Integer.parseInt(seatDetails.getSeatNo()) - 1] = "RESERVED";

                                String ticketNo = "JP#" + String.valueOf(Math.random()).substring(2, 7);
                                System.out.println("Booking Confirmed! " + ticketNo);
                                seatDetails.setTicketNo(ticketNo);
                                selectionDto.getReservedSeats().add(seatDetails);
                            }

                        }catch (Exception e) {
                            System.out.println("Seat Not Found!");
                        }finally {
                            timerBookings(selectionDto.getCancelFlag());
                           exitPage(selectionDto);
                        }
                    case 3:
                        if (selectionDto.getCancelFlag() == 1) {
                            System.out.println("Cancelation of Booking is not allowed anymore.");
                        } else {
                            System.out.println("Enter phone number and Seat Number to cancel");
                            String ticketTobeCancel = sc.nextLine();
                            selectionDto.getReservedSeats().removeIf(s->s.getTicketNo().equals(ticketTobeCancel));


                            Arrays.stream(selectionDto.getCinemaSeat()).forEach(s -> System.out.println(Arrays.toString(s)));
                        }
                            exitPage(selectionDto);

                        }

                }

        }


    public static void exitPage(SelectionDto selectionDto) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Go Back to Main Menu ? (Y/N)");
        String selection = sc.nextLine();
        if(selection.equals("Y")){
            selectionMenu(selectionDto);
        }
    }
}
