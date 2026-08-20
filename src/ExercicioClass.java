public class ExercicioClass {
    public static void main(String[] args){
        Conta contaJoanilda = new Conta( "Joanilda");
        contaJoanilda.depositar(  20);

        Conta contaGabriel = new Conta(  "Gabriel");
        contaGabriel.depositar(  10);

        contaJoanilda.sacar(  15);

        System.out.println("Saldo da joanilda = " + contaJoanilda.verSaldo());
        System.out.println("Saldo do gabriel = " + contaGabriel.verSaldo());


    }

}
