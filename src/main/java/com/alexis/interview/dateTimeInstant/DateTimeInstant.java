package com.alexis.interview.dateTimeInstant;

public class DateTimeInstant {

    // https://nurkiewicz.com/2016/08/guide-to-time-and-date-in-java.html
    // http://www.odi.ch/prog/design/datetime.php
    // https://devcom.w3schools.com/java/java_date.asp
    //
    // WE SHOULD ALWAYS USE THE JAVA.TIME LIBRARY FROM JAVA 8
    // this page make a clear review of what is an instant and what is a date
    // instant = universal (at least on earth) "Instant is geographically and culturally agnostic."
    // Date and time must be contextualized.
    // our language make us switch to one another all the time. Date/time and instant.
        // She born the 2 of Oct at 10am. (this is an instant)
        // I wake up every day at 7am, even when on vacation (this is a time)
                // if I go on vacation in HongKong i will wake up at 7am
                // I will wake up at 7am next monday (even though I am in HongKong)
        // I have a meeting the 5 of oct at 10am (paris time) (this is an instant)

    // Consider the following exemple:
        // we have a meeting tomorrow at 10am Paris time (need to consider it as an instant)
                // - our colleagues will connect from Paris, NYC and HongKong
                // ==> view from the space we will all be on our phone at the same instant
        // we want to switch off all lights of our sites (paris, nyc, hongKong) during the off hours (from 10pm to 6am)
                // - this will occur at different instants every days.
                // ==> view from the space the lights switch off at different instants.






}
