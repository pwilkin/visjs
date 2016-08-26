package org.vaadin.visjs.networkDiagram.options.modules;

import org.vaadin.visjs.networkDiagram.options.Scaling;
import org.vaadin.visjs.networkDiagram.options.Shadow;
import org.vaadin.visjs.networkDiagram.options.ShapeProperties;
import org.vaadin.visjs.networkDiagram.util.*;
import org.vaadin.visjs.networkDiagram.Node;

/**
 * Created by roshans on 10/29/14.
 */
public class Nodes {

    Integer borderWidth;
    Integer borderWidthSelected;
    String brokenImage;
    Color color;
    Fixed fixed;
    Font font;
    private String group;
    private Boolean hidden;
    /*
    These options are only used when the shape is set to ICON
     */
    private Icon icon;
    private String image;
    private String label;
    private Boolean labelHighlightBold;
    private Integer level;
    private Integer mass;
    private Boolean physics;
    private Scaling scaling;
    private Shadow shadow;
    private Node.Shape shape;
    private ShapeProperties shapeProperties;
    /*
    The size is used to determine the size of node shapes that do not have the label inside of them.
     These shapes are: image, circularImage, diamond, dot, star, triangle, triangleDown, square and icon
     */
    private Integer size;
    /*
     Title to be displayed when the user hovers over the node.
     The title can be an HTML element or a string containing plain text or HTML.
     */
    private String title;
    /*
    When a value is set, the nodes will be scaled using the options in the scaling object defined above.
     */
    private Integer value;
    //private Integer x;
    //private Integer y;


    /** This gives a node an initial x position. When using the hierarchical layout, either the x or y position is set by
     * the layout engine depending on the type of view. The other value remains untouched. When using stabilization,
     * the stabilized position may be different from the initial one. To lock the node to that position use the physics
     * or fixed options.
    * */
    private Integer x;

  /*  * This gives a node an initial y position. When using the hierarchical layout, either the x or y position is set by
     * the layout engine depending on the type of view. The other value remains untouched. When using stabilization, the
      * stabilized position may be different from the initial one. To lock the node to that position use the physics or
      * fixed options.
    * */
    private Integer y;

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Integer getBorderWidthSelected() {
        return borderWidthSelected;
    }

    public void setBorderWidthSelected(Integer borderWidthSelected) {
        this.borderWidthSelected = borderWidthSelected;
    }

    public String getBrokenImage() {
        return brokenImage;
    }

    public void setBrokenImage(String brokenImage) {
        this.brokenImage = brokenImage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fixed getFixed() {
        return fixed;
    }

    public void setFixed(Fixed fixed) {
        this.fixed = fixed;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean isHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        setShape(Node.Shape.image);
        this.image = image;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean isLabelHighlightBold() {
        return labelHighlightBold;
    }

    public void setLabelHighlightBold(Boolean labelHighlightBold) {
        this.labelHighlightBold = labelHighlightBold;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Boolean isPhysics() {
        return physics;
    }

    public void setPhysics(Boolean physics) {
        this.physics = physics;
    }

    public Scaling getScaling() {
        return scaling;
    }

    public void setScaling(Scaling scaling) {
        this.scaling = scaling;
    }

    public Shadow getShadow() {
        return shadow;
    }

    public void setShadow(Shadow shadow) {
        this.shadow = shadow;
    }

    public Node.Shape getShape() {
        return shape;
    }

    public void setShape(Node.Shape shape) {
        this.shape = shape;
    }

    public ShapeProperties getShapeProperties() {
        return shapeProperties;
    }

    public void setShapeProperties(ShapeProperties shapeProperties) {
        this.shapeProperties = shapeProperties;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

}
