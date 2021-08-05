import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import intities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcionarios serão registrados? ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			
			sc.nextLine();
			
			System.out.println();
			System.out.println("Funcionario #" + ( i + 1) + ":");
			System.out.print("Entre com o Id ");
			Integer id = sc.nextInt();
			
			System.out.print("Entre com o nome ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Entre com o salário ");
			Double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			list.add(funcionario);
		}
		
		System.out.println();
		System.out.println("Entre com o Id do funcionario que terá seu salára incrementado: ");
		int idFuncionario = sc.nextInt();
		Integer pos = posicao(list, idFuncionario);
		
		if(pos == null) {
			System.out.println("Este Id não existe");
		}
		else {
			System.out.println("entre com a porcentagem");
			double porcentagem = sc.nextDouble();
			list.get(pos).incremento(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}
	
		static Integer posicao(List<Funcionario> list, int id) {
			for (int i=0; i<list.size(); i++) {
				if(list.get(i).getId() == id) {
					return i;
				}
			}
			return null;
		}
		
}
