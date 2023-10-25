package ru.cs.vsu.g102.oop.bolgov_e_v;

import java.util.*;

public class MyHashMultiMap<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        if (!map.containsKey(key)) {
            map.put(key, new LinkedList<>());
        }
        map.get(key).add(value);
    }

    public List<V> get(K key) {
        return map.getOrDefault(key, new ArrayList<>());
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public void remove(K key, V value) {
        if (map.containsKey(key)) {
            map.get(key).remove(value);
        }
    }

    public void removeAll(K key) {
        map.remove(key);
    }
}
