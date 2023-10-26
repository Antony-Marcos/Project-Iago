import java.util.ArrayList;

public class AutoresLeitores {
    private String nome;
    private ArrayList<Ebook> ebooksEscritos;

    public AutoresLeitores(String nome) {
        this.nome = nome;
        this.ebooksEscritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ebook> getEbooksEscritos() {
        return ebooksEscritos;
    }

    public void setEbooksEscritos(ArrayList<Ebook> ebooksEscritos) {
        this.ebooksEscritos = ebooksEscritos;
    }

    public void adicionarEbook(Ebook ebook) {
        ebooksEscritos.add(ebook);
    }

    public void excluirEbook(Ebook ebook) {
        ebooksEscritos.remove(ebook);
    }

    
}


