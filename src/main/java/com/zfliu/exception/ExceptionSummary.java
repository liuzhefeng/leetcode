package com.zfliu.exception;

/**
 * Created by zfliu on 2021/3/5 15:32
 * Desc:
 */
public class ExceptionSummary {
    public static void main(String[] args) {
        //System.out.println(new ExceptionSummary().doExcept());
        new ExceptionSummary().doExcept();
    }

   /* public Integer doExcept() {
        try {
            return 1 / 0;
        } catch (Throwable e) {
            throw new RuntimeException();
        } finally {
            System.out.println(232332);
            return 2;
        }
    }*/

    public void doExcept() {
        try {
            int i = 1 / 0;
        } catch (Throwable e) {
            throw new RuntimeException();
        } finally {
            System.out.println(232332);
        }
    }
}
