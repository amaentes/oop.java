package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class Drug implements Iterator<Component> {
    private List<Component> components;
    private int index;

    public Drug() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        Component component = components.get(index);
        index++;
        return component;
    }
}
