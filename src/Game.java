import util.java.Arraylist;

class Game {
 //public static void main(String[] args){
static Arraylist<Player> players = new Arraylist<Player>();

 public void init(){

  Player p = new Player("Gabby");
  Player p1 = new Player("Melissa");
  Player p2 = new Player("Jasmin");
  Player p3 = new Player("Zainab");

  players.add(p);
  players.add(p1); 
  players.add(p2);
  players.add(p3);

  p1.addScore(100);
  p1.addScore(10);

   //change username
  p1.setName("Elev");
 }

private void ListPlayers(){

for(Player p: players){
 System.out.print(p); //player.username+ ": "+player.score)
     System.out.println(p.toString());
   }
 }
 
}



