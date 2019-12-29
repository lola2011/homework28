package exam2;

public class Map {
    private String place;
    private String operation;

    public Map(String place, String operation) {
        this.place = place;
        this.operation = operation;
    }
    public Map(){

    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
