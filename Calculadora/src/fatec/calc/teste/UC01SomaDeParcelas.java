package fatec.calc.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fatec.calc.servico.Calculadora;

public class UC01SomaDeParcelas {

		static Calculadora calculadora;
		
	@Before
	
		public  void setUPBeforeClass() throws Exception{
			
			calculadora = new Calculadora();
		}
	
	@Test
	
		public void CT01UC01SomaDeParcelas_com_sucesso(){
			assertEquals("resultado =",5,calculadora.soma("3,2"));
			
		}
	@Test
	
	public void CT02UC01SomaDeParcelas_com_sucesso(){
		assertEquals("resultado =",5,calculadora.soma("x,2"));
		
	}

	
	@After
	
		public  void tearDownAfterClass() throws Exception{
			
		}
	}

	 

