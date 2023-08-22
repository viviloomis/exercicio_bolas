public class TesteBolas {
    public static void main(String[] args) {
        Pedra pedregulho = new Pedra();


        pedregulho.lancar();
       
        BolaDeBoliche Phaze = new BolaDeBoliche (nomeDaMarca:"Storm");
        Phaze.lancar();
        Phaze.quicar();

        BolaDeFutebol jabulani = new BolaDeFutebol (nomeDaMarca:"Nike");
        jabulani.lancar();
        jabulani.quicar();
    }
}