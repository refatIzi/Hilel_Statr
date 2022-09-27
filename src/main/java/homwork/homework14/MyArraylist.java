package homwork.homework14;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArraylist<T> implements MyList {
    Object[] objects = new Object[1];
    int index = 0;
    Object[] obj;

    @Override
    public void add(Object value) {
        if (index == objects.length) {
            int newSize = objects.length + 1;
            obj = Arrays.copyOf(objects, newSize);
            obj[index] = value;
            objects = Arrays.copyOf(obj, newSize);
        }
        objects[index] = value;
        //  System.out.print("Index "+index);
        //    System.out.println(" object "+objects[index]);
        index++;
    }

    @Override
    public void remove(int index) {
        Object[] objectOne = new Object[objects.length];

        for (int i = 0; i < objects.length; i++) {
            if (i >= index && i != objects.length - 1) {
                objectOne[i] = objects[i + 1];
            } else {
                objectOne[i] = objects[i];
            }
        }
        objects = Arrays.copyOf(objectOne, objectOne.length - 1);
        this.index = this.index - 1;
    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public void show() {
        for (int index = 0; index < objects.length; index++)
            System.out.println("Index " + index + " object " + objects[index]);

    }

    @Override
    public void clear() {
        objects = new Object[0];
    }

    @Override
    public Object get(int index) {
        return objects[index];
    }
}
