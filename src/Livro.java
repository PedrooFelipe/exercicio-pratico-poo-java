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
        setAberto(false);
        setPaginaAtual(0);

        System.out.println("================ LEITURA ===============");
        System.out.println(leitor.getNome() + " esta lendo O livro " + getTitulo() + " do autor(a) " + getAutor() + " ele tem " + getTotPaginas() + " paginas");
    }
    public void detalhes(){
        System.out.println("=============== DETALHES ================");
        if(getPaginaAtual() < 0 || getPaginaAtual() > getTotPaginas()){
            System.out.println("Impossivel esta nessa pagina");
            setPaginaAtual(0);
        }
        System.out.println("o Nome do livro é " + getTitulo() + " é do altor "+ getAutor() +" ele tem " + getTotPaginas() + " paginas voce esta com ele " + getAberto() + " na pagina " + getPaginaAtual());
    }


    public void abrir() {
        if(getAberto()){
            System.out.println("Livro ja esta aberto");
        }else {
            setAberto(true);
            System.out.println("Livro aberto");
        }
    }

    public void fechar() {
        if(getAberto() == false){
            System.out.println("Ja esta fechado");
        }else{
            setAberto(false);
            System.out.println("Livro fechado");
        }
    }

    public void folhear() {
        Random random = new Random();
        System.out.println("folheando...");
        setPaginaAtual(random.nextInt(getTotPaginas()));
    }

    public void avancarPag() {
        if(getPaginaAtual() >= getTotPaginas()){
            System.out.println("imppossivel avançar mais uma pagina");
        }else {
            System.out.println("Passando a página...");
            setPaginaAtual(getPaginaAtual() + 1);
        }
    }

    public void voltarPag() {
        if(getPaginaAtual() <= 0){
            System.out.println("Inposivel voltar mais uma pagina");
        }else {
            System.out.println("Voltando a página...");
            setPaginaAtual(getPaginaAtual() - 1);
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

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
            this.paginaAtual = paginaAtual;

    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
