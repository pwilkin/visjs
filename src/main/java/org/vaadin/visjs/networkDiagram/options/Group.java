package org.vaadin.visjs.networkDiagram.options;

import org.vaadin.visjs.networkDiagram.util.Color;
import org.vaadin.visjs.networkDiagram.Node;

/**
 * Created by roshans on 10/29/14.
 */
public class Group {

    private Color color;
    private String image;
    private String fontColor;
    private String fontFace;
    private Integer fontSize;
    private Node.Shape shape;
    private Integer radius;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontFace() {
        return fontFace;
    }

    public void setFontFace(String fontFace) {
        this.fontFace = fontFace;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public Node.Shape getShape() {
        return shape;
    }

    public void setShape(Node.Shape shape) {
        this.shape = shape;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }
}
