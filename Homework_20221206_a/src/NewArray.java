import java.util.Arrays;

public class NewArray {
    private int capasity = 2;
    private Integer[] arr = new Integer[capasity];
    private int size = 0;

    public boolean add(int value) {
        if (size >= arr.length) {
            enlarge();
        }
        arr[size++] = value;
        return true;
    }

    private void enlarge() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }

    public void addAt(int index, int value){
        if (index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size >= arr.length) {
            enlarge();
        }
        for (int i = arr.length - 2 ; i > index - 1; i--) {
                arr[i + 1 ] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    public void remove(){
        arr[size - 1] = null;
        size--;
    }

    public void removeAt(int index){
        if (index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                arr[i] = null;
                arr = Arrays.copyOf(arr, arr.length - 1);
            }
        }
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public int get(int index){
        if (index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index >=0 && index<size ) {
            return arr[index];
        }
       return Integer.parseInt(null);
    }

    public void set(int index, int value) {
        if (index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < size; i++) {
            if (index == i){
                arr[i] = value;
            }
        }
    }

    public boolean contains(int value){
        for (int i = 0; i < size; i++) {
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }

    public void shrinkSize() {
        if (arr.length > size) {
            arr = Arrays.copyOf(arr,size);
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
        arr = Arrays.copyOf(arr,2);
    }
}
