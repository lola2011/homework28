package exam2;

import java.awt.*;

public class main3 {
    public static void main(String[] args) {
        Bag bag1=new Bag(Color.black,11.0);
        Bag bag2=new Bag(Color.cyan,8.5);
        Gun gun1=new Gun("Kalashnikov",12);
        Map map1=new Map("Irak","owl");

        Soldier soldier1= new Soldier("Akbar","asker",21,bag1,gun1);
        Soldier soldier2=new Soldier("Aziz","asker",19,bag1,gun1);
        Soldier soldier3=new Soldier("Mehmet","asker",20,bag1,gun1);
        Soldier soldier4=new Soldier("Marat","asker",22,bag1,gun1);
        Officer officer1=new Officer("Sultan","polkovnik",38,bag2,map1);
    }
}
