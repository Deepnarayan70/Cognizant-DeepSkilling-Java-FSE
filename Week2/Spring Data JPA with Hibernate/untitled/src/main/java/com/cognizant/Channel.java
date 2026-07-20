import java.util.ArrayList;

public class Channel {
    private final List<Observer> observer = new ArrayList<>();
    void subscribe(Observer o){
        observer.add(o);
    }
    void unsubscribe(Observer o){
        observer.remove(remove);
    }
    void publish(String video){
        for(Observer o: oberserver){
            o.update(event:"New Video");
        }
    }

}
