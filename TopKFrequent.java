import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counters = new HashMap<>();
        for (Integer n : nums){
            counters.put(n,counters.getOrDefault(n,0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> counters.get(b) - counters.get(a));
        pq.addAll(counters.keySet());

        int[] result = new int[k];
        for(int i = 0; i< k ;i++){
            result[i] = pq.poll();
        }
        return result;


    }
}
