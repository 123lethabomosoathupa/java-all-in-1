/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ball;

/**
 *
 * @author letha
 */
public class Ball {

    private double weight;

    protected double getWeight() {
        return this.weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}

public class BaseBall extends Ball {

    public BaseBall() {
        setWeight(5.125);
    }
}
