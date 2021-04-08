package com.gordon.design.principle.compositionaggregation;

/**
 * Created by gordon
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
