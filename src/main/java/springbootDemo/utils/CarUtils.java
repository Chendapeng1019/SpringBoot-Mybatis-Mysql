package springbootDemo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @ClassName CarUtils
 * @Description
 * @Author chendapeng
 * @Date 2019/7/5
 **/
public class CarUtils {
    public static String dateToString(){
        SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str =  sf.format(new Date());
        return str;
    }

    public static Integer getID(){
        Integer min = 100000;
        Integer max = 1000000;
        return new Random().nextInt((max-min)+1)+min;
    }
}
