package ESTRUTUTRA_CONTROLE;

public class ExemplosControle {

public static void main(String[] args){
    
    //1 - if - else (condicionais)
 
    //operadores de comparação
    //x > y, a == b

    int idade = 18;

    //if -> começa a condição
    //() -> contem a condição a ser avaliada
    //{} -> corpo da condição
    if (idade >= 18){
        System.out.println("Você é maior de idade");
    }

    //if -> validade se algo é verdadeiro
    //else -> executa se o if não executar
    double nota = 6.3;

    if (nota > 7){
        System.out.println("Você é maior de idade");
    } else{
        System.out.println("Você é menor de idade");

    }
    
    // else if -> intermediário do if e do else
    //tambem valida um bloco

    int hora = 14;

if (hora < 12) {

    System.out.println("Bom dia!");

 }else if (hora > 18) {

    System.out.println("Boa tarde!");  

} else {

    System.out.println("Boa noite!");
}

//é possivel se ter mais de 1 else if

//2 - operadores de comparação

// = é diferente de ==
// = é atribuição
// == é comparação

int x = 10;
int y = 5;

System.out.println("x == y " + (x == y)); // comparação
System.out.println("x != y " + (x != y)); // diferente de 
System.out.println("x > y " + (x > y)); // maior que
System.out.println("x < y " + (x < y)); // menor que
System.out.println("x >= y " + (x >= y)); // maior ou igual à
System.out.println("x <= y " + (x <= y)); // menor ou igual à

//operadores lógicos

// && => AND => op1 && op2 => boolean => apenas se as duas operações forem true 

// || => OR op1 || op2 => boolean => se alguma operação for true

// ! => NOT => !valor => altera o valor ao contrário => TRUE <> FALSE

boolean temDinheiro = true;
boolean temTempo = true;

if (temTempo && temDinheiro) {

    System.out.println("Pode viajar");
    
}else {

    System.out.println("Não pode viajar");

}

// LOOPS - While e For
// Repetir algo  até uma condição ser atingida
// Evita repetição mecaninca de código

int contador = 1;

while (contador <= 5) {
    
    System.out.println(contador );
    contador ++;
}

// se não tivermos uma condição de encerramento caimos no loop infinito

// iteração = cada passagem pelo loop

for(int i = 1; i <= 5; i++) {

    System.out.println("o valor de i é: " + i);

}

}
    
}
