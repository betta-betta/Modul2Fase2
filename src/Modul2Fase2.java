import java.util.*;
import java.util.Iterator;
public class Modul2Fase2 {
//Scanner entrada =new Scanner(System.in)
	public static void main(String[] args) {
		

		ArrayList<Character> nom = new ArrayList <Character>();
		nom.add('L');
		nom.add('l');
		nom.add('u');
		nom.add('i');
		nom.add('s');
		nom.add('1');
		System.out.println("Total de car�cters al ArrayList son : "+nom.size());
		System.out.println(nom);
		Iterator<Character> buscador= nom.iterator();
		while (buscador.hasNext()) {
			Character lletra = buscador.next();
			if (lletra.equals('a')||lletra.equals('e')|| lletra.equals('i')||lletra.equals('o')
					||lletra.equals('u')) {
				System.out.println("Vocal");}
				else if (lletra.equals('1')||lletra.equals('2')||lletra.equals('3')||lletra.equals('4')||
							lletra.equals('5')||lletra.equals('6')||lletra.equals('7')||lletra.equals('8')||
							lletra.equals('9')||lletra.equals('0')) {
						System.out.println("Els noms de persones no contenen n�meros");}
				else	
			
			{
				System.out.println("Consonant");
	
			}
		}
	}
}

		
		
		
		

	

