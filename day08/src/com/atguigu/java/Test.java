package com.atguigu.java;

import java.util.*;

/**
 * @author shkstart
 * @create 2021-09-02 9:58
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("wang",13);
        map.put("li",14);
        map.put("zhao",15);
        TraversalMap(map);
        System.out.println(getKeys(map));
    }

    public static void TraversalMap(Map map) {
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i1 = set.iterator();
        while(i1.hasNext()){
            Map.Entry<String, Integer> next = i1.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "----" + value);

        }
    }

    //
    public static List getKeys(HashMap<String,?> map){
        List list = new ArrayList();
        Collection<String> keys = map.keySet();
        for(String s:keys){
            list.add(s);
        }
        return list;

    }
}


