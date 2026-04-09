import java.util.Random;

public class Livro implements publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulio, String autor, int totpg, Pessoa leitor){
        this.titulo = titulio;
        this.autor = autor;
        this.totPaginas = totpg;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;

        System.out.println("================ LEITURA ===============");
        System.out.println(leitor.getNome() + " esta lendo O livro " + getTitulo() + " do autor(a) " + getAutor() + " ele tem " + getTotPaginas() + " paginas");
    }
    public String detalhes(){
        return "Livro{" + "Titulo="+ titulo+",\n autor=" + autor+ ",\n total de paginas=" + totPaginas + ",\n pagina atual=" + paginaAtual +",\n aberto=" + aberto + ",\n leitor=" +leitor.getNome() + "}";
    }


    public void abrir() {
        if(this.aberto){
            System.out.println("Livro ja esta aberto");
        }else {
            this.aberto = true;
            System.out.println("Livro aberto");
        }
    }

    public void fechar() {
        if(this.aberto == false){
            System.out.println("Ja esta fechado");
        }else{
            this.aberto = false;
            System.out.println("Livro fechado");
        }
    }

    public void folhear(int p) {
        if(p > this.totPaginas || p < 0){
            this.paginaAtual = 0;
        }else{
            this.paginaAtual = p;
        }
    }

    public void avancarPag() {
        if(this.paginaAtual >= getTotPaginas()){
            System.out.println("imppossivel avançar mais uma pagina");
        }else {
            System.out.println("Passando a página...");
            this.paginaAtual++;
        }
    }

    public void voltarPag() {
        if(this.paginaAtual <= 0){
            System.out.println("Inposivel voltar mais uma pagina");
        }else {
            System.out.println("Voltando a página...");
            this.paginaAtual--;
        }
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

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
}
