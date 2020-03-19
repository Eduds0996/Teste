package ppi.pais;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
 public class PaisTest {
	Pais pais, copia;
	static int id = 0;
	
	/*
	@Before
	public void setUp() throws Exception {
		System.out.println("Configurando");
		pais = new Pais(1 , "Brasil" , 211254285 , 8511000.00);
		copia = new Pais(1 , "Brasil" , 211254285 , 8511000.00);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
		System.out.println("Pais" + copia.getId() + "Pais" + pais.getId());
	}
	*/
	
	@Test
	public void test00Carregar() {
		System.out.println("Carregar");
		
		Pais fixture = new Pais(1 , "Brasil" , 211254285 , 8511000.00);
		Pais novo = new Pais(15 , "" , 0, 0.0);
		novo.carregar();
		assertEquals("Carregando... " , novo.toString() , fixture.toString() );	
	}
	
	/*
	 * System.out.println("criar");
		id = paisService.criar(pais);
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	 */
	
	@Test
	public void test01Criar() {
		System.out.println("Criar");
		
		PaisDAO.criar("Brasil" , 211254285 , 8511000.00);
		
	}

	@Test
	public void test02Atualizar() {
		System.out.println("Atualizar");
		pais.setArea(89.01);
		copia.setArea(78.25);
		copia.atualizar();
		copia.carregar();
		assertEquals("Atualizando... ", copia.toString() , pais.toString());	
	}

	@Test
	public void testExcluir() {
		System.out.println("Excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0);
		pais.excluir();
		pais.carregar();
		assertEquals("Excluindo... " , copia.toString() , pais.toString());
	}
	
	@Test
	public void testMaiorPopulacao() {
		pais.getMaiorpop();
		assertEquals("Testa Maior população", "China", pais.getMaiorpop());
		
	}

	@Test
	public void testMenorArea() {
		pais.getMenorarea();
		assertEquals("Testa menor Area: ", "Japão", pais.getMenorarea());
	}
}
/*


	@Test
	public void test00Carregar() {
		System.out.println("Carregar pa�s");
		System.out.println(PaisDAO.carregar(1));
		System.out.println(PaisDAO.carregar(2));
		System.out.println(PaisDAO.carregar(3));
		System.out.println(PaisDAO.carregar(4));
		System.out.println(PaisDAO.carregar(5));
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Test
	public void test01Criar() {
		System.out.println("Criar pa�s");
		PaisDAO.criar("Espanha11", 11146524943L, 99504030);
		System.out.println(PaisDAO.carregar(6));
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Test
	public void test02Atualizar() {
		System.out.println("Atualizar pa�s");
		PaisDAO.atualizar(6, "Kaue", 123456789, 987654321);
		System.out.println(PaisDAO.carregar(6));
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Test
	public void test03Excluir() {
		System.out.println("Excluir pa�s");
		PaisDAO.excluir(13);
		System.out.println(PaisDAO.carregar(6));
		System.out.println("--------------------------------------------------------------------------------------------");
	}

	@Test
	public void test04PaisMaisHab() {
		System.out.println("Busca do pa�s mais habitado");
		System.out.println(PaisDAO.buscaPaisMaisHab());
		System.out.println("--------------------------------------------------------------------------------------------");
	}
	
	@Test
	public void test05PaisMenor() {
		System.out.println("Busca do pa�s menor");
		System.out.println(PaisDAO.buscaPaisMenor());
		System.out.println("--------------------------------------------------------------------------------------------");
	}
	
	@Test
	public void test06Vetor() {
		System.out.println("Vetor 3 pa�ses");
		Pais[] vetor = PaisDAO.Vetor();
		for (Pais pais : vetor) {
			System.out.println(pais);
		}
		System.out.println("--------------------------------------------------------------------------------------------");
	}

*/