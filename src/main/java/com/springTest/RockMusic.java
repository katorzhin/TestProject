package com.springTest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockSongs = new ArrayList<>();

    {
        rockSongs.add("Smells Like Teen Spirit");
        rockSongs.add("rock song number one");
        rockSongs.add("rock song number two");

    }

    @Override
    public List<String> getSong() {
        return rockSongs;
    }
}
