package org.vaadin.visjs.networkDiagram.options.modules;

public class Interaction {
    /*
    When true, the nodes that are not fixed can be dragged by the user.
     */
    Boolean dragNodes;
    /*
    When true, the view can be dragged around by the user.
     */
    Boolean dragView;
    /*
    When true, the edges are not drawn when dragging the view.
    This can greatly speed up responsiveness on dragging, improving user experience.
     */
    Boolean hideEdgesOnDrag;
    /*
    When true, the nodes are not drawn when dragging the view.
    This can greatly speed up responsiveness on dragging, improving user experience.
     */
    Boolean hideNodesOnDrag;
    /*
    When true, the nodes use their hover colors when the mouse moves over them.
     */
    Boolean hover;
    /*
    When true, on hovering over a node, it's connecting edges are highlighted.
     */
    Boolean hoverConnectedEdges;
    Keyboard keyboard;
    /*
    When true, a longheld click (or touch) as well as a control-click will add to the selection.
     */
    Boolean multiselect;
    /*
    When true, navigation buttons are drawn on the network canvas.
    These are HTML buttons and can be completely customized using CSS.
     */
    Boolean navigationButtons;
    /*
    When true, the nodes and edges can be selected by the user.
     */
    Boolean selectable;
    /*
    When true, on selecting a node, its connecting edges are highlighted.
     */
    Boolean selectConnectedEdges;
    /*
    When nodes or edges have a defined 'title' field, this can be shown as a pop-up tooltip.
    The tooltip itself is an HTML element that can be fully styled using CSS.
    The delay is the amount of time in milliseconds it takes before the tooltip is shown.
     */
    Integer tooltipDelay;
    /*
    When true, the user can zoom in.
     */
    Boolean zoomView;

    public class Keyboard {
        /*
        Toggle the usage of the keyboard shortcuts. If this option is not defined,
        it is set to true if any of the properties in this object are defined.
         */
        Boolean enabled;
        Speed speed;
        Boolean bindToWindow;

        private class Speed {
            /*
            The speed at which the view moves in the x direction on pressing a key or pressing a navigation button.
             */
            Integer x;
            /*
            The speed at which the view moves in the y direction on pressing a key or pressing a navigation button.
             */
            Integer y;
            /*
            The speed at which the view zooms in or out pressing a key or pressing a navigation button.
             */
            Float zoom;

            public Integer getX() {
                return x;
            }

            public void setX(Integer x) {
                this.x = x;
            }

            public Integer getY() {
                return y;
            }

            public void setY(Integer y) {
                this.y = y;
            }

            public Float getZoom() {
                return zoom;
            }

            public void setZoom(Float zoom) {
                this.zoom = zoom;
            }

        }

        public Boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Speed getSpeed() {
            return speed;
        }

        public void setSpeed(Speed speed) {
            this.speed = speed;
        }

        public Boolean isBindToWindow() {
            return bindToWindow;
        }

        public void setBindToWindow(Boolean bindToWindow) {
            this.bindToWindow = bindToWindow;
        }
    }

    public Boolean isDragNodes() {
        return dragNodes;
    }

    public void setDragNodes(Boolean dragNodes) {
        this.dragNodes = dragNodes;
    }

    public Boolean isDragView() {
        return dragView;
    }

    public void setDragView(Boolean dragView) {
        this.dragView = dragView;
    }

    public Boolean isHideEdgesOnDrag() {
        return hideEdgesOnDrag;
    }

    public void setHideEdgesOnDrag(Boolean hideEdgesOnDrag) {
        this.hideEdgesOnDrag = hideEdgesOnDrag;
    }

    public Boolean isHideNodesOnDrag() {
        return hideNodesOnDrag;
    }

    public void setHideNodesOnDrag(Boolean hideNodesOnDrag) {
        this.hideNodesOnDrag = hideNodesOnDrag;
    }

    public Boolean isHover() {
        return hover;
    }

    public void setHover(Boolean hover) {
        this.hover = hover;
    }

    public Boolean isHoverConnectedEdges() {
        return hoverConnectedEdges;
    }

    public void setHoverConnectedEdges(Boolean hoverConnectedEdges) {
        this.hoverConnectedEdges = hoverConnectedEdges;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Boolean isMultiselect() {
        return multiselect;
    }

    public void setMultiselect(Boolean multiselect) {
        this.multiselect = multiselect;
    }

    public Boolean isNavigationButtons() {
        return navigationButtons;
    }

    public void setNavigationButtons(Boolean navigationButtons) {
        this.navigationButtons = navigationButtons;
    }

    public Boolean isSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public Boolean isSelectConnectedEdges() {
        return selectConnectedEdges;
    }

    public void setSelectConnectedEdges(Boolean selectConnectedEdges) {
        this.selectConnectedEdges = selectConnectedEdges;
    }

    public Integer getTooltipDelay() {
        return tooltipDelay;
    }

    public void setTooltipDelay(Integer tooltipDelay) {
        this.tooltipDelay = tooltipDelay;
    }

    public Boolean isZoomView() {
        return zoomView;
    }

    public void setZoomView(Boolean zoomView) {
        this.zoomView = zoomView;
    }
}

