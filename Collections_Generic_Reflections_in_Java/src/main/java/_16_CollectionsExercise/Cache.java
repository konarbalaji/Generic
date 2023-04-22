package _16_CollectionsExercise;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private int CAPACITY = 5;
    private List<Pair> cache;

    public Cache() {
        this.cache = new ArrayList<>();
    }

    public void search(String url){

        Pair searchedItem = null;
        for(Pair pair : cache){
            //if url was already searhgec recently, then remove exiting & add it to first index
            if(pair.getUrl().equals(url)){
                searchedItem=pair;
            }
        }

        //if URL was not searched then create a new pair & add it to the list
        if(searchedItem != null){
            cache.remove(searchedItem);
            cache.add(0,searchedItem);
        }else{
            Pair p = new Pair(url,"random content");
            cache.add(0,p);
        }
    }

    public void showPairs(){
        for(int i=0; i<CAPACITY; i++){
            System.out.println(cache.get(i));
        }

    }
}