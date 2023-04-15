package _04_BoundedTypeParameters;


import java.util.ArrayList;
import java.util.List;

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle on canvas");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle on canvas");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Square on canvas");
    }
}


public class Shapes {

    public static void main(String[] args) {
        List<Rectangle> rl = new ArrayList<>();
        rl.add(new Rectangle());
        drawALl(rl);

    }


    public static <T extends Shape> void drawALl(List<T> shapes){

        for(T s : shapes)
            s.draw();
    }
}
