package org.vaadin.visjs.networkDiagram.options;

public class Scaling {
    /*
        If edges have a value, their widths are determined by the value,
        the scaling function and the min max values.
         The min value is the minimum allowed value.
         */
    private Integer min;
    /*
    This is the maximum allowed width when the edges are scaled using the value option.
     */
    private Integer max;

    /*
    When false, the label is not allowed to scale with the edge.
    If true it will scale using default settigns.
    For further customization, you can supply an object
     */

    private Label label;

    /*
    If edges have value fields, this function determines how the size of the nodes
    are scaled based on their values. The default function is:

    function (min,max,total,value) {
      if (max === min) {
        return 0.5;
      }
      else {
        var scale = 1 / (max - min);
        return Math.max(0,(value - min)*scale);
      }
    }

    The function receives the minimum value of the set,
    the maximum value, the total sum of all values and finally the value
    of the node or edge it works on. It has to return a value between 0 and 1.
    The nodes and edges then calculate their size as follows:

    var scale = customScalingFunction(min,max,total,value);
    var diff = maxWidth - minWidth;
    myWidth = minWidth + diff * scale;

    Please note: maxWidth and minWidth are the values scaling.max and
    scaling.min provided in the options.
     */
    private String customScalingFunction;

    public class Label{
        /*
                Toggle the scaling of the label on or off.
                 If this option is not defined, it is set to true if any of the properties in this
                  object are defined.
                 */
        Boolean enabled;
        /*
        The minimum font-size used for labels when scaling
         */
        Integer min;
        /*
        The maximum font-size used for labels when scaling.
         */
        Integer max;
        /*
        When zooming in, the font is drawn larger as well.
        You can limit the perceived font size using this option.
        If set to 30, the font will never look larger than size 30 zoomed at 100%.
         */
        Integer maxVisible;
        /*
        When zooming out, the font will be drawn smaller.
        This defines a lower limit for when the font is drawn.
        When using font scaling, you can use this together with the
        maxVisible to first show labels of important edges when zoomed
        out and only show the rest when zooming in.
         */
        Integer drawThreshold;

        public Boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }

        public Integer getMaxVisible() {
            return maxVisible;
        }

        public void setMaxVisible(Integer maxVisible) {
            this.maxVisible = maxVisible;
        }

        public Integer getDrawThreshold() {
            return drawThreshold;
        }

        public void setDrawThreshold(Integer drawThreshold) {
            this.drawThreshold = drawThreshold;
        }


    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public String getCustomScalingFunction() {
        return customScalingFunction;
    }

    public void setCustomScalingFunction(String customScalingFunction) {
        this.customScalingFunction = customScalingFunction;
    }
}
