package com.meta.maps.display;

/* loaded from: classes.dex */
public final class ImageStretch {
    public final float from;
    public final float to;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ImageStretch) {
                ImageStretch imageStretch = (ImageStretch) obj;
                if (Float.compare(this.from, imageStretch.from) != 0 || Float.compare(this.to, imageStretch.to) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((217 + Float.floatToIntBits(this.from)) * 31) + Float.floatToIntBits(this.to);
    }

    public ImageStretch(float f, float f2) {
        this.from = f;
        this.to = f2;
    }
}
