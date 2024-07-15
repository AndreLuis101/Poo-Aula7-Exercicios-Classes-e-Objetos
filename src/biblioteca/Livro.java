package biblioteca;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String isbn;
    boolean emprestado;

    Livro(String titulo, String autor, int anoPublicacao, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        
        emprestado = false;
    }

    void emprestar() {
        if(estaEmprestado()){
            throw new IllegalStateException("O livro ja esta emprestado");
            //Se o livro estiver emprestado, ele returna o erro, nao sendo possivel emprestar;
        }
        //se nao tiver emprestado, retorna atualizando o valor de emprestado;
        emprestado = true;
    }

    void devolver() {
        if(!estaEmprestado()){
            throw new IllegalStateException("O livro já foi devolvido!!");
            //Se o livro for devolvido e nao esta emprestado, ele ja foi devolvido;
        }
        //Caso o livro esteja emprestado e for devolvido, o valor é atualizado;
        emprestado = false;
    }

    boolean estaEmprestado() {
        return emprestado;
        //Retorna o valor emprestado como verdadeiro;
    }

    String converteParaString(){
        return String.format("%s. %s. (%d). ISBN: %s",this.autor, this.titulo, this.anoPublicacao, this.isbn);
        //Formatação de saída;
    }
}
