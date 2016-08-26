package org.vaadin.visjs.networkDiagram.options;

import com.google.gson.annotations.SerializedName;

/**
 * Created by roshans on 10/29/14.
 */
public class SmoothCurves {

    Boolean dynamic;
    Type type = Type.continuous;
    Float roundness;

    public static enum Type {
        @SerializedName("continuous")
        continuous,
        @SerializedName("discrete")
        discrete,
        @SerializedName("straightCross")
        straightCross,
        @SerializedName("horizontal")
        horizontal,
        @SerializedName("vertical")
        vertical
    }

    public Boolean isDynamic() {
        return dynamic;
    }

    public void setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Float getRoundness() {
        return roundness;
    }

    public void setRoundness(Float roundness) {
        this.roundness = roundness;
    }


}
