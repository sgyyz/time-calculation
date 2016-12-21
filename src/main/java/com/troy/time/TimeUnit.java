package com.troy.time;

import java.util.Calendar;

/**
 * Created by yongzhi.yang on 12/21/16.
 */
public enum TimeUnit {
    MINUTE(Calendar.MINUTE, 1),
    HOUR(Calendar.HOUR, 1),
    WEEK(Calendar.DATE, 7),
    MONTH(Calendar.MONTH, 1);

    private int dateType;
    private int scale;

    private TimeUnit(int dateType, int scale) {
        this.dateType = dateType;
        this.scale = scale;
    }

    public int getDateType() {
        return this.dateType;
    }

    public int getScale() {
        return this.scale;
    }
}
