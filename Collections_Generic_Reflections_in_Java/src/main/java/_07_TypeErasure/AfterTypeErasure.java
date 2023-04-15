package _07_TypeErasure;

public class AfterTypeErasure {
}

class Node1 {

    private Object data;

    public Node1(Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

class MyNode1 extends Node1 {

    public MyNode1(Integer data) {
        super(data);
    }

    //This is a Bridge method that will be added by java compiler
    public void setData(Object o){
        super.setData((Integer) o);
    }

    public void setData(Integer data){
        super.setData(data);
    }

}