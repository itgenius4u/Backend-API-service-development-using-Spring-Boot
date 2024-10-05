package com.example.myapp3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Oracle implements Database{
    @Override
    public String open() {
        return "Oracle Open";
    }
}
