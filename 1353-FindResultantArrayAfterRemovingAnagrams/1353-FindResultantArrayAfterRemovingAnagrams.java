// Last updated: 2/13/2026, 11:32:35 AM
class Solution {
    public List<String> removeAnagrams(String[] w) {
        List <String> s = new ArrayList<>();
        String pre = " ";
        for(String str:w){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!sorted.equals(pre)){
                s.add(str);
                pre = sorted;
            }
        }
        return s;
    }
}