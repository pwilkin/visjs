package org.vaadin.visjs.networkDiagram.options.modules;

import com.google.gson.annotations.SerializedName;

public class Layout {
    /*
        When NOT using the hierarchical layout, the nodes are randomly positioned initially.
        This means that the settled result is different every time. If you provide a random seed manually,
        the layout will be the same every time. Ideally you try with an undefined seed,
        reload until you are happy with the layout and use the getSeed() method to ascertain the seed.
         */
    Integer randomSeed;
    /*
    When enabled, the network will use the Kamada Kawai algorithm for initial layout.
    For networks larger than 100 nodes, clustering will be performed automatically to reduce the amount of nodes.
    This can greatly improve the stabilization times.
    If the network is very Integererconnected (no or few leaf nodes),
     this may not work and it will revert back to the old method.
    Performance will be improved in the future.
     */
    Boolean improvedLayout;

    /*
        When true, the layout engine positions the nodes in a hierarchical fashion using default settings.
        For customization you can supply an object.
         */
    private Hierarchical hierarchical;

    public static class Hierarchical {
        /*
                Toggle the usage of the hierarchical layout system.
                If this option is not defined, it is set to true if any of the properties in this object are defined.
                 */
        Boolean enabled;
        /*
        The distance between the different levels.
         */
        Integer levelSeparation;
        /*
        The direction of the hierarchical layout. The available options are:
        UD, DU, LR, RL. To simplify: up-down, down-up, left-right, right-left.
         */
        Direction direction;
        /*
        The algorithm used to ascertain the levels of the nodes based on the data.
        The possible options are: hubsize, directed.Hubsize takes the nodes with the most edges and puts them at the top.
        From that the rest of the hierarchy is evaluated. Directed adheres to the to and from data of the edges.
         A --> B so B is a level lower than A.
         */
        SortMethod sortMethod;

        public Boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getLevelSeparation() {
            return levelSeparation;
        }

        public void setLevelSeparation(Integer levelSeparation) {
            this.levelSeparation = levelSeparation;
        }

        public Direction getDirection() {
            return direction;
        }

        public void setDirection(Direction direction) {
            this.direction = direction;
        }

        public SortMethod getSortMethod() {
            return sortMethod;
        }

        public void setSortMethod(SortMethod sortMethod) {
            this.sortMethod = sortMethod;
        }
    }

    public Integer getRandomSeed() {
        return randomSeed;
    }

    public void setRandomSeed(Integer randomSeed) {
        this.randomSeed = randomSeed;
    }

    public Boolean isImprovedLayout() {
        return improvedLayout;
    }

    public void setImprovedLayout(Boolean improvedLayout) {
        this.improvedLayout = improvedLayout;
    }

    public Hierarchical getHierarchical() {
        return hierarchical;
    }

    public void setHierarchical(Hierarchical hierarchical) {
        this.hierarchical = hierarchical;
    }

    /*
    The direction of the hierarchical layout.
    The available options are: UD, DU, LR, RL.
    To simplify: up-down, down-up, left-right, right-left.
     */

    public enum Direction {
        @SerializedName("UD")
        UD,
        @SerializedName("DU")
        DU,
        @SerializedName("LR")
        LR,
        @SerializedName("RL")
        RL;
    }

    public enum SortMethod {
        @SerializedName("hubsize")
        hubsize,
        @SerializedName("directed")
        directed;
    }


}
