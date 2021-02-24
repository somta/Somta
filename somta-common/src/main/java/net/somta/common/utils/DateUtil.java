package net.somta.common.utils;

import java.util.Calendar;
import net.somta.core.utils.CommonUtil;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {

    /**
     * 日期转换成字符串
     * @param date 日期
     * pattern 日期规则
     * @return str 日期字符串
     */
    public static String dateToStr(Date date,String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String str = format.format(date);
        return str;
    }

    /**
     * 字符串转换成日期
     * @param str 日期字符串
     * @param pattern 日期规则
     * @return date 日期
     */
    public static Date strToDate(String str,String pattern) {
        if(CommonUtil.isNullOrEmpty(str)){
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 判断时间否在指定时间之间
     * @param startHour 开始时间
     * @param endHour 结束时间
     * @return date 日期
     */
    public static boolean isBetweenByHour(Integer startHour,Integer endHour) {
        if(startHour == null || endHour == null){
            return false;
        }
        Calendar c = Calendar.getInstance();
        int currentHour = c.get(Calendar.HOUR);
        if(currentHour > startHour && currentHour < endHour){
            return true;
        }
        return false;
    }

}
