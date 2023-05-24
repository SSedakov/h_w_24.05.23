package org.example.day;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class WeatherToolsTest {

    @ParameterizedTest
    @CsvSource({
            "20,true,'Gusty Breeze with speed of 20.0 km'",
            "20,false,'Moderate Breeze with speed of 20.0 km'",
            "30,true,'Gusty Fresh Breeze with speed of 30.0 km'",
            "30,false,' Moderate Fresh Breeze with speed of 30.0 km'",
    })
    public void getWindDescription(double speed, boolean isGusty,String message){
        assertEquals(message,WeatherTools.getWindDescription(speed,isGusty));
    }

}
