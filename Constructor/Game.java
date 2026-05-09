package Constructor;

public class Game {
    private String gameTitle;
    private int players;
    public Game (String gameTitle , int players){
        this.gameTitle = gameTitle;
        this.players = players;
    }
    public int getPlayer(){
        return this.players;
    }
    public void setPlayer(int players){
        this.players = players;
    }
    public void setGameTitle (String gameTitle){
        this.gameTitle = gameTitle;
    }
    public String getTitle (){
        return gameTitle;
    }
    public void show (){
         System.out.println(" game name " + gameTitle);
         System.out.println(" players : " + players );
        }
        public static void main(String[] args) {
            Game src = new Game("pubg", 3);
            src.show();
            src.setPlayer(20);
            src.show();
        }
    }
    


