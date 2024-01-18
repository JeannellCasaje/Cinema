package org.example;

import org.example.CinemaMenu.SelectionDto;
import org.example.Utils.InitializeValues;

import java.io.IOException;

import static org.example.CinemaMenu.Selection.selectionMenu;

public class Main {
    public static void main(String[] args) throws IOException {
        SelectionDto selectionDto = new SelectionDto();
        InitializeValues.initializeCinemaSeats(selectionDto.getCinemaSeat());
        selectionMenu(selectionDto);
    }
}