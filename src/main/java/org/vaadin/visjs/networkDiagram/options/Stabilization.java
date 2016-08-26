package org.vaadin.visjs.networkDiagram.options;


public class Stabilization {
    /*
    Toggle the stabilization. This is an optional property. If undefined, it is automatically set to true when any of
    the properties of this object are defined.
         */
    Boolean enabled;
    /*
    The physics module tries to stabilize the network on load up til a maximum number of iterations defined here.
    If the network stabilized with less, you are finished before the maximum number.
     */
    Integer iterations;
    /*
    When stabilizing, the DOM can freeze.
    You can chop the stabilization up Integero pieces to show a loading bar for instance.
    The Integererval determines after how many iterations the stabilizationProgress event is triggered.
     */
    Integer updateInterval;
    /*
    If you have predefined the position of all nodes and only want to stabilize the dynamic smooth edges,
    et this to true.It freezes all nodes except the invisible dynamic smooth curve support nodes.
    If you want the visible nodes to move and stabilize, do not use this.
     */
    Boolean onlyDynamicEdges;
    /*
    Toggle whether or not you want the view to zoom to fit all nodes when the stabilization is finished.
     */
    Boolean fit;

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getIterations() {
        return iterations;
    }

    public void setIterations(Integer iterations) {
        this.iterations = iterations;
    }

    public Integer getUpdateInterval() {
        return updateInterval;
    }

    public void setUpdateInterval(Integer updateInterval) {
        this.updateInterval = updateInterval;
    }

    public Boolean isOnlyDynamicEdges() {
        return onlyDynamicEdges;
    }

    public void setOnlyDynamicEdges(Boolean onlyDynamicEdges) {
        this.onlyDynamicEdges = onlyDynamicEdges;
    }

    public Boolean isFit() {
        return fit;
    }

    public void setFit(Boolean fit) {
        this.fit = fit;
    }
}
