package java3;
import java3.CarShop;
public class TestMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop shop = new CarShop();
		shop.sellCar(new QQ("abc",30000));
		shop.sellCar(new QQ("xyz",50000));
		shop.sellCar(new BMW("X5",90000));
		shop.sellCar(new BMW("X6",100000));
		System.out.println("Sale income: "+ shop.getMoney());
	}
}
