package users;

import book.Book;
import duties.*;
import static book.Books.books;


public class SupplierUser extends ReaderUser implements Supplier {
    final static int DELIVERY_DAYS =3;
    private static int delivery  = 0;

    public SupplierUser(String name) {
        super(name);
    }

    @Override
    public boolean deliveryBook(Book book) {
        if(delivery++ < DELIVERY_DAYS)
            return false;
        else {
            delivery = 0;
            return true;}
    }
}
