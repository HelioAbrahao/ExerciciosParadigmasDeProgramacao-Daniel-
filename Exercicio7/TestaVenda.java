import java.util.ArrayList;

// Exercício 7 - Sistema de Vendas de Supermercado

class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + "', preco=" + preco + "}";
    }
}

class Cliente {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "'}";
    }
}

class ItemVenda {
    private int id;
    private int quantidade;
    private Produto produto;

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double calcularSubtotal() {
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return "ItemVenda{id=" + id +
                ", quantidade=" + quantidade +
                ", produto=" + produto.getNome() +
                ", subtotal=" + calcularSubtotal() + "}";
    }
}

class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(int id, int quantidade, Produto produto) {
        ItemVenda item = new ItemVenda(id, quantidade, produto);
        itens.add(item);
    }

    public void listarVenda() {
        System.out.println("Venda #" + id);
        System.out.println("Cliente: " + cliente.getNome());
        double total = 0;

        for (ItemVenda item : itens) {
            System.out.println(item);
            total += item.calcularSubtotal();
        }

        System.out.println("Total da venda: " + total);
    }
}

class TestaVenda {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Arroz", 25.0);
        Produto p2 = new Produto(2, "Feijão", 10.0);

        Cliente cliente = new Cliente(1, "José");

        Venda venda = new Venda(1, cliente);
        venda.adicionarItem(1, 2, p1);
        venda.adicionarItem(2, 3, p2);

        venda.listarVenda();
    }
}
