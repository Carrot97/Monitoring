package com.cxy.monitor.constants;

public class NumberConstants {
    // 时间获取默认时间差（单位毫秒）10秒
    public static final Integer EVENTFLASHTIME2 = 1000 * 10 * 2;

    public static final Integer EVENTFLASHTIME1 = 1000 * 10 * 1;

    // 报警检查默认时间差 5分钟
    // 注意该常亮仅为展示用，无法绑定到定时任务
    public static final Integer ALERTFLASHTIME = 1000 * 60 * 5;

    // 报警获取默认时间差 一天
    public static final Integer ALERTINTERVAL = 1000 * 60 * 60 * 24;

    // 增速过快一级阈值
    public static final Integer GROWTHFIRSTTHRESHOLD = 50;

    // 增速过快二级阈值
    public static final Integer GROWTHSECONDTHRESHOLD = 100;

    // 增速过快一级阈值
    public static final Integer QUANTITYFIRSTTHRESHOLD = 40;

    // 增速过快二级阈值
    public static final Integer QUANTITYSECONDTHRESHOLD = 80;

    // 预测界面显示的数据量
    public static final Integer PREDICTNUMBER = 5;
}
