import java.util.Scanner;

public class Pave {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Rentrez la longueur");
		double l = scan.nextDouble();
		while (l<0){
			System.out.println("Vous avez rentré un nombre négatif");
			l = scan.nextDouble();
		}
		System.out.println("Rentrez la largeur");
		double L = scan.nextDouble();
		while (L<0){
			System.out.println("Vous avez rentré un nombre négatif");
			L = scan.nextDouble();
		}
		System.out.println("Rentrez la hauteur");
		double h = scan.nextDouble();
		while (h<0){
			System.out.println("Vous avez rentré un nombre négatif");
			h = scan.nextDouble();
		}
		double v=l*L*h;
		System.out.println(v);
	}
}
