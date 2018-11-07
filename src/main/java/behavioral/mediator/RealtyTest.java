package behavioral.mediator;

public class RealtyTest {
    public static void main(String[] args) {
        Mediator rieltor = new Rieltor("Риелтор");

        Person customer = new Customer(rieltor, "Покупатель");
        Person seller =new Seller(rieltor, "Продавец");

        rieltor.setPersonX(customer);
        rieltor.setPersonY(seller);

        customer.sendMessage("Хочу купить бетонную коробку");
        seller.sendMessage("Продаю бетонную коробку");
        customer.sendMessage("Сколько?");
        seller.sendMessage("Много");

    }
}
