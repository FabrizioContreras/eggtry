package ej1poo.Entidad;

public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NDePag;

    public Libro(int ISBN, String Titulo, String Autor, int NDePag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NDePag = NDePag;
    }

    public Libro() {
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNDePag(int NDePag) {
        this.NDePag = NDePag;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNDePag() {
        return NDePag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NDePag=" + NDePag + '}';
    }

}
