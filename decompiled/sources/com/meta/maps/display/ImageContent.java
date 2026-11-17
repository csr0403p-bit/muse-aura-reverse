package com.meta.maps.display;

import X.AnonymousClass005;
import X.C8j4;

/* loaded from: classes4.dex */
public final class ImageContent {
    public final float bottom;
    public final float left;
    public final float right;
    public final float top;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ImageContent) {
                ImageContent imageContent = (ImageContent) obj;
                if (Float.compare(this.left, imageContent.left) != 0 || Float.compare(this.top, imageContent.top) != 0 || Float.compare(this.right, imageContent.right) != 0 || Float.compare(this.bottom, imageContent.bottom) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02((217 + Float.floatToIntBits(this.left)) * 31, this.top), this.right), this.bottom);
    }

    public ImageContent(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }
}
