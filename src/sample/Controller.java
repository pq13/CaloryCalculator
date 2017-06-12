package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class Controller {
    @FXML
    Label lblDisplay;
    public Controller() throws IOException {
    }
    private Counter counter = new Counter();

    public void initialize(){
        setLblDisplay();
    }

    private void setLblDisplay() {
        this.lblDisplay.setText(String.valueOf(counter.getCalory()));
    }

    //Пока заглушки реализация потом
    public void setCalory() {
        System.out.println("Нажата кнопка установить калории");
    }
    public void addCalory() {
        System.out.println("Нажата кнопка добавить калории");
    }

    public void deleteCalory() {
        System.out.println("Нажата кнопка удалить калории");
    }

    public void purgeCalory() {
        System.out.println("Нажата кнопка стереть всё");
    }
}
