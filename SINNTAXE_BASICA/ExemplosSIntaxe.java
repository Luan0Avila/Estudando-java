package SINNTAXE_BASICA;

public class ExemplosSIntaxe {
    
    public static void main(String[] args) {
        
        //1 - Impressão de texto
        System.out.println("Podemos inprimir este texto " + 45);

        //2 - tipos primitivos
        //variavel = coloca dados
        //int - integer = inteiro
        int idade = 20;
        int anoAtual = 2024;

        System.out.println("Sua idade é " + idade + " anos.");
        System.out.println("O ano é " + anoAtual);

        //double para variaveis com virgula
        double altura = 1.75;
        double pi = 3.14;

        System.out.println("Altura " + altura + " PI " + pi);

        //Textos = Strings
        String nome = "Luan";

        System.out.println("O Nome é: " + nome);

        //bolean => ture ou false
        boolean estaLogado = true;
        boolean temAcesso = false;

        System.out.println("Está logado? " + estaLogado);

        System.out.println("Acesso: " + temAcesso);

        //Variáveis
        int numero;
        
    numero = 10;

    System.out.println(numero);

    numero = 11;

    System.out.println(numero);
        
    //A Atribuição precisa ser do mesmo tipo declarado
    //Exemplo => numero = "teste"; --Não poderia ser feito

    // 4 - Operadores básicos
    //aritiméticas
    int a = 10;
    int b = 5;

    //() = > resolvido primeiro
    //subtração => exibição
    System.out.println("A - B = " + (a - b));
    System.out.println("A + B = " + (a + b));
    System.out.println("A / B = " + (a / b));
    System.out.println("A * B = " + (a * b));

        //op. de incremennto e decremento
        int contador = 0;

        contador++;

        System.out.println("VALOR CONTADOR: " + contador);

        contador--;

        System.out.println("VALOR CONTADOR: " + contador);

        //op. composto
        //a = 10
        //a= 5
        //a += 5
        
        System.out.println("OP COMPOSTO SOMA " + (a += 5));
        System.out.println("OP COMPOSTO SUBTRAÇÃO " + (b -= 5));
        System.out.println("OP COMPOSTO MULTIPLICAÇÃO " + (a *= 5));
    }
}
