import java.util.*;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();

        for (int n : nums1) s1.add(n);
        for (int n : nums2) s2.add(n);
        for (int n : nums3) s3.add(n);

        Map<Integer, Integer> count = new HashMap<>();

        for (int n : s1) count.put(n, count.getOrDefault(n, 0) + 1);
        for (int n : s2) count.put(n, count.getOrDefault(n, 0) + 1);
        for (int n : s3) count.put(n, count.getOrDefault(n, 0) + 1);

        List<Integer> result = new ArrayList<>();
        for (int key : count.keySet()) {
            if (count.get(key) >= 2) {
                result.add(key);
            }
        }

        return result;
    }
}