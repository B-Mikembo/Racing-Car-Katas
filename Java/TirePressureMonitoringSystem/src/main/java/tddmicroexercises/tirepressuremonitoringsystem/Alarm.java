package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm
{
    private static final double LOW_PRESSURE_THRESHOLD = 17;
    private static final double HIGH_PRESSURE_THRESHOLD = 21;

    public static boolean isAlert(double pressureValue)
    {
        return pressureValue < LOW_PRESSURE_THRESHOLD || HIGH_PRESSURE_THRESHOLD < pressureValue;
    }
}
