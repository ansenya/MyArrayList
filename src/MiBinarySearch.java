import java.util.Iterator;

public class MiBinarySearch<T> implements Iterable<T> {

    private Object[] data;
    private int m;

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public MiBinarySearch(Object[] data) {
        this.data = data;
    }

    public int search(Object s, int l, int h){
        if (l>h) throw new IllegalArgumentException();
        if (l<0 || h> data.length) throw new IndexOutOfBoundsException();
        while (l<=h){
            m = (l+h) >>> 1;
            if (data[m]==s) return m;
            else {
                l = m++;
            }
        }
        return -m - 1;
    }
}
