package com.company;

/**
 * Created by alex-deem on 2016/11/6 0006.
 */
public class Test{
    public static void main(String[] args) {
        wordSearcher wordSearcher = new wordSearcher();
        Thread t = new Thread(wordSearcher);
        t.start();
    }
}
