package com.ncr.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        pieces[1][0] = new Pawn(PieceColor.WHITE);
        pieces[1][1] = new Pawn(PieceColor.WHITE);
        pieces[1][2] = new Pawn(PieceColor.WHITE);
        pieces[1][3] = new Pawn(PieceColor.WHITE);
        pieces[1][4] = new Pawn(PieceColor.WHITE);
        pieces[1][5] = new Pawn(PieceColor.WHITE);
        pieces[1][6] = new Pawn(PieceColor.WHITE);
        pieces[1][7] = new Pawn(PieceColor.WHITE);

        pieces[6][0] = new Pawn(PieceColor.BLACK);
        pieces[6][1] = new Pawn(PieceColor.BLACK);
        pieces[6][2] = new Pawn(PieceColor.BLACK);
        pieces[6][3] = new Pawn(PieceColor.BLACK);
        pieces[6][4] = new Pawn(PieceColor.BLACK);
        pieces[6][5] = new Pawn(PieceColor.BLACK);
        pieces[6][6] = new Pawn(PieceColor.BLACK);
        pieces[6][7] = new Pawn(PieceColor.BLACK);
        
        throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean isLegalBoardPosition(int srcX, int srcY,Coordinate coordinate,Pawn pawn) {
        int destX = coordinate.getX();
        int destY = coordinate.getX();
        PieceColor color = pawn.getPieceColor();
        if (srcX >= 8 || destX >= 8 || srcY >= 8 || destY >= 8) {
            System.out.println("Exception handled");
            return false;
        }
        if (color == pawn.getPieceColor().BLACK) {
            if (srcX > destX) {
                throw new UnsupportedOperationException("cant make this move, cant move Backwards");
            }
            if( (destX<srcX) && (destY>srcY || destY<srcY ))
            {
                return true;
            }
        }

        if (color == pawn.getPieceColor().WHITE) {
            if (srcX < destX) {
                throw new UnsupportedOperationException("cant make this move, cant move Backwards");
            }
            if( (destX>srcX) && (destY>srcY || destY<srcY ))
            {
                return true;
            }
        }
        return true;
    }


}
