package com.java.time.drafts;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Main {

    public static void main(String[] args) {
        OffsetDateTime odt = OffsetDateTime.now();

        ZoneId.getAvailableZoneIds().forEach(zonedId -> {
            ZoneOffset offset = odt.atZoneSameInstant(ZoneId.of(zonedId)).getOffset();

            if (odt.getOffset().equals(offset)) System.out.println(zonedId+" : "+offset);
        });
    }
}
