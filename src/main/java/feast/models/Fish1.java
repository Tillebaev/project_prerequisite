package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fish1 {
    private final Duck2 duck2;

    @Autowired
    public Fish1(Duck2 duck2) {
        this.duck2 = duck2;
    }

    @Override
    public String toString() {
        return "of a fish inside of a duck, " + duck2.toString();
    }
}