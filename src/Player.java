import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Player {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }


    public Player(String name,int age) {
        setName(name);
        setAge(age);

    }
}

