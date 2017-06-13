package sample;


import java.io.*;


public class Counter {
    private int calory;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;

    Counter() throws IOException {

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
            System.out.println("Херак 0 в файл и calory 0");
            this.calory = 0;
        } catch (NumberFormatException e) {
            System.out.println("Какая то херь в файле. Запишу в него нулину");
            fileWriter = new FileWriter("data.txt");
            fileWriter.write("0");
            fileWriter.close();
            this.calory = 0;
        }

    }

    public void setCalory(int calory) {
        this.calory = calory;

    }

    int getCalory() {
        return calory;
    }

    //Помещаем данные о текущих калориях в файл для сохранности
    public void saveCalory() {
        try {
            fileWriter = new FileWriter("data.txt");
            fileWriter.write(String.valueOf(calory));
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Не смог сохранить данные в файл");
            e.printStackTrace();
        }
    }
}
