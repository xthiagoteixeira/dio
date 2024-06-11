package apps.navegador;

public class NavegadorNaInternet implements INavegadorNaInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBIR PAGINA NA INTERNET : " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONAR NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZAR NOVA PAGINA");
    }
}
