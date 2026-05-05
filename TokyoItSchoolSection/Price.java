package TokyoItSchoolSection;

public class Price {
    public static void main (String[] args){
        Product pr = new Product("phone", 2000);
        pr.showProduct();
        pr.discount(10);
        pr.showProduct();

    }
}
