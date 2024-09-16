public class Operacao {

    String operacao;

    public Operacao() {
        operacao = "";
    }

    public Operacao(String operacao) {
        this.operacao = operacao;
    }

    public Numero getResultadoOperacao(Numero n1, Numero n2, Operacao operacao) {
        switch (operacao.getOperacao()) {
            case "+":
                return new Numero(n1.getValor() + n2.getValor());
            case "-":
                return new Numero(n1.getValor() - n2.getValor());
            case "*":
                return new Numero(n1.getValor() * n2.getValor());
            case "/":
                return new Numero(n1.getValor() / n2.getValor());
            default:
                System.out.println("Operação inválida!");
                return null;


        }

    }

    public String getOperacao() {
        return this.operacao;
    }

}



