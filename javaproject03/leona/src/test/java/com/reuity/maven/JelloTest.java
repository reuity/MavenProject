package com.reuity.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JelloTest {
    @Test
    public void testJello() {
        Jello jello = new Jello();
        String results = jello.sayJello("kfhaerihg");
        assertEquals("Jello kfhaerihg!", results);
    }
}