import com.kovko.context.Context;
import com.kovko.dictionary.DictProtocolDictionary;
import com.kovko.translator.Translator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {
  @Test
  void testSolution() {
    Context context = new Context(new String[]{"host", "name"});
    assertThat(context.getTranslator())
        .as("Context should provide non null Translator")
        .isNotNull()
        .as("Context should provide Translator instance")
        .isInstanceOf(Translator.class);

    assertThat(context.getDictionary())
        .as("Context should provide non null Dictionary")
        .isNotNull()
        .as("Context should provide DictProtocolDictionary instance")
        .isInstanceOf(DictProtocolDictionary.class);
  }
}