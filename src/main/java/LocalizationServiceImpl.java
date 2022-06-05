public class LocalizationServiceImpl {
    public String locale(String country) {
        switch (country) {
            case "RUSSIA":
                return "Добро пожаловать";
            default:
                return "Welcome";
        }
    }
}
