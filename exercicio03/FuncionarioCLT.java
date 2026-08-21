package exercicio03;

public class FuncionarioCLT extends Funcionario{

	public Double valeTransporte ;
	public Double valeAlimentacao;
	
	public FuncionarioCLT(String nome, String matricula, Double salarioBase, String dataAdmissao, Double valeTransporte, Double valeAlimentacao) {
		super(nome,matricula,salarioBase,dataAdmissao);
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;
	}

	
	
	@Override
	public double calcularSalario() {
		
		return super.calcularSalario()
				+ valeTransporte
				+ valeAlimentacao;
	}

	@Override
	public double calcularDesconto() {
		
		return super.calcularDesconto()50.00;
	}

	
	
	
}
