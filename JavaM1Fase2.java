
public class JavaM1Fase2 {

	public static void main(String[] args) {
		// calcul anys de traspas desde 1948 a 1971
		
		int b=0;
				for(int a=1948; a<=1971;a++) {
					if(((a % 4 ==0) &&(a %100 != 0))||(a%400==0)) {
						b++;
						System.out.println (+b);
					}
				}
	}

}
