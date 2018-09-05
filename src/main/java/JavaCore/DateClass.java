package JavaCore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * The java.time, java.util, java.sql and java.text packages contains classes for representing date and time.
 */
public class DateClass {

    public static void main(String[] args){
        //getCurrentDate();
        //severalDaysFromNowFunc1();
        //severalDaysFromNowFunc2();
        //System.out.println(getDate(1, "yyyy/MM/dd HH:mm:ss"));
        System.out.println(convertUTCtoDate(1536133151, "yyyy/MM/dd HH:mm:ss"));
    }

    /**
     * Get Current Date and Time
     */
    private static void getCurrentDate(){
        // 1
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        // 2
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        // 3
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        System.out.println(java.time.LocalDateTime.now());

        // 4
        System.out.println(java.time.Clock.systemUTC().instant());

        // 5
        java.util.Date date2=new java.util.Date();
        System.out.println(date2);

        long millis=System.currentTimeMillis();
        java.util.Date date3=new java.util.Date(millis);
        System.out.println(date3);

        // 6
        Date date4=java.util.Calendar.getInstance().getTime();
        System.out.println(date4);
    }

    /**
     *
     */
    private static void severalDaysFromNowFunc1(){
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tommorow date: "+tomorrow);
    }

    /**
     *
     */
    private static void severalDaysFromNowFunc2(){
        Calendar calendar = Calendar.getInstance();
        System.out.println("The current date is : " + calendar.getTime());
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + calendar.getTime());
    }

    /**
     * получение даты, отличающейся от текущей на interval
     */
    protected static String getDate(int interval, String datePattern){
        DateFormat dateFormat = new SimpleDateFormat(datePattern);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, interval);
        return dateFormat.format(cal.getTime());
    }

    /**
     * Функция, для конвертирования UTC даты в дату другого формата
     * @param date_utc передается в милисекундах
     * @param new_format нужный формат даты
     */
    protected static String convertUTCtoDate(long date_utc, String new_format) {
        Date date = new Date(date_utc*1000);
        DateFormat format = new SimpleDateFormat(new_format);
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        return format.format(date);
    }
}
