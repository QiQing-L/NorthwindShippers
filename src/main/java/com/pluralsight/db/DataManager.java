package com.pluralsight.db;

import javax.sql.DataSource;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
