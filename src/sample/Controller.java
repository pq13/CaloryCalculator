package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {
    @FXML
    Label lblDisplay;

    @FXML
    TextField txtField;

    private Counter counter = new Counter();

    public Controller() throws IOException {
    }


    public void initialize(){
        setLblDisplay();
    }

    private void setLblDisplay() {
        this.lblDisplay.setText(String.valueOf(counter.getCalory()));
    }

    //Пока заглушки реализация потом
    //Устанавливает количество калорий из поля
    public void setCalory() {
        System.out.println("Нажата кнопка установить калории");
        try {
            counter.setCalory(Integer.parseInt(txtField.getText()));
        } catch (Exception e) {
            System.out.println("Вводить нужно число!");
        }
        setLblDisplay();
        counter.saveCalory();
        System.out.println("Сохранили в файл");

    }
    //Добавляет количество калорий указанное в textField
    public void addCalory() {
        System.out.println("Нажата кнопка добавить калории");
        try {
            int a = Integer.parseInt(txtField.getText());
            counter.setCalory(counter.getCalory() + a);
            setLblDisplay();
            counter.saveCalory();
        } catch (NumberFormatException ex) {
            System.out.println("Пустая строка. Введи число!");
        }
    }

    //Вычитает количество калорий указанное в textField
    public void deleteCalory() {
        System.out.println("Нажата кнопка удалить калории");
        try {
            int a = Integer.parseInt(txtField.getText());
            counter.setCalory(counter.getCalory() - a);
            setLblDisplay();
            counter.saveCalory();
        } catch (NumberFormatException ex) {
            System.out.println("Пустая строка. Введи число!");
        }
    }

    //Счётчики устанавливает в ноль
    public void purgeCalory() {
        System.out.println("Нажата кнопка стереть всё");
        counter.setCalory(0);
        setLblDisplay();
        counter.saveCalory();
    }
}
