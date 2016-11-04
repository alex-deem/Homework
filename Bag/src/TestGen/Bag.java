package TestGen;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex-deem on 2016/11/2 0002.
 */

class Bag implements BagUnite {
    private Map<Object, Object> bag = new HashMap<>();
    private int key = 0 ;

    @Override
    public void Add(Object add) {
        bag.put(key,add);
        key ++ ;
    }

    @Override
    public void Search(Object search){
        for (int i = 0; i < key; i++) {
            String type = search.getClass().getName();
            if(type.equals("java.lang.String")||type.equals("java.lang.Integer")){
                if (search.equals(bag.get(i))) {
                System.out.println("The element number:" + i);
                }
            }
            else {
                if( search==bag.get(i) ){
                    System.out.println("The element number:" + i);
                }
            }
        }
    }

    @Override
    public void Remove(int remove) {
        bag.remove(remove);
    }

    @Override
    public boolean IsEmpty() {
        boolean isEmpty = bag.isEmpty();
        if(isEmpty){
            System.out.println("The Bag is empty.");
        }
        else {
            System.out.println("The Bag is not empty.");
        }
        return isEmpty;
    }

    @Override
    public void Show() {
       System.out.println(bag.values());
    }

    @Override
    public void Size() {
        System.out.println(bag.size());
    }

}

