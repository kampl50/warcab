package com.mygdx.game.Fields;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.EnumOfFileds.FieldPawnEnum;
import com.mygdx.game.EnumOfFileds.FieldColorEnum;

import java.io.Serializable;

public class Field implements Serializable {

    private Texture texture;
    private int width;
    private int height;
    private FieldPawnEnum statusField;
    private FieldColorEnum fieldColor;
    private int i, j;

    public Field(Texture texture, FieldColorEnum fieldColorEnum, FieldPawnEnum kindOfPawn, int i, int j) {

        this.fieldColor = fieldColorEnum;
        this.texture = texture;
        this.statusField = kindOfPawn;
        this.height = texture.getHeight();
        this.width = texture.getWidth();
        this.i = i;
        this.j = j;
    }


    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public FieldPawnEnum getStatusField() {
        return statusField;
    }

    public void setStatusField(FieldPawnEnum statusField) {
        this.statusField = statusField;
    }

    public FieldColorEnum getFieldColor() {
        return fieldColor;
    }

    public void setFieldColor(FieldColorEnum fieldColor) {
        this.fieldColor = fieldColor;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}


