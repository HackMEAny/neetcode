class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> string1 = new HashMap<>();
        HashMap<Character, Integer> string2 = new HashMap<>();
        char[] st1 = s.toCharArray();
        char[] st2 = t.toCharArray();
        // System.out.println(st1[1] + " t-> " + t);
        for (int i = 0; i < st1.length; i++) {
            if (string1.containsKey(st1[i])) {
                string1.put(st1[i], string1.get(st1[i]) + 1);
                // System.out.println("KEY -> " + st1[i] + " Value -> " + string1.get(st1[i]));
            } else {
                string1.put(st1[i], 1);
                // System.out.println("KEY -> " + st1[i] + " Value -> " + string1.get(st1[i]));
            }
        }

        for (int i = 0; i < st2.length; i++) {
            if (string2.containsKey(st2[i])) {
                string2.put(st2[i], string2.get(st2[i]) + 1);
                // System.out.println("KEY -> " + st2[i] + " Value -> " + string2.get(st2[i]));
            } else {
                string2.put(st2[i], 1);
                // System.out.println("KEY -> " + st2[i] + " Value -> " + string2.get(st2[i]));
            }
        }
        // System.out.println("String 1 -> " + string1 + " String 2 -> " + string2);

        if (string1.equals(string2) == true)
            return true;
        else
            return false;
    }
}
