import java.util.Scanner;

public class Operacoes {

    String operacao = "";

    public Operacoes() {

        String operacao = "";


    }

    public void setOperacao(String operacao) {

        while (operacao != "+" || operacao != "-"
                || operacao != "/" || operacao != "*") {


            if (operacao.equals("+") || operacao.equals("-")
                    || operacao.equals("/") || operacao.equals("*")) {

                this.operacao = operacao;


            } else {
                System.out.printf("%nOperação inválida, por favor digite outra.%n");
            }


        }

    }
    public String getOperacao() {

        return this.operacao;
    }
}



