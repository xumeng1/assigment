package java3;
public class CarShop {
	int Money = 0;
	public void sellCar( Car c) {
		System.out.println("Âô³öµÄ³µ"+c.Name+"\n");
		System.out.println("³µµÄ¼Û¸ñ"+c.Price+"\n");
		Money+=c.Price;

	}
	public int getMoney(){
		return Money;
	}
}

