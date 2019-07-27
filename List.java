import java.util.Scanner;
public class List{
	private String name;
	private float price;
	private int number;
	static int discount;
	private float money; //一类商品的总钱数
	 
	public List(String name,float price,int number){
		this.name=name;
		this.price=price;
		this.number=number;
	}
	
	public void setMoney(float money){
		this.money=money;
	}
	public static void setDiscount(int discount){
		 List.discount=discount;
	}
	
	public void print2(){
		System.out.println(this.name +"    "+this.price+"    " +this.number +"     "+this.money);
	}
	public static void main (String[] args){
		List[] list=new List[3];
		list[0]=new List("T恤   ",245.0F,2);
		list[1]=new List("网球拍",570.0F,1);
		list[2]=new List("网球鞋",320.0F,1);
		System.out.print("请输入本次购物的折扣:");
		Scanner scan=new Scanner(System.in);
		int discount=scan.nextInt();
		System.out.print("请输入本次购物顾客给的总钱数:");
		//Scanner scan=new Scanner(System.in);
		int enterMoney=scan.nextInt();
		List.setDiscount(discount);
		
		for(int j=0;j<3;j++){
			list[j].setMoney(money1(list[j].price,list[j].number));
		}
		
		 //所有商品没有打折的总钱数
		float totalMoney=totalMoney1(list[0].money,list[1].money,list[2].money);
		//打完折的价钱
		float disMoney=disMoney1(totalMoney,discount);
		//所找的零钱
		float change =change1(enterMoney,totalMoney);
		
		System.out.println("****************消费单******************");
	    System.out.println("购买商品  "+"单价    "+"个数    "+"金额");
		System.out.println();
		for(int j=0;j<3;j++){
			list[j].print2();
		}
	    System.out.println("折扣:          "+List.discount);
	    System.out.println("消费总金额:    "+disMoney);
	    System.out.println("找钱:          "+change);
		System.out.println("本次购物所获得的积分是33积分");

	    
		
	}	
		//求一类商品的总价格
		public static float money1(float price,int number){
			return price*number;
		}
			
		public static float totalMoney1(float money1,float money2,float money3){
			return money1+money2+money3;
		}
		
		public static float disMoney1(float totalMoney,int discount){
			return totalMoney*discount*0.1F;
		}
		public static float change1(float enterMoney,float totalMoney){
		     return enterMoney-totalMoney;
		}
		

}
	
