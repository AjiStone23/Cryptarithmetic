/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptarithmetics;

/**
 *
 * @author ajist
 */
public class Cryptarithmetics {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
			
		String s = "SO + MANY + MORE + MEN + SEEM + TO + SAY + THAT + THEY + MAY + SOON + TRY + TO + STAY + AT + HOME + SO + AS + TO + SEE + OR + HEAR + THE + SAME + ONE + MAN + TRY + TO + MEET + THE + TEAM + ON + THE + MOON + AS + HE + HAS + AT + THE + OTHER + TEN = TESTS";
 
		
		 
		 Alphametic a= new Alphametic(s);
		

		 	System.out.println(a.getTheMap());
	
			System.out.println(a.getTargetString());
			System.out.println(a.getSolution());
		
		
		
	}
	
}
