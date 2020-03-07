package heima;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

//Data类相关用法
public class day2020_3_6_2 {
    public static void main(String[] args) throws ParseException {
        print();
    }

    public static void print() throws ParseException {
        Date date = new Date();
        System.out.println(getDateInfo(date));
        System.out.println(stringToDate("1234"));

    }

    public static String getDateInfo(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(date);
    }
    public static Date stringToDate(String date) throws ParseException {
        Date temp = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        temp = sdf.parse("2017年3月6日");

        return temp;
    }
}
