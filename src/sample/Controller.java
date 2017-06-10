package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    Label lblDisplay;

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
