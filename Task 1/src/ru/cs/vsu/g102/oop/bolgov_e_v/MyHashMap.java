package ru.cs.vsu.g102.oop.bolgov_e_v;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap<K, V> {
    private Map<K, V> map = new HashMap<>();

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }
}
