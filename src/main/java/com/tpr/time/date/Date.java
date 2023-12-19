package com.tpr.time.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Date {
    public static void main(String[] args) throws InterruptedException {
        // Example 1
        String dInStr = "2011-11-19";
        LocalDate d1 = LocalDate.parse("19-11-2011", DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println("String to LocalDate : " + d1);
        // Example 2
        String dInStr2 = "2015-11-20";
        LocalDate d2 = LocalDate.parse(dInStr2);
        System.out.println("String to LocalDate : " + d2);

        LocalDateTime datetime = LocalDateTime .now(ZoneId.of ( "America/New_York" ));

        System.out.println("EST time : " + datetime);

        Instant before = Instant.now();
        Thread.sleep(2000);
        Instant after = Instant.now();


        System.out.println("Duration : " + Duration.between(before, after).getSeconds());
        System.out.println("Duration : " + Duration.between(before, after).getNano());


        //CollectionUtils.isEmpty()
        //BeanUtils.cop()
        //Objects.nonNull()
        //objects.isNull()
        //Objects.requireNonNull (it throws exceptio if obect is null)
        //StringUtils is blank

    }
}
