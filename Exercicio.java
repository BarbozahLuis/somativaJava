package Somativa;

import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);

    public void questao1() {
        System.out.println("Digite primeiro numero");
        double numero1 = sc.nextInt();
        System.out.println("Digite segundo numero");
        double numero2 = sc.nextInt();
        System.out.println("Digite 1 para adição, 2 para subtração, 3 para multiplicação e 4 para divisão");
        int nDigitado = sc.nextInt();
        
        if(nDigitado==1){
            double valorTotal1 = numero1+numero2;
            System.out.println("Valor somado é"+valorTotal1);
             }
             else if(nDigitado==2){
                double valorTotal2 = numero1-numero2;
                System.out.println("Valor subtraido é"+valorTotal2);
            }
            else if(nDigitado==3){
                double valorTotal3 = numero1*numero2;
                System.out.println("Valor multiplicado é"+valorTotal3);
            }
            else if(nDigitado==4){
                double valorTotal4 = numero1/numero2;
                System.out.println("Valor dividido é"+valorTotal4);
            }
            else {
                System.out.println("Digite um numero de 1 a 4");
            }
        }

        public void questao2(){
            double nDigitado = sc.nextDouble();
            System.out.println("Digite o numero de Matricula");
            if(nDigitado%4==0){
                System.out.println("Você foi selecionado para o time do Cris");
            }else if(nDigitado%4==1){
            System.out.println("Você foi selecionado para o time do Greg");
            }else if(nDigitado%4==2){
            System.out.println("Você foi selecionado para o time do Caruso");
            }else if(nDigitado%4==3){
                System.out.println("Você foi selecionado para o time do Jerome");
            }else{
                System.out.println("Digite o numero novamete");
            }
    }

        public void questao3(){
            System.out.println("Digite a quantidade de morangos");
            double morangos = sc.nextDouble();
            System.out.println("Digite a quantidade de maças");
            double maças = sc.nextDouble();
            System.out.println("Digite a quantidade de banana");
            double bananas = sc.nextDouble();
            
            double precoMorango = 2.50;
            double precoMaça = 1.80;
            double precoBanana = 1.30;

           double valorMorango = morangos*precoMorango;
           double valorMaça = maças*precoMaça;
           double valorBanana = bananas*precoBanana;
           double precoTotal = valorMorango*valorMaça*valorBanana;

            double desconto = 0.1;
            double kgFrutas = morangos+maças+bananas;
            if(precoTotal>25.00||kgFrutas>8){
               precoTotal =precoTotal - precoTotal*desconto;
            
                
            }
            System.out.println("O valor da sua compra é de"+precoTotal);
        }

        }


