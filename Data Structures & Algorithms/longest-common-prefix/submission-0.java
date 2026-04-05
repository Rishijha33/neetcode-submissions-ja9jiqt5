class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        String minStr  = "";
        for(String s : strs){
            if(s.length() < minLen){
                minStr = s;
                minLen = s.length();
            }
        }
        for(String s : strs){
            int ind  = compareStrings(minStr, s);
            System.out.println(s +"  "  + " minStr : " + minStr + " ind: " + ind);
            minStr = minStr.substring(0, ind);
        }

        return minStr;
    }


    private int compareStrings(String min, String act){
        int len = 0;
        for(int i=0;i<min.length();i++){
            if(min.charAt(i) != act.charAt(i)) break;
            len++;
        }
        return len;
    }
}