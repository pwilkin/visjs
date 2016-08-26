package org.vaadin.visjs.networkDiagram.options.cluster;

/**
 * Created by roshans on 10/30/14.
 */
public class Cluster {

    private Integer initialMaxNodes;
    private Integer clusterThreshold;
    private Integer reduceToNodes;
    private Integer clusterEdgeThreshold;
    private Integer sectorThreshold;
    private Integer maxFontSize;
    private Integer edgeGrowth;
    private Integer maxNodeSizeIncrements;
    private Integer activeAreaBoxSize;
    private Integer clusterLevelDifference;

    private Float chainThreshold;
    private Float screenSizeThreshold;
    private Float fontSizeMultiplier;
    private Float forceAmplification;
    private Float distanceAmplification;

    private NodeScale nodeScaling;

    public Integer getInitialMaxNodes() {
        return initialMaxNodes;
    }

    public void setInitialMaxNodes(Integer initialMaxNodes) {
        this.initialMaxNodes = initialMaxNodes;
    }

    public Integer getClusterThreshold() {
        return clusterThreshold;
    }

    public void setClusterThreshold(Integer clusterThreshold) {
        this.clusterThreshold = clusterThreshold;
    }

    public Integer getReduceToNodes() {
        return reduceToNodes;
    }

    public void setReduceToNodes(Integer reduceToNodes) {
        this.reduceToNodes = reduceToNodes;
    }

    public Integer getClusterEdgeThreshold() {
        return clusterEdgeThreshold;
    }

    public void setClusterEdgeThreshold(Integer clusterEdgeThreshold) {
        this.clusterEdgeThreshold = clusterEdgeThreshold;
    }

    public Integer getSectorThreshold() {
        return sectorThreshold;
    }

    public void setSectorThreshold(Integer sectorThreshold) {
        this.sectorThreshold = sectorThreshold;
    }

    public Integer getMaxFontSize() {
        return maxFontSize;
    }

    public void setMaxFontSize(Integer maxFontSize) {
        this.maxFontSize = maxFontSize;
    }

    public Integer getEdgeGrowth() {
        return edgeGrowth;
    }

    public void setEdgeGrowth(Integer edgeGrowth) {
        this.edgeGrowth = edgeGrowth;
    }

    public Integer getMaxNodeSizeIncrements() {
        return maxNodeSizeIncrements;
    }

    public void setMaxNodeSizeIncrements(Integer maxNodeSizeIncrements) {
        this.maxNodeSizeIncrements = maxNodeSizeIncrements;
    }

    public Integer getActiveAreaBoxSize() {
        return activeAreaBoxSize;
    }

    public void setActiveAreaBoxSize(Integer activeAreaBoxSize) {
        this.activeAreaBoxSize = activeAreaBoxSize;
    }

    public Integer getClusterLevelDifference() {
        return clusterLevelDifference;
    }

    public void setClusterLevelDifference(Integer clusterLevelDifference) {
        this.clusterLevelDifference = clusterLevelDifference;
    }

    public Float getChainThreshold() {
        return chainThreshold;
    }

    public void setChainThreshold(Float chainThreshold) {
        this.chainThreshold = chainThreshold;
    }

    public Float getScreenSizeThreshold() {
        return screenSizeThreshold;
    }

    public void setScreenSizeThreshold(Float screenSizeThreshold) {
        this.screenSizeThreshold = screenSizeThreshold;
    }

    public Float getFontSizeMultiplier() {
        return fontSizeMultiplier;
    }

    public void setFontSizeMultiplier(Float fontSizeMultiplier) {
        this.fontSizeMultiplier = fontSizeMultiplier;
    }

    public Float getForceAmplification() {
        return forceAmplification;
    }

    public void setForceAmplification(Float forceAmplification) {
        this.forceAmplification = forceAmplification;
    }

    public Float getDistanceAmplification() {
        return distanceAmplification;
    }

    public void setDistanceAmplification(Float distanceAmplification) {
        this.distanceAmplification = distanceAmplification;
    }

    public NodeScale getNodeScaling() {
        return nodeScaling;
    }

    public void setNodeScaling(NodeScale nodeScaling) {
        this.nodeScaling = nodeScaling;
    }
}
