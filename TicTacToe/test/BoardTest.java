/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of copyBoard method, of class Board.
     */
    @Test
    public void testCopyBoard() {
        System.out.println("copyBoard");
        Board instance = new Board();
        int[][] expResult = null;
        int[][] result = instance.copyBoard();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markFirst method, of class Board.
     */
    @Test
    public void testMarkFirst() {
        System.out.println("markFirst");
        int row = 0;
        int column = 0;
        Board instance = new Board();
        instance.markFirst(row, column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markSecond method, of class Board.
     */
    @Test
    public void testMarkSecond() {
        System.out.println("markSecond");
        int row = 0;
        int column = 0;
        Board instance = new Board();
        instance.markSecond(row, column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elementMarked method, of class Board.
     */
    @Test
    public void testElementMarked() {
        System.out.println("elementMarked");
        int row = 0;
        int column = 0;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.elementMarked(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of win method, of class Board.
     */
    @Test
    public void testWin() {
        System.out.println("win");
        Board instance = new Board();
        char expResult = ' ';
        char result = instance.win();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBoard method, of class Board.
     */
    @Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        Board instance = new Board();
        String expResult = "";
        String result = instance.printBoard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
