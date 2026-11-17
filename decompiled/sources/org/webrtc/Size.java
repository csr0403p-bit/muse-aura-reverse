package org.webrtc;

import X.FGI;

/* loaded from: classes.dex */
public class Size {
    public int height;
    public int width;

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public String toString() {
        return FGI.A07(this.width, this.height, "x");
    }

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }
}
