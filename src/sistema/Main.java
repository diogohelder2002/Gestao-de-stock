package sistema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Funcoes f = new Funcoes();

        Scanner t = new Scanner(System.in);

        String nome;

        double tot;

        

        while(true){

            System.out.print("ola, bem vindo ao sistema de stock e vendas da gelataria bamidi: \n1.Adicionar produto \n2.Listar Produtos \n3.Vender produto \n4.Procurar produto \n5.Remover produto \n6.Alterar preço \n7.Totais\n8.Sair: ");
            int esc = t.nextInt(); 

            while(esc < 1 || esc > 8){

                System.out.print("valor errado digite um dos valores indicados:\n1.Adicionar produto \n2.Listar Produtos\n3.Vender Produto \n4.Procurar produto \n5.Remover produto \n6.Alterar preço \n7.Totais\n8.Sair: ");
                esc = t.nextInt(); 

            }

            switch (esc){

                case 1:
                    t.nextLine();
                    System.out.print("por favor digite o nome do produto: ");
                    nome = t.nextLine();

                    System.out.print("por favor digite o preço do produto: ");
                    double preco = t.nextDouble();

                    System.out.print("digite o stock do produto: ");
                    int stock = t.nextInt();

                    f.adiciona(nome, preco, stock);
                    break;

                    
                case 2:

                    f.listarP();
                    break;


                case 3:

                    t.nextLine();

                    System.out.print("Qual é o nome do produto que quer vender?: ");
                    nome = t.nextLine();
                    System.out.print("qual a quantidade que pertende vender?: ");
                    int quantidade = t.nextInt();

                    f.vender(nome, quantidade);
                    break;

                case 4: 

                    t.nextLine();

                    System.out.print("Que produto deseja procurar: ");
                    nome = t.nextLine();

                    f.procurar(nome);
                    break;


                case 5:
                    t.nextLine();
                    System.out.print("Que produto deseja remover: ");
                    nome = t.nextLine();

                    f.remover(nome);
                    break;


                case 6:

                    t.nextLine();

                    System.out.print("Que produto deseja alterar o preço: ");
                    nome = t.nextLine();

                    System.out.print("Qual é o novo preço?: ");
                    preco = t.nextDouble();

                    f.alterar(nome, preco);
                    break;


                case 7:

                    tot = f.total;
                    System.out.printf("O valor vendido hoje foi: %.2f ", tot);
                    break;

                
                case 8:

                    System.out.println("Até breve :)");
                    break;

                }
                
                if (esc == 8){

                    break;

                }
        }

        t.close();
    }
    
}
