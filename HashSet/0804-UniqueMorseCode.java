class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String word : words){
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                sb.append(morse[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}