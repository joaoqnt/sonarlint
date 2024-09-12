package domain;

public class PessoaEstrangeira implements Validavel {

    private String nome;

    @Override
    public boolean valida() {
        boolean validouPassaporte = true;
        
        return validaGenerico(nome) && validouPassaporte;        
    }

}
