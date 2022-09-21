//        Requirements for the Bookshelf class. The user can store N
//        Book objects to the shelf. The size of shelf is defined by
//        using constructor and cannot be changed during the lifetime
//        of bookshelf.
//
//        - constructor(N)    // N = the size of bookshelf
//        - add(Book object)
//        - remove(N)         // Remove index N from bookshelf. Mark unused.
//        - print()           // Display books in shelf
//        - count()           // Display used active slots (current used size)
//        - size()            // Maximum size of shelf

import java.util.Arrays;

public class Bookshelf {
    int size;
    Book array[];

    @Override
    public String toString() {
        return "Bookshelf{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public Bookshelf(int size){
        this.size = size;
        array= new Book[size];
    }
    public int count(){
        int count=0;
        for(int i = 0; i < array.length; i++){
            if(array[i]!=null){
                count++;
                System.out.println("count is " + count);
            }

    }
        return count;
    }
    public void add(Book book){
        int slotAvailable = this.size-count();
        if(slotAvailable>0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = book;
                    break;


                }
            }
        }
    }
    public int size(){
        return this.size;
    }

    public void remove(int n){
        if(n<this.size) {
            for (int i = 0; i < this.size; i++) {
                if (i == n) {
                     array[i]= null;
                }
            }
        }
    }
}
