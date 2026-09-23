class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder rev = new StringBuilder(sb);
        rev.reverse();
        String s1 = rev.toString();
        String s2 = sb.toString();
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }
}
