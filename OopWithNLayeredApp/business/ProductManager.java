package OopWithNLayeredApp.business;
import java.util.List;
import OopWithNLayeredApp.core.logging.Logger; // Buraya dikkat et çok önemli!! Logger adında farklı bir kütüphaneyi yanlışlıkla aktif edilebiliyor.
import OopWithNLayeredApp.dataAccess.ProductDao;
import OopWithNLayeredApp.entities.Product;

public class ProductManager{ // Sisteme kayıt edilen şeyler ProductManager'a gelir.
                            // throws Exception => Bu metodu çağırdığımızda böyle bir hata fırlatabilir demektir.
    private ProductDao productDao; // Buradaki amaç JDBC , Hibernate-CRM gibi kodlar yazmamak,görmemek için 
    // Bu tekniğin ismi = dependency injection

    // Aynı anda Veritabanina,Dosyaya ve Maile loglamak için :
    private Logger[] loggers; // Logger nesnesinden oluşan özel bir liste.
    // List<Logger> = Logger[] dır. İkiside aynı şeyi ifade eder. Yani arraydir.
    public ProductManager(ProductDao productDao,Logger[] loggers) { // artık sadece interface'e bağlıyız.
        this.productDao = productDao;
        this.loggers = loggers;

    }
    public void add(Product product) throws Exception{ // Verileri product'tan çektik. product'ta tanımlı olduğu için tekrar kullanmamız gerekmekteydi.
        // business rules , iş kurallarını yazalım. Normalde bu kod tekniği clean kod değildir. Ama yolun başındayız şimdilik idare edelim :)
        if(product.getUnitPrice()<10){ // Burada birim fiyatı 10'dan küçük ise demek istedik.
            throw new Exception("Ürün fiyati 10'dan küçük olamaz."); // throw = fırlatmak , Burada hata mesajınıda verdik.
            // Hata çıkar ise uygulama durur. Orada kesilir.
        }
        productDao.add(product);   

        // Şimdi yukarıda private olarak tanımladığımız logger dizisini döndürücem.(foreach ile)
        for (Logger logger : loggers) { // [db,file] önce db çalışır sonra mail
            logger.log(product.getName());
        }
    }
}

