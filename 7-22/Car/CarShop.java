package java3;
public class CarShop {
	int Money = 0;
	public void sellCar( Car c) {
		System.out.println("卖出的车："+c.Name+"\n");
		System.out.println("车的价格："+c.Price+"\n");
		Money+=c.Price;

	}
	public int getMoney(){
		return Money;
	}
}

