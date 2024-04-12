import java.io.IOException;
import java.util.HashMap;
public class Program {
    public static void main(String[] args) {
        Exceptions Data = new Exceptions(); 
        String newFileName = null; 
        Write writeFile = new Write(); 

        HashMap<String, Object> data = Data.InputData(); // Иннициализация словаря
        while (data.size() != 6) {
            try {
                throw new IntExeption();
            } catch (IntExeption e) {
                data = Data.InputData();
            }
        } // Цикл для ввода данных, пока пользователь не введет корректные данные

        newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath); // Вызывается метод класса WriteFile для записи в файл

    }
}
