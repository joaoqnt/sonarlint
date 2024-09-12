package domain;

public class PessoaJuridica implements Validavel {

    private String nome;

    @Override
    public boolean valida() {
        boolean validouCnpj = true;
        return validaGenerico(nome) && validouCnpj && isPessoaRegular();
    }

    public boolean isPessoaRegular() {

        return true;
    }
    
}
