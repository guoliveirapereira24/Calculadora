import java.util.Scanner;

public class Calc {

    static public void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero resp = new Numero();
        String opc="S";
        Operacoes operacaoEscolhida = new Operacoes();

        while(opc.equals("s") || opc.equals("S")) {

            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scanner.nextInt());

            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scanner.nextInt());

            System.out.printf("%nQual a operação que será feita?(+ - * /): ");


            operacaoEscolhida.setOperacao(scanner.next());



            /*if (operacaoEscolhida.getOperacao().equals("+")) {

                resp.setValor(n1.getValor() + n2.getValor());
                System.out.printf("%nA Soma de %d com %d é igual a %d"
                        , n1.getValor(), n2.getValor(), resp.getValor());

            }else if (operacaoEscolhida.getOperacao().equals("-")) {
                resp.setValor(n1.getValor() - n2.getValor());
                System.out.printf("%nA Subtração de %d com %d é igual a %d"
                        , n1.getValor(), n2.getValor(), resp.getValor());

            } else if (operacaoEscolhida.getOperacao().equals("*")) {
                resp.setValor(n1.getValor() * n2.getValor());
                System.out.printf("%nA Multiplicação de %d com %d é igual a %d"
                        , n1.getValor(), n2.getValor(), resp.getValor());
            }else {
                resp.setValor(n1.getValor() / n2.getValor());
                System.out.printf("%nA Divisão de %d com %d é igual a %d"
                        , n1.getValor(), n2.getValor(), resp.getValor());
            }
           */

            System.out.printf("%nDeseja fazer outro calculo?");
            opc = scanner.next();
            System.out.printf("%n");
        }
    }

}
