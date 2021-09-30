package com.alexis.interview.dateTimeInstant;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DateTimeInstantTest {

    @Test
    public void should(){
        // GIVEN
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime return time of my computer: -->" + localDateTime);

        Instant now = Instant.now();
        System.out.println("Instant.now() nous retourn un instant universal (displayed in UTC)  -->" + now);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(
                now,
                ZoneId.of("Europe/Moscow")
        );
        System.out.println("zonedDateTime nous retourne la date zonée correspondant à notre instant -->" + zonedDateTime);

        ZonedDateTime moscow = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Moscow"));
        System.out.println("zonedDateTime nous retourne la date zonée correspondant à notre localDateTime LOCAL -->" + moscow);

        long timestamp = System.currentTimeMillis();
        System.out.println("system.currentTImeMilis renvoie " + timestamp + " ('Both java.time.Instant and java.sql.Timestamp classes represent a point on the timeline in UTC')");

    }

}