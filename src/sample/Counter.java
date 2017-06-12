package sample;


import java.io.*;


public class Counter {
    private int calory;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;

    Counter() throws IOException {
        this.calory = 0;
        try {
            fileReader = new FileReader("data.txt");
            System.out.println("файл найден");
            bufferedReader = new BufferedReader(fileReader);
            this.calory = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Сейчас calory равен " + calory);
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
            File file = new File("data.txt");
            file.createNewFile();
            System.out.println("Создаём файл");
            fileWriter = new FileWriter("data.txt");
            fileWriter.write("0");
            fileWriter.close();
            System.out.println("Херак 0 в файл");
        }
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }

    int getCalory() {
        return calory;
    }

    //Помещаем данные в файл для сохранности
    public void saveCalory() {
        try {
            fileWriter.write(calory);
        } catch (IOException e) {
            System.out.println("Не смог сохранить данные в файл");
            e.printStackTrace();
        }
    }
}
