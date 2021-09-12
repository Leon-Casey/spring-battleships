package com.starr.dev.battleships.model;

public class Cell {
    boolean isShipPiece = false;
    boolean isWater = true;

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
}
