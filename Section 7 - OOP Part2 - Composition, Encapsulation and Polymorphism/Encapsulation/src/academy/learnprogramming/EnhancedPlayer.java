package academy.learnprogramming;

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    // We can add some other validations ex. if name has all letters, its length ...
    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;

        if(hitPoints > 0 && hitPoints <= 200){
            this.hitPoints = hitPoints;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
