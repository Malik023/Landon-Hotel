package edu.wgu.d387_sample_code.rest;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static String[] getConvertedTimes() {
        ZoneId etZone = ZoneId.of("America/New_York");
        ZoneId mtZone = ZoneId.of("America/Denver");
        ZoneId utcZone = ZoneId.of("UTC");

        ZonedDateTime now = ZonedDateTime.now();

        ZonedDateTime etTime = now.withZoneSameInstant(etZone);
        ZonedDateTime mtTime = now.withZoneSameInstant(mtZone);
        ZonedDateTime utcTime = now.withZoneSameInstant(utcZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy h:mm a");

        String etTimeString = "Come join us for an online live Presentation held on " + etTime.format(formatter) + " Eastern Time (ET)|";
        String mtTimeString = mtTime.format(formatter) + " Mountain Time (MT)|";
        String utcTimeString = utcTime.format(formatter) + " UTC";

        return new String[]{etTimeString, mtTimeString, utcTimeString};
    }
}
