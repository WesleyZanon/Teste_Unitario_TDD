package PackageDefault;

public class Funcionario {
	
	private String name;
	private int idade;
	private ContratoEnum tipoContrato;
	
	public Funcionario(String name, int idade) {
	 this.name = name;
	 this.idade = idade;
	 }
	
	 // GRAFO DE FLUXO
	 public void setContrato() {
		 
	 if (idade < 16) // (1)
	 tipoContrato = ContratoEnum.DESEMPREGADO;
	 
	// (2)
	else if (idade < 18) // (3)
	tipoContrato = ContratoEnum.MEIO_PERIODO;
	 
	// (4)
	else if (idade < 55) // (5)
	tipoContrato =
	ContratoEnum.PERIODO_INTEGRAL; // (6)
	 else
	 tipoContrato = ContratoEnum.DESEMPREGADO;
	 
	// (7)
	 } // (8)
	 public ContratoEnum getTipoContrato() {
	 return this.tipoContrato;
	 }
	 
	 public enum ContratoEnum {
		 PERIODO_INTEGRAL,
		 MEIO_PERIODO,
		 DESEMPREGADO
		}

}
