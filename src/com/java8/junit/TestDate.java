package com.java8.junit;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    @Test
    public void test(){
        SimpleDateFormat format = new SimpleDateFormat("MMDDhhssmm");
        Date date = new Date();
        String new_date = format.format(date);
        System.out.println(new_date);
    }
}
