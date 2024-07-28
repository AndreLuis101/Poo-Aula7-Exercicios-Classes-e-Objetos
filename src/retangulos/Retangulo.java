package retangulos;

public class Retangulo {
    double centrox, centroy; //Considerando apenas o 2d
    double largura;
    double altura;

    Retangulo(double centrox, double centroy, double largura, double altura){
        this.centrox = centrox;
        this.centroy = centroy;
        this.largura = largura;
        this.altura = altura;
    }

    double area(){
        return this.altura*this.largura;
    }

    double perimetro(){
        return 2*(this.altura+this.largura);
    }

    boolean pontoContido(double x, double y){
        double dist = (((this.centrox-x)*(this.centrox-x)) + ((this.centroy-y)*(this.centroy-y)))*0.5;
        return dist < centrox+largura/2 || dist < centrox-largura/2  && dist < centroy+altura/2 || dist < centroy-altura/2;
    }

    /**
     * Um retângulo não intersecciona outro se: 
     * * lado direito do retângulo A está à esquerda do lado esquerdo do retângulo B
     * * lado esquerdo do retângulo A está à direita do lado direito do retângulo B
     * * lado superior do retângulo A está abaixo do lado inferior do retângulo B
     * * lado inferior do retângulo A está acima do lado superior do retângulo B
     * Inversamente, se nenhuma dessas condições for verdadeira, os retângulos interseccionam.
     */
    boolean interseciona(Retangulo b) {
        boolean aEsquerdaDeB = this.centrox + this.largura / 2 < b.centrox - b.largura / 2;
        boolean aDireitaDeB = this.centrox - this.largura / 2 > b.centrox + b.largura / 2;
        boolean aAbaixoDeB = this.centroy + this.altura / 2 < b.centroy - b.altura / 2;
        boolean aAcimaDeB = this.centroy - this.altura / 2 > b.centroy + b.altura / 2;

        return !aEsquerdaDeB && !aDireitaDeB && !aAcimaDeB && !aAbaixoDeB;
    }

    /**
     * Um retângulo contém outro se o retângulo contido estiver completamente dentro do
     * retângulo contenedor. Isso significa que:
     * * lado superior do retângulo contido está abaixo do lado superior do retângulo contenedor
     * * lado inferior do retângulo contido está acima do lado inferior do retângulo contenedor
     * * lado esquerdo do retângulo contido está à direita do lado esquerdo do retângulo contenedor
     * * lado direito do retângulo contido está à esquerda do lado direito do retângulo contenedor
     * Se todas essas condições forem verdadeiras, o retângulo contenedor contém o retângulo contido.
     */
    boolean contem(Retangulo b) {
        double aEsquerdo = this.centrox - this.largura / 2;
        double aDireito = this.centrox + this.largura / 2;
        double aTopo = this.centroy + this.altura / 2;
        double aBase = this.centroy - this.altura / 2;

        double bEsquerdo = b.centrox - b.largura / 2;
        double bDireito = b.centrox + b.largura / 2;
        double bTopo = b.centroy + b.altura / 2;
        double bBase = b.centroy - b.altura / 2;

        return bEsquerdo >= aEsquerdo && bTopo <= aTopo && bDireito <= aDireito && bBase >= aBase;
    }
}
