public class Main {
    public static void main(String[] args) {
        Pessoa[] cara = new Pessoa[2];
        Livro[] lv = new Livro[3];
        cara[0] = new Pessoa("Pedro", 20, "Masculino");
        cara[1] = new Pessoa("Vitoria", 21, "Feminino");
        lv[0] = new Livro("Trono de Vidro", "Sara J Mass", 550, cara[0]);
        lv[1] = new Livro("Aprendendo java", "Jose da Silva", 300, cara[1]);
        lv[2] = new Livro("POO", "Pedro Paulo", 500, cara[0]);


        lv[0].abrir();
        lv[0].folhear(550);
        lv[0].voltarPag();
        System.out.println(lv[0].detalhes());


    }
}
