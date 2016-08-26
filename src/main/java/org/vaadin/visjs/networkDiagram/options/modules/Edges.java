package org.vaadin.visjs.networkDiagram.options.modules;

import org.vaadin.visjs.networkDiagram.options.Scaling;
import org.vaadin.visjs.networkDiagram.options.Shadow;
import org.vaadin.visjs.networkDiagram.options.Smooth;
import org.vaadin.visjs.networkDiagram.util.*;

/**
 * Created by roshans on 10/29/14.
 */
public class Edges {
    /*
            To draw an arrow with default settings a string can be supplied. For example: <code>arrows:'to, from,  middle'</code>
         or <code>'to;from'</code>, any combination with any seperating symbol is fine. If you want to control the size of
         the arrowheads, you can supply an object.
         */
    private Arrows arrows;
    private Color color;
    private Boolean dashes;
    private Font font;
    private Boolean hidden;
    private Float hoverWidth;
    private String label;
    private Boolean labelHighlightBold;
    /*
        * The physics simulation gives edges a spring length. This value can override the length of the spring in rest.*/
    private Integer length;
    /*
    The physics simulation gives edges a spring length. This value can override the length of the spring in rest.
     */
   /* private Float length = 100;*/
    /*
    When true, the edge is part of the physics simulation. When false, it will not act as a spring.
     */
    private Boolean physics;
    /*
   If the value option is specified,
   the width of the edges will be scaled according to the
   properties in this object. Keep in mind that when using scaling,
   the width option is neglected.
    */
    private Scaling scaling;

    /*
        The selectionWidth determines the width of the edge when the edge is selected.
        If a number is supplied, this number will be added to the width.
        Because the width can be altered by the value and the scaling functions,
        a constant multiplier or added value may not give the best results.
        To solve this, you can supply a function. Example:

        var options: {
          edges: {
            selectionWidth: function (width) {return width*2;}
          }
        }
        It receives the Number width of the edge.
        In this simple example multiply the width by 2.
        You can taylor the logic in the function as long as it returns a Number.
        */
    private Integer selectionWidth;
    /*
    When the to and from nodes are the same, a circle is drawn. This is the radius of that circle.
     */
    private Integer selfReferenceSize;
    /*
    When true, the edge casts a shadow using the default settings.
    This can be further refined by supplying an object.
     */
    private Shadow shadow;
    /*
    When true, the edge is drawn as a dynamic quadratic bezier curve. The drawing of these curves takes longer than
    that of straight curves but it looks better.There is a difference between dynamic smooth curves and static smooth curves.
    The dynamic smooth curves have an invisible support node that takes part in the physics simulation. If you have a lot of edges,
    you may want to consider picking a different type of smooth curves then dynamic for better performance.
     */
    private Smooth smooth;


    /*
    The title is shown in a pop-up when the mouse moves over the edge.
     */
    private String title;
    /*
        When a value is set, the edges' width will be scaled using the options
        in the scaling object defined above.
         */
   /* private Integer value; */

    /*
        The width of the edge. If value is set, this is not used.
         */
    private Float width;

    public Arrows getArrows() {
        return arrows;
    }

    public void setArrows(Arrows arrows) {
        this.arrows = arrows;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean isDashes() {
        return dashes;
    }

    public void setDashes(Boolean dashes) {
        this.dashes = dashes;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Boolean isHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Float getHoverWidth() {
        return hoverWidth;
    }

    public void setHoverWidth(Float hoverWidth) {
        this.hoverWidth = hoverWidth;
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }


   /* public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }*/

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

    public Integer getSelectionWidth() {
        return selectionWidth;
    }

    public void setSelectionWidth(Integer selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public Integer getSelfReferenceSize() {
        return selfReferenceSize;
    }

    public void setSelfReferenceSize(Integer selfReferenceSize) {
        this.selfReferenceSize = selfReferenceSize;
    }

    public Shadow getShadow() {
        return shadow;
    }

    public void setShadow(Shadow shadow) {
        this.shadow = shadow;
    }

    public Smooth getSmooth() {
        return smooth;
    }

    public void setSmooth(Smooth smooth) {
        this.smooth = smooth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }*/

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public void setWidth(Integer width) {
        this.width = width == null ? null : (float) width;
    }
}
