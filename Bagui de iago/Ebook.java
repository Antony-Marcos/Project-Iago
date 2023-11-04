
import java.util.ArrayList;
import java.time.LocalDate;

public class Ebook {
    protected String titulo;
    protected UsuarioColaborador autor;
    protected Editoras editora;
    protected LocalDate dataPublicacao;
    protected ArrayList<String> generoEbooks;
    protected double preco;
    protected Editoras patrocinio;
    protected int avaliacao;
    protected String comentario;

    public Ebook(String titulo, UsuarioColaborador autor, Editoras editora, LocalDate dataPublicacao, 
                 ArrayList<String> generos, double preco, Editoras patrocinio, int avaliacao, String comentario) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.generoEbooks = generos;
        this.preco = preco;
        this.patrocinio = patrocinio;
        this.avaliacao = avaliacao;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AutoresLeitores getAutor() {
        return autor;
    }

    public void setAutor(AutoresLeitores autor) {
        this.autor = autor;
    }

    public Editoras getEditora() {
        return editora;
    }

    public void setEditora(Editoras editora) {
        this.editora = editora;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public ArrayList<String> getGeneroEbooks() {
        return generoEbooks;
    }

    public void setGeneroEbooks(ArrayList<String> generoEbooks) {
        this.generoEbooks = generoEbooks;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editoras getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(Editoras patrocinio) {
        this.patrocinio = patrocinio;
    }

     public int getAvalicao() {
        return avaliacao;
    }

    public void setAvalicao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    public void avaliarEbook(int estrelas){
        
 if (estrelas >= 0 && estrelas <= 5) {
        this.avaliacao = estrelas;
        System.out.println("Você avaliou o ebook com " + estrelas + " estrelas.");
        } else {
        System.out.println("Avaliação inválida. A avaliação deve estar entre 0 e 5 estrelas.");
        }
    }

    
    public void comentarEbook(String comentario){
    
        this.comentario = comentario;
        System.out.println("Você comentou sobre o ebook: " + comentario);

    }


    public void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Editora: " + editora.getNome());
        System.out.println("Data de Publicação: " + dataPublicacao);
        System.out.println("Gêneros: " + generoEbooks);
        System.out.println("Preço: " + preco);
        System.out.println("Avalição: " + avaliacao);
        System.out.println("Comentário: " + comentario);
        
    }
}

