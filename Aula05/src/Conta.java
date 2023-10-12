import java.util.Objects;

public class Conta {
    public int numero_da_conta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public Conta(int numero_da_conta, String tipo, String dono
    ) {
        this.numero_da_conta = numero_da_conta;
        this.tipo = tipo;
        setStatus(false);
        setDono(dono);
        setSaldo(0);

    }

    public int getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(int numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    private void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        if(isStatus()){
        return saldo;
        }
        else{
            System.out.println("Conta encerrada!");
            return 0;
        }
    }

    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrir(int valor) {
        if (Objects.equals(this.tipo, "CC")) {
            setSaldo(valor + 50);
            setStatus(true);
        }
        if (Objects.equals(this.tipo, "CP")) {
            setSaldo(valor + 150);
            setStatus(true);
        }
    }

    public void fechar() {
        if (this.status) {
            if (getSaldo() == 0) {
                setStatus(false);
                System.out.println("Conta encerrada com sucesso!");
            }
            else{
                System.out.println("O seu saldo deve ser 0 para " +
                        "poder encerrar sua conta, saldo atual: "+ getSaldo());
            }
        }
    }

    public int depositar(int valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public int sacar(int valor) {
        if(this.saldo - valor >= 0){
        this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
        return this.saldo;
    }

    public int pagarMensal() {
        if (Objects.equals(this.tipo, "CC")) {
            this.saldo -= 12;
        }
        if (Objects.equals(this.tipo, "CP")) {
            this.saldo -= 20;
        }
        return this.saldo;
    }
}
