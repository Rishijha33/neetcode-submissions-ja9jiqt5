class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // for each anagram, make a 26 long array that will be the key to the hashmap,
        // values will be an array of Strings which has the same anagram

        HashMap<List<Integer>, List<String>> map = new HashMap<>();

        for(String s : strs){
            List<Integer> freq = getFreqArray(s);
            if(map.containsKey(freq)){
                map.get(freq).add(s);
            }
            else{
                map.put(freq, new ArrayList<>(List.of(s)));
            }
            
        }

        List<List<String>> result = convertMapToList(map);
        return result;
    }

    private List<Integer> getFreqArray(String s){
        Integer[] freq = new Integer[26];
        Arrays.fill(freq, 0);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c -'a']++;
        }
        return Arrays.asList(freq);
    }

    private List<List<String>> convertMapToList(HashMap<List<Integer>, List<String>> map){
        List<List<String>> res  = new ArrayList<>();
        for(List<String> list : map.values()){
            res.add(list);
        }

        return res;
    }
}
