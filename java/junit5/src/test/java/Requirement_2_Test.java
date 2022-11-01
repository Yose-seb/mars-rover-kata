import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Requirement_2_Test extends AbstractTest {

    @Test
    void req2_checkArrayCommands() {
        Character[] commands = new Character[] {};
        var result = this.rover.executeCommand(commands);

        assertThat(result)
            .isEqualTo(true);
    }

}
