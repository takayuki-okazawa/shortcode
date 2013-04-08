public class Main {
	public static void main(String[] args) {
		int j = 1;

		for(int i = 1; i <= 12; i++){
			int max = 35;
			int day = 31;
			
			System.out.println("\n\n"+i+"月\n|S| M| T| W| T| F| S|");
			
			if(i==2){
				day = 28;
			}
			else if(i%2==0){
				day = 30;
			}
			
			for(int k = 1; k<j; k++)
				System.out.print("   ");
			
			for(int n = 1; n <= day; n++){
				
				if(10>n)
					System.out.print(" ");
				
				if(1!=j&&j%7==0){
					System.out.println(n);
				}
				else{
					System.out.print(n+" ");
				}
				max--;
				j++;
			}
			j = max;
		}
	}
}