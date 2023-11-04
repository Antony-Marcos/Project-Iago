import java.time.LocalDateTime;
import java.util.ArrayList;


public class CarrinhoDeCompras {
    private ArrayList<Ebook> ebooks;
    private double valorTotal;
    private LocalDateTime dataCompra;

        public CarrinhoDeCompras(ArrayList<Ebook> ebooks,double valorTotal,LocalDateTime dataCompra){
            this.valorTotal = valorTotal;
            this.dataCompra = dataCompra;
        }

}