class Solution {
    // We can have a HashMap of Integer, List<String>
    //  Store the Counter against the Strings
    int counter = 0;
    Map<Integer, List<String>> map = new HashMap();
    public String encode(List<String> strs) {
        counter++;
        map.put(counter, strs);
        return String.valueOf(counter);
    }

    public List<String> decode(String str) {
        return map.get(Integer.parseInt(str));
    }
}
