package com.sanjana.retrofit2;

public class Source {
    //    Model class for source details
    private String id,name;


    //    Getters
    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

//    Constructors

    public Source(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
