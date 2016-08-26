package org.vaadin.visjs.networkDiagram.options;

public class ShapeProperties {
    /*
    This property applies to all shapes that have borders.
    You set the dashes by supplying an Array. Array formart:
    [dash length, gap length]. You can also use a Boolean,
    false is disable and true is default [5,15].
     */
    Boolean borderDashes;
    /*
    This property is used only for the box shape.
    It allows you to determine the roundness of the corners of the shape.
     */
    Integer borderRadius;
    /*
    This property only applies to the image and circularImage shapes. When false,
    the size option is used, when true, the size of the image is used.
    Important: if this is set to true, the image cannot be scaled with the value option!
     */
    Boolean useImageSize;
    /*
    This property only applies to the image shape. When true, the color object is used.
     A rectangle with the background color is drawn behind it and it has a border.
      This means all border options are taken Integero account.
     */
    Boolean useBorderWithImage;

    public Boolean getBorderDashes() {
        return borderDashes;
    }

    public void setBorderDashes(Boolean borderDashes) {
        this.borderDashes = borderDashes;
    }

    public Integer getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Boolean getUseImageSize() {
        return useImageSize;
    }

    public void setUseImageSize(Boolean useImageSize) {
        this.useImageSize = useImageSize;
    }

    public Boolean getUseBorderWithImage() {
        return useBorderWithImage;
    }

    public void setUseBorderWithImage(Boolean useBorderWithImage) {
        this.useBorderWithImage = useBorderWithImage;
    }
}
