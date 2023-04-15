package _08_HomeworkSolution;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Algorithm> {

    private List<T> algorithms;

    public Library() {
        this.algorithms = new ArrayList<>();
    }

    public void add(T algo){
        this.algorithms.add(algo);
    }

    public T getlast(){
        if(this.algorithms.size() <=0 )
            return null;
        T actualItem = this.algorithms.remove(this.algorithms.size()-1);
        return actualItem;
    }
}