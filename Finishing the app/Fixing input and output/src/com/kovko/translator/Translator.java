package com.kovko.translator;

import java.util.List;
import java.util.Map;

public interface Translator {
    String translate(String word);
    Map<String, String> translate(String text, String delimiter);
    Map<String, String> translate (List<String> words);
}
