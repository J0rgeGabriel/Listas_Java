/* Exercício 01:
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int tamanho = 4, i;
        int[] vetor = new int[tamanho];

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor para a posição 1: ");
        vetor[0] = scan.nextInt();

        int maiorNumero = vetor[0];
        int posMaiorNumero = 1;
        int menorNumero = vetor[0];
        int posMenorNumero = 1;

        for (i = 2; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scan.nextInt();
        }

        for (i = 2; i < tamanho; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
                posMaiorNumero = i;
            }
        }

        for (i = 2; i < tamanho; i++) {
            if (vetor[i] < menorNumero) {
                menorNumero = vetor[i];
                posMenorNumero = i;
            }
        }
        System.out.println("\nO maior numero é " + maiorNumero + " e está na posição " + posMaiorNumero);
        System.out.println("O menor numero é: " + menorNumero + " e está na posição " + posMenorNumero);
    }
}
 */

/* Exercício 02:
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int vetor = 10, i;
        int[] vetor1 = new int[vetor];
        int[] vetor2 = new int[vetor];
        int[] resultado = new int[vetor];

        Scanner scan = new Scanner(System.in);

        System.out.println("\n---Digite os elementos do primeiro vetore---");
        for (i = 0; i < vetor; i++) {
            System.out.print("Elementos " + (i + 1) + ": ");
            vetor1[i] = scan.nextInt();
        }

        System.out.println("\n---Digite os elementos do segundo vetore---");
        for (i = 0; i < vetor; i++) {
            System.out.print("Elementos " + (i + 1) + ": ");
            vetor2[i] = scan.nextInt();
        }

        for (i = 0; i < vetor; i++) {
            resultado[i] = vetor1[i] * vetor2[i];
        }

        System.out.println("\n---Resultado da multiplicação dos vetores---");
        for (i = 0; i < vetor; i++) {
            System.out.println(vetor1[i] + " × " + vetor2[i] + " = " + resultado[i]);
        }

    }
}
 */

/*
 * Exercicío 03:
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[50];
        int i;
        Random random = new Random();

        for (i = 0; i < 50; i++) {
            vetor[i] = random.nextInt(201) - 100;
            if (vetor[i] > 0) {
                System.out.print(vetor[i] + ";" + " ");
            }
        }
    }
}
 */

/* Exercício 04: */
/*
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int tamanho = 30, i;
        int[] vetor_principal = new int[tamanho];
        int[] vetor_trocado = new int[tamanho];

        Random random = new Random();

        for (i = 0; i < tamanho; i++) {
            vetor_principal[i] = random.nextInt(0,2);
        }

        for (i = 0; i < tamanho; i++) {
            if (vetor_principal[i] == 0) {
                vetor_trocado[i] = 1;
            } 
            else {
                vetor_trocado[i] = vetor_principal[i];
            }
        }

        System.out.println("---Vetor principal---");
        for (i = 0; i < tamanho; i++) {
            System.out.print(vetor_principal[i] + ";" + " ");
        }
        System.out.println();
        System.out.println("---Vetor Trocado---");
        for (i = 0; i < tamanho; i++) {
            System.out.print(vetor_trocado[i] + ";" + " ");
        }
    }
}
 */

/* Exercicío 05:*/
/*
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int tamanho = 10, i, compactador = 0;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        

        Random random = new Random();

        for (i = 0; i < tamanho; i++) {
            vetorA[i] = random.nextInt(21) - 10;
        }

        for (i = 0; i < tamanho; i++) {
            if (vetorA[i] > 0) {
                vetorB[compactador] = vetorA[i];
                compactador++;
            }
        }

        System.out.print("\n---Resultado com os numeros nulos e negativos---");
        System.out.println();
        for (i = 0; i < tamanho; i++) {
            System.out.print(vetorA[i] + ";" + " ");
        }


        System.out.print("\n---Resultado sem os numeros nulos e negativos---");
        System.out.println();
        for (i = 0; i < compactador; i++) {
            System.out.print(vetorB[i] + ";" + " ");
        }
    }
}
 */

/* Exercício 06:
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int elemento = 5, i;
        int[] vetorA = new int[elemento];
        int[] vetorB = new int[elemento];
        int[] vetor_resultado = new int[elemento];

        Scanner scan = new Scanner(System.in);

        for (i = 0; i < elemento; i++) {
            System.out.print("Digite um numero para o vetor A na posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            System.out.print("Digite um numero para o vetor B na posição " + (i + 1) + ": ");
            vetorB[i] = scan.nextInt();

            System.out.println();
        }

        for (i = 0; i < elemento; i++) {
            vetor_resultado[i] = vetorA[i] - vetorB[elemento - 1 - i];
        }

        System.out.print("\n---Vetor Resultado---\n");
        for (i = 0; i < elemento; i++) {
            System.out.println(vetorA[i] + " - " + vetorB[elemento - 1 - i] + " = " + vetor_resultado[i]);
        }
    }
}
 */

/* Exercício 07: */
/*
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int tamanho = 15;
        int[] vetor = new int[tamanho];
        int contadorPrimos = 0;

        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100);
        }

        System.out.println("---Vetor Original---");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int num : vetor) {
            if (num > 1) {
                boolean ehPrimo = true;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo) {
                    contadorPrimos++;
                }
            }
        }

        int[] vetorPrimos = new int[contadorPrimos];
        int index = 0;

        for (int num : vetor) {
            if (num > 1) {
                boolean ehPrimo = true;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo) {
                    vetorPrimos[index++] = num;
                }
            }
        }

        System.out.println("\n---Vetor Resultante (Números Primos)---");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(vetorPrimos[i] + " ");
        }
        System.out.println();
    }
}
 */

/* Exercicio 08:*/
/*
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int numeros = 15;
        int[] vetor = new int[numeros];
        double[] vetor_resultado = new double[numeros];

        Random random = new Random();

        System.out.println("---Números gerados aleatoriamente---");
        for (int i = 0; i < numeros; i++) {
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i] + ";" + " ");
        }

        int maior_numero = vetor[0];

        for (int i = 1; i < numeros; i++) {
            if (vetor[i] > maior_numero) {
                maior_numero = vetor[i];
            }
        }

        for (int i = 0; i < numeros; i++) {
            vetor_resultado[i] = (double) vetor[i] / maior_numero;
        }

        System.out.println("\n---A divisão dos números divididos por " + maior_numero + " ficou da seguinte forma---");

        for (int i = 0; i < numeros; i++) {
            System.out.println(vetor[i] + " / " + maior_numero + " = " + String.format("%.2f", vetor_resultado[i]));
        }
    }
}
 */

/* Exercício 09:
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {

        int[] vetor = new int[10];
        Random random = new Random();

        System.out.println("Números gerados aleatoriamente:");

        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(100);
            System.out.println("Posição " + (i + 1) + ": " + vetor[i]);
        }

        System.out.println("\nNúmeros primos e suas posições:");

        for (int i = 0; i < 10; i++) {
            int num = vetor[i];

            if (num > 1) {
                boolean primo = true;

                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }

                if (primo) {
                    System.out.println("Número primo: " + num + " - Posição: " + (i + 1));
                }
            }
        }
    }
}

 */

/* Exercício 10:*/
/*
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int tamanho = 6, contImpares = 0;
        int[] numeros = new int[tamanho];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("---Números pares---");
        System.out.println();

        int somaPares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                somaPares += num;
            }
        }
        System.out.println("\nSoma dos números pares: " + somaPares);

        System.out.print("\n---Números ímpares---");
        System.out.println();

        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                contImpares++;
            }
        }
        System.out.println("\nQuantidade de números ímpares: " + contImpares);
    }
}
 */


/* Exercicio 11:
 * import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        int tamanho = 15, soma = 0;
        int[] vetor = new int[tamanho];

        Random random = new Random();

        System.out.print("---Numeros gerados---");
        System.out.println();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100);
            soma += vetor[i];
            System.out.print(vetor[i] + "; ");
        }

        double media = (double) soma / tamanho;

        System.out.println("\nMédia aritmética dos elementos: " + String.format("%.2f",media));

        boolean encontrouMenor = false;
        
        System.out.print("\n---Elementos menores que a média e suas posições---");
        System.out.println();
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i] + " (posição " + i + ") ");
                encontrouMenor = true;
            }
        }

        if (!encontrouMenor) {
            System.out.println("Nenhum elemento menor que a média foi encontrado.");
        }
    }
}
 */