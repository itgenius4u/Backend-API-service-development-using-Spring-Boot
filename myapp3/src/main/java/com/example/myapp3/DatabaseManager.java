package com.example.myapp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseManager {
    private Database database;

    public Database getDatabase() {
        return database;
    }
    @Autowired
    public void setDatabase(Database database) {
        this.database = database;
    }
}
