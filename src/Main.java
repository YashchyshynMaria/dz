public class Main {

    public static void main(String[] args) throws Exception {
        BankApplication bankApplication = new BankApplication();
        try {
            bankApplication.process("accountId000",50, "USD");
        } catch (Exception e) {
            throw new WrongAccountException();

        }
        try {
            bankApplication.process("accountId003",250, "HRV");
        } catch (Exception e) {
            throw new WrongCurrencyException();
        }
        try {
            bankApplication.process("accountId001",50, "EUR");
        } catch (Exception e) {
            throw new WrongOperationException();
        }
        try {
            bankApplication.process("accountId001",50, "USD");
        } catch (Exception e) {
            System.out.println("Акаунт не має достатньо коштів");
        }
        try {
            bankApplication.process("accountId001",50, "USD");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Дякую, що скористалися нашим сервісом");
        }
    }
}
