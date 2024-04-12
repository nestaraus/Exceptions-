public class GenderException extends Exception {
    public GenderException() {
    }

    public void genderException(String i) {
        System.out.println("Неккоректно введены значения");
        System.out.printf("Пожалуйста введите f или m: %s", i);
        System.out.println();
    }
}
