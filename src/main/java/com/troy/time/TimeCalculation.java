package com.troy.time;

import java.util.Calendar;
import java.util.Date;

/**
 * Based on the time unit, calculate the time range from specific date
 * Created by yongzhi.yang on 12/21/16.
 */
public class TimeCalculation {
    public static DateRange calculate(TimeUnit unit, Integer rangeUnit) {
        return calculate(new Date(), unit, rangeUnit);
    }

    public static DateRange calculate(Date specificDate, TimeUnit unit, Integer rangeUnit) {
        DateRange dateRange = new DateRange();
        dateRange.setEnd(specificDate);

        // calculate the start time
        Calendar instance = Calendar.getInstance();
        instance.setTime(specificDate);

        instance.add(unit.getDateType(), -rangeUnit * unit.getScale());
        dateRange.setStart(instance.getTime());

        return dateRange;
    }
}
