import java.util.Observer;

public class subscriber implements Observer;
privte final String name;
Subscriber(String name) {
    this.name=name;
}
public void update(String event){
    System.out.println(name+"recived"+event);
}
