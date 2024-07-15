package datas;

public class Data {
    int dia;
    int mes;
    int ano;

    int[] meses31 = new int[]{1, 3, 5, 7, 8, 10, 12};

    //Construtor
    Data(int dia, int mes, int ano){
        validaDia(dia);
        validaMes(mes);
        validaAno(ano);

        if(dia == 31 && !testaMes31(mes)){
            throw new IllegalArgumentException(String.format("O mes %d não pode ter 31 dias", mes));
        }

        // To-do Validar fevereiro
        // To-do Validar fevereiro
        // To-do Validar fevereiro
        // To-do Validar fevereiro
        // To-do Validar fevereiro

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //Blocos para validar os dias, mes e ano:
    void validaDia(int dia){
        if(dia < 1 || dia > 31){
            throw new IllegalArgumentException("Dia deve estar em [1, 31]");
        }
    }

    void validaMes(int mes){
        if(mes < 1 || mes > 12){
            throw new IllegalArgumentException("Mes deve estar em [1, 12]");
        }
    }

    void validaAno( int ano){
        if(ano < 0 || ano > 2999){
            throw new IllegalArgumentException("Ano deve estar em [0, 2999]");
        }
    }


    boolean testaMes31(int mes){
        for(int m : meses31){
            if(m == mes){
                return true;
            }
        }

        return false;
    }

    boolean bissexto(int ano){
        validaAno(ano);

        if ( ano % 4 != 0){
            return false;
        }

        if (ano % 100 != 0){
            return true;
        }

        return ano % 400 == 0;
    }


    String converteParaString(){
        return String.format("%d de %d de %d", this.dia, this.mes, this.ano);
        //Formatação de saída;

        // To-do ajustar a formatação, mudando o nº mes para escrita
        // To-do ajustar a formatação, mudando o nº mes para escrita
        // To-do ajustar a formatação, mudando o nº mes para escrita
        // To-do ajustar a formatação, mudando o nº mes para escrita
        // To-do ajustar a formatação, mudando o nº mes para escrita
    }

    //To-do Verificar se uma data é anterior a outra
    //To-do Verificar se uma data é anterior a outra
    //To-do Verificar se uma data é anterior a outra
    //To-do Verificar se uma data é anterior a outra
    //To-do Verificar se uma data é anterior a outra

    //To-do Verificar se uma data é posterior a outra
    //To-do Verificar se uma data é posterior a outra
    //To-do Verificar se uma data é posterior a outra
    //To-do Verificar se uma data é posterior a outra
    //To-do Verificar se uma data é posterior a outra
}
