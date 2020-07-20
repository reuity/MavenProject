package com.reuity.com.maven;

import com.reuity.maven.Jello;

public class jellofriend {
    public String sayJelloToFriend(String name) {
        Jello jello = new Jello();
        String str = jello.sayJello(name) + " I am" + this.getMyName();
        System.out.println(str);
        return str;
    }
    public String getMyName(){
        return "John";
    }
}

