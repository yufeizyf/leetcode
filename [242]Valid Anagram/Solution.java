public class Solution {
    public boolean isAnagram(String s, String t) {
    	if(s == null && t == null) return true;
    	if(s == null || t == null) return false;
    	
        int[] count = new int[26];
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        
        if(sa.length != ta.length) {
        	return false;
        }
        
        for(int i = 0; i < sa.length; i++) {
        	count[sa[i]-97]++;
        }
              
        for(int i = 0; i < ta.length; i++) {
        	count[ta[i]-97]--;
        }
            
        for(int i = 0; i < count.length; i++) {
        	if(count[i] != 0 ) {
        		return false;
        	}
        }
        
        return true;
    }
}
