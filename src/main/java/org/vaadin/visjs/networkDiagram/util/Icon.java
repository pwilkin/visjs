package org.vaadin.visjs.networkDiagram.util;


import com.google.gson.annotations.SerializedName;

public class Icon {
    private Face face;
    private String code;
    private Integer size;
    private String color;

    public enum Face{
        @SerializedName("FontAwesome")
        FontAwesome,
        @SerializedName("Ionicons")
        Ionicons
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
