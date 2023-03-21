public class Livro {
    String nome;
    String resumo;
    double preco;
    int paginas;
    String autor;

    void exibirDados(){
        System.out.println("nome: " + nome);
        System.out.println("resumo: " + resumo);
        System.out.println("preco: " + preco);
        System.out.println("paginas: " + paginas);
        System.out.println("autor: " + autor);
        System.out.println("---------");
    }
}