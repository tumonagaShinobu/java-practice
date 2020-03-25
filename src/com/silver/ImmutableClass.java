package com.silver;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final String name;
    private final List<Object> objects;

    public ImmutableClass(String name, List<Object> objects) {
        this.name = name;
        this.objects = new ArrayList<>();
        this.objects.addAll(objects);
    }

    public String getName() {
        return this.name;
    }

    public List<Object> getObjects() {
        return new ArrayList<>(objects);
    }
}
