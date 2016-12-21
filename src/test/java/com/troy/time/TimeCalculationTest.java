package com.troy.time;

import static org.junit.Assert.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by yongzhi.yang on 12/21/16.
 */
public class TimeCalculationTest {
    @Test
    public void testTimeCalculationByMins() {
        Calendar specificDate = Calendar.getInstance();
        specificDate.set(2016, 11, 21, 14, 00);

        DateRange dateRange = TimeCalculation.calculate(specificDate.getTime(), TimeUnit.MINUTE, 15);

        assertNotNull(dateRange);
        assertEquals("2016-12-21 13:45", format(dateRange.getStart()));
        assertEquals("2016-12-21 14:00", format(dateRange.getEnd()));
    }

    @Test
    public void testTimeCalculationByHours() {
        Calendar specificDate = Calendar.getInstance();
        specificDate.set(2016, 11, 21, 14, 00);

        DateRange dateRange = TimeCalculation.calculate(specificDate.getTime(), TimeUnit.HOUR, 1);

        assertNotNull(dateRange);
        assertEquals("2016-12-21 13:00", format(dateRange.getStart()));
        assertEquals("2016-12-21 14:00", format(dateRange.getEnd()));
    }

    @Test
    public void testTimeCalculationByWeek() {
        Calendar specificDate = Calendar.getInstance();
        specificDate.set(2016, 11, 21, 14, 00);

        DateRange dateRange = TimeCalculation.calculate(specificDate.getTime(), TimeUnit.WEEK, 1);

        assertNotNull(dateRange);
        assertEquals("2016-12-14 14:00", format(dateRange.getStart()));
        assertEquals("2016-12-21 14:00", format(dateRange.getEnd()));
    }

    @Test
    public void testTimeCalculationByMonth() {
        Calendar specificDate = Calendar.getInstance();
        specificDate.set(2016, 11, 21, 14, 00);

        DateRange dateRange = TimeCalculation.calculate(specificDate.getTime(), TimeUnit.MONTH, 1);

        assertNotNull(dateRange);
        assertEquals("2016-11-21 14:00", format(dateRange.getStart()));
        assertEquals("2016-12-21 14:00", format(dateRange.getEnd()));
    }


    private static String format(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(date);
    }
}
