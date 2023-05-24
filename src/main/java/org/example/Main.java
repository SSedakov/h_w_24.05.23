package org.example;

import org.example.day.WeatherTools;

public class Main {
    public static void main(String[] args) {
        System.out.println(WeatherTools.getWindDescription(20, true));
    }
}