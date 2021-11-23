import static org.junit.Assert.assertFalse;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExemploCadastroTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
		
	 public void validarCadastro() throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nome, profissao,rg;
        int data;
        System.out.println("Informe seu nome");
        nome = teclado.nextLine();
        System.out.println("Informe sua profissão");
        profissao = teclado.nextLine();
        System.out.println("Informe seu rg(XX-XXX-XXX-X)");
        rg = teclado.nextLine();
        System.out.println("Informe o sua idade");
        data = teclado.nextInt();
        assert nome.length() > 3 &&  nome.length() < 40 && nome.matches("[A-Za-z\\s]*");
        assertFalse(data < 16);
        assert profissao.length() > 3 &&  profissao.length() < 40 && profissao.matches("[A-Za-z\\s]*");
        assert rg.length() == 12;
        
        System.out.println(
            "nome :" + nome + "\n"+
            "idade :" + data + "\n"+
            "profissao :" + profissao + "\n"+
            "rg :" + rg  + "\n cadastradx com sucesso!"
        );
        teclado.close();
		
    }

}
