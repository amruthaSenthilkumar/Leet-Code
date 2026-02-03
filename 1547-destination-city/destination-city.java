import java.util.*;

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> starts = new HashSet<>();

        // Collect all starting cities
        for (List<String> path : paths) {
            starts.add(path.get(0));
        }

        // Find the city that is never a start
        for (List<String> path : paths) {
            String destination = path.get(1);
            if (!starts.contains(destination)) {
                return destination;
            }
        }

        return "";
    }
}