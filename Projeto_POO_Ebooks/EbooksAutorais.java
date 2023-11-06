import java.time.LocalDateTime;

public class EbooksAutorais extends Ebook {

    LocalDateTime dataDeCriacao;

    String tempoDeCriacao;

    public EbooksAutorais(String titulo, UsuarioColaborador autor, Editoras editora, LocalDate dataPublicacao, ArrayList<String> generoEbooks, double preco, Editoras patrocinio, int avaliacao, String comentario, LocalDateTime dataDeCriacao, String tempoDeCriacao) {

    super(titulo, autor, editora, dataPublicacao, generoEbooks, preco, patrocinio, avaliacao, comentario);

    this.dataDeCriacao = dataDeCriacao;

    this.tempoDeCriacao = tempoDeCriacao;

}






    @Override
    public void avaliarEbook(int estrelas){
        
        if (estrelas >= 0 && estrelas <= 5) {
               this.avaliacao = estrelas;
               System.out.println("Você avaliou o ebook com " + estrelas + " estrelas.");
               } else {
               System.out.println("Avaliação inválida. A avaliação deve estar entre 0 e 5 estrelas.");
               }
           }

    @Override
    public void comentarEbook(String comentario){
    
        this.comentario = comentario;
        System.out.println("Você comentou sobre o ebook: " + comentario);

    }       
       

    
}