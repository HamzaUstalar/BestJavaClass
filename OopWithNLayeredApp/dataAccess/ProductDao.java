package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entities.Product;

// Birbirinin alternatifidir bu yüzden interface açtık.
public interface ProductDao {
    // Sadece şablonu çiziyoruz.
    void add(Product product); // interface'ler hatırlayacağımız üzere sadece method imzasını barındırabilir.
    // add iki alternatifte'de olması lazım. İsmine kadar aynı olmalı.
}
