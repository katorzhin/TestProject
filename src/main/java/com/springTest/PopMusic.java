package com.springTest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    List<String> popSongs = new ArrayList<>();

    {
        popSongs.add("Thinking Out Loud");
        popSongs.add("pop song number one");
        popSongs.add("pop song number two");

    }

    @Override
    public List<String> getSong() {
        return popSongs;
    }
}
