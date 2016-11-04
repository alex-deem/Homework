package TestGen;

import java.util.Objects;

/**
 * Created by alex-deem on 2016/11/3 0003.
 */
interface BagUnite <T>{
    void Add(T add);
    void Search(T search);
    void Remove(int remove);
    boolean IsEmpty();
    void Show();
    void Size();
}
