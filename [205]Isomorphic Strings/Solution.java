public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sTot = new HashMap<Character, Character>();
        HashMap<Character, Character> tTos = new HashMap<Character, Character>();

        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        for(int i = 0; i < s.length(); i++) {
        	if(!sTot.containsKey(sArray[i]) && !tTos.containsKey(tArray[i])) {
        		sTot.put(sArray[i], tArray[i]);
        		tTos.put(tArray[i], sArray[i]);
        	}
        	else if(!sTot.containsKey(sArray[i])){
        		sTot.put(sArray[i], tArray[i]);
        	}
        	else if(!tTos.containsKey(tArray[i])){
        		tTos.put(tArray[i], sArray[i]);
        	}
        	
        	if(tArray[i] != sTot.get(sArray[i]) || sArray[i] != tTos.get(tArray[i])) {
        		return false;
        	}
        }
        
        return true;
    }
}
