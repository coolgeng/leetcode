class ShortestWordDistance {
  public int shortestDistance(String[] words, String word1, String word2) {
      int p1 = -1;
      int p2 = -1;
      int distance = Integer.MAX_VALUE;
      for (int i = 0; i < words.length ; i ++) {
          if (words[i].equals(word1)) {
              p1 = i;
          }
          if (words[i].equals(word2)) {
              p2 = i;
          }
          if (p1 != -1 && p2 != -1) {
              distance = Math.min(distance, Math.abs(p1- p2));
          }
      }
      return distance;
  }
  
  public static void main(String[] args) {
    
  }
}