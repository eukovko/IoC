package com.kovko.dictionary;

import java.util.List;
import java.util.Map;

public interface Dictionary {
    String lookUp(String word);
    Map<String, String> lookUp(List<String> words);
}
