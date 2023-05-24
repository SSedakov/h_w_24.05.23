package org.example.day;

public class WeatherTools {
    /*
    public static String getWindDescription(double speed, boolean isGusty)
    Этот метод принимает скорость ветра и параметр сообщающий является ли ветер порывистым.
     Корреляция скорости ветра и описания:
<1 == Calm
1-5 == Light Air
6-11 == Light Breeze
12-19 == Gentle Breeze
20-28 == Moderate Breeze
29-38 == Fresh Breeze
     */
    public static String getWindDescription(double speed, boolean isGusty) {
        if (speed < 1) {
            //"Gusty Moderate Breeze with speed of 20 km"
            return (isGusty?"Gusty ":"Moderate ") + "Calm" ;
        }
        if (speed >= 1 && speed <= 5) {
            return (isGusty?"Gusty ":"Moderate ") + "Light Air " + " with speed of " + speed + " km" ;
        }
        if (speed >= 6 && speed <= 11) {
            return (isGusty?"Gusty ":"Moderate ") + "Light Breeze"  + " with speed of " + speed + " km";
        }
        if (speed >= 12 && speed <= 19) {
            return (isGusty?"Gusty ":"Moderate ") + "Gentle Breeze"  + " with speed of " + speed + " km";
        }
        if (speed >= 20 && speed <= 28) {
            return (isGusty?"Gusty ":"Moderate ") + "Breeze"  + " with speed of " + speed + " km";
        }
        if (speed >= 29 && speed <= 38) {
            return (isGusty?"Gusty ":" Moderate ") + "Fresh Breeze"  + " with speed of " + speed + " km";
        }
        return "No";
    }
}
