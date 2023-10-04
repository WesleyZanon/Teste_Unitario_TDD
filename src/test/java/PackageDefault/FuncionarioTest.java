package PackageDefault;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import PackageDefault.Funcionario.ContratoEnum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class FuncionarioTest {
	
	@Test
	@DisplayName("Dado um possivel funcionario com idade menor que 16 anos"  +
			 "Quando verificado a possibilidade de contratacao " +
			 "Entao ele nao deve ser contratado")

	 void testCase1() {
		
		Funcionario funcionario = new Funcionario("Wesley", 15);
		funcionario.setContrato();
		assertEquals(ContratoEnum.DESEMPREGADO,
		funcionario.getTipoContrato());
	 }
	
	
	@Test
	@DisplayName("Dado um possivel funcionario com idade entre 16 e 18 anos" +
	"Quando verificado a possibilidade de contratacao " +
	"Entoo ele deve ser contrato por meio periodo")
	
	 void testCase2() {
	 Funcionario funcionario = new Funcionario("Wesley", 17);
	 funcionario.setContrato();
	 assertEquals(ContratoEnum.MEIO_PERIODO, funcionario.getTipoContrato());
	 }
	
	
	 @Test
	 @DisplayName("Dado um possivel funcionario com idade entre 18 e 55 anos " +
	 "Quando verificado a possibilidade de contratacao " +
	 "Entao ele deve ser contrato em periodo integral")

	void testCase3() {
	 Funcionario funcionario = new Funcionario("Wesley", 30);
	 funcionario.setContrato();
	assertEquals(ContratoEnum.PERIODO_INTEGRAL, funcionario.getTipoContrato());
	 }
	 
	 @Test
	 @DisplayName("Dado um possivel funcionario com idade maior que 55 anos" +
	 "Quando verificado a possibilidade de contratacao " +
	 "Entao ele nao deve ser contratado")
	 
	 void test4Case() {
	 Funcionario funcionario = new Funcionario("Wesley", 56);
	 funcionario.setContrato();
	 assertEquals(ContratoEnum.DESEMPREGADO,
   	 funcionario.getTipoContrato());
	 }
	 
	}
	 
	 

