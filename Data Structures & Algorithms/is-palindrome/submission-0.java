class Solution {
    public boolean isPalindrome(String s) {
        
        String str = filterString(s);
        int i= 0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    private String filterString(String s){
        String lower = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = lower.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
