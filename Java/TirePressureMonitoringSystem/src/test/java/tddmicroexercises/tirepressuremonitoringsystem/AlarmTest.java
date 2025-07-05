package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tddmicroexercises.tirepressuremonitoringsystem.Alarm.isAlert;

import org.junit.jupiter.api.Test;

public class AlarmTest {
    @Test
    void alarm_is_on_if_pressure_value_is_less_than_17() {
        assertTrue(isAlert(16));
    }

    @Test
    void alarm_is_on_if_pressure_value_is_greater_than_21() {
        assertTrue(isAlert(22));
    }

    @Test
    void alarm_is_off_if_pressure_value_is_between_or_equals_17_and_21() {
        assertFalse(isAlert(20));
    }
}
