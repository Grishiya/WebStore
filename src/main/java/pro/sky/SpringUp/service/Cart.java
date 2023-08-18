package pro.sky.SpringUp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private List<Integer> items;

    public Cart() {
        items = new ArrayList<>();

    }

    public void add(Integer item) {
        items.add( item );
    }

    public List<Integer> get() {
        return Collections.unmodifiableList( items );
    }
}
