package biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O senhor dos aneis"
        ,  "J. R. R. Tolkien "
        ,1954
        ,  "123");

        Livro livro2 = new Livro("O Hobbit" 
        , "J. R. R. Tolkien"
        , 1937
        , "234");

        Livro livro3 = new Livro("Dom quixote"
        , "Miguel cervantes"
        , 1605
        , "789");

        Livro livro4 = new Livro("Guerra e paz"
        , "Lev Tolstóo"
        , 1869
        , "325");

        Livro livro5 = new Livro("100 anos de solidão"
        , "Gabriel guarcia marquez"
        , 1967
        , "961");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();

        System.out.println("Livros emprestados");
        for(Livro livro : biblioteca.listaEmprestados()){
            System.out.println(livro.converteParaString());
        }
        
        //Colocar em pretica após verificar a parte de livros disponiveis
        //*******************************************************************

        /** 
        System.out.println("Livros disnponíveis");
        for( Livro livro: biblioteca.listaDisponivel){
            System.out.println(livro.converteParaString());
        }
        */
    }
}
