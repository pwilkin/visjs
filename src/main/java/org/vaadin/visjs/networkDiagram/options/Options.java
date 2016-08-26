package org.vaadin.visjs.networkDiagram.options;

import org.vaadin.visjs.networkDiagram.options.modules.*;
import org.vaadin.visjs.networkDiagram.options.modules.Layout.Direction;
import org.vaadin.visjs.networkDiagram.options.modules.Layout.Hierarchical;

/**
 * Created by roshans on 10/10/14.
 */
public class Options {
    private Boolean autoResize;
    private String height;
    private String width;
    private String locale;
    private Locales locales;
    private Boolean clickToUse;
    private Configure configure;
    private Edges edges;
    private Nodes nodes;
    private Groups groups;
    private Layout layout;
    private Interaction interaction;
    private Manipulation manipulation;
    private Physics physics;

    public Boolean isAutoResize() {
        return autoResize;
    }

    public void setAutoResize(Boolean autoResize) {
        this.autoResize = autoResize;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Locales getLocales() {
        return locales;
    }

    public void setLocales(Locales locales) {
        this.locales = locales;
    }

    public Boolean isClickToUse() {
        return clickToUse;
    }

    public void setClickToUse(Boolean clickToUse) {
        this.clickToUse = clickToUse;
    }

    public Configure getConfigure() {
        return configure;
    }

    public void setConfigure(Configure configure) {
        this.configure = configure;
    }

    public Edges getEdges() {
        return edges;
    }

    public void setEdges(Edges edges) {
        this.edges = edges;
    }

    public Nodes getNodes() {
        return nodes;
    }

    public void setNodes(Nodes nodes) {
        this.nodes = nodes;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public Interaction getInteraction() {
        return interaction;
    }

    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }

    public Manipulation getManipulation() {
        return manipulation;
    }

    public void setManipulation(Manipulation manipulation) {
        this.manipulation = manipulation;
    }

    public Physics getPhysics() {
        return physics;
    }

    public void setPhysics(Physics physics) {
        this.physics = physics;
    }

    public static Options noPhysicsHierarchical() {
        Options options = new Options();
        Physics physics = new Physics();
        physics.setEnabled(false);
        options.setPhysics(physics);
        Layout layout = new Layout();
        Hierarchical hierarchical = new Hierarchical();
        hierarchical.setDirection(Direction.UD);
        layout.setHierarchical(hierarchical);
        options.setLayout(layout);
        return options;
    }

}
