class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (List<Integer> pair : pairs) {
            int left = getRoot(parent, pair.get(0));
            int right = getRoot(parent, pair.get(1));
            if (left != right) {
                parent[left] = right;
            }
        }
        
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            groups.computeIfAbsent(getRoot(parent, i), r -> new ArrayList<>()).add(i);
        }
        char[] res = s.toCharArray();
        for (List<Integer> group : groups.values()) {


            char[] chars = new char[group.size()];
            for (int i = 0; i < chars.length; i++) {
                chars[i] = s.charAt(group.get(i));
            }
            Arrays.sort(chars);
            for (int i = 0; i < chars.length; i++) {
                res[group.get(i)] = chars[i];
            }
            
        }
        return new String(res);
        
    }