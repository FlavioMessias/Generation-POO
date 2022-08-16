package ProjetoConversordeMoedas;

import java.util.Scanner;

public class projeto_conversor_v1_0
{
	public static void main(String[] args)
	{
		int op;
		int realConvert, yuanConvert, rupiaConvert, rubloConvert, randConvert;
		double valorConvertido;

		Scanner leia = new Scanner(System.in);
		Conversor conversao = new Conversor(0);
		
		do
		{
			System.out.println("\nDigite sua moeda nativa para conversão: "
				+ "\n1-Real"
				+ "\n2-Rublo Russo"
				+ "\n3-Yuan Renminbi Chinês"
				+ "\n4-Rupias Indianas"
				+ "\n5-Rand Sulafricano"
				+ "\n0-Sair");
				op = leia.nextInt();
			switch (op)
			{
				case 0:
					{
					System.out.println("\nSaindo...");
					break;
					}
				case 1: // real para outras moedas
					{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Rublo Russo"
						+ "\n2-Yuan Renminbi Chinês"
						+ "\n3-Rupias Indianas"
						+ "\n4-Rand Sulafricano"
						+ "\n0-Voltar");
					
					realConvert = leia.nextInt();
					switch (realConvert)
						{
						case 0:
							{
							System.out.println("\nVoltando...");
							break;
							}
						case 1: // Real para Rublo Russo
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.082);
							break;	
							}
							case 2: // Real para Yuan Renminbi Chinês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.1119);
							break;
							}
						case 3: // Real para Rupias Indianas
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.6739);
							break;
							}
						case 4: // Real para Rand Sulafricano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.6739);
							break;
							}
						default:
							{
							System.out.println("\nOpção invalida, tente novamente!!!");
							}
							break;
						}
							System.out.println("\n");
							break;
					}
				case 2: // Menu - Rublo Russo para outras moedas.
				{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Real"
						+ "\n2-Yuan Renminbi Chinês"
						+ "\n3-Rupias Indianas"
						+ "\n4-Rand Sulafricano"
						+ "\n0-Voltar");

					rubloConvert = leia.nextInt();
					switch (rubloConvert) {
						case 0:
							{
							System.out.println("\nVoltando...");
							break;
							}
						case 1: // Rublo Russo para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.082);
							break;	
							}
						case 2: // Rublo Russo para Yuan Renminbi Chinês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.1119);
							break;
							}
						case 3: // Rublo Russo para Rupias Indianas
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.6739);
							break;
							}
						case 4: // Rublo Russo para Raid Sulafricano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.6739);
							break;
							}
						default:
							{
							System.out.println("\nOpção invalida, tente novamente!!!");
							}
						}
							System.out.println("\n");
							break;
				}
				case 3: //Yuan para outras moedas
						{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Real"
						+ "\n2-Rublo Russo"
						+ "\n3-Rupias Indianas"
						+ "\n4-Rand Sulafricano"
						+ "\n0-Voltar");

					yuanConvert = leia.nextInt();
					switch (yuanConvert)
							{
						case 0: // Voltar
							{
							System.out.println("\nVoltando...");
							break;
							}
						case 1: //Yuan para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.7566);
							break;	
							}
						case 2: // Yuan para Rublo Russo
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,9.2325);
							break;
							}
						case 3: // Yuan para Rupias Indianas
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.6739);
							break;
							}
						case 4: // Yuan para Rand Sulafricano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.6739);
							break;
							}
						default:
							{
							System.out.println("\nOpção invalida, tente novamente!!!");
							}
						}
							System.out.println("\n");
							break;
					}
				case 4: // Rupias Indianas para outras moedas
				{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Real"
						+ "\n2-Rublo Russo"
						+ "\n3-Yuan Renminbi Chinês"
						+ "\n4-Rand Sulafricano"
						+ "\n0-Voltar");
					
					rupiaConvert = leia.nextInt();
					switch (rupiaConvert)
						{
						case 0:
							{
							System.out.println("\nVoltando...");
							break;
							}
						case 1: //Rupias Indianas para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,3.9901);
							break;	
							}
						case 2: // Rupias Indianas para Rublo Russo
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,48.7013);
							break;
							}
						case 3: // Rupias Indianas para Yuan Renminbi Chinês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,5.2754);
							break;
							}
						case 4: // Rupias Indianas para Rand Sulafricano
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.6739);
							break;
							}
						default:
							{
							System.out.println("\nOpção invalida, tente novamente!!!");
							}
						}	
							System.out.println("\n");
							break;
				}
				case 5: // Rand Sulafricano para outras moedas
				{
					System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Real"
						+ "\n2-Rublo Russo"
						+ "\n3-Yuan Renminbi Chinês"
						+ "\n4-Rupias Indianas"
						+ "\n0-Voltar");
					
					randConvert = leia.nextInt();
					switch (randConvert)
						{
						case 0:
							{
							System.out.println("\nVoltando...");
							}
						case 1: //Rand Sulafricano para Real
							{
							System.out.printf("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,3.9901);
							break;	
							}
						case 2: // Rand Sulafricano para Rublo Russo
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,48.7013);
							break;
							}
						case 3: // Rand Sulafricano para Yuan Renminbi Chinês
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,5.2754);
							break;
							}
						case 4: // Rand Sulafricano para Rupias Indianas
							{
							System.out.println("\nEntre com valor a ser convertido: ");
							conversao.setValor(leia.nextDouble());
							conversao.conversaoMult(conversao.valor,0.6739);
							break;
							}
						default:
							{
							System.out.println("\nOpção invalida, tente novamente!!!");
							}
						}
							System.out.println("\n");
							break;
				}	
			}
			
		if (op>5 || op<0)
			System.out.println("\nEntre com uma opção valida!!!");
		}
	while (op!=0);
		System.out.println("Obrigado por usar nosso programa!!!");
	}
}