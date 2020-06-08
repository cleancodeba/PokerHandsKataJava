package com.cleancodeba;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void createCardTest(){
        Hand whiteHand = new Hand();
        whiteHand.addCard("2H");
        whiteHand.addCard("3D");
        whiteHand.addCard("5S");
        whiteHand.addCard("9C");
        whiteHand.addCard("KD");
        assertEquals(2, new Card("2H").getValue());
        assertEquals(10, new Card("TD").getValue());
        assertEquals(11, new Card("JD").getValue());
        assertEquals(12, new Card("QD").getValue());
        assertEquals(13, new Card("KD").getValue());
        assertEquals(14, new Card("AD").getValue());
        assertEquals("KD", whiteHand.getHigherCard().toString());
    }

    @Test
    public void compareHandsHigherCards(){
        String[] black = new String[]{"2H","3D","5S","9C","KD"};
        String[] white = new String[]{"2C","3H","4S","8C","AH"};
        Hand whiteHand = new Hand(white);
        Hand blackHand = new Hand(black);
        Game game = new Game();
        assertEquals( whiteHand, game.whosWinning(whiteHand, blackHand));
    }

    @Test
    public void compareHandsPairCards(){
        String[] black = new String[]{"2H","2D","5S","9C","KD"};
        String[] white = new String[]{"2C","3H","4S","8C","AH"};
        Hand whiteHand = new Hand(white);
        Hand blackHand = new Hand(black);
        Game game = new Game();
        assertEquals( blackHand, game.whosWinning(whiteHand, blackHand));
    }

    @Test
    public void compareHandsPairHigherCards(){
        String[] white = new String[]{"AH","AD","5S","9C","KD"};
        String[] black = new String[]{"2C","2S","4S","8C","JC"};
        Hand whiteHand = new Hand(white);
        Hand blackHand = new Hand(black);
        Game game = new Game();
        assertEquals( whiteHand, game.whosWinning(whiteHand, blackHand));
    }

    @Test
    public void compareHandsPairTieCards(){
        String[] black = new String[]{"3H","3D","5S","9C","KD"};
        String[] white = new String[]{"3C","3S","4S","8C","AH"};
        Hand whiteHand = new Hand(white);
        Hand blackHand = new Hand(black);
        Game game = new Game();
        assertEquals(whiteHand, game.whosWinning(whiteHand, blackHand));
    }

}