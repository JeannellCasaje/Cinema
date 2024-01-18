package org.example.CinemaMenu;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CinemaDtoTest {

    @Test
    public void showNoTest(){
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setShowNo("1");
        Assert.assertEquals("1", cinemaDto.getShowNo());
    }

    @Test
    public void seatTest(){
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setSeat("1");
        Assert.assertEquals("1", cinemaDto.getSeat());
    }

    @Test
    public void seatNoTest(){
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setSeatNo("1");
        Assert.assertEquals("1", cinemaDto.getSeatNo());
    }

    @Test
    public void mobileNoTest(){
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setMobileNo("1");
        Assert.assertEquals("1", cinemaDto.getMobileNo());
    }

    @Test
    public void ticketNo(){
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setTicketNo("1");
        Assert.assertEquals("1", cinemaDto.getTicketNo());
    }
}
