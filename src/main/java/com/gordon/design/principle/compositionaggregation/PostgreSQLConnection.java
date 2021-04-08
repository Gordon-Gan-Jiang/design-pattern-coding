package com.gordon.design.principle.compositionaggregation;

/**
 * Created by gordon
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
