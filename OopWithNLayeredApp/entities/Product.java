package OopWithNLayeredApp.entities; // Dosya içinde dosya olduğu zaman package'i kullanırız.

// Burası varlıklar,özler...
public class Product{
    private int id;
    private String name;
    private double unitPrice; // Birim fiyatı
    
    

    public Product(){
       super(); // Burası yapıcı blok
    }

    public Product(int id, String name, double unitPrice) { // Bunu yazdığımız için product'u çağırırken için doldurmamız lazım.
        super();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
}