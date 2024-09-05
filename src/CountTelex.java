import java.util.HashMap;
import java.util.Map;

public class CountTelex {
    public static int countTelex(String input) {
        Map<String, String> map = new HashMap<>();
        map.put("aw", "ă");
        map.put("aa", "â");
        map.put("dd", "đ");
        map.put("ee", "ê");
        map.put("oo", "ô");
        map.put("ow", "ơ");
        map.put("w", "ư");

        int count = 0;
        int i = 0;
        for (i = 0; i < input.length(); i++) {
            if (i + 1 < input.length()) {
                String char1 = input.substring(i, i + 2);
                if (map.containsKey(char1)) {
                    count++;
                    i++;
                    continue;
                }
            }

            String char2 = input.substring(i, i + 1);
            if (map.containsKey(char2)) {
                count++;
            }
        }
        return count;
    }
}
