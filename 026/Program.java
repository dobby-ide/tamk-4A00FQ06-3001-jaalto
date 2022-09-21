//2.6 Bookshelf program
//
//        Write program with following classes:
//
//        Program.java
//        Book.java
//        Bookshelf.java
//

//


public class Program {
    public static void main(String[] args) {
        Book a = new Book();
        Book b = new Book();
        Book c = new Book();
        Bookshelf shelf = new Bookshelf(4);
        shelf.add(a);
        shelf.add(b);
        shelf.count();
        shelf.remove(1);
        String print=shelf.toString();
        System.out.println(print);
    }

}
