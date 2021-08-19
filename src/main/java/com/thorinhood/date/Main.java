package com.thorinhood.date;

import java.sql.Date;
import java.text.ParseException;
import java.time.Instant;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println(DateUtil.convert("10$10$2020+10:15:15"));
        System.out.println(DateUtil.convert(Date.from(Instant.now())));
    }

}
