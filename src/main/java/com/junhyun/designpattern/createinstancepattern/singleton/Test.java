package com.junhyun.designpattern.createinstancepattern.singleton;

public class Test {
    public static void main(String[] args) {
        ConnectionPool intance1 = ConnectionPool.getInstance();
        ConnectionPool intance2 = ConnectionPool.getInstance();

        //true
        System.out.println(intance1 == intance2);

    }
}
