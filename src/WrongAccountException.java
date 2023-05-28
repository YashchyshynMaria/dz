public class WrongAccountException extends Exception{
    public WrongAccountException() {
        super("Такого акаунту не існує");
    }
}
