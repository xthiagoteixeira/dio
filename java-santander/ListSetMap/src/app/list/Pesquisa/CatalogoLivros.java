package app.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }


    public List<Livro> pesquisaPorAutor(String autor) {
        if(!livroList.isEmpty()){
            List<Livro> resultado = new ArrayList<>();
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    resultado.add(livro);
                }
            }
            return resultado;
        }
        return List.of();
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }


    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        catalogoLivros.adicionarLivro("To Kill a Mockingbird", "Harper Lee", 1960);
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);


        System.out.println(catalogoLivros.pesquisaPorAutor("George Orwell"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1925, 1949));
        System.out.println(catalogoLivros.pesquisarPorTitulo("The Great Gatsby"));

    }

}
