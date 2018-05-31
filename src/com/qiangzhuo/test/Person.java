package com.qiangzhuo.test;

import java.util.Vector;

/**
 * Created by Arron on 2018/5/26--22:30.
 */
public class Person {

    /**
     *
     * @param 消耗内存的程序
     */
    public static void main(String[] args) {
        Vector v = new  Vector( 10 );
        for  ( int  i = 1 ;i < Integer.MAX_VALUE ; i ++ ){
            Object o = new  Object();
            v.add(o);
            o = null ;
        }
    }

    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    /*@Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }*/
}
