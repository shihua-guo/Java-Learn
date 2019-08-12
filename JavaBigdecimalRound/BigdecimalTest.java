package com.example.xlsdemo.utils;

import java.math.BigDecimal;

/**
 * @author shihu
 */
public class BigdecimalTest {
    public static double round(double d, int mode){
        BigDecimal bd = new BigDecimal(d).setScale(2, mode);
        final double v = bd.doubleValue();
        String str = "";
        switch (mode){
            case BigDecimal.ROUND_UP:
                str = "舍入远离零（ROUND_UP）";
                break;
            case BigDecimal.ROUND_DOWN:
                str = "舍入远离零（ROUND_DOWN）";
                break;
            case BigDecimal.ROUND_CEILING:
                str = "接近正无穷大（ROUND_CEILING）";
                break;
            case BigDecimal.ROUND_FLOOR:
                str = "接近负无穷大（ROUND_FLOOR）";
                break;
            case BigDecimal.ROUND_HALF_UP:
                str = "向“最接近的”数字舍入（ROUND_HALF_UP）";
                break;
            case BigDecimal.ROUND_HALF_DOWN:
                str = "向“最接近的”数字舍入（ROUND_HALF_DOWN）";
                break;
            case BigDecimal.ROUND_HALF_EVEN:
                str = "向“最接近的”数字舍入（ROUND_HALF_EVEN）";
                break;
            case BigDecimal.ROUND_UNNECESSARY:
                str = "不需要舍入（ROUND_UNNECESSARY）";
                break;

        }
        String printStr = "原始值[%s]，舍入后的值[%s]，值变化%s";

        System.out.println(String.format(printStr,d, v, d - v >=0 ?(d - v >0 ?"↓":"="):"↑"));
        return v;
    }
    /**
     * 精度保留2位
     */
    public static void main(String[] args){
        Double d = 12.12;
        Double d2 = 12.16;
        Double d3 = 12.122;
        Double d4 = 12.126;
        Double dd = -12.12;
        Double dd2 = -12.16;
        Double dd3 = -12.122;
        Double dd4 = -12.126;
        System.out.println("--------------------ROUND_UP 模式--------------------");
        round(d,BigDecimal.ROUND_UP);
        round(d2,BigDecimal.ROUND_UP);
        round(d3,BigDecimal.ROUND_UP);
        round(d4,BigDecimal.ROUND_UP);
        round(dd,BigDecimal.ROUND_UP);
        round(dd2,BigDecimal.ROUND_UP);
        round(dd3,BigDecimal.ROUND_UP);
        round(dd4,BigDecimal.ROUND_UP);
        System.out.println("--------------------ROUND_UP 模式--------------------\n");

        System.out.println("--------------------ROUND_DOWN 模式--------------------");
        round(d,BigDecimal.ROUND_DOWN);
        round(d2,BigDecimal.ROUND_DOWN);
        round(d3,BigDecimal.ROUND_DOWN);
        round(d4,BigDecimal.ROUND_DOWN);
        round(dd,BigDecimal.ROUND_DOWN);
        round(dd2,BigDecimal.ROUND_DOWN);
        round(dd3,BigDecimal.ROUND_DOWN);
        round(dd4,BigDecimal.ROUND_DOWN);
        System.out.println("--------------------ROUND_DOWN 模式--------------------\n");

        System.out.println("--------------------ROUND_CEILING 模式--------------------");
        round(d,BigDecimal.ROUND_CEILING);
        round(d2,BigDecimal.ROUND_CEILING);
        round(d3,BigDecimal.ROUND_CEILING);
        round(d4,BigDecimal.ROUND_CEILING);
        round(dd,BigDecimal.ROUND_CEILING);
        round(dd2,BigDecimal.ROUND_CEILING);
        round(dd3,BigDecimal.ROUND_CEILING);
        round(dd4,BigDecimal.ROUND_CEILING);
        System.out.println("--------------------ROUND_CEILING 模式--------------------\n");

        System.out.println("--------------------ROUND_FLOOR 模式--------------------");
        round(d,BigDecimal.ROUND_FLOOR);
        round(d2,BigDecimal.ROUND_FLOOR);
        round(d3,BigDecimal.ROUND_FLOOR);
        round(d4,BigDecimal.ROUND_FLOOR);
        round(dd,BigDecimal.ROUND_FLOOR);
        round(dd2,BigDecimal.ROUND_FLOOR);
        round(dd3,BigDecimal.ROUND_FLOOR);
        round(dd4,BigDecimal.ROUND_FLOOR);
        System.out.println("--------------------ROUND_FLOOR 模式--------------------\n");

        System.out.println("--------------------ROUND_HALF_UP 模式--------------------");
        round(d,BigDecimal.ROUND_HALF_UP);
        round(d2,BigDecimal.ROUND_HALF_UP);
        round(d3,BigDecimal.ROUND_HALF_UP);
        round(d4,BigDecimal.ROUND_HALF_UP);
        round(dd,BigDecimal.ROUND_HALF_UP);
        round(dd2,BigDecimal.ROUND_HALF_UP);
        round(dd3,BigDecimal.ROUND_HALF_UP);
        round(dd4,BigDecimal.ROUND_HALF_UP);
        System.out.println("--------------------ROUND_HALF_UP 模式--------------------\n");

        System.out.println("--------------------ROUND_HALF_DOWN 模式--------------------");
        round(d,BigDecimal.ROUND_HALF_DOWN);
        round(d2,BigDecimal.ROUND_HALF_DOWN);
        round(d3,BigDecimal.ROUND_HALF_DOWN);
        round(d4,BigDecimal.ROUND_HALF_DOWN);
        round(dd,BigDecimal.ROUND_HALF_DOWN);
        round(dd2,BigDecimal.ROUND_HALF_DOWN);
        round(dd3,BigDecimal.ROUND_HALF_DOWN);
        round(dd4,BigDecimal.ROUND_HALF_DOWN);
        System.out.println("--------------------ROUND_HALF_DOWN 模式--------------------\n");

        System.out.println("--------------------ROUND_HALF_EVEN 模式--------------------");
        round(d,BigDecimal.ROUND_HALF_EVEN);
        round(d2,BigDecimal.ROUND_HALF_EVEN);
        round(d3,BigDecimal.ROUND_HALF_EVEN);
        round(d4,BigDecimal.ROUND_HALF_EVEN);
        round(dd,BigDecimal.ROUND_HALF_EVEN);
        round(dd2,BigDecimal.ROUND_HALF_EVEN);
        round(dd3,BigDecimal.ROUND_HALF_EVEN);
        round(dd4,BigDecimal.ROUND_HALF_EVEN);
        System.out.println("--------------------ROUND_HALF_EVEN 模式--------------------\n");

//        System.out.println("--------------------ROUND_UNNECESSARY 模式--------------------");
//        round(d,BigDecimal.ROUND_UNNECESSARY);
//        round(d2,BigDecimal.ROUND_UNNECESSARY);
//        round(d3,BigDecimal.ROUND_UNNECESSARY);
//        round(d4,BigDecimal.ROUND_UNNECESSARY);
//        System.out.println("--------------------ROUND_UNNECESSARY 模式--------------------");
    }
}
