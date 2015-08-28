class ShortestWordDistanceII {
  private HashMap<String, List<Integer>> indexer = new HashMap<String, List<Integer>>();
    public WordDistance(String[] words) {
        if (words == null) return;
        for (int i = 0; i < words.length; i++) {
            if (indexer.containsKey(words[i])) {
                indexer.get(words[i]).add(i);
            } else {
                List<Integer> positions = new ArrayList<Integer>();
                positions.add(i);
                indexer.put(words[i], positions);
            }
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> posList1 = indexer.get(word1);
        List<Integer> posList2 = indexer.get(word2);
        int i = 0, j = 0;
        int diff = Integer.MAX_VALUE;
        while (i < posList1.size() && j < posList2.size()) {
            int pos1 = posList1.get(i), pos2 = posList2.get(j);
            if (pos1 < pos2) {
                diff = Math.min(diff, pos2 - pos1);
                i++;
            } else {
                diff = Math.min(diff, pos1 - pos2);
                j++;
            }
        }
        return diff;
    }
  public static void main(String[] args) {
    
  }
}