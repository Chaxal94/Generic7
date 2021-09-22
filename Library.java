public interface Library<T>  {
    void add(T media,int index);
    T get(int index);
    int size();
    void delete(int index);



}
