public abstract class Cafeteria {
    String condimentos;

    public Cafeteria(String condimentos) {
        this.condimentos = condimentos;
    }

    final void faz(){
        aqueceAgua();
        preparaBebida();
        colocaXicara();
        adicionaCondimentos(condimentos);
    }
    public void aqueceAgua(){
        System.out.println("Aquecendo a agua");
    }
    abstract void preparaBebida();
    public void colocaXicara(){
        System.out.println("Colocando a bebida na xicara");
    }

    abstract void adicionaCondimentos(String Condimentos);

}
