package lesson2;

import java.util.List;

public class User {

    private int orderNumber;
    private List<Integer> integerList;


    public User(int orderNumber, List<Integer> ints) {
        this.orderNumber = orderNumber;
        this.integerList = ints;
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public String toString() {
        return "User{" +
                "orderNumber=" + orderNumber +
                ", ints=" + integerList +
                '}';
    }
}
