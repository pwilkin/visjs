package org.vaadin.visjs.networkDiagram.util;


public class Arrows {

    ArrowOptions to;
    ArrowOptions middle;
    ArrowOptions from;

    public static class ArrowOptions {
        Boolean enabled;
        Float scaleFactor;

        public ArrowOptions(Boolean enabled, Float scaleFactor) {
            this.enabled = enabled;
            this.scaleFactor = scaleFactor;
        }

        public Boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public Float getScaleFactor() {
            return scaleFactor;
        }

        public void setScaleFactor(Float scaleFactor) {
            this.scaleFactor = scaleFactor;
        }

    }


    public ArrowOptions getMiddle() {
        return middle;
    }

    public void setMiddle(ArrowOptions middle) {
        this.middle = middle;
    }

    public ArrowOptions getTo() {
        return to;
    }

    public void setTo(ArrowOptions to) {
        this.to = to;
    }

    public ArrowOptions getFrom() {
        return from;
    }

    public void setFrom(ArrowOptions from) {
        this.from = from;
    }
}
