class bola implements lancavel {
    private String nomeDaMarca;

    public Bola(String nomeDaMarca) {
        this.nomeDaMarca = nomeDaMarca;
    }

    public String getNomeDaMarca() {
        return this.nomeDaMarca;
    }

    public void lancar() {
        System.out.println("Bola da marca" + nomeDaMarca + " lançada!");
    }

    public void quicar() {
        System.out.println("Bola da marca " + nomeDaMarca + " quicando!");
    }
}
