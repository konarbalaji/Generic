package _16_CollectionsExercise;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private int CAPACITY = 3;
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

            //we have to deal with capacity , so this is how we remove items from cache iif necessary
            if(cache.size() >= CAPACITY)
                cache.remove(cache.size()-1);

            //we have to check whether is it the first item in the array
            if(cache.size() == 0)
                cache.add(p);
            else
                cache.add(0,p);
        }
    }

    public void showCache(){
        for(Pair p : cache){
            System.out.println(p);
        }
    }
}