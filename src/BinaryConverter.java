import java.util.ArrayList;

public class BinaryConverter {

    private static final double H_WAVELENGTH = 0.2110611405416;
    private ArrayList<Double> _hydrogenValues = new ArrayList<>();

    public BinaryConverter() {

    }

    public String ConvertForValue(double valueIn) {
        double value = valueIn;
        double lowestValue = GetNthSequence(0);
        long convertedValue = 0;

        do {
            int i = 0;
            double currValue = valueIn;
            double lastValue = valueIn;

            boolean hasFoundNextDigit = false;
            do {
                lastValue = currValue;

                if (i < _hydrogenValues.size()) {
                    currValue = _hydrogenValues.get(i);
                } else {
                    currValue = GetNthSequence(i);
                    _hydrogenValues.add(currValue);
                }

                hasFoundNextDigit = currValue >= value && lastValue <= value;

                i++;
            } while (!hasFoundNextDigit);
            i--; // undo the last increment
            convertedValue += 0b1L << i;
            value -= lastValue;
        } while (value > lowestValue);

        return Long.toBinaryString(convertedValue);
    }

    public static double GetNthSequence(int n) {
        return H_WAVELENGTH * Math.pow(2, n);
    }

    // 0000000111100101011000100000101001001111001110
    // 0000001110110111100111011000100100111010001110
    // 0000010100011100001111010100111010011101010100
    // 0000011110111111111110110001011101101101101010
    // 0001101011000010111101011100000111101011110110
    // 0011000100101001100010100000010110111011000100
    // 1001101000011100110011110110111111011101110110
}
