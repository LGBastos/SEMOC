package mobile.com.ucsal.semoc.model;

import java.io.Serializable;

public class ItemLivro implements Serializable {
    private String titulo;
    private String autor;
    private String resumo;

    public ItemLivro(String titulo, String autor, String resumo) {
        this.titulo = titulo;
        this.autor = autor;
        this.resumo = resumo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
