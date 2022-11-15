import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pes = new Pessoa();
        Funcionarios func = new Funcionarios(0, 0);
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem Vindo !");
        System.out.println("Digite Seu Nome para Adentrar");
        String nome = scan.next();
        System.out.println("Seja Bem-vindo ! " + nome + ", Adentre no estabelecimento");

        System.out.println("Você possui carteira de Estudante");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int carteirinha = 0;
        carteirinha = scan.nextInt();

        if (carteirinha == 1) {
            System.out.println("Você possui carteirinha ! Ganhe 50% de desconto");
            System.out.println("Você tem 3 filmes a Escolha, selecione um deles");
            System.out.println("1 - Pantera Negra - Wakanda para Sempre");
            System.out.println("2 - Adão Negro");
            System.out.println("3 - One Piece Red");
            double valor = 23.99;
            int films = 4;

            films = scan.nextInt();
            switch (films) {
                case 1:
                    System.out.println("Você escolheu Pantera Negra");
                    System.out.println("Preço Inicial do Ingresso - 23.99$");
                    System.out.println("Seu Desconto foi aplicado, o valor ficou de:" + valor / 50);
                    break;

                case 2:
                    System.out.println("Você escolheu Adão Negro");
                    System.out.println("Preço Inicial do Ingresso - 23.99$");
                    System.out.println("Seu Desconto foi aplicado, o valor ficou de:" + valor / 50);
                    break;
                case 3:
                    System.out.println("Você escolheu One Piece Red");
                    System.out.println("Preço Inicial do Ingresso - 23.99$");
                    System.out.println("Seu Desconto foi aplicado, o valor ficou de:" + valor / 50);
                    break;
            }
        } else {
            System.out.println("Você não possui carteira.");
            System.out.println("Você tem 3 filmes a Escolha, selecione um deles");
            System.out.println("1 - Pantera Negra - Wakanda para Sempre");
            System.out.println("2 - Adão Negro");
            System.out.println("3 - One Piece Red");
            double valor2 = 23.99;
            int films2 = 4;

            films2 = scan.nextInt();
            switch (films2) {
                case 1:
                    System.out.println("Você escolheu Pantera Negra");
                    System.out.println("Preço Inicial do Ingresso - 23.99$");
                    System.out.println("Seu Desconto não foi aplicado, logo o valor se mantem: " + valor2);
                    break;

                case 2:
                    System.out.println("Você escolheu Adão Negro");
                    System.out.println("Preço Inicial do Ingresso - 23.99$");
                    System.out.println("Seu Desconto não foi aplicado, logo o valor se mantem: " + valor2);
                    break;
                case 3:
                    System.out.println("Você escolheu One Piece Red");
                    System.out.println("Preço Inicial do Ingresso - 23.99$");
                    System.out.println("Seu Desconto não foi aplicado, logo o valor se mantem: " + valor2);
                    break;
            }

            System.out.println("Você é um Funcionário ?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int funcionarios;
            funcionarios = scan.nextInt();
            double salarios = 150;

            if (funcionarios == 1) {
                System.out.println("Você Recebeu 1% de Desconto pelo Ingresso Comprado");
                System.out.println("Salário Atual = 150$ por Dia de Trabalho");
                System.out.println("Com os Acréscimos" + salarios + 1.5);

            } else {
                System.out.println("Volte Novamente.");
            }

        }
    }
}
