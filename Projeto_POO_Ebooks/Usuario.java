public class Usuario {
  protected String nome;
  protected String email;
  protected String endereco;
  protected String numerocontato;  

    public Usuario(String nome, String email,String endereco,String numerocontato){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.numerocontato = numerocontato;
    }
public void avaliarEbook(){
  System.out.println("Isso aqui é só pra tentar lembrar");
}

public void comentarEbook(){
   System.out.println("Bla bla bla");
}

} 