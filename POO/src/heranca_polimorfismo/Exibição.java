package heranca_polimorfismo;

import heranca_polimorfismo.caracteristicas.Cachorro;
import heranca_polimorfismo.caracteristicas.Cavalo;
import heranca_polimorfismo.caracteristicas.Preguiça;

public class Exibição {

	public static void main(String[] args) {


		Cachorro cao = new Cachorro ("Rex", 9, "late", "corre");
		{

		}
		Cavalo cal = new Cavalo ("Grace", 14, "Relincha", "corre");
		{

		}
		Preguiça pre = new Preguiça("Prego", 20, "Zurra", "Sobe em arvore");
		{

			
			System.out.println("\nO cachorro "+cao.getAção());
			System.out.println("\nO nome do cavalo é "+cal.getNome());
			System.out.println("\nA preguiça tem "+pre.getIdade()+" anos de idade");
			
		}
	}



	
}
