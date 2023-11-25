/* Exercício 01: */
/*
 * public class main {
    public static void main(String[] args) throws Exception {
        String frase = "Nao vou colar na prova";
        int i;

        for (i = 0; i < 30; i++) {
            System.out.println(frase);
        }
    }
}
 */

/*Exercício 02:*/
/*
 * public class main {
    public static void main(String[] args) throws Exception {
        int i;

        for (i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
 */


/*Exercício 03: */
/*
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int tamanho = 50, i;
        int[] vetor = new int[tamanho];

        Scanner scan = new Scanner(System.in);

        for (i = 0; i < tamanho; i++) {
            System.out.print("Digite um número inteiro para verificar se é positivo: ");
            vetor[i] = scan.nextInt();
        }

        System.out.println("");

        for (i = 0; i < tamanho; i++) {
            if (vetor[i] >= 0) {
                System.out.println("O número " + vetor[i] + " é positivo");
            }
        }
    }
}
 */


/*Exercício 04*/
/*
 * import java.util.*;;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0, contador = 0;
        double media;

        while (true) {
            System.out.print("Digite um número (ou 0 para sair): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            else if (numero % 2 == 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador > 0) {
            media = (double )soma / contador;
            System.out.println("A média dos números pares é: " + media);
        } 

        else {
            System.out.println("Nenhum número par foi digitado.");
        }
    }
}
 */

/*Exercicio 04:*/
/*
 * import java.util.*;;

public class main {

    public static void main(String[] args) {
    int numero, soma = 0, contador;

    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    numero = scan.nextInt();

    for (contador = 0; contador <= numero; contador++) {
        soma += contador;
    }
    System.out.println("A soma dos numeros de 0 ate " + numero + " é " + soma);
    }
}
 */

/*Exercicio 05:*/
/*
 *import java.util.*;;

public class main {
    public static void main(String[] args) {
        int numero, i;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = scan.nextInt();

        for (i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}
 */

/*Exercicios 06:*/
/*
 * import java.util.*;;

public class main {

    public static void main(String[] args) {
        int anos = 0;
        double populacaoBruzundangas = 90_000_000;
        double populacaoMilano = 200_000_000;
        double taxaCrescimentoBruzundangas = 0.03; 
        double taxaCrescimentoMilano = 0.015;

        while (populacaoBruzundangas < populacaoMilano) {
            populacaoBruzundangas += populacaoBruzundangas * taxaCrescimentoBruzundangas;
            populacaoMilano += populacaoMilano * taxaCrescimentoMilano;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população dos Bruzundangas alcance ou ultrapasse a população dos Milanos.");
    }
}
 */

/*Exercicios 07:*/
/*
 * import java.util.*;;

public class main {
    public static void main(String[] args) {
        int termo_1, termo_2, termos, termos_02, soma, i, novoTermo;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro termo: ");
        termo_1 = scan.nextInt();

        System.out.print("Digite o segundo termo: ");
        termo_2 = scan.nextInt();

        System.out.print("Digite a quantidade de termos [N]: ");
        termos = scan.nextInt();

        while (termos < 3) {
            System.out.print(
                    "Para ser uma serie de Ricci, precisa ser digitado no minimo 3 termos! Digite a quantidade de termos novamente [N]:");
            termos_02 = scan.nextInt();
            termos = termos_02;
        }

        soma = termo_1 + termo_2;

        System.out.print("Os " + termos + " primeiros termos de Ricci são: " + termo_1 + " e " + termo_2);

        for (i = 3; i <= termos; i++) {
            novoTermo = termo_1 + termo_2;
            System.out.print(", " + novoTermo);
            soma += novoTermo;

            termo_1 = termo_2;
            termo_2 = novoTermo;
        }
        System.out.println("\nA soma dos " + termos + " termos é: " + soma);
    }
}
 */

/*Exercicio 08:*/
/*
 * import java.util.*;

public class main {
    public static void main(String[] args) {
        int n_mais_gordo = 0, n_mais_magro = 0, i, n;
        double maisGordo = Double.MIN_VALUE, maisMagro = Double.MAX_VALUE, peso;

        Random random = new Random();

        for (i = 1; i <= 10; i++) {
            n = i;
            peso = 180 + random.nextDouble() * (300 - 180);

            if (peso > maisGordo) {
                maisGordo = peso;
                n_mais_gordo = n;
            }

            else if (peso < maisMagro) {
                maisMagro = peso;
                n_mais_magro = n;
            }
        }
        System.out.println("O boi mais gordo é o numero " + n_mais_gordo + ", o seu peso é de " + String.format("%.2f", maisGordo) + "Kg");
        System.out.println("O boi mais magro é o numero " + n_mais_magro + ", o seu peso é de " + String.format("%.2f", maisMagro) + "Kg");
    }
}
 */

/*Exercicio 09:*/
/*
 * import java.util.*;

public class main {
    public static void main(String[] args) {
        int numero, numero_primo = 1, i;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = scan.nextInt();

        for (i = 2; i < numero; i++) {
            if (numero % i == 0) {
                numero_primo = 0;
                break;
            }
        }

        if (numero_primo == 1) {
            System.out.print("O numero é primo");
        }

        else {
            System.out.print("O numero não é primo");
        }
    }
}
 */

/*Exercicio 10:*/
import java.util.*;

public class lista_04 {
    public static void main(String[] args) {
        double numero;
        String pergunta;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero entre 1 e 8: ");
        numero = scan.nextDouble();

        while (numero < 1 || numero > 8) {
            System.out.print("Número invalido!! Digite um numero entre 1 e 8: ");
            numero = scan.nextDouble();
        }

        if (numero <= 2) {
            System.out.print("Seu numero é divisivel por 2? [S/N]");
            pergunta = scan.next().toUpperCase();

            while (!pergunta.equals("S") && !pergunta.equals("N")) {
                System.out.print("Resposta invalida!! Seu numero é divisivel por 2? [S/N] ");
                pergunta = scan.next().toUpperCase();
            }

            if (pergunta.equals("S")) {
                System.out.println("O numero que voce pensou é [2]");
            }

            else {
                System.out.println("O numero que voce pensou é [1]");
            }
        }

        else if (numero >= 3 && numero <= 5) {
            System.out.print("Seu numero é divisivel por 2? [S/N]");
            pergunta = scan.next().toUpperCase();

            while (!pergunta.equals("S") && !pergunta.equals("N")) {
                System.out.print("Resposta invalida!! Seu numero é divisivel por 2? [S/N] ");
                pergunta = scan.next().toUpperCase();
            }

            if (pergunta.equals("S")) {
                System.out.println("O numero que voce pensou é [4]");
            }

            else if (pergunta.equals("N")) {
                System.out.print("Seu numero é divisivel por 5? [S/N]");
                pergunta = scan.next().toUpperCase();

                while (!pergunta.equals("S") && !pergunta.equals("N")) {
                    System.out.print("Resposta invalida!! Seu numero é divisivel por 5? [S/N] ");
                    pergunta = scan.next().toUpperCase();
                }
                if (pergunta.equals("S")) {
                    System.out.println("O numero que voce pensou é [5]");
                }

                else {
                    System.out.println("O numero que voce pensou é [3]");
                }
            }
        }

        else if (numero >= 6 && numero <= 8) {
            System.out.print("Seu numero é divisivel por 2? [S/N]");
            pergunta = scan.next().toUpperCase();

            while (!pergunta.equals("S") && !pergunta.equals("N")) {
                System.out.print("Resposta invalida!! Seu numero é divisivel por 2? [S/N] ");
                pergunta = scan.next().toUpperCase();
            }

            if (pergunta.equals("S")) {
                System.out.print("Seu numero é divisivel por 3? [S/N]");
                pergunta = scan.next().toUpperCase();

                while (!pergunta.equals("S") && !pergunta.equals("N")) {
                    System.out.print("Resposta invalida!! Seu numero é divisivel por 2? [S/N] ");
                    pergunta = scan.next().toUpperCase();
                }

                if (pergunta.equals("S")) {
                    System.out.println("O numero que voce pensou é [6]");
                }

                else if (pergunta.equals("N")) {
                    System.out.print("Seu numero é divisivel por 4? [S/N]");
                    pergunta = scan.next().toUpperCase();
                    if (pergunta.equals("S")) {
                        System.out.println("O numero que voce pensou é [8]");
                    }
                }
            }

            else {
                System.out.println("O numero que voce pensou é [7]");
            }
        }
    }
}

/* Exercicio 11: */
/*
 * import java.util.*;
 * 
 * public class main {
 * public static void main(String[] args) {
 * int n = 0;
 * 
 * while (n < 100000) {
 * System.out.println("O valor atual é: " + n);
 * n += 1000;
 * }
 * System.out.println("Chegou em 100000");
 * }
 * }
 */

/* Exercicio 12: */
/*
 * import java.util.*;
 * 
 * public class main {
 * public static void main(String[] args) {
 * int N, mult2 = 0, mult3 = 0, mult4 = 0, mult5 = 0;
 * 
 * Random random = new Random();
 * Scanner scan = new Scanner(System.in);
 * 
 * System.out.print("Quantidade de números na lista: ");
 * N = scan.nextInt();
 * 
 * int [] lista = new int[N];
 * 
 * for (int i = 0; i < N; i++) {
 * lista[i] = random.nextInt(100) + 1;
 * System.out.print(lista[i] + " ");
 * 
 * if (lista[i] % 2 == 0) mult2++;
 * if (lista[i] % 3 == 0) mult3++;
 * if (lista[i] % 4 == 0) mult4++;
 * if (lista[i] % 5 == 0) mult5++;
 * }
 * 
 * System.out.println("\nQuantidade de múltiplos de 2: " + mult2);
 * System.out.println("Quantidade de múltiplos de 3: " + mult3);
 * System.out.println("Quantidade de múltiplos de 4: " + mult4);
 * System.out.println("Quantidade de múltiplos de 5: " + mult5);
 * }
 * }
 * 
 */

/* Exercicio 13: */
/*
 * import java.util.*;
 * 
 * public class main {
 * public static void main(String[] args) {
 * int idade, maior_Idade = 0, menor_idade = 1000, qnt_mulheres = 0,
 * total_pessoas = 0;
 * String sexo = "", sexo_MenorSalario = "";
 * double salario, soma_salario = 0, menor_Salario = Double.MAX_VALUE;
 * 
 * Scanner scan = new Scanner(System.in);
 * 
 * while (true) {
 * System.out.print("\nDigite sua idade: ");
 * idade = scan.nextInt();
 * 
 * if (idade < 0) {
 * break;
 * }
 * 
 * System.out.print("Digite seu salario: R$");
 * salario = scan.nextDouble();
 * 
 * System.out.print("Digite seu sexo [M/F/I]: ");
 * sexo = scan.next().toUpperCase();
 * 
 * if (idade > maior_Idade) {
 * maior_Idade = idade;
 * }
 * 
 * else if (idade < menor_idade) {
 * menor_idade = idade;
 * }
 * 
 * soma_salario += salario;
 * 
 * if (salario < menor_Salario) {
 * menor_Salario = salario;
 * sexo_MenorSalario = sexo;
 * }
 * 
 * if (sexo.equals("F")) {
 * qnt_mulheres++;
 * }
 * 
 * total_pessoas++;
 * }
 * 
 * if (total_pessoas > 0) {
 * double media_salario = soma_salario / total_pessoas;
 * System.out.println("\nA média salarial dos grupos desta região é de R$" +
 * String.format("%.2f",media_salario));
 * }
 * 
 * else {
 * System.out.println("Nenhuma pessoa foi inserida.");
 * }
 * 
 * System.out.println("Maior idade: " + maior_Idade);
 * System.out.println("Menor idade: " + menor_idade);
 * System.out.println("A quantidade de mulheres é de nesta região é de " +
 * qnt_mulheres);
 * System.out.println("O menor salario é no valor de R$" + menor_Salario +
 * ", e pertence a uma pessoa do sexo " + sexo_MenorSalario);
 * }
 * }
 */