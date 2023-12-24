package org.example.model;

import org.example.annotations.Autowired;
import org.example.annotations.Component;

@Component("Motorbike")
public class Motorbike {
    @Autowired
    private Body body;
    @Autowired
    private Engine engine;

    /*@Autowired
    public Motorbike(Body body, Engine engine) {
        this.body = body;
        this.engine = engine;
    }*/

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "body=" + body +
                ", engine=" + engine +
                '}';
    }
}
