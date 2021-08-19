package com.thorinhood.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final String PATTERN = "dd$MM$yyyy+hh:mm:ss";
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat(PATTERN);

    public static String convert(Date date) {
        return FORMATTER.format(date);
    }

    public static Date convert(String str) throws ParseException {
        return FORMATTER.parse(str);
    }

}
