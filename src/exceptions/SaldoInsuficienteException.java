package exceptions;

    public class SaldoInsuficienteException extends RuntimeException {
        /**
         * Constroi a exceção para valores negativos
         * @param saldo
         */
        public SaldoInsuficienteException(double saldo){
            super("Saldo Insuficiente: " + saldo);

        }
    }


