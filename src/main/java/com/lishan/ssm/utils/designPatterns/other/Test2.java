package com.lishan.ssm.utils.designPatterns.other;

import com.alibaba.fastjson.JSONObject;

import javax.json.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {

        Date date = new SimpleDateFormat("yyyy-MM").parse("2017-09-28 00:11:11");
        new SimpleDateFormat("yyyy-MM").format(date);
        //new SimpleDateFormat("yyyy-MM").format("2017-09-28 00:11:11");
        String dateStrPat = new SimpleDateFormat("yyyy-MM").toPattern();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy-MM");
        LocalDateTime dateTime = LocalDateTime.parse("2020-09-30 00:11:11", df);
        LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth()+1, 0, 0, 0, 0);
        LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth(), 23, 59, 59, 0);
//        LocalDateTime date = LocalDateTime.parse("2017-09", df2);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("date", "2020-01-01 11:11:11");
//        LocalDateTime date = (LocalDateTime)jsonObject.get("date");

//        LocalDateTime localDateTime =LocalDateTime.now();
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDateTime l = LocalDateTime.parse("2017-09-28", df);
//        System.out.println(LocalDateTime.parse("2000-01-03", DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        //String date = "2000-01-03 00:00:00";
        //Date dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
        //System.out.println(LocalDateTime.parse(dateStr.toString()));


    }
}
