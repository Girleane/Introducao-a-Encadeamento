package nos.refatorado;

public class Main {

    public static void main(String[] args) {
        No<String> no1 = new No<>("Conteudo no1");

        No<String> no2 = new No<>("Conteudo no2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.toStringEncadeado());

        System.out.println(no2);
        System.out.println(no2.toStringEncadeado());

        System.out.println(no3);
        System.out.println(no3.toStringEncadeado());
        System.out.println(no4.toStringEncadeado());
    }
}
