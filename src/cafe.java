public class cafe extends Cafeteria{
    public cafe(String condimentos) {
        super(condimentos);
    }

    void preparaBebida(){
        System.out.println("Preparando o café");
    }

    @Override
    void adicionaCondimentos(String Condimentos) {
        System.out.println("Adicionando " + Condimentos);
    }
}
