package com.example.myapplicationl7;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private ArrayList<Book> books=new ArrayList<>();

    public DataBase(){
        books.add(new Book("mybook" , "abood" , "A" , 99 , true));
        books.add(new Book("school" , "ahmad" , "C" , 909 , true));
        books.add(new Book("X2" , "omar" , "A" , 129 , false));
        books.add(new Book("life" , "abd" , "C" , 42 , true));
        books.add(new Book("111" , "issa" , "B" , 432 , false));
        books.add(new Book("12:12" , "ibrahmem" , "B" , 78 , true));
    }

    public List<Book> getbooks(String c){
        ArrayList<Book> res =new ArrayList<>();
        for(Book b :books){
            if (b.getCategory().equals(c)){
                res.add(b);
            }
        }
        return res;

    }

}
