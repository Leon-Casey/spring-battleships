package com.starr.dev.battleships.model;

enum ShipType {
    TWO, THREE, FOUR
}

enum PieceType {
    BOTTOM, MIDDLE, TOP
}

public class Cell {
    boolean isShipPiece = false;
    boolean isWater = true;
    PieceType pieceType;
    ShipType shipType;

    public boolean isShipPiece() {
        return isShipPiece;
    }

    public void setShipPiece(boolean shipPiece) {
        isShipPiece = shipPiece;
    }

    public boolean isWater() {
        return isWater;
    }

    public void setWater(boolean water) {
        isWater = water;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }
}
