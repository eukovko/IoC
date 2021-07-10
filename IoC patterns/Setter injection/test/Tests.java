import com.kovko.battery.Battery;
import com.kovko.remote.RecoderRemoteControl;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class Tests {
  @Test
  void testSolution() {
    Constructor<?>[] constructors = RecoderRemoteControl.class.getDeclaredConstructors();
    assertThat(constructors.length)
        .as("There should be only one constructor in RecoderRemoteControl").isEqualTo(1);
    assertThat(constructors[0].getParameterTypes().length)
        .as("There should be one default  constructor in RecoderRemoteControl").isEqualTo(0);
      assertDoesNotThrow(() -> {
        RecoderRemoteControl.class.getDeclaredMethod("setFirstBattery", Battery.class);
        RecoderRemoteControl.class.getDeclaredMethod("setSecondBattery", Battery.class);
      }, "RecoderRemoteControl should contain setters for the batteries");
  }
}