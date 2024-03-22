public class bankCount {

    private Integer identificador;
    private String name;
    private double balance;

    public bankCount(Integer identificador, String name, double balance) {
        this.identificador = identificador;
        this.name = name;
        this.balance = balance;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double cant) {

        balance += cant;
        return balance;
    }

    public double debito(double cant) {
        if (balance >= cant) {
            balance -= cant;
        } else {
            System.out.println(" Saldo insuficiente ");
        }
        return balance;
    }


}
