import java.util.Scanner;

public class Calc {

    static public void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();

        String opc="S";
        Operacao operacaoEscolhida = new Operacao();

        while(opc.equalsIgnoreCase("s")) {
            Numero resp = null;
            boolean validaN1 = false;
            boolean validaN2 = false;

            while (!validaN1) {

                try {
                    System.out.printf("%nDigite o valor 1: ");
                    n1.setValor(scanner.nextInt());
                    validaN1 = true;

                } catch (Exception e) {
                    System.out.println("O texto digitado não é valido, por favor digite um número.");
                    scanner.next();

                }

            }

            while (!validaN2) {

                try {
                    System.out.printf("%nDigite o valor 2: ");
                    n2.setValor(scanner.nextInt());
                    validaN2 = true;

                } catch (Exception e) {
                    System.out.println("O texto digitado não é valido, por favor digite um número.");
                    scanner.next();

                }

            }

            while(resp == null){
                System.out.printf("%nEscolha a operação que será feita?(+ - * /): ");

                resp = operacaoEscolhida.getResultadoOperacao(n1, n2, new Operacao(scanner.next()));
            }

            System.out.println("O resultado da operação é: " + resp.getValor());

            System.out.printf("%nDeseja fazer outro cálculo? S ou N%n");
            opc = scanner.next();
            System.out.printf("%n");
        }
    }

}
