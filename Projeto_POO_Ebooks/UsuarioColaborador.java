import java.util.ArrayList;

public class UsuarioColaborador {
    private String cpf;
    private ArrayList<Ebook> ebooksEscritos;

    public UsuarioColaborador(String cpf) {
        this.cpf = cpf;
        this.ebooksEscritos = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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


