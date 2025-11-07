import java.util.HashMap;
import java.util.Map;

public class NotationConverter {

    private HashMap<String, String> map = new HashMap<String, String>();

    public NotationConverter() {
        map.put("m", "0.001");
        map.put("c", "0.01");
        map.put("k", "1000");
        map.put("M", "1000000");
        map.put("G", "1000000000");
    }

    public double GetMulFactor(String prefix) {
        if (!map.containsKey(prefix)) {
            System.out.println(String.format("Multiplication factor in prefix %s not recognised", prefix));
            return 1.0;
        }
        var factorString = map.get(prefix);
        return Double.parseDouble(factorString);
    }

}
