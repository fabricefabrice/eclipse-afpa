import java.util.Scanner;

public class ExoLectureClavier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("DEBUT") ;
		
		int a = sc.nextInt() ;
		int b = sc.nextInt() ; 
		 
		if(a >= b) {
			System.out.println(a + ">=" +b)  ;
		} else {
			System.out.println(a + "<=" +b)  ;
		}
		System.out.print("FIN") ;	

	}

}
