package com.ncr.chess;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PawnTest {

    private ChessBoard chessBoard;
    private Pawn testSubject;

    @Before
    public void setUp() {
        this.chessBoard = new ChessBoard();
        this.testSubject = new Pawn(PieceColor.BLACK);
    }

    @Test
    public void testChessBoard_Add_Sets_XCoordinate() {
        this.chessBoard.addPiece(testSubject, 6, 3, PieceColor.BLACK);
        assertEquals(6, testSubject.getXCoordinate());
    }

    @Test
    public void testChessBoard_Add_Sets_YCoordinate() {
        this.chessBoard.addPiece(testSubject, 6, 3, PieceColor.BLACK);
        assertEquals(3, testSubject.getYCoordinate());
    }


    @Test
    public void testPawn_Move_IllegalCoordinates_Right_DoesNotMove() {
        chessBoard.addPiece(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.move(MovementType.MOVE,new Coordinate(4, 3),new Coordinate(2, 3),PieceColor.BLACK);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove() {
        chessBoard.addPiece(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.move(MovementType.MOVE,new Coordinate(4, 3),new Coordinate(2, 3),PieceColor.BLACK);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_LegalCoordinates_Forward_UpdatesCoordinates() {
        chessBoard.addPiece(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.move(MovementType.MOVE, new Coordinate(4, 3),new Coordinate(2, 3), PieceColor.BLACK);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
    }

}