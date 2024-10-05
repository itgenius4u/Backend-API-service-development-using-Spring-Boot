package com.example.myapp3;

import org.springframework.stereotype.Component;

@Component
public class DatabaseManager {
    private Database database;

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }


}
