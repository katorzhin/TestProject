package com.springTest;

import org.springframework.stereotype.Component;

/**
 * @author Alex Katorzhin
 */
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Nocturne in E flat";
    }
}
