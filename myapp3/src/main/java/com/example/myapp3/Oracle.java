package com.example.myapp3;

import org.springframework.stereotype.Component;

@Component
public class Oracle implements Database{
    @Override
    public String open() {
        return "Oracle Open";
    }
}
