public class capuccino extends Cafeteria{

    public capuccino(String condimentos) {
        super(condimentos);
    }
    void preparaBebida() {
        System.out.println("Preparando o capuccino");
    }
    void adicionaCondimentos(String Condimentos) {
        System.out.println("Adicionando " + Condimentos);
    }
}
