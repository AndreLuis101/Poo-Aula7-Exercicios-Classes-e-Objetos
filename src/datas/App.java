package datas;

public class App {
    public static void main(String[] args) {
        Data d1 = new Data(21, 05, 2001);
        Data d2 = new Data(31, 10, 2003);
        Data d3 = new Data(1,05,2008);

        System.out.println(d1.converteParaString());
        System.err.println(d2.converteParaString());
        System.err.println(d3.converteParaString());
    }   
}
