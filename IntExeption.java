public class IntExeption extends Exception {
        public IntExeption() {
        }
    
        public void intException(String i) {
            System.out.println("Формат числа некорректен");
            System.out.printf("Введите число согласно шаблону: %s", i);
            System.out.println();
        }
}
