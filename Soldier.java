package exam2;

public class Soldier extends Military{
  private Gun guns;

    public Soldier(String name, String title, int age, Bag bags,Gun guns) {
        super(name, title, age, bags);
        this.guns=guns;
    }

    public Soldier() {
    }

    public Gun getGuns() {
        return guns;
    }

    public void setGuns(Gun guns) {
        this.guns = guns;
    }

    public void shoot(){
        System.out.println("Shoot the enemy!!!");

    }
}
