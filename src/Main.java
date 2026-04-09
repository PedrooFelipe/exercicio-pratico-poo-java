public class Main {
    public static void main(String[] args) {
        Pessoa[] cara = new Pessoa[5];
        cara[0] = new Pessoa("Pedro", 20, "Masculino");

        Livro lv = new Livro("Trono de Vidro", "Sara J Mass", 550, cara[0]);
        lv.abrir();
        lv.folhear();
        lv.detalhes();
        lv.avancarPag();
        lv.detalhes();
        lv.voltarPag();
        lv.detalhes();

    }
}
