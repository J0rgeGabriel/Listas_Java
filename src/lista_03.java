/*
 * // Exercicio 01:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        double n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        n = scan.nextDouble();

        if (n <= 10) {
            System.out.println("F1");
        }

        if (n > 10 && n <= 100) {
            System.out.println("F2");
        }
        if (n > 100) {
            System.out.println("F3");
        }
    }
}
 */

/*
 * // Exercicio 02:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int tempo = 0, vezesDividido;
        double massaInicial;

        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a massa inicial em gramas: ");
        massaInicial = scan.nextDouble();

        if (massaInicial <= 0.5) {
            System.out.println("A massa inicial já é menor que 0.5 gramas.");
        } else {
            vezesDividido = 0;
            double massaAtual = massaInicial;

            if (massaAtual > 0.5) {
                massaAtual = massaAtual / 2;
                tempo += 50;
                vezesDividido++;
            }

            int horas = tempo / 3600;
            int minutos = (tempo % 3600) / 60;
            int segundos = tempo % 60;

            System.out.println("Massa inicial: " + massaInicial + " gramas");
            System.out.println("Tempo necessário: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
            System.out.println("A massa foi dividida pela metade " + vezesDividido + " vezes.");
        }
    }
}
 */

/*
 * // Exercicio 03:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {

        int dias, diaria = 95;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias que voce ficara hospedado: ");
        dias = scan.nextInt();

        if (dias < 0) {
            Scanner scan2 = new Scanner(System.in);
            System.out.print("VALOR INVALIDO! Digite a quantidade de dias que voce ficara hospedado: ");
            dias = scan2.nextInt();

        }

        if (dias > 0 && dias < 15) {
            System.out.print("O valor a ser pego sera de: R$" + (dias * diaria) + 2.50);
        }

        if (dias == 15) {
            System.out.print("O valor a ser pego sera de: R$" + (dias * diaria) + 1.50);
        }

        else if (dias > 15) {
            System.out.print("O valor a ser pego sera de: R$" + (dias * diaria) + 0.50);
        }

    }

}
 */

/*
 * // Exercicio 04:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int opcao;

        Scanner scan = new Scanner(System.in);
        System.out.print("--Combustiveis disponiveis--\n" +
                "1 - Álcool\n" +
                "2 - Gasolina\n" +
                "3 - Diesel\n" +
                "4 - Fim\n" +
                "Informe o tipo de combustível que você deseja abastecer o seu veiculo: ");
        opcao = scan.nextInt();

        while (opcao < 1 || opcao > 4) {    // eu ja usei while enquanto estudava python, a ideia é a mesma, para atender a solicitação do exercicio optei por usar o while
            Scanner scan2 = new Scanner(System.in);
            System.out.print("\nValor invalido, tente novamente!!\n" +
                    "--Combustiveis disponiveis--\n" +
                    "1 - Álcool\n" +
                    "2 - Gasolina\n" +
                    "3 - Diesel\n" +
                    "4 - Fim\n" +
                    "\nInforme o tipo de combustível que você deseja abastecer o seu veiculo: ");
            opcao = scan2.nextInt();
        }
        ;

        switch (opcao) {
            case 1:
                System.out.println("\nVocê escolheu Álcool");
                break;
            case 2:
                System.out.println("\nVocê escolheu Gasolina");
                break;
            case 3:
                System.out.println("\nVocê escolheu Diesel");
                break;
            case 4:
                System.out.println("\nVocê escolheu encerrar o atendimento. MUITO OBRIGADO!");
                break;
        }

    }
}
 */

/*
 * // Exercicio 05:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int codigo, tempo_anos;
        double salario, bonus;
        String sexo;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu codigo de funcionario: ");
        codigo = scan.nextInt();

        System.out.print("Digite o seu sexo [M ou F]: ");
        sexo = scan.next().toUpperCase(); // para converter em maiúscula

        System.out.print("Digite a quantos anos você está na empresa: ");
        tempo_anos = scan.nextInt();

        System.out.print("Digite o seu salario: R$");
        salario = scan.nextDouble();

        if (sexo.equals("M") && tempo_anos > 15) {
            bonus = salario * 0.20;
            System.out.println("\nO funcionario do codigo " + codigo + " terá um bonus de R$" + bonus);
        }

        else if (sexo.equals("F") && tempo_anos > 10) {
            bonus = salario * 0.25;
            System.out.println("\nO funcionario do codigo " + codigo + " terá um bonus de R$" + bonus);

        }

        else {
            bonus = 100;
            System.out.println("\nO funcionario do codigo " + codigo + " terá um bonus de R$" + bonus);
        }

    }
}

 */

/*
 * // Exercicio 06:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        double salario, perct_aumento, aumento, novo_salario;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu salario atual: R$");
        salario = scan.nextDouble();

        if (salario >= 1000 && salario < 1500) {
            perct_aumento = 1.0;
            aumento = salario * perct_aumento;
            novo_salario = salario + aumento;
            System.out.println(
                    "O seu salario atual é de R$" + salario + ", você receberá um aumento de 100%, que é no valor de R$"
                            + aumento + ", o seu novo salario será de R$" + novo_salario);
        }

        else if (salario >= 1500 && salario < 2500) {
            perct_aumento = 0.9;
            aumento = salario * perct_aumento;
            novo_salario = salario + aumento;
            System.out.println(
                    "O seu salario atual é de R$" + salario + ", você receberá um aumento de 90%, que é no valor de R$"
                            + aumento + ", o seu novo salario será de R$" + novo_salario);
        }

        else if (salario >= 2500 && salario < 3000) {
            perct_aumento = 0.8;
            aumento = salario * perct_aumento;
            novo_salario = salario + aumento;
            System.out.println(
                    "O seu salario atual é de R$" + salario + ", você receberá um aumento de 80%, que é no valor de R$"
                            + aumento + ", o seu novo salario será de R$" + novo_salario);
        }

        else if (salario >= 3000 && salario < 3500) {
            perct_aumento = 0.7;
            aumento = salario * perct_aumento;
            novo_salario = salario + aumento;
            System.out.println(
                    "O seu salario atual é de R$" + salario + ", você receberá um aumento de 70%, que é no valor de R$"
                            + aumento + ", o seu novo salario será de R$" + novo_salario);
        }

        else if (salario >= 3500 && salario < 4000) {
            perct_aumento = 0.6;
            aumento = salario * perct_aumento;
            novo_salario = salario + aumento;
            System.out.println(
                    "O seu salario atual é de R$" + salario + ", você receberá um aumento de 60%, que é no valor de R$"
                            + aumento + ", o seu novo salario será de R$" + novo_salario);
        }

        else if (salario >= 4000) {
            perct_aumento = 0.5;
            aumento = salario * perct_aumento;
            novo_salario = salario + aumento;
            System.out.println(
                    "O seu salario atual é de R$" + salario + ", você receberá um aumento de 50%, que é no valor de R$"
                            + aumento + ", o seu novo salario será de R$" + novo_salario);
        }
    }
}
 */
// Exercicio 07:
import java.util.*;

public class lista_03 {
    public static void main(String[] args) throws Exception {
        int produtos;

        Scanner scan = new Scanner(System.in);
        System.out.print("--PRODUTOSs--\n" +
                "101 - Adoçante liquido FINN 65ml - R$7,89\n" +
                "102 - Adoçante liquido STEVIA 80ml - R$4,49\n" +
                "301 - Azeite portugês 200ml - R$4,99\n" +
                "401 - Batata tradicional congelada MCCAIN 720GR - R$1,39\n" +
                "403 - Biscoito recheado BONO 200GR -R$1,09\n" +
                "501 - Aguardante velho barreiro 910ml - R$2,98\n" +
                "502 - Cerveja MILLER long neck 355ml- R$1,29\n" +
                "503 - Cerveja KAISER lata ou long neck UNID - R$0,78\n" +
                "504 - Cerveja BOHEMIA lata ou long neck - R$1,25\n" +
                "505 - Cerveja ANTARCTICA lata ou long neck UNID - R$0,78\n" +
                "506 - Cerveja BRAHMA lata ou long neck - R$0,89\n" +

                "\nInforme o produto que voce deseja comprar: ");
        produtos = scan.nextInt();

        while (produtos != 101 && produtos != 102 && produtos != 301 && produtos != 401 && produtos != 403
                && produtos != 501 && produtos != 502 && produtos != 503 && produtos != 5045 && produtos != 506) {
            Scanner scan2 = new Scanner(System.in);
            System.out.print("\nValor invalido, tente novamente!!\n" +
                    "101 - Adoçante liquido FINN 65ml - R$7,89\n" +
                    "102 - Adoçante liquido STEVIA 80ml - R$4,49\n" +
                    "301 - Azeite portugês 200ml - R$4,99\n" +
                    "401 - Batata tradicional congelada MCCAIN 720GR - R$1,39\n" +
                    "403 - Biscoito recheado BONO 200GR -R$1,09\n" +
                    "501 - Aguardante velho barreiro 910ml - R$2,98\n" +
                    "502 - Cerveja MILLER long neck 355ml- R$1,29\n" +
                    "503 - Cerveja KAISER lata ou long neck UNID - R$0,78\n" +
                    "504 - Cerveja BOHEMIA lata ou long neck - R$1,25\n" +
                    "505 - Cerveja ANTARCTICA lata ou long neck UNID - R$0,78\n" +
                    "506 - Cerveja BRAHMA lata ou long neck - R$0,89\n" +

                    "\nInforme o produto que voce deseja comprar: ");
            produtos = scan2.nextInt();
        }
        switch (produtos) {
            case 101:
                System.out.println("\nVocê escolheu Adoçante liquido FINN 65ml");
                break;
            case 102:
                System.out.println("\nVocê escolheu Adoçante liquido STEVIA 80ml");
                break;
            case 301:
                System.out.println("\nVocê escolheu Azeite portugês 200ml");
                break;
            case 401:
                System.out.println("\nVocê escolheu Batata tradicional congelada MCCAIN 720GR");
                break;
            case 403:
                System.out.println("\nVocê escolheu Biscoito recheado BONO 200GR");
                break;
            case 501:
                System.out.println("\nVocê escolheu Aguardante velho barreiro 910ml");
                break;
            case 502:
                System.out.println("\nVocê escolheu Cerveja MILLER 355ml");
                break;
            case 503:
                System.out.println("\nVocê escolheu Cerveja KAISER");
                break;
            case 504:
                System.out.println("\nVocê escolheu Cerveja BOHEMIA");
                break;
            case 505:
                System.out.println("\nVocê escolheu Cerveja ANTARCTICA");
                break;
            case 506:
                System.out.println("\nVocê escolheu Cerveja BRAHMA");
                break;
        }
    }
}


/*
 * // Exercicio 08:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        double x1, y1, x2, y2, d, x_elevado, y_elevado;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de X1: ");
        x1 = scan.nextDouble();

        System.out.print("Digite o valor de Y1: ");
        y1 = scan.nextDouble();

        System.out.print("Digite o valor de X2: ");
        x2 = scan.nextDouble();

        System.out.print("Digite o valor de Y1: ");
        y2 = scan.nextDouble();

        x_elevado = Math.pow(x2 - x1, 2);
        y_elevado = Math.pow(y2 - y1, 2);

        d = Math.sqrt(x_elevado + y_elevado);

        System.out.println(d);
    }
}
 */

/*
 * // Exercicio 09:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int codigo; 
        double salario, vendas, comissao;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu codigo de vendedor: ");
        codigo = scan.nextInt();

        System.out.print("Digite o seu salario: R$");
        salario = scan.nextDouble();

        System.out.print("Digite o total de vendas realizadas este mês: R$");
        vendas = scan.nextDouble();

        if (vendas < 10000) {
            comissao = salario * 0.03;
            System.out.println("Sua comissao será de R$" + comissao);   
        }
        else if (vendas > 10000) {
            comissao = vendas * 0.05;
            System.out.println("Sua comissao será de R$" + comissao);
        }
    }
}
 */

/*
 * // Exercicio 10:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        double n1, n2, soma, subtracao;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        n1 = scan.nextDouble();

        System.out.print("Digite o segundo numero: ");
        n2 = scan.nextDouble();

        if (n1 > n2) {
            soma = n1 + n2;
            System.out.println("A soma de " + n1 + " + " + n2 + " = " + soma);
        }

        else {
            subtracao = n2 - n1;
            System.out.println("A subtração de " + n2 + " - " + n1 + " = " + subtracao);
        }
    }
}
 */

/*
 * // Exercicio 11:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        double num1, num2, num3, raizQuadrada, quadrado, diferenca, soma;

        Scanner scan = new Scanner(System.in);

        // Leitura dos três números
        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scan.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = scan.nextDouble();

        if (num1 > 0) {
            raizQuadrada = Math.sqrt(num1);
            System.out.println("\nA raiz quadrada do primeiro número é: " + raizQuadrada);
        }

        else {
            quadrado = Math.pow(num1, 2);
            System.out.println("O quadrado do primeiro número é: " + quadrado);
        }

        if (num2 > 10 && num2 < 100) {
            System.out.println("Número entre 10 e 100. Intervalo permitido");
        }

        if (num3 < num2) {
            diferenca = num2 - num3;
            System.out.println("A diferença entre o segundo e o terceiro número é de: " + diferenca);
        } else {
            soma = num2 + num3;
            System.out.println("A soma do segundo e terceiro número é: " + soma);
        }
    }
}
 */

/*
 * // Exercicio 12:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        String medias;
        double n1, n2, n3, aritmética, ponderada,harmonica;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        n1 = scan.nextDouble();

        System.out.print("Digite o segundo numero: ");
        n2 = scan.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        n3 = scan.nextDouble();

        System.out.print("\n--Possibilidades de médias--\n" +
                "A - Aritmética\n" +
                "B - Ponderada\n" +
                "C - Harmônica\n" +
                "Informe qual média você deseja realizar: ");
        medias = scan.next().toUpperCase();

        while (!medias.equals("A") && !medias.equals("B") && !medias.equals("C")) {
            Scanner scan2 = new Scanner(System.in);
            System.out.print("\nValor Inválido!! Tente novamente\n" +
                    "--Possibilidades de médias--\n" +
                    "A - Aritmética\n" +
                    "B - Ponderada\n" +
                    "C - Harmônica\n" +
                    "Informe qual média você deseja realizar: ");
            medias = scan2.next().toUpperCase();
        }

        if (medias.equals("A")) {
            aritmética = (n1 + n2 + n3) / 3;
            System.out.println("A média aritmética é: " + aritmética);
        }

        else if (medias.equals("B")) {
            ponderada = ((n1 * 3) + (n2 * 3) + (n3 * 4)) / 10;
            System.out.println("A média ponderada é: " + ponderada);
        } 
        else {
            harmonica = 3 / ((1 / n1) + (1 / n2) + (1 / n3));
            System.out.println("A média harmônica é: " + harmonica);
        }
    }
}


/*
 * // Exercicio 13:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int numero;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } 
        
        else {
            System.out.println(numero + " é um número ímpar.");
        }
    }
}

 */

/*
 * // Exercicio 14:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int cargos;
        double salario, aumento, novo_salario;

        Scanner scan = new Scanner(System.in);
        System.out.print("--Cargos--\n" +
                "1 - Escriturário\n" +
                "2 - Secretário\n" +
                "3 - Caixa\n" +
                "4 - Gerente\n" +
                "5 - Diretor\n" +
                "Informe qual o código do seu cargo: ");
        cargos = scan.nextInt();

        while (cargos < 1 || cargos > 5) {
            Scanner scan2 = new Scanner(System.in);
            System.out.print("\nValor invalido, tente novamente!!\n" +
                    "--Cargos--\n" +
                    "1 - Escriturário\n" +
                    "2 - Secretário\n" +
                    "3 - Caixa\n" +
                    "4 - Gerente\n" +
                    "5 - Diretor\n" +
                    "Informe qual o código do seu cargo: ");
            cargos = scan2.nextInt();
        }
        ;

        System.out.print("\nInforme o seu salario: R$");
        salario = scan.nextDouble();

        switch (cargos) {
            case 1:
                System.out.println("\nO seu cargo é: Escriturário");
                aumento = salario * 0.50;
                System.out.println("Você terá um aumento de 50%. O seu novo salario será de R$" + (salario + aumento));
                break;
            case 2:
                System.out.println("\nO seu cargo é: Secretário");
                aumento = salario * 0.35;
                System.out.println("Você terá um aumento de 35%. O seu novo salario será de R$" + (salario + aumento));
                break;
            case 3:
                System.out.println("\nO seu cargo é: Caixa");
                aumento = salario * 0.20;
                System.out.println("Você terá um aumento de 20%. O seu novo salario será de R$" + (salario + aumento));
                break;
            case 4:
                System.out.println("\nO seu cargo é: Gerente");
                aumento = salario * 0.10;
                System.out.println("Você terá um aumento de 10%. O seu novo salario será de R$" + (salario + aumento));
                break;
            case 5:
                System.out.println("\nO seu cargo é: Diretor");
                System.out.println("Você não terá aumento! O seu salario continuara sendo R$" + salario);
                break;
        }
    }
}
 */