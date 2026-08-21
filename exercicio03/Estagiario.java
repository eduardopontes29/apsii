package exercicio03;

public class Estagiario extends Funcionario {
		protected double valorBolsaAuxilio;
		protected int cargaHorariaSemanal;

		public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao, double valorBolsaAuxilio,
				int cargaHorariaSemanal) {
			super(nome, matricula, salarioBase, dataAdmissao);
			this.valorBolsaAuxilio = valorBolsaAuxilio;
			this.cargaHorariaSemanal = cargaHorariaSemanal;
		}

		@Override
		public double calcularSalario() {
			return valorBolsaAuxilio;
		}

		@Override
		public double calcularDesconto() {
			return 0;
		}
		
		@Override
		public String toString() {
			return String.format("Estagiário: \n%s | %s | %.0f | %s | \nBolsa: %.0f | Carga horária: %d", 
					nome, matricula, salarioBase, dataAdmissao, valorBolsaAuxilio, cargaHorariaSemanal);
		}
		
	}

