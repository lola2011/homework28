package exam2;

public class Military {
    private String name;
    private String title;
    private int age;
    private Bag bags;

    public Military(String name, String title, int age, Bag bags) {
        this.name = name;
        this.title = title;
        this.age = age;
        this.bags = bags;
    }
    public Military(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Bag getBags() {
        return bags;
    }

    public void setBags(Bag bags) {
        this.bags = bags;
    }
    // it is just a practice
}
