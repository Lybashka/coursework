package Course;


/**
 * Created by pc on 05.11.2015.
 */
public class Product implements Marketable {
    String productType;
    private String name;
    private Integer article;
    private Integer quantity;
    private Double price;
    private String manufacturer;
    public Product(){

    }
    public String getProductType(){
        return productType;
    }

    public void setProductType(String productType) {
        if("".equals(productType)){
            productType=null;
        }
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArticle() {
        return article;
    }

    public void setArticle(Integer article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        Integer a=0;
        if(a.equals(quantity)){ //как сравнить тип Интеджер?
            quantity=null;
        }
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Product Type").append(productType).append("\n");
        if (name != null) {
            b.append("Product Name").append(name).append("\n");
        }
        if (article != null) {
            b.append("Product Article").append(article).append("\n");
        }
        if (quantity != null) {
            b.append("Quantity of goods").append(quantity).append("\n");
        }
        if (price != null) {
            b.append("The price of the product:").append(price).append("\n");
        }
        if (manufacturer != null) {
            b.append("Producer goods:").append(manufacturer).append("\n");
        }
        return b.toString();
    }

    }




