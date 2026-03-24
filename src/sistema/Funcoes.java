package sistema;

import java.util.ArrayList;

public class Funcoes {

    ArrayList<Produto> produtos = new ArrayList<>();
    double total;

    public void adiciona (String nome, double preco, int stock){

        produtos.add(new Produto(nome, preco, stock));

    }

    
    public void listarP (){

        for( Produto p : produtos){

            System.out.println("nome: " + p.nome + "\npreço: " + p.preco + "\nstock: " + p.stock);

        }

    }


    public void vender(String nome, int quant){

        for (Produto p : produtos){


            if (p.nome.equalsIgnoreCase(nome)){

                if(quant > p.stock){

                    System.out.println("produto não disponível");

                }

                else if(quant == 0){

                    System.out.println("Stock insuficiente");

                }

                else{

                    p.stock -= quant;
                    System.out.println("venda realizada");

                    total += p.preco * quant; 

                }

                return;
            }

                
        }

        System.out.println("Produto inexistente");

        

    }


    public void procurar(String nome){

        for (Produto p : produtos){

            if(p.nome.equalsIgnoreCase(nome)){

                System.out.println("Produto encontrado \nnome: " + p.nome + "\npreço: " + p.preco + "\nstock: " + p.stock );
                return;
                

            }

        }
        
        System.out.println("produto nao encontrado");

    }

    public void remover(String nome){

    
        boolean removido = produtos.removeIf(p -> p.nome.equalsIgnoreCase(nome));

        if (removido){

            System.out.println("Produto removido");

        }

        else{

            System.out.println("Produto não encontrado");

        }

    }

    public void alterar(String nome, double preco){

        for (Produto p : produtos){

            if (p.nome.equalsIgnoreCase(nome)){

                p.preco = preco;
                return;

            }

        }
        System.out.println("Produto não encontrado");


    }


    public double vendas(){

        return total;

    }

    



}
