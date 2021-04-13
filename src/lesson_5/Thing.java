package lesson_5;

public class Thing {
    private Integer size;
    private Integer cost;

    public Thing() {
        size = 0;
        cost = 0;
    }
    public Thing(int size, int cost) {
        this.size = size;
        this.cost = cost;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getCost() {
        return cost;
    }
}
