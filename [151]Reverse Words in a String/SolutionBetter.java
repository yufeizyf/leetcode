public class SolutionBetter {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split(" +"));

        Collections.reverse(words);
        
        return String.join(" ", words);
    }
}
