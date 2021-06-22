package com.kovko.output;

import java.util.Map;

public interface TranslationOutput {
    void output(String word);
    void output(Map<String, String> translations);
}
