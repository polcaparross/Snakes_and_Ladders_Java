public class Player {
  private String name;
  private Square square = null;
  private Boolean dead=false;

  public Player(String name) {
    this.name = name;
  }

  public void setSquare(Square square) {
	  this.square = square;
  }

  public String getName() {
	  return name;
  }
  public boolean isDead(){return dead;}
  public void setDead(boolean d){ this.dead = d;}
  public int getPosition() {
    return square.getPosition();
  }

  @Override
  public String toString() {
    return name;
  }

  public boolean wins() {
    return square.isLastSquare();
  }

  public void moveForward(int moves) {
    assert moves > 0 : "non-positive moves";
    square.leave(this);
    square = square.moveAndLand(moves);
    square.enter(this);
  }
}
