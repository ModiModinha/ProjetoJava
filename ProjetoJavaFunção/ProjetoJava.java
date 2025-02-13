package ProjetoJavaFunção;
import java.util.Scanner;

public class ProjetoJava {

    //Scanner publico
    public static Scanner sc = new Scanner(System.in);

    //Função de adição responsavel por somar 2 numeros definidos pelo usuario
    public static void adicao1(){
        double num1;
        double num2;
        double ResulSoma;
        int menuAdi = 0;




            System.out.println("- Voce está usando a função de adição da calculadora");
            System.out.println("Insira o primeiro numero para a adição: ");
            num1 = sc.nextDouble();
            System.out.println("Insira o segundo numero para a adição: ");
            num2 = sc.nextDouble();

            ResulSoma = num1 + num2;

        while (menuAdi != 4) {

            System.out.println("O resultado da soma é de:" + ResulSoma);
            System.out.println("----Fim do calculo----");
            System.out.println("Deseja repetir outro calculo de adição?");
            System.out.println("1 - Sim");
            System.out.println("2- Sim, porém usando o resultado desta soma");
            System.out.println("3- Não, quero voltar ao menu");
            System.out.println("4- Não, pode encerrar o sistema");
            menuAdi = sc.nextInt();

            if (menuAdi == 1){
                num1 = 0;
                num2 = 0;
                menuAdi = 0;
                ResulSoma = 0;
                adicao1();
            }
            if (menuAdi == 2){
                num1 = 0;
                num2 = 0;
                menuAdi = 0;
                adicaoCresul(ResulSoma);

            }

            if (menuAdi == 3){
                num1 = 0;
                num2 = 0;
                menuAdi = 0;
                main();
            }


        }
        System.exit(0);
    }


    //Função responsavel por pegar a soma da função adicao1 e usar nesta aqui para repetir o calculo
    public static void adicaoCresul(double ResulSoma){
        double num1;
        double ResulSoma2;
        int menuadi2 = 0;



            System.out.println("- Voce esta usando a função de soma com o resultado passado");
            System.out.println("Resultado Passado -> " + ResulSoma);
            System.out.println("Insira o numero para ser somado com o resultado passado");
            num1 = sc.nextDouble();

            ResulSoma2 = num1 + ResulSoma;

        while (menuadi2 !=4) {

            System.out.println("O Resultado desta soma é de: " + ResulSoma2);
            System.out.println("Deseja repetir outro calculo de adição?");
            System.out.println("1 - Sim");
            System.out.println("2- Sim, porém usando o resultado desta soma");
            System.out.println("3- Não, quero voltar ao menu");
            System.out.println("4- Não, pode encerrar o sistema");
            menuadi2 = sc.nextInt();

            if (menuadi2 == 1) {
                num1 = 0;
                menuadi2 = 0;
                ResulSoma = 0;
                adicao1();
            }
            if (menuadi2 == 2) {
                num1 = 0;
                menuadi2 = 0;
                ResulSoma = ResulSoma2;
                ResulSoma2 = 0;
                adicaoCresul(ResulSoma);

            }

            if (menuadi2 == 3) {
                num1 = 0;
                menuadi2 = 0;
                main();
            }

        }

        System.exit(0);

    }

    //função responsavel pela subtração
    public static void subtracao(){
        double num1;
        double num2;
        double ResulSub;
        int menuSub = 0;




        System.out.println("- Voce está usando a função de subtração da calculadora");
        System.out.println("Insira o primeiro numero para a subtração: ");
        num1 = sc.nextDouble();
        System.out.println("Insira o segundo numero para a subtração: ");
        num2 = sc.nextDouble();

        ResulSub = num1 - num2;

        while (menuSub != 4) {

            System.out.println("O resultado da soma é de:" + ResulSub);
            System.out.println("----Fim do calculo----");
            System.out.println("Deseja repetir outro calculo de subtração?");
            System.out.println("1 - Sim");
            System.out.println("2- Sim, porém usando o resultado desta subtração");
            System.out.println("3- Não, quero voltar ao menu");
            System.out.println("4- Não, pode encerrar o sistema");
            menuSub = sc.nextInt();

            if (menuSub == 1){
                num1 = 0;
                num2 = 0;
                menuSub = 0;
                ResulSub = 0;
                adicao1();
            }
            if (menuSub == 2){
                num1 = 0;
                num2 = 0;
                menuSub = 0;
                adicaoCresul(ResulSub);

            }

            if (menuSub == 3){
                num1 = 0;
                num2 = 0;
                menuSub = 0;
                main();
            }


        }
        System.exit(0);
    }


    //Função responsavel por pegar a soma da função adicao1 e usar nesta aqui para repetir o calculo
    public static void subtracao2(double ResulSub){
        double num1;
        double ResulSub2;
        int menusub2 = 0;



        System.out.println("- Voce esta usando a função de subtração com o resultado passado");
        System.out.println("Resultado Passado -> " + ResulSub);
        System.out.println("Insira o numero para ser subtraido com o resultado passado");
        num1 = sc.nextDouble();

        ResulSub2 = num1 - ResulSub;

        while (menusub2 !=4) {

            System.out.println("O Resultado desta subtração é de: " + ResulSub2);
            System.out.println("Deseja repetir outro calculo de subtração?");
            System.out.println("1 - Sim");
            System.out.println("2- Sim, porém usando o resultado desta subtração");
            System.out.println("3- Não, quero voltar ao menu");
            System.out.println("4- Não, pode encerrar o sistema");
            menusub2 = sc.nextInt();

            if (menusub2 == 1) {
                num1 = 0;
                menusub2 = 0;
                ResulSub = 0;
                subtracao();
            }
            if (menusub2 == 2) {
                num1 = 0;
                menusub2 = 0;
                ResulSub = ResulSub2;
                ResulSub2 = 0;
                subtracao2(ResulSub);

            }

            if (menusub2 == 3) {
                num1 = 0;
                menusub2 = 0;
                main();
            }

        }

        System.exit(0);

    }

    //função responsavel pela divisão
    public static void divisao1(){
        double num1;
        double num2;
        double ResulDivisao;
        int menuDiv = 0;

        System.out.println("- Voce está usando a função de divisão da calculadora");
        System.out.println("Insira o primeiro numero para a divisão: ");
        num1 = sc.nextDouble();
        System.out.println("Insira o segundo numero para a divisão: ");
        num2 = sc.nextDouble();

        if (num2 != 0) {
            ResulDivisao = num1 / num2;
        } else {
            System.out.println("Erro: divisão por zero não permitida.");
            return;
        }

        while (menuDiv != 4) {

            System.out.println("O resultado da divisão é de: " + ResulDivisao);
            System.out.println("----Fim do calculo----");
            System.out.println("Deseja repetir outro calculo de divisão?");
            System.out.println("1 - Sim");
            System.out.println("2- Sim, porém usando o resultado desta divisão");
            System.out.println("3- Não, quero voltar ao menu");
            System.out.println("4- Não, pode encerrar o sistema");
            menuDiv = sc.nextInt();

            if (menuDiv == 1){
                num1 = 0;
                num2 = 0;
                menuDiv = 0;
                ResulDivisao = 0;
                divisao1();
            }
            if (menuDiv == 2){
                num1 = 0;
                num2 = 0;
                menuDiv = 0;
                divisaoCresul(ResulDivisao);
            }

            if (menuDiv == 3){
                num1 = 0;
                num2 = 0;
                menuDiv = 0;
                main();
            }
        }
        System.exit(0);
    }


    //Função responsável por pegar o resultado da função divisao1 e usar nesta aqui para repetir o cálculo
    public static void divisaoCresul(double ResulDivisao){
        double num1;
        double ResulDivisao2;
        int menuDiv2 = 0;

        System.out.println("- Voce está usando a função de divisão com o resultado passado");
        System.out.println("Resultado Passado -> " + ResulDivisao);
        System.out.println("Insira o numero para ser dividido com o resultado passado");
        num1 = sc.nextDouble();

        if (num1 != 0) {
            ResulDivisao2 = ResulDivisao / num1;
        } else {
            System.out.println("Erro: divisão por zero não permitida.");
            return;
        }

        while (menuDiv2 != 4) {

            System.out.println("O Resultado desta divisão é de: " + ResulDivisao2);
            System.out.println("Deseja repetir outro cálculo de divisão?");
            System.out.println("1 - Sim");
            System.out.println("2- Sim, porém usando o resultado desta divisão");
            System.out.println("3- Não, quero voltar ao menu");
            System.out.println("4- Não, pode encerrar o sistema");
            menuDiv2 = sc.nextInt();

            if (menuDiv2 == 1) {
                num1 = 0;
                menuDiv2 = 0;
                ResulDivisao = 0;
                divisao1();
            }
            if (menuDiv2 == 2) {
                num1 = 0;
                menuDiv2 = 0;
                ResulDivisao = ResulDivisao2;
                ResulDivisao2 = 0;
                divisaoCresul(ResulDivisao);
            }

            if (menuDiv2 == 3) {
                num1 = 0;
                menuDiv2 = 0;
                main();
            }

        }

        System.exit(0);
    }

    //Função responsavel pela multiplicação
    public static void multiplicacao1(){
        double num1;
        double num2;
        double ResulMultiplicacao;
        int menuMul = 0;

        System.out.println("- Voce está usando a função de multiplicação da calculadora");
        System.out.println("Insira o primeiro numero para a multiplicação: ");
        num1 = sc.nextDouble();
        System.out.println("Insira o segundo numero para a multiplicação: ");
        num2 = sc.nextDouble();

        ResulMultiplicacao = num1 * num2;

        while (menuMul != 4) {

            System.out.println("O resultado da multiplicação é de: " + ResulMultiplicacao);
            System.out.println("----Fim do calculo----");
            System.out.println("Deseja repetir outro calculo de multiplicação?");
            System.out.println("1 - Sim");
            System.out.println("2- Sim, porém usando o resultado desta multiplicação");
            System.out.println("3- Não, quero voltar ao menu");
            System.out.println("4- Não, pode encerrar o sistema");
            menuMul = sc.nextInt();

            if (menuMul == 1){
                num1 = 0;
                num2 = 0;
                menuMul = 0;
                ResulMultiplicacao = 0;
                multiplicacao1();
            }
            if (menuMul == 2){
                num1 = 0;
                num2 = 0;
                menuMul = 0;
                multiplicacaoCresul(ResulMultiplicacao);
            }

            if (menuMul == 3){
                num1 = 0;
                num2 = 0;
                menuMul = 0;
                main();
            }
        }
        System.exit(0);
    }



    //Função responsável por pegar o resultado da função multiplicacao1 e usar nesta aqui para repetir o cálculo
    public static void multiplicacaoCresul(double ResulMultiplicacao){
        double num1;
        double ResulMultiplicacao2;
        int menuMul2 = 0;

        System.out.println("- Voce está usando a função de multiplicação com o resultado passado");
        System.out.println("Resultado Passado -> " + ResulMultiplicacao);
        System.out.println("Insira o numero para ser multiplicado com o resultado passado");
        num1 = sc.nextDouble();

        ResulMultiplicacao2 = ResulMultiplicacao * num1;

        while (menuMul2 != 4) {

            System.out.println("O Resultado desta multiplicação é de: " + ResulMultiplicacao2);
            System.out.println("Deseja repetir outro cálculo de multiplicação?");
            System.out.println("1 - Sim");
            System.out.println("2- Sim, porém usando o resultado desta multiplicação");
            System.out.println("3- Não, quero voltar ao menu");
            System.out.println("4- Não, pode encerrar o sistema");
            menuMul2 = sc.nextInt();

            if (menuMul2 == 1) {
                num1 = 0;
                menuMul2 = 0;
                ResulMultiplicacao = 0;
                multiplicacao1();
            }
            if (menuMul2 == 2) {
                num1 = 0;
                menuMul2 = 0;
                ResulMultiplicacao = ResulMultiplicacao2;
                ResulMultiplicacao2 = 0;
                multiplicacaoCresul(ResulMultiplicacao);
            }

            if (menuMul2 == 3) {
                num1 = 0;
                menuMul2 = 0;
                main();
            }

        }

        System.exit(0);
    }



    //Função responsavel pelo menu na qual leva os usuarios para as outras funções responsaveis pelos calculos
    public static void main() {


        int menu = 0;

        while (menu != 5){
            System.out.println("----- Calculadora Furacão -----");
            System.out.println("       1 - Adição");
            System.out.println("       2 - Subtração");
            System.out.println("       3 - Divisão");
            System.out.println("       4 - Multiplicação");
            System.out.println("       5 - Sair do Programa");
            System.out.println("--------------------------------");
            menu = sc.nextInt();

            if (menu == 1){
                menu = 0;
                adicao1();
            }

            if (menu == 2){
                menu = 0;
                subtracao();
            }

            if (menu == 3){
                menu = 0;
                divisao1();
            }

            if (menu == 4){
                menu = 0;
                multiplicacao1();
            }
        }
    }
}