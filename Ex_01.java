package exercicios.lista.pkg5;

public class Ex_01 {

    private String nome, sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome.length() > 0) {
            this.sobrenome = sobrenome;
        }
    }

    public String Nome_Completo() {
        StringBuilder builder = new StringBuilder();
        builder.append(nome);
        builder.append(" ");
        builder.append(sobrenome);
        return builder.toString();
    }

}
