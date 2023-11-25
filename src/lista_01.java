/*Ex01:
import java.util.*;
public class main {
    public static void main(String[] args) throws Exception {
        double numero;
        double divisao;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um numero real: ");
        numero = leitura.nextFloat();

        divisao = numero / 2;

        System.out.println("O numero " + numero + " divido por 2 é igual a " + divisao);
    }
}
 */

/*Ex02:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double numero;
        double antecessor;
        double sucessor;
        
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = leitura.nextFloat();
        
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        System.out.println("O antecessor de " + numero + " é " +  antecessor);
        System.out.println("O sucessor de " + numero + " é " +  sucessor);
    }
}
 */

/* Ex03:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double n1;
        double n2;
        double resultado;
        
        Scanner numero01 = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        n1 = numero01.nextDouble();
        
        Scanner numero02 = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        n2 = numero02.nextDouble();
        
        resultado = n1 + n2;
        System.out.println("Soma: " + resultado);
    }
}
 */

/* Ex04:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double Km, Km_por_Litro, preco;
        double gasto;
        
        Scanner Km_pecorrido = new Scanner(System.in);
        System.out.print("Digite a distancia a ser percorrida em Km: ");
        Km = Km_pecorrido.nextDouble();
        
        Scanner Km_litro = new Scanner(System.in);
        System.out.print("Digite o consumo do carro em Km/Litros: ");
        Km_por_Litro = Km_litro.nextDouble();
        
        Scanner preco$ = new Scanner(System.in);
        System.out.print("Digite o pre o da gasolina: R$");
        preco = preco$.nextDouble();
        
        gasto = (Km / Km_por_Litro) * preco;
        
        System.out.print("O valor gasto nessa viagem foi de R$" + gasto);
    }
}
 */

/* Ex05:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double prova01, prova02, prova03, media;
        
        Scanner p1 = new Scanner(System.in);
        System.out.print("Digite sua nota da primeria prova: ");
        prova01 = p1.nextDouble();
        
        Scanner p2 = new Scanner(System.in);
        System.out.print("Digite sua nota da segunda prova: ");
        prova02 = p2.nextDouble();
        
        Scanner p3 = new Scanner(System.in);
        System.out.print("Digite sua nota da terceira prova: ");
        prova03 = p3.nextDouble();
        
        media = ((prova01 * 2) + (prova02 * 4) + (prova03 * 6)/12);
        
        System.out.println("A sua media final foi de: " + media);
    }
}
 */

/* Ex06:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        int anos, meses, dias, idade_anos, idade_meses, idade_dias;
        
        Scanner a = new Scanner(System.in);
        System.out.print("Digite sua idade em anos: ");
        anos = a.nextInt();
        
        Scanner m = new Scanner(System.in);
        System.out.print("E quantos meses: ");
        meses = m.nextInt();
        
        Scanner d = new Scanner(System.in);
        System.out.print("E quantos dias: ");
        dias = d.nextInt();
        
        idade_anos = anos * 365;
        idade_meses = meses *30;
        idade_dias = idade_anos + idade_meses + dias;
        
        System.out.println("Voce tem " + idade_dias + " dias de vida");
    }
}
 */

/* Ex07:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        int d1, d2, d3, numero, numeroInvertido;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro com três digitos: ");
        numero = scan.nextInt();

        d1 = numero % 10;
        d2 = (numero / 10) % 10;
        d3 = numero / 100;

        numeroInvertido = (d1 * 100) + (d2 * 10) + d3;

        System.out.println("Numero invertido: " + numeroInvertido);
    }
}
 */

/* Ex08:
import java.util.*;
 * public class main {
    public static void main(String[] args) throws Exception {
        int base, altura, perimetro, area;
        
        Scanner b = new Scanner(System.in);
        System.out.print("Digite a base do retangulo: ");
        base = b.nextInt();
        
        Scanner a = new Scanner(System.in);
        System.out.print("Digite a area do retangulo: ");
        altura = a.nextInt();
        
        perimetro = (base + altura) * 2;
        area = base  * altura;
        
        System.out.println("O perimetro do retangulo é: " + perimetro);
        System.out.println("A area do retangulo é: " + area);   
    }
}
 */

/* Ex09:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double raio, perimetro, area, pi=3.14;
        
        Scanner r = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        raio = r.nextDouble();
        
        perimetro = 2 * pi * raio;
        area = pi * raio * raio;
        
        System.out.printf("O perimetro do raio é de: %.2f \n" , perimetro);
        System.out.printf("A area do raio é de: %.2f" , area);  
    }
}
 */

/* Ex10:
import java.util.*;
 * public class main {
    public static void main(String[] args) throws Exception {
        double prestacao, valor_prestacao, taxa, tempo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor da prestação: R$");
        valor_prestacao = scan.nextDouble();
        
        System.out.print("Digite o valor da taxa: R$");
        taxa = scan.nextDouble();
        
        System.out.print("Digite o tempo em atraso: ");
        tempo = scan.nextDouble();
        
        prestacao = valor_prestacao + (valor_prestacao * (taxa/100) * tempo);
        
        System.out.println("O valor da prestação será de: R$" + prestacao);
    }
}
 */

/* Ex10.1:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double n1, n2, n3, n4, media;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        n1 = scan.nextDouble();

        System.out.print("Digite o segundo numero: ");
        n2 = scan.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        n3 = scan.nextDouble();

        System.out.print("Digite o quarto numero: ");
        n4 = scan.nextDouble();

        media = (n1 + n2 + n3 + n4) / 10;
        System.out.println("A média ponderada dos numeros digitados é: " + media);
    }
}
 */

/* Ex11:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double saldo_atual, reajuste_saldo;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu saldo atual: R$");
        saldo_atual = scan.nextDouble();

        reajuste_saldo = saldo_atual + (saldo_atual * 0.1);

        System.out.println("O seu novo saldo após o reajuste de 1% é de R$" + reajuste_saldo);
    }
}
 */

/* Ex12:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double centigrados, fahrenheit;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus celsius: ");
        centigrados = scan.nextDouble();

        fahrenheit = (9 * centigrados + 160) / 5;

        System.out.println("A temperatura de " + centigrados + "°C convertida para fahrenheit é de: " + fahrenheit + "°F");
    }
}
 */

/* Ex13 e 14:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        double id, horas_trabalhadas, valor_hora, salario;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu ID de funcionario: ");
        id = scan.nextDouble();
        System.out.print("Digite suas horas trabalhadas: ");
        horas_trabalhadas = scan.nextDouble();
        System.out.print("Digite quanto você recebe por hora:");
        valor_hora = scan.nextDouble();

        salario = horas_trabalhadas * valor_hora;

        System.out.println("O funcionario do ID: " + id + " trabalhou " + horas_trabalhadas
                + " horas, portando, o seu sálario será de R$" + salario);
    }
}
 */

/* Ex15:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        int n1, n2, adicao, subtracao, multiplicacao, divisao;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        n1 = scan.nextInt();

        System.out.print("Digite mais um numero: ");
        n2 = scan.nextInt();

        adicao = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;

        System.out.println(n1 + " + " + n2 + " = " + adicao);
        System.out.println(n1 + " - " + n2 + " = " + subtracao);
        System.out.println(n1 + " * " + n2 + " = " + multiplicacao);
        System.out.println(n1 + " ÷ " + n2 + " = " + divisao);
    }
}
 */

/*Ex16:
import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        int valor_saque, notas_1, notas_5, notas_10, resto_10;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor que deseja retirar: R$");
        valor_saque = scan.nextInt();

        notas_10 = valor_saque / 10;
        resto_10 = valor_saque % 10;
        notas_5 = resto_10 / 5;
        notas_1 = resto_10 % 5;

        System.out.println("\n-----Quantidade de notas-----");
        System.out.println("Notas de R$10,00: " + notas_10);
        System.out.println("Notas de R$5,00: " + notas_5);
        System.out.println("Notas de R$1,00: " + notas_1);
    }
}
 */

/*Ex17:
    import java.util.*;
    public class main {
    public static void main(String[] args) throws Exception {
        int numero_conta, soma, multiplicacao, subtracao, digito_verificador;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero da sua conta (4 dígitos): ");
        numero_conta = scan.nextInt();

        soma = (numero_conta / 1000) + ((numero_conta / 100) % 10) + ((numero_conta / 10) % 10) + (numero_conta % 10);
        multiplicacao = (numero_conta / 1000) * ((numero_conta / 100) % 10) * ((numero_conta / 10) % 10) * (numero_conta % 10);
        subtracao = multiplicacao - soma;
        digito_verificador =subtracao % 9;

        System.out.println("O dígito verificar é: " + digito_verificador);
    }
}
 */

import java.util.*;

public class lista_01 {
    public static void main(String[] args) throws Exception {
        double n1;
        double n2;
        double n3;
        double resultado;

        Scanner numero01 = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        n1 = numero01.nextDouble();

        if (n1 < 0) {
            Scanner nn1 = new Scanner(System.in);
            System.out.print("Numero invalido! Digite um numero valido");
            n1 = nn1.nextDouble();

        } else if (n1 >= 0) {
            Scanner numero02 = new Scanner(System.in);
            System.out.print("Digite o segundo numero: ");
            n2 = numero02.nextDouble();
        }
    }
}
