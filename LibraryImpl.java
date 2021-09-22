import java.util.ArrayList;
import java.util.List;

public class LibraryImpl<T extends Media> implements Library<T> {
    private ArrayList<T> medias = new ArrayList<>();
    @Override
    public void add(T media,int index) {
        medias.add(medias.size()/4,media);

    }

    @Override
    public T get(int index) {
        return medias.get(medias.size()/2);
    }

    @Override
    public int size() {
        return medias.size();
    }

    @Override
    public void delete(int index) {
        medias.remove(medias.size() -1);

    }



}
