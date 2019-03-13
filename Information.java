public class Information{
	private String name;
	private boolean sex;  //false 表示女性
	private String tel;
	private String post;
	private int age;
	private String adress;
	
	public Information(String name,boolean sex){
		this.name=name;
		this.sex=sex;
	}
	public String getTel(){
		return this.tel;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getPost(){
		return this.post;
	}
	public void setPost(String post){
		this.post=post;
	}
	public String getAdress(String adress){
		return this.adress;
	}
	public void setAdress(String adress){
		this.adress=adress;
	}
	public String sexChange(boolean a){
		if (sex==false){
			return "女生";
		}else{
			return"男生";
		}
	}
	public void print(){
		System.out.println("这个人的名字是："+this.name);
		System.out.println("这个人的性别是："+sexChange(this.sex));
		System.out.println("这个人的电话是："+this.tel);
		System.out.println("这个人的Post是："+this.post);
		System.out.println("这个人的年龄是："+this.age);
		System.out.println("这个人的地址是："+this.adress);
	}	
	public static void main (String[] args){
		Information presion=new Information("Marry",false);
		presion.setTel("13361173971");
		presion.setPost("HR");
		presion.setAge(26);
		presion.setAdress("北京");
		presion.print();
		
	}
}