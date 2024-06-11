package apps.reprodutor;

public class ReprodutorMusical implements IReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("TOCAR MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSAR MUSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONAR MUSICA : " + musica);

    }
}
