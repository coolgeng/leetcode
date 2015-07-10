class Coordinate {
  private int x;
  private int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean isAdjacent(Coordinate c) {
    if (x == c.x && (y == c.y - 1 || y == c.y + 1)) {
      return true;
    }
    if (y == c.y && (x == c.x - 1 || x == c.x + 1)) {
      return true;
    }
    return false;
  }
}