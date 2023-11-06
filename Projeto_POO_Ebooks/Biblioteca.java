import java.util.ArrayList;
import java.lang.reflect.Array;

public class Biblioteca {

    private ArrayList<Ebook> ebooks;

     public Biblioteca() {
          ebooks = new ArrayList<>();
     }

     //ArrayList<Ebook> ebooks;
     //UsuarioColaborador usuario;

     public void adicionarEbook(Ebook ebook){

          ebooks.add(ebook);
     }
     public void excluirEbook(Ebook ebook){

          ebooks.remove(ebook);
     }

     public ArrayList<Ebook> listarTodosEbooks() {
          ArrayList<Ebook> todosEbooks = new ArrayList<>();
          todosEbooks.addAll(listarEbooksAutorais());
          todosEbooks.addAll(listarEbooksAdquiridos());
          return todosEbooks;
     }

     public ArrayList<Ebook> listarEbooksAutorais() {
          ArrayList<Ebook> ebooksAutorais = new ArrayList<>();
          for (Ebook ebook : ebooks) {
               if (ebook instanceof EbooksAutorais) {
                    ebooksAutorais.add(ebook);
               }
          }
          return ebooksAutorais;
     }

     public ArrayList<Ebook> listarEbooksAdquiridos() {
          ArrayList<Ebook> ebooksAdquiridos = new ArrayList<>();
          for (Ebook ebook : ebooks) {
               if (ebook instanceof EbooksAdquiridos) {
                    ebooksAdquiridos.add(ebook);
               }
          }
          return ebooksAdquiridos;
     }
}
    
