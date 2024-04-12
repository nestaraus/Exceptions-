import java.util.HashMap;
public class Exceptions {
    public HashMap<String, Object> InputData() {
        Input inputData = new Input();
        String[] data = inputData.enterData();
        HashMap<String, Object> dataDic = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String i : data) {
            if (i.length() == 1) {
                if (i.equals("f") || i.equals("m")) {
                    dataDic.put("gender", i);
                } else{
                    try {
                        throw new GenderException();
                    } catch (GenderException e) {
                        e.genderException(i);
                    }
                }
            } else if (i.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrayDate = i.split("\\.");
                if (Integer.parseInt(arrayDate[0]) > 0 ||
                        Integer.parseInt(arrayDate[0]) < 31 || Integer.parseInt(arrayDate[1]) > 0 ||
                        Integer.parseInt(arrayDate[1]) < 12 || Integer.parseInt(arrayDate[2]) > 0 ||
                        Integer.parseInt(arrayDate[1]) < 2024) {
                            dataDic.put("date", i);
                        } else try {
                            throw new IntExeption();
                        } catch (IntExeption e) {
                            e.intException(i);
                        }

            } else if (i.matches("[0-9]+")) {
                dataDic.put("tel", i);
            } else if (i.matches("[A-Za-z]+")) {
                sb.append(i + " ");
            } else {
                try {
                    throw new IntExeption();
                } catch (IntExeption e) {
                    e.intException(i);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataDic.put("lastName", fullName[0]);
            dataDic.put("firstName", fullName[1]);
            dataDic.put("patronymic", fullName[2]);
        }
        return dataDic;
    }
}
