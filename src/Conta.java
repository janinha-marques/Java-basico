import exceptions.SaldoInsuficienteException;
import exceptions.ValorNegativoException;

public class Conta {
    double saldo;
    String dono;


    void depositar(double valor)   throws ValorNegativoException {
        // this.saldo = this.saldo + valor;
        if (valor < 0) {
            throw new ValorNegativoException(valor);

        }
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
        }

        void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
            if (valor < 0) {
                throw new ValorNegativoException(valor);

            }

            if (this.saldo < valor){
            throw new SaldoInsuficienteException(this.saldo);
        }

            this.saldo -= valor;

        }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    double verSaldo() {
            return this.saldo;
        }

         Conta(String dono) {
             this.dono = dono;
             this.saldo = 0;

         }
    }
}
