package com.kovko.input;

import java.util.List;

public class ConsoleInput implements TranslationInput {

    @Override
    public List<String> input(String[] args) {
        return List.of(args);
    }
}
