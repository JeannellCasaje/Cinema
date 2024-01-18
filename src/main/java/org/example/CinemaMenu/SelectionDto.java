package org.example.CinemaMenu;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectionDto {
    String[][] cinemaSeat = new String[26][10];
    int cancelFlag = 0;
    List<CinemaDto> reservedSeats = new ArrayList<>();


}
