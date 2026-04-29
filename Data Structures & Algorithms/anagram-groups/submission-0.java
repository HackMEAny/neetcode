class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
            for (String s : strs) {
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                // System.out.println(hashMap.values());
                hashMap.putIfAbsent(new String(ch), new ArrayList<>());
                hashMap.get(new String(ch)).add(s);
            }
            return new ArrayList<>(hashMap.values());
    }
}
