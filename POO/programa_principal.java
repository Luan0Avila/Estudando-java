package POO;


public class programa_principal {

    public static void main(String[] args) {
        

        //Criar uma pessoa => instanciar (new)

        //tipo(classe) var = new classe()
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Luan");
        pessoa1.setIdade(20);
        pessoa1.setAltura(1.75);
        pessoa1.setPeso(87);


    System.out.println(pessoa1.getNome());
    System.out.println(pessoa1.getIdade());
    System.out.println(pessoa1.getAltura());
    System.out.println(pessoa1.getPeso());
    
    }
}
