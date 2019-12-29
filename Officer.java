package exam2;

public class Officer extends Military {
    private Map maps;
public Officer(){

}
    public Officer(String name, String title, int age, Bag bags, Map maps) {
        super(name, title, age, bags);
        this.maps = maps;
    }


    public Map getMaps() {
        return maps;
    }

    public void setMaps(Map maps) {
        this.maps = maps;
    }
    public void command(){
        System.out.println("Wait for my command!!!");
    }
}
