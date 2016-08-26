package org.vaadin.visjs.networkDiagram.util;

/**
 * Created by roshans on 10/22/14.
 */
public class Color {

    private String hover;
    private String highlight;
    private String border;
    private String background;
    private String color;
    private Float opacity = 1.0f;
    private String inherit;

    public Color() {
    }

    public Color(String backgroundColor) {
        this.background = backgroundColor;
    }

    public Color(String backgroundColor, String highlightColor) {
        this.background = backgroundColor;
        this.highlight = highlightColor;
    }

    public Color(String backgroundColor, String hoverColor, String highlightColor) {
        this.background = backgroundColor;
        this.highlight = highlightColor;
        this.hover = hoverColor;
    }

    public Color(String backgroundColor, String hoverColor, String highlightColor, String borderColor) {
        this.background = backgroundColor;
        this.hover = hoverColor;
        this.highlight = highlightColor;
        this.border = borderColor;
    }

    public String getHoverColor() {
        return hover;
    }

    public void setHoverColor(String hover) {
        this.hover = hover;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlightColor(String highlight) {
        this.highlight = highlight;
    }

    public String getBorderColor() {
        return border;
    }

    public void setBorderColor(String border) {
        this.border = border;
    }

    public String getBackgroundColor() {
        return background;
    }

    public void setBackgroundColor(String background) {
        this.background = background;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getOpacity() {
        return opacity;
    }

    public void setOpacity(Float opacity) {
        this.opacity = opacity;
    }

    public String getInherit() {
        return inherit;
    }

    public void setInherit(String inherit) {
        this.inherit = inherit;
    }

    public String getHover() {
        return hover;
    }

    public void setHover(String hover) {
        this.hover = hover;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
