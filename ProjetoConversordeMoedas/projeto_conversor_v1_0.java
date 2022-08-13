package ProjetoConversordeMoedas;

import java.util.Scanner;

public class projeto_conversor_v1_0
{

	public static void main(String[] args)
	{
		int op, op2, op3, op4, op5, op6, op7, op8, op9, op10;
		int realConvert, dolarAmConvert, EuroConvert, LibraConvert, IeneConvert;
		int yuanConvert, dolarCnConvert, DolarAustConvert, PesoMxConvert, RubloConvert, zlotyConvert;
		double valorConvertido;

		Scanner leia = new Scanner(System.in);
		Conversor conversaoDiv = new Conversor(0);
		Conversor conversaoMult = new Conversor(0);
		
		do
		{
			System.out.println("\nDigite sua moeda nativa para conversão: "
				+ "\n1-Real"
				+ "\n2-Dólar Americano"
				+ "\n3-Euro"
				+ "\n4-Libra Esterlina"
				+ "\n5-Iene Japonês"
				+ "\n6-Yuan Renminbi Chinês"
				+ "\n7-Dólar Canadense"
				+ "\n8-Dolar Australiano"
				+ "\n9-Peso Mexicano"
				+ "\n10-Rublo Russo"
				+ "\n11-Zloty Polonês"
				+ "\n0-Sair");
				op = leia.nextInt();
			switch (op)
			{
				case 1: // real para outras moedas
				{
				System.out.println("\nDefina para qual moeda converter: "
					+ "\n1-Dólar Americano"
					+ "\n2-Euro"
					+ "\n3-Libra Esterlina"
					+ "\n4-Iene Japonês"
					+ "\n5-Yuan Renminbi Chinês"
					+ "\n6-Dólar Canadense"
					+ "\n7-Dolar Australiano"
					+ "\n8-Peso Mexicano"
					+ "\n9-Rublo Russo"
					+ "\n10-Zloty Polonês");
					realConvert = leia.nextInt();

					switch (realConvert)
					{
						case 1: // Real para Dólar Americano
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,5.0764);
						break;
						}
						case 2: // Real para Euro
						{
						System.out.printf("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,5.2097);
						break;	
						}
						case 3: // Real para Libra Esterlina
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,6.1636);
						break;
						}
						case 4: // Real para Iene Japonês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,26.2857);
						break;
						}
						case 5: // Real para Yuan Renminbi Chinês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,1.3283);
						break;
						}
						case 6: // Real para Dólar Canadense
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,3.9733);
						break;
						}
						case 7: // Real para Dolar Australiano
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,3.6178);
						break;
						}
						case 8: // Real para Peso Mexicano
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,3.9060);
						break;
						}
						case 9: // Real para Rublo Russo
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,12.1149);
						break;
						}
						case 10: // Real para Zloty Polonês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,1.1190);
						break;
						}
						default
						{
						System.out.println("\nEntre com uma opção valida!!!");
						}
					}
				}
				
				case 2: // real para outras moedas
				{
				System.out.println("\nDefina para qual moeda converter: "
					+ "\n1-Dólar Americano"
					+ "\n2-Euro"
					+ "\n3-Libra Esterlina"
					+ "\n4-Iene Japonês"
					+ "\n5-Yuan Renminbi Chinês"
					+ "\n6-Dólar Canadense"
					+ "\n7-Dolar Australiano"
					+ "\n8-Peso Mexicano"
					+ "\n9-Rublo Russo"
					+ "\n10-Zloty Polonês");
					dolarAmConvert = leia.nextInt();

					switch (dolarAmConvert)
					{
						case 1: // Dólar Americano para Real 
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,5.1017);
						break;
						}
						case 2: // Dólar Americano para Euro
						{
						System.out.printf("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,0.975);
						break;	
						}
						case 3: // Dólar Americano para Libra Esterlina
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,0.8243);
						break;
						}
						case 4: // Dólar Americano para Iene Japonês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,133.57);
						break;
						}
						case 5: // Dólar Americano para Yuan Renminbi Chinês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,6.7425);
						break;
						}
						case 6: // Dólar Americano para Dólar Canadense
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,1.2782);
						break;
						}
						case 7: // Dólar Americano para Dolar Australiano
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,1.4073);
						break;
						}
						case 8: // Dólar Americano para Peso Mexicano
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,19.856);
						break;
						}
						case 9: // Dólar Americano para Rublo Russo
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,60.25);
						break;
						}
						case 10: // Dólar Americano para Zloty Polonês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,4.5414);
						break;
						}
						default
						{
						System.out.println("\nEntre com uma opção valida!!!");
						}
					}
				}
				case 3: //Euro para outras moedas
					{
						System.out.println("\nDefina para qual moeda converter: "
							+ "\n1-Dólar Americano"
							+ "\n2-Real"
							+ "\n3-Libra Esterlina"
							+ "\n4-Iene Japonês"
							+ "\n5-Yuan Renminbi Chinês"
							+ "\n6-Dólar Canadense"
							+ "\n7-Dolar Australiano"
							+ "\n8-Peso Mexicano"
							+ "\n9-Rublo Russo"
							+ "\n10-Zloty Polonês");
							EuroConvert = leia.nextInt();

							switch (EuroConvert)
							{
								case 1: // Euro para Dólar Americano
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoDiv.setValor(leia.nextDouble());
								conversaoDiv.conversaoDiv(conversaoDiv.valor,1.0255);
								break;
								}
								case 2: // Euro para Real
								{
								System.out.printf("\nEntre com valor a ser convertido: ");
								conversaoDiv.setValor(leia.nextDouble());
								conversaoDiv.conversaoDiv(conversaoDiv.valor,5.2318);
								break;	
								}
								case 3: // Euro para Libra Esterlina
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoDiv.setValor(leia.nextDouble());
								conversaoDiv.conversaoDiv(conversaoDiv.valor,0.8453);
								break;
								}
								case 4: // Euro para Iene Japonês
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoMult.setValor(leia.nextDouble());
								conversaoMult.conversaoMult(conversaoMult.valor,136.976);
								break;
								}
								case 5: // Euro para Yuan Renminbi Chinês
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoMult.setValor(leia.nextDouble());
								conversaoMult.conversaoMult(conversaoMult.valor,6.9144);
								break;
								}
								case 6: // Euro para Dólar Canadense
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoDiv.setValor(leia.nextDouble());
								conversaoDiv.conversaoDiv(conversaoDiv.valor,1.3108);
								break;
								}
								case 7: // Euro para Dolar Australiano
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoDiv.setValor(leia.nextDouble());
								conversaoDiv.conversaoDiv(conversaoDiv.valor,1.4431);
								break;
								}
								case 8: // Euro para Peso Mexicano
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoMult.setValor(leia.nextDouble());
								conversaoMult.conversaoMult(conversaoMult.valor,20.3623);
								break;
								}
								case 9: // Euro para Rublo Russo
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoMult.setValor(leia.nextDouble());
								conversaoMult.conversaoMult(conversaoMult.valor,61.7864);
								break;
								}
								case 10: // Euro para Zloty Polonês
								{
								System.out.println("\nEntre com valor a ser convertido: ");
								conversaoDiv.setValor(leia.nextDouble());
								conversaoDiv.conversaoDiv(conversaoDiv.valor,4.4672);
								break;
								}
								default
								{
								System.out.println("\nEntre com uma opção valida!!!");
				}
			}
		}
				case 4: //Libra para outras moedas
				{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Real"
						+ "\n3-Euro"
						+ "\n4-Iene Japonês"
						+ "\n5-Yuan Renminbi Chinês"
						+ "\n6-Dólar Canadense"
						+ "\n7-Dolar Australiano"
						+ "\n8-Peso Mexicano"
						+ "\n9-Rublo Russo"
						+ "\n10-Zloty Polonês");
						LibraConvert = leia.nextInt();

						switch (LibraConvert)
						{
							case 1: // Libra para Dólar Americano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,1.2131);
							break;
							}
							case 2: // Libra para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,6.1869);
							break;	
							}
							case 3: // Libra para Euro
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,1.1828);
							break;
							}
							case 4: // Libra para Iene Japonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,162.0338);
							break;
							}
							case 5: // Libra para Yuan Renminbi Chinês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,8.1793);
							break;
							}
							case 6: // Libra para Dólar Canadense
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,1.5506);
							break;
							}
							case 7: // Libra para Dolar Australiano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,1.7071);
							break;
							}
							case 8: // Libra para Peso Mexicano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,24.0873);
							break;
							}
							case 9: // Libra para Rublo Russo
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,73.0893);
							break;
							}
							case 10: // Libra para Zloty Polonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,5.5092);
							break;
							}
							default
							{
							System.out.println("\nEntre com uma opção valida!!!");
							}
						}
					}
				case 5: //Iene para outras moedas
				{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Real"
						+ "\n3-Euro"
						+ "\n4-Libra Esterlina"
						+ "\n5-Yuan Renminbi Chinês"
						+ "\n6-Dólar Canadense"
						+ "\n7-Dolar Australiano"
						+ "\n8-Peso Mexicano"
						+ "\n9-Rublo Russo"
						+ "\n10-Zloty Polonês");
						IeneConvert = leia.nextInt();

						switch (IeneConvert)
						{
							case 1: // Iene para Dólar Americano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.0075);
							break;
							}
							case 2: // Iene para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.0382);
							break;	
							}
							case 3: // Iene para Euro
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.0073);
							break;
							}
							case 4: // Iene para Libra
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,0.0062);
							break;
							}
							case 5: // Iene para Yuan Renminbi Chinês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,0.0505);
							break;
							}
							case 6: // Iene para Dólar Canadense
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.0096);
							break;
							}
							case 7: // Iene para Dolar Australiano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.0105);
							break;
							}
							case 8: // Iene para Peso Mexicano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,0.1487);
							break;
							}
							case 9: // Iene para Rublo Russo
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,0.466);
							break;
							}
							case 10: // Iene para Zloty Polonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.034);
							break;
							}
							default
							{
							System.out.println("\nEntre com uma opção valida!!!");
							}
						}
					}
				case 6: //Yuan para outras moedas
				{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Real"
						+ "\n3-Euro"
						+ "\n4-Libra Esterlina"
						+ "\n5-Iene Japonês"
						+ "\n6-Yuan Renminbi Chinês"
						+ "\n7-Dolar Australiano"
						+ "\n8-Peso Mexicano"
						+ "\n9-Rublo Russo"
						+ "\n10-Zloty Polonês");
						yuanConvert = leia.nextInt();

						switch (yuanConvert)
						{
							case 1: //Yuan  para Dólar Americano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.1483);
							break;
							}
							case 2: //Yuan para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.7566);
							break;	
							}
							case 3: // Yuan para Euro
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.1446);
							break;
							}
							case 4: // Yuan para Libra
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,0.1223);
							break;
							}
							case 5: // Yuan para Iene Japonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,19.8116);
							break;
							}
							case 6: // Yuan para Dólar Canadense
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.1896);
							break;
							}
							case 7: // Yuan para Dolar Australiano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.2088);
							break;
							}
							case 8: // Yuan para Peso Mexicano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,2.9461);
							break;
							}
							case 9: // Yuan para Rublo Russo
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,9.2325);
							break;
							}
							case 10: // Yuan para Zloty Polonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.6739);
							break;
							}
							default
							{
							System.out.println("\nEntre com uma opção valida!!!");
							}
						}
					}
				case 7: // Dolar Canadense para outras moedas
				{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Real"
						+ "\n3-Euro"
						+ "\n4-Libra Esterlina"
						+ "\n5-Iene Japonês"
						+ "\n6-Yuan Renminbi Chinês"
						+ "\n7-Dolar Australiano"
						+ "\n8-Peso Mexicano"
						+ "\n9-Rublo Russo"
						+ "\n10-Zloty Polonês");
						dolarCnConvert = leia.nextInt();

						switch (dolarCnConvert)
						{
							case 1: //Dolar Canadense  para Dólar Americano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.7821);
							break;
							}
							case 2: //Dolar Canadense para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,3.9901);
							break;	
							}
							case 3: // Dolar Canadense para Euro
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.7629);
							break;
							}
							case 4: // Dolar Canadense para Libra
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,0.6449);
							break;
							}
							case 5: // Dolar Canadense para Iene Japonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,104.5063);
							break;
							}
							case 6: // Dolar Canadense para Yuan Renminbi Chinês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,5.2754);
							break;
							}
							case 7: // Dolar Canadense para Dolar Australiano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,1.1013);
							break;
							}
							case 8: // Dolar Canadense para Peso Mexicano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,15.5406);
							break;
							}
							case 9: // Dolar Canadense para Rublo Russo
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,48.7013);
							break;
							}
							case 10: // Dolar Canadense para Zloty Polonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,3.5548);
							break;
							}
							default
							{
							System.out.println("\nEntre com uma opção valida!!!");
							}
						}
					}
				case 8: // Dolar Australiano para outras moedas
				{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Real"
						+ "\n3-Euro"
						+ "\n4-Libra Esterlina"
						+ "\n5-Iene Japonês"
						+ "\n6-Yuan Renminbi Chinês"
						+ "\n7-Dolar Canadense"
						+ "\n8-Peso Mexicano"
						+ "\n9-Rublo Russo"
						+ "\n10-Zloty Polonês");
						DolarAustConvert = leia.nextInt();

						switch (DolarAustConvert)
						{
							case 1: //Dolar Australiano para Dólar Americano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.7104);
							break;
							}
							case 2: //Dolar Australiano para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,3.6242);
							break;	
							}
							case 3: // Dolar Australiano para Euro
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.5856);
							break;
							}
							case 4: // Dolar Australiano para Libra
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,0.6449);
							break;
							}
							case 5: // Dolar Australiano para Iene Japonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,94.8881);
							break;
							}
							case 6: // Dolar Australiano para Yuan Renminbi Chinês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,4.7899);
							break;
							}
							case 7: // Dolar Australiano para Dolar Canadense
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,0.908);
							break;
							}
							case 8: // Dolar Australiano para Peso Mexicano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,14.1057);
							break;
							}
							case 9: // Dolar Australiano para Rublo Russo
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoMult.setValor(leia.nextDouble());
							conversaoMult.conversaoMult(conversaoMult.valor,42.8016);
							break;
							}
							case 10: // Dolar Australiano para Zloty Polonês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversaoDiv.setValor(leia.nextDouble());
							conversaoDiv.conversaoDiv(conversaoDiv.valor,3.2262);
							break;
							}
							default
							{
							System.out.println("\nEntre com uma opção valida!!!");
							}
						}
					}
				}	
			}
		while (op!=0);
	}
	
}
