package me.codeboy.common.base.util;

/**
 * 日志工具
 *
 * @author Yuedong Li
 */
public class CBLogUtil {
    private static boolean ONOFF = false; //默认不打印

    /**
     * 打印日志
     *
     * @param info
     *         要打印 内容
     */
    public static void log(Object info) {
        if (ONOFF) {
            System.out.println("===> " + info);
        }
    }

    /**
     * 设置开关
     *
     * @param onOff
     *         日志开关
     */
    public static void setOnOff(boolean onOff) {
        ONOFF = onOff;
    }

    /**
     * 打印
     *
     * @param obj
     *         打印对象
     */
    public static void print(Object obj) {
        System.out.println(obj);
    }
}