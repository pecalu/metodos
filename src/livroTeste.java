public class livroTeste {

    public static void main(String[] args){
        Livro meuLivro = new Livro();
        meuLivro.nome = "A arte da guerra";
        meuLivro.preco = 20.99;
        meuLivro.paginas = 350;
        meuLivro.resumo = "eita como ele tadiboa <°>|<°>";
        meuLivro.autor = "luan gameplays";

        System.out.println(meuLivro.nome);
        System.out.println(meuLivro.resumo);
        System.out.println(meuLivro.preco);
        System.out.println(meuLivro.paginas);
        System.out.println(meuLivro.autor);

        Livro livroFavorito = new Livro();
        livroFavorito.nome = "CLEBER RESPOSTAS";
        livroFavorito.resumo = "um livro de respostas do cleber";
        livroFavorito.paginas = 1700;
        livroFavorito.preco = 139.99;
        livroFavorito.autor = "cleber mentoria";

        livroFavorito.exibirDados();
    }
}