package biblioteca;

import java.util.ArrayList; //Array dinamico que vai dobrando a cada limite de dados;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca(){
        acervo = new ArrayList<Livro>();
    }

    void adicionarLivro(Livro livro){
        acervo.add(livro);
    }

    boolean removerLivro(String isbn){
        for(Livro livro: acervo){
            if (isbn.equals(livro)){
                acervo.remove(livro);

                return true;
            }
        }

        return false;
    }

    ArrayList<Livro> listaTodos(){
        return acervo;
    }

    ArrayList<Livro> listaEmprestados(){
        ArrayList<Livro> emprestados = new ArrayList<Livro>();

        for (var Livro: acervo){
            if(Livro.estaEmprestado()){
                emprestados.add(Livro);
            }
        }

        return emprestados;
    }


    //To-do: verificar essa parte do código com o do prof;
    /**
    ArrayList<Livro> listaDisponivel(){
        ArrayList<Livro> disponiveis = new ArrayList<Livro>();

        for(Livro livro : acervo){
            if(!livro.estaEmprestado()){
                disponiveis 
            }
        }
    }
    */
}
