/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package old.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ching Vang
 */
public class Startup {
    public static void main(String[] args) throws ParseException {
        Demo1 demo1 = new Demo1();
        Date date = demo1.getCurrentDateTime();
        Calendar calendar = demo1.getCurrentCalendar();
        //Examples MM-dd-yyyy or MM-d-yy or MM-d-yy hh:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy hh:mm a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/d/yy hh:mm a X");
        System.out.println(sdf2.format(calendar.getTime()));
        System.out.println(sdf.format(date));
        
        //convert String to date
        String s = "10/20/2014 6:19 PM";
        Date date2 = sdf.parse(s);
        System.out.println("Parsed date: " + date2);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        System.out.println("Parsed Calendar: " + cal2.getTime());
        
        Calendar startDate = Calendar.getInstance();
        startDate.set(2014, Calendar.JANUARY, 1);
        startDate.roll(Calendar.YEAR, -2);
        Calendar endDate = Calendar.getInstance();
        endDate.set(2014, Calendar.JANUARY, 15);
        
        long startMsec = startDate.getTimeInMillis();
        long endMsec = endDate.getTimeInMillis();
        long diff = endMsec - startMsec;
        
        long days = diff/1000/60/60/24;
        System.out.println("Days between dates: " + days);
    }
}
