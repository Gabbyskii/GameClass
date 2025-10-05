class Player {
	private String username;
	private int score;

public Player(String name) {
	this.username = name;
}

public void  addScore(int amount){
	this.score += amount;
}

public String getName(){
	return username;
}
public void setName(String newName){
	username = newName;
}

public void setScore(int amount){
	score = amount;
}

public String toString(){
  return "Player username: " +this.username + "score: "+this.score;
  }

}