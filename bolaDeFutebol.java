class bolaDeFutebol extends Bola {
    public bolaDeFutebol(String nomeDaMarca) {
        super(nomeDaMarca);
    }

    @Override
    public void lancar() {
        System.out.println("Bola da marca" + nomeDaMarca + "lançada!");
    }

    @Override
    public void quicar() {
        System.out.println("Bola da marca" + nomeDaMarca + "quicando!");
    }
}