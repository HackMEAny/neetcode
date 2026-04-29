class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int item : nums) {
            hashMap.putIfAbsent(item, 0);
            if (hashMap.containsKey(item)) {
                hashMap.put(item, (hashMap.get(item) + 1));
            }
        }
        // System.out.println(hashMap);
        // int[] x = {};
        // hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        // .forEach(System.out::println);
        // System.out.println(hashMap);

        Map<Integer, Integer> sortedByValue =
            hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                    Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedByValue);

        // Collections.sort(hashMap -> (i1,i2) -> i1.getValue().compareTo(i2));
        List<Integer> x = new ArrayList<>();
        for (Map.Entry<Integer, Integer> a : sortedByValue.entrySet()) {
            // Integer key = a.getKey();
            // Integer val = a.getValue();
            if (x.size() < k)
                x.add(a.getKey());
        }
        // System.out.println(x);
        return x.stream().mapToInt(Integer::intValue).toArray();
    }
}
