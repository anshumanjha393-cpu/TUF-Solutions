class Solution {
    public List<Character> frequencySort(String s) {
    
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());

                Collections.sort(list, (a, b) -> {
            int fa = map.get(a);
            int fb = map.get(b);
            if (fa != fb) return fb - fa;   
            return a - b;                   
        });

        return list;
    }
}