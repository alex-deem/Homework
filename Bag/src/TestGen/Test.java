package TestGen;

/**
 * Created by alex-deem on 2016/11/3 0003.
 */
public class Test {
    public static void main(String args []){
        Bag bag = new Bag();
        bag.Add(12.0);
        bag.Add(12.0);
        bag.IsEmpty();
        bag.Size();
        bag.Show();
        bag.Search(12.0);
        System.out.println("-----------------------------");
        bag.Remove(0);
        bag.Size();
        bag.Show();
        bag.Search(31);
    }
}