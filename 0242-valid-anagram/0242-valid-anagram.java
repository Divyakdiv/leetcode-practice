class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[] = new int[26];
        int len1 = s.length();
        int len2 = t.length();

        if(len1!=len2) return false;

        for(int i=0; i<len1; i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<len2; i++){
            freq[t.charAt(i)-'a']--;
            if(freq[t.charAt(i)-'a']<0) return false;
        }

        return true;                  
    
        
    }
}