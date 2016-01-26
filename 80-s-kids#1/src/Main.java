import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static String totalLicks(Map<String, Integer> env) {
        String result;
        String toughestChallenge = "";
        int totalLicks = 252;
        int maxLicks = 0;
        Set set = env.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
            String key = entry.getKey();
            int licks = entry.getValue();
            if (licks > maxLicks) {
                maxLicks = licks;
                toughestChallenge = key;
            }
            totalLicks = totalLicks + licks;
        }
        if (toughestChallenge != "") {
            result = String.format("It took %s licks to get to the tootsie roll center of a tootsie pop. The toughest challenge was %s.", totalLicks, toughestChallenge);
        }else{
            result = String.format("It took %s licks to get to the tootsie roll center of a tootsie pop.", totalLicks);
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Map<String, Integer> env = new HashMap<>(3, 1f);
        env.put("dragons", 100);
        env.put("evil wizards", 110);
        env.put("trolls", 50);
        String result = main.totalLicks(env);
        System.out.println(result);
    }
}