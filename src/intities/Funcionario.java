package intities;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void incremento(double porcentagem) {
		salario += (salario / 100 * porcentagem);
	}
	
	public String toString() {
		return id
				+ ", "
				+ nome
				+ ", "
				+ String.format("%.2f", salario);
	}
}
