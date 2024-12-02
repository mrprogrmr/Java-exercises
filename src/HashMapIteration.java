import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("LY2048303", "John Wells");
        map.put("AB0649858", "Lori Wells");
        map.put("AB4453455", "David Windston");
        map.put("CS9857859", "John Smith");
        map.put("LY9475958", "Alen Cornworth");

        System.out.println();

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println("ID: " + key + ", Name: " + value);
        }
        System.out.println();
    }
}
