public class Solution {
    public String reverseWords(String s) {
        if(s == null) return null;
        if(s.length() == 0) return "";
        
        String[] strs = s.trim().split("\\s{1,}");
        
        int begin = 0, end = strs.length-1;
        while(begin <= end) {
        	String temp = strs[begin];
        	strs[begin] = strs[end];
        	strs[end] = temp;
        	begin++;
        	end--;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.length; i++) {
        	sb.append(strs[i]);
        	sb.append(" ");
        }
        
        return sb.toString().trim();
    }
}
