package OopWithNLayeredApp;
import OopWithNLayeredApp.business.ProductManager;
import OopWithNLayeredApp.core.logging.DatabaseLogger;
import OopWithNLayeredApp.core.logging.FileLogger;
import OopWithNLayeredApp.core.logging.Logger; // Buraya çok dikkat et Logger kullandığımız için nereden import ettiğimiz çok önem arz ediyor.
import OopWithNLayeredApp.core.logging.MailLogger;
import OopWithNLayeredApp.dataAccess.HibernateProductDao;
import OopWithNLayeredApp.dataAccess.JdbcProductDao;
import OopWithNLayeredApp.entities.Product; // Başka bir yerden kullanırsak import ediyoruz.
 // Onun içinde isek package ediyoruz.

public class Main {
    public static void main(String[] args) throws Exception { // ProductManager'ı çağırıcağımız için throws Exception'ı tanımlamamız lazım.
        Product product1 = new Product(1,"Camaro",100);
        // İş birimi ile iletişim kurabilir. Veri tabanına gidemez.

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
