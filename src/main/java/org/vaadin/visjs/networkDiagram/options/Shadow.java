package org.vaadin.visjs.networkDiagram.options;

public class Shadow {


    /*
        Toggle the casting of shadows. If this option is not defined,
        it is set to true if any of the properties in this object are defined.
         */
    private Boolean enabled;
    /*
    The blur size of the shadow.
     */
    private Integer size;
    /*
    The x offset.
     */
    private Integer x;
    /*
    The y offset.
     */
    private Integer y;

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

}
