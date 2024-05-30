package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entities.Product;

// Birbirinin alternatifi olan durumlarda onlara bir tane interface yapıcaz.
// Yani Hibernet ile JDBC birinin alternatifi olan API'lardır.
public class HibernateProductDao implements ProductDao{ // implements edip burayı boş bırakırsak patlarız. ProductDao'da olduğu gibi add methodu olmalı.
    public void add(Product product){ // implements ediyorsak kurallara uymak zorunda...
        System.out.println("HiberNate ile erişim sağlandi.");
    }
    
}
