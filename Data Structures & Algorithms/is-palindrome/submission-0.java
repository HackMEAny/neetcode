class Solution {

    boolean checkPalindrom(int i, char[] s){
        if(i >= s.length / 2 ) return true;
        if(s[i] != s[s.length - i - 1]) return false;
        return checkPalindrom(i+1,s);
    }

    public boolean isPalindrome(String s) {
        return checkPalindrom(0, s.replaceAll("[\\p{P}\\s+]","").toLowerCase().toCharArray());
    }
}
