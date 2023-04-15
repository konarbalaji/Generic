package _09_HomeworkSolution;

import java.util.ArrayList;

public class AlgoLibraryApp {

    public static void main(String[] args) {
        Library<Algorithm> library = new Library<>();

        library.add(new SearchAlgorithm());
        library.add(new SortingAlgorithm());
        library.add(new GraphAlgorithm());

        Algorithm item = library.getlast();

        while(item != null){
            item.execute();
            item=library.getlast();
        }
    }
}