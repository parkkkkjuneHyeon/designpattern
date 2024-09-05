package com.junhyun.designpattern.createinstancepattern.singleton;

public class ConnectionPool {
    private static ConnectionPool instance;

    private ConnectionPool() {}

    public static ConnectionPool getInstance() {
        if(instance == null)
            instance = new ConnectionPool();

        return instance;
    }
}
