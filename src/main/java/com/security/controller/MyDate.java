package com.security.controller;

import java.util.Calendar;
import java.util.Date;

public class MyDate {

    private static final int EXPIRATION = 60 * 24;

    public Date calculateExpiryDate() {

        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(new Date().getTime());
        cal.add(Calendar.MINUTE, MyDate.EXPIRATION);

        return new Date(cal.getTime().getTime());
    }
}
