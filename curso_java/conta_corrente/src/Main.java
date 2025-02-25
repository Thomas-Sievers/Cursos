import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome = "";
        String conta = "";
        double saldo = 0;
        int escolha = 0;

        if( nome.equals("") || conta.equals("")){
            System.out.println("******************");

            System.out.println("Digite seu nome: ");
            nome = leitura.nextLine();

            System.out.println("Sua conta é corrente ou de investimentos? Digite: ");
            conta = leitura.nextLine();

            System.out.println("Qual o saldo da sua conta?");
            saldo = leitura.nextDouble();
        }

        while(escolha != 4){
            System.out.println("******************");

            System.out.println("Qual opção deseja escolher? Digite o número.");
            System.out.println("1. Visualização dos dados");
            System.out.println("2. Fazer pix");
            System.out.println("3. Receber transferencia");
            System.out.println("4. Sair");

            escolha = leitura.nextInt();

            System.out.println("******************");

            if(escolha == 1){
                System.out.println("Nome: " + nome);
                System.out.println("Tipo de conta: " + conta);
                System.out.println("Saldo: " + saldo);
            }
            else if(escolha == 2){
                double valorPix = 0;

                System.out.println("Qual o valor do pix?");
                valorPix = leitura.nextDouble();

                if (valorPix > saldo){
                    System.out.println("Saldo insuficiente");
                }
                else{
                    saldo -= valorPix;
                    System.out.println("Transfêrencia concluida com sucesso!");
                }
            }
            else if(escolha == 3){
                double valorTransferencia = 0;

                System.out.println("Quanto de dinheiro você vai receber?");
                valorTransferencia = leitura.nextDouble();
                saldo += valorTransferencia;
                System.out.println("Transferencia recebida com sucesso!");
            }
        }
    }
}
