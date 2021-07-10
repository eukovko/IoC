import com.kovko.engine.BasicEngine;
import com.kovko.engine.Engine;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {

  @Test
  void testEngineCreation() {
    Constructor<?>[] constructors = BasicEngine.class.getDeclaredConstructors();
    assertThat(constructors.length)
        .as("There should be only one constructor").isEqualTo(1);
    assertThat(constructors[0].getParameterCount())
        .as("There should be only one parameter in the constructor").isEqualTo(1);
    assertThat(constructors[0].getParameterTypes()[0])
        .as("Car constructor should accept Engine instance").isInstanceOf(Engine.class);

  }
}