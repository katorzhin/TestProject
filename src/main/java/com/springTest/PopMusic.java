package com.springTest;

import org.springframework.stereotype.Component;


public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Thinking Out Loud";
    }
}
