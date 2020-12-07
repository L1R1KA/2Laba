package com.company;

public class Book {
  private String avtor;
  private String name;
  private int year;

    public String getAvtor() {
        return avtor;

    }

    public void setAvtor(String args) {
        avtor=args;
    }

    public String getName() {
        return name;
    }
    public void setName(String args){
        name=args;
    }
    public int getYear(){
        return year;

    }
    public void setYear(int args){
        year=args;

    }
    public Book(String avtor1, String name1, int year1){
        avtor = avtor1;
        name = name1;
        year = year1;

    }
}
