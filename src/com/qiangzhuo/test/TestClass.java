package com.qiangzhuo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/5/23.
 * ctrl+m  :全屏显示代码
 */
public class TestClass {

    private Lock lock = new ReentrantLock();

    //private Condition condition = lock.newCondition();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        list.add("ss");
        String s = list.get(0);
        System.out.println(s);

        HashSet<Person> set = new HashSet<Person>();
        set.add(new Person("GG",22));
        set.add(new Person("GG",22));

        int size = set.size();
        System.out.println(size);

        HashMap<Object, Object> map = new HashMap<>();
        map.put(1,11);
        map.put(2,22);
        map.put(3,33);

        System.out.println(map);
        Set<Map.Entry<Object, Object>> entries = map.entrySet();

        System.out.println(entries);

    }

}
