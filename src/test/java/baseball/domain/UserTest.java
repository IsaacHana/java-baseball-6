package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("생성 테스트")
    @Test
    void create() {
        User.valueOf("123");
    }
}