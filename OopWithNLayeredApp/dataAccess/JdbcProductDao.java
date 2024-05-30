package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entities.Product; // Bir paketten başka bir paket kulanırsak onu import etmemiz gerekmektedir.

// Dao = Data Access Object , yani data access nesnesi olduğunu belirtmek için kullanılmıştır.
public class JdbcProductDao implements ProductDao{ // JDBC API yöntemini kullanıcaz. Eski bir API'dır. Hibernet-ORM veya JPA daha yenidir.
                             // Şuan için hangisini kullandığımız önemli değildir. 
                            // API = Bir yazılım uygulamasının diğer yazılım uygulamasıyla iletişim kurmasını sağlayan bir arayüzdür.
                            // JDBC,Hibernet-CRM,JPA lar ise veri tabanıyla iletişim kurmamızı sağlayan API'lardır.

    public void add(Product product){ // Veri tabanımıza bir şeyler ekliyoruz. (Similasyon Yapıyoruz.)
        System.out.println("JDBC ile veri tabanina eklendi.");
        // Sadece ve sadece db erişim kodları buraya yazılır ekstrası yok. SQL bilinmesi gerekmektedir.
        // Domain => Sadece birisine özel olan sayı,kelime vs.
    }

}
