public class Lab3Program {
	public static void main(String[] args) {
		
		float farenheit,centigrade;
		farenheit=(float) 98.6;
		centigrade=(5F/9)*(farenheit-32);
		
		System.out.println("farenheit is: "+farenheit+", and the centigrade is: "+centigrade);
		
		for(farenheit=0; farenheit<=40; farenheit+=5) {
			centigrade=(5F/9)*(farenheit-32);
			System.out.println("farenheit is: "+farenheit+", and the centigrade is: "+centigrade);
		}
		
		farenheit=0;
		while(farenheit<=40) {
			centigrade=(5F/9)*(farenheit-32);
			System.out.println("farenheit is: "+farenheit+", and the centigrade is: "+centigrade);
			farenheit=farenheit+=5;
		}
	}
}

