package org.example.CinemaMenu;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Generated
public class CinemaDto {
    String showNo;
    String mobileNo;
    String seat;
    String seatRow;
    String seatNo;
    String ticketNo;

    @Override
    public String toString() {
        return "CinemaDto{" +
                "showNo='" + showNo + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", seat='" + seat + '\'' +
                ", ticketNo='" + ticketNo + '\'' +
                '}';
    }
}
