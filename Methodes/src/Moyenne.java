
public class Moyenne {

	public static void main(String[] args) {
		
			float noteJava = 14f ; 
			float noteHtml = 13f ; 
			float noteJavascript = 9f ; 
			float noteCss = 8.5f ;
				
			int coefJava = 3 ; 
			int coefHtml = 2; 
			int coefJavascript = 3 ; 
			int coefCSs = 1;
			
			float moyenne = (
					(noteJava * coefJava ) 
					+ (noteHtml * coefHtml) 
					+ (noteJavascript * coefJavascript) 
					+ (noteCss * coefCSs)) 
						/ (coefJava + coefHtml + coefJavascript + coefCSs);
			
					
			System.out.println("La moyenne = " + moyenne);
			
		
		

				
			}
		}


