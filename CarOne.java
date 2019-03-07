public class CarOne{
	//this 表示当前操作的对象
	//属性是boolean类型的getter方法是isXxx
	static class Car1{
		private String brand;
		private int price;
		private String pigment;
		
		public Car1(String brand,String pigment){
			this.brand=brand;
			this.pigment=pigment;
		}
		//结合方法使用，用if语句
		public void speed(){
			System.out.println("我们的车速度很快");
		}
		public String getBrand(){
			return this.brand;
		}
		public void setPrice(int price){
			this.price=price;
		}
	}
	public static void main(String[] args){
		Car1 baoma= new Car1("宝马","黑色");
		baoma.speed();
		System.out.println(baoma.getBrand());
		baoma.setPrice(100000);
	}
}