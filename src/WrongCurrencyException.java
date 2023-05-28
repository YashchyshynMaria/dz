public class WrongCurrencyException extends Exception{
    public WrongCurrencyException() {
        super("Акаунт не має достатньо коштів");
    }
}
