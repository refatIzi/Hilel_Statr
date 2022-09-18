package homwork.homework14;

public interface MyList<T> {
    void add(T value);

    void remove(int index);

    int size();

    void show();

    void clear();

    Object get(int index);
}
