public class cha extends Cafeteria{
    public cha(String condimentos) {
        super(condimentos);
    }
    void preparaBebida() {
        System.out.println("Preparando o chá");
    }
    void adicionaCondimentos(String Condimentos) {
        System.out.println("Adicionando " + Condimentos);
    }
}
