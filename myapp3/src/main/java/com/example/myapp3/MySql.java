package com.example.myapp3;

import org.springframework.stereotype.Component;

@Component
public class MySql implements Database {
        @Override
        public String open() {
            return "MySql Open";
        }    
}
