package org.vaadin.visjs.networkDiagram.util;


public class Font {

    private String color;
    private Integer size;
    private String face;
    private String background;
    private Integer strokeWidth;
    private String strokeColor;
   /* private Align align = Align.horizontal;

    enum Align{
        @SerializedName("horizontal")
        horizontal,
        @SerializedName("top")
        top,
        @SerializedName("middle")
        middle,
        @SerializedName("bottom")
        bottom
    }*/


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Integer getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(Integer strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

}
