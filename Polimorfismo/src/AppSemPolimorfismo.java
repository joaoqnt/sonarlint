import domain.Pessoa;
import domain.PessoaEstrangeira;
import domain.PessoaFisica;
import domain.PessoaJuridica;

public class AppSemPolimorfismo {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new PessoaFisica();
        Pessoa pessoa3 = new PessoaJuridica();
        Pessoa pessoa4 = new PessoaEstrangeira();

        chamaValidacao(pessoa1);
        chamaValidacao(pessoa3);
        chamaValidacao(pessoa4);
    }

}
