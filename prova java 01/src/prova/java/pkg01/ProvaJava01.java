
package prova.java.pkg01;

import java.util.Scanner;


public class ProvaJava01 {

 
    public static void main(String[] args) {Scanner entrada = new Scanner(System.in);
        
        String programa;
        System.out.println("Selecione o programa desejado: ");
        System.out.print("1: GBEeGBA  \n 2: Numeros de 0 a 900 \n 3: múltiplos \n Ex4: Crescente ou descrecente \n 5: Horas de trabalho \n 6: Entrada \n 7: Números negativos \n 8: Soma dos números inteiros \n 9: Números primos \n");
        System.out.print("Digite o número do programa: ");
        programa = entrada.nextLine();
        char prog = programa.charAt(0);
        while(prog != 0)
        {
            switch(prog)
            {
                case '0':System.exit(0);
                break;
                case '1':GBEeGBA();
                break;
                case '2':num1a900();
                break;
                case '3':Multiplos();
                break;
                case '4':Cresente();
                break;
                case '5':Horastrabalho();
                break;
                case '6':EntradaSaida();
                break;
                case '7':negativos();
                break;
                case '8':Soma();
                break;
                case '9':Primos();
                break;
                default:System.out.print("Erro");
            }
            System.out.print("Digite o número do programa que deseja:");
            programa = entrada.nextLine();
            prog = programa.charAt(0);
        }
    }
    
    private static void GBEeGBA() {
        Scanner entrada = new Scanner(System.in);
        int i;
        double altura, Peso, GEBM, GEBH;
        String sexo;
        System.out.print("Informe seu sexo [M ou F]: ");
        sexo = entrada.nextLine();
        System.out.print("Informe seu peso em kg: ");
        Peso = entrada.nextInt();
        System.out.print("Informe sua altura em cm:");
        altura = entrada.nextDouble();
        System.out.print("Informe sua idade:");
        i = entrada.nextInt();
        if ("M".equals(sexo))
        {
            GEBM = 66.47 +(13.75 * Peso) + (5 * altura) - (6.76 * i);
            System.out.println(GEBM);
        }
        else
            if ("F".equals(sexo))
            {
               GEBH = 65.51 + (9.56 * Peso) + (1.85 * altura) - (4.67 * i);
               System.out.println(GEBH);
            } 
        }

        private static void num1a900() {
        Scanner num = new Scanner(System.in);
        int valor, centena,  dezena, unidade, j;
        System.out.print("Digite um número de 0 até 999:");
        valor = num.nextInt();
        centena = valor/100;
        dezena = valor % 100/10;
        unidade = (valor % 100)%10;
        j = valor/1;
        if (centena == 1 && dezena == 0 && unidade == 0)
        {
            System.out.println("cem");
        }
        else 
            if(centena == 0 && dezena == 0  && unidade == 0)
        {
            System.out.println("zero");
        }
        else
        {
            if(centena >= 1 && dezena == 0 && unidade == 0)
            {
            switch(centena)
            {
            case 1 : System.out.println("Cento ");break;
            case 2 : System.out.println("Duzentos ");break;
            case 3 : System.out.println("Trezentos ");break;
            case 4 : System.out.println("Quatrocentos ");break;
            case 5 : System.out.println("Quinhentos ");break;
            case 6 : System.out.println("Seiscentos ");break;
            case 7 : System.out.println("Setecentos ");break;
            case 8 : System.out.println("Oitocentos ");break;
            case 9 : System.out.println("Novecentos ");break;
            }
            }
            else
                {
                    switch(centena)
                    {
                    case 1 : System.out.println("Cento e ");break;
                    case 2 : System.out.println("Duzentos e ");break;
                    case 3 : System.out.println("Trezentos e ");break;
                    case 4 : System.out.println("Quatrocentos e");break;
                    case 5 : System.out.println("Quinhentos e ");break;
                    case 6 : System.out.println("Seiscentos e ");break;
                    case 7 : System.out.println("Setecentos e ");break;
                    case 8 : System.out.println("Oitocentos e ");break;
                    case 9 : System.out.println("Novecentos e ");break;
                    }
                }
        if(dezena == 1)
            {
                switch(unidade)
                    {
                        case 0 : System.out.println("Dez ");break;
                        case 1 : System.out.println("Onze ");break;
                        case 2 : System.out.println("Doze ");break;
                        case 3 : System.out.println("Treze ");break;
                        case 4 : System.out.println("Quatorze ");break;
                        case 5 : System.out.println("Quinze ");break;
                        case 6 : System.out.println("Dezesseis ");break;
                        case 7 : System.out.println("Dezessete ");break;
                        case 8 : System.out.println("Dezoito ");break;
                        case 9 : System.out.println("Dezenove ");break;
                    }
            }
            else 
            if(dezena > 1)
                {
                    switch (dezena)
                        {
                            case 2 : System.out.println("Vinte");break;
                            case 3 : System.out.println("Trinta");break;
                            case 4 : System.out.println("Quarenta");break;
                            case 5 : System.out.println("Cinquenta");break;
                            case 6 : System.out.println("Sessenta");break;
                            case 7 : System.out.println("Setenta");break;
                            case 8 : System.out.println("Oitenta");break;
                            case 9 : System.out.println("Noventa");break;
                        }
                        switch (unidade)
                            {
                                case 1 : System.out.println(" e Um ");break;
                                case 2 : System.out.println(" e Dois ");break;
                                case 3 : System.out.println(" e Tres ");break;
                                case 4 : System.out.println(" e Quatro ");break;
                                case 5 : System.out.println(" e Cinco ");break;
                                case 6 : System.out.println(" e Seis ");break;
                                case 7 : System.out.println(" e Sete ");break;
                                case 8 : System.out.println(" e Oito ");break;
                                case 9 : System.out.println(" e Nove ");break;
                            }
                }
                else
                    {
                        switch (unidade)
                            {
                                case 1 : System.out.println("Um ");break;
                                case 2 : System.out.println("Dois ");break;
                                case 3 : System.out.println("Tres ");break;
                                case 4 : System.out.println("Quatro ");break;
                                case 5 : System.out.println("Cinco ");break;
                                case 6 : System.out.println("Seis ");break;
                                case 7 : System.out.println("Sete ");break;
                                case 8 : System.out.println("Oito ");break;
                                case 9 : System.out.println("Nove ");break;
                            }
                    }
        }
    }

    private static void Multiplos() {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;
        System.out.print("Digite um números: ");
        n1 = entrada.nextDouble();
        System.out.print("Digite outro número: ");
        n2 = entrada.nextDouble();
        if (n1 % n2 == 0)
        {
            System.out.println(n1 + " É multiplo " + n2);
        }
        else
            System.out.println(n1 + " Não é multiplo de " + n2);
    }

    private static void Cresente() {
        Scanner entrada = new Scanner(System.in);
        int i;
        float a, b, c;
        System.out.println ("Escreva 1 ou 2 para o valor de I: ");
        i = entrada.nextInt();
        System.out.println ("Escreva o primeiro valor: ");
        a = entrada.nextFloat();
        System.out.println ("Escreva o segundo valor: ");
        b = entrada.nextFloat();
        System.out.println ("Escreva o terceiro valor: ");
        c = entrada.nextFloat();
        
        if(i == 1)
        {
            System.out.println (+a+"\n"+b+"\n"+c);
        }
        else
        {
            if(i == 2)
            {
                System.out.println (+c+"\n"+b+"\n"+a);
            }
        }
    }

    private static void Horastrabalho() {
        Scanner entrada = new Scanner(System.in);
        double horasE, horasF, h;
        System.out.print("Digite o número de horas extras:");
        horasE = entrada.nextDouble();
        System.out.print("Digite o número de horas que o funcionario faltou (em minutos): ");
        horasF = entrada.nextDouble();
        h = (horasE * 60) - (2/3 * (horasF));
        if(h > 2400)
        {
            System.out.println("O funcionário fez " + horasE + " horas extras. O número de horas faltas é: " +  horasF/60 + " e o valor do premio é R$: 500");
        }
        else
            if(h >= 1800 && h < 2400)
            {
                System.out.println("O funcionário fez " + horasE + " horas extras. O número de horas faltas é: " +  horasF/60 + " e o valor do premio é R$: 400");
            }
        else
            if(h >= 1201 && h < 1800)
            {
                System.out.println("O funcionário fez " + horasE + " horas extras. O número de horas faltas é: " +  horasF/60 + " e o valor do premio é R$: 300");
            }
        else
            if(h >= 600 && h  < 1200)
            {
                System.out.println("O funcionário fez " + horasE + " horas extras. O número de horas faltas é: " +  horasF/60 + " e o valor do premio é R$: 200");
            }
        else
            if(h < 600)
            {
                System.out.println("O funcionário fez " + horasE + " horas extras. O número de horas faltas é: " +  horasF/60 + " e o valor do premio é R$: 100");
            }
    }

    private static void EntradaSaida() {
        Scanner entrada = new Scanner(System.in);
        double hentrada, saida, saidaEsp;
        System.out.print("Digite o horário de entrada: ");
        hentrada = entrada.nextDouble();
        saida = hentrada + 6;
        saidaEsp = saida - 24;
        if(hentrada >= 19)
        {
            System.out.println("Horário de saída:"+ saidaEsp + "horas");
        }
        else
            if(hentrada < 19)
            {
                System.out.println("Horário de saída:"+ saida + "horas");
            }
    }

    private static void negativos() {
        Scanner scann = new Scanner(System.in);
        float i=0, fat=1, a = 1;
        while (a>=0)
        {
            System.out.print("Digite um número:");
            a = scann.nextInt();
            fat += a;
            i++;
        }
        System.out.println(fat/(i-1));     
    }

    private static void Soma() {
        Scanner entrada = new Scanner(System.in);
        int i, soma, n1;
        System.out.print("Digite o valor de n: ");
        n1 = entrada.nextInt();
        soma = 0;
        i = 1;
        while(i <= n1)
        {
            soma = soma + i;
            i = i + 1;
        }
        System.out.println("A soma dos primeiros inteiros é:" +soma);
    }

    private static void Primos() { 
        Scanner entrada = new Scanner(System.in);
        int i, j, somaprimos = 2, qtddiv = 0, n;
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        for(i=3;i<=n;i+=2)
        {
            qtddiv=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    qtddiv++;
                }
                if(qtddiv>2)
                {
                    break;
                }
            }
            if(qtddiv == 2)
            {
                somaprimos+=i;
            }
        }
        System.out.println("A soma dos números primos é: "+somaprimos);
        
    }
    
}
