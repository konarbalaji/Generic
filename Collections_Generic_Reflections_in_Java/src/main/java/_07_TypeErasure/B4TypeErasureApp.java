package _07_TypeErasure;

public class B4TypeErasureApp {
}



class Node<T> {

    private T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class MyNode extends Node<Integer> {

    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data){
        super.setData(data);
    }

}