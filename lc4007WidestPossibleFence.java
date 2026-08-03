import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class lc4007WidestPossibleFence {
class Solution {
    public int maximumWidth(int[] p) {
        //count all plank already equal to h
        //count freq of all remaining values
        //create pairs
       int[] value = p;
        int ans = 0;

        Map<Integer, Integer> f = new HashMap<>();
        for (int x : p) {
            f.put(x, f.getOrDefault(x, 0) + 1);
        }

        Map<Integer, Integer> pairScore = new HashMap<>();
        List<Integer> unique = new ArrayList<>(f.keySet());
        int m = unique.size();

        for (int i = 0; i < m; i++) {
            int u = unique.get(i);
            int pairsSelf = f.get(u) / 2;
            
            if (pairsSelf > 0) {
                pairScore.put(u * 2, pairScore.getOrDefault(u * 2, 0) + pairsSelf);
            }

            for (int j = i + 1; j < m; j++) {
                int v = unique.get(j);
                int pairsDiff = Math.min(f.get(u), f.get(v));
                
                if (pairsDiff > 0) {
                    int sum = u + v;
                    pairScore.put(sum, pairScore.getOrDefault(sum, 0) + pairsDiff);
                }
            }
        }

        Set<Integer> candidates = new HashSet<>(f.keySet());
        candidates.addAll(pairScore.keySet());

        for (int t : candidates) {
            int currentWidth = f.getOrDefault(t, 0) +        pairScore.getOrDefault(t, 0);
            ans = Math.max(ans, currentWidth);
        }

        return ans;
    }
}
}