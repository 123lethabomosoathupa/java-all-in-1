/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumtest;

/**
 *
 * @author letha
 */
public class EnumTest {

    public enum CardSuit {
        HEARTS, SPADES, CLUBS, DIAMONDS
    }

    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println("The suit is " + suit);
    }
}
