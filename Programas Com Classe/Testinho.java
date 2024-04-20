import java.util.Scanner;

public class Testinho{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedidos p1 = new Pedidos();

        System.out.println("Digite o codigo do Pedido:");
        p1.setCodProD(sc.nextInt());

        System.out.println("Digite a descricao do Pedido:");
        p1.setDescricao(sc.next());

        System.out.println("Digite o preco do Pedido:");
        p1.setPreco(sc.nextDouble());

        Pedidos p2 = new Pedidos(2, "teste", 12.00);

        Pedidos p3 = new Pedidos(p2);

        p3.print();


    }
}