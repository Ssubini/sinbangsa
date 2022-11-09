package com.sinbangsa.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdministratorThemeDetailDto {
    private String themeTitle;
    private String genre;
    private String content;
    private int leadtime;
    private String capacity;
    private String price;
    private String themeImg;
    private int difficaulty;
    private List<ThemeTimeDto> reservationtime;

}
