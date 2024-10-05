package com.example.myapp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DatabaseManager {
    private Database database;

    public Database getDatabase() {
        return database;
    }
    @Autowired
    public void setDatabase(@Qualifier("mySql") Database database) {
        this.database = database;
    }

    public String getDatabaseOpen() {
        return this.database.open();
    }
}
