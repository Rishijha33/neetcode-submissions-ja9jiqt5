class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Calculate & store freq using hashmap
        // Use Heap to get top k
        // can k == n NOPE k <= number of unique elements
        // What if 2 ele have the same Freq Does not matter return in any order
        // Can be negative
        // Can k be greater than N?


        HashMap<Integer, Integer> map = new HashMap();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> Integer.compare(map.get(a), map.get(b)));

        for(Integer num : map.keySet()){
            if(heap.size() == k){
                if(map.get(num) > map.get(heap.peek())){
                    heap.poll();
                    heap.add(num);
                }
            }
            else{
                heap.add(num);
            }
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = heap.poll();
        }

        return ans;

    }
}
