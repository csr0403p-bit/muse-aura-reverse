package com.meta.maps.display;

import X.AnonymousClass005;
import X.C06H;

/* loaded from: classes3.dex */
public final class SDKColor {
    public static final Companion Companion = new Companion();
    public float alpha;
    public float blue;
    public float green;
    public float red;

    public static final native SDKColor valueOf(long j);

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof SDKColor) {
                SDKColor sDKColor = (SDKColor) obj;
                if (Float.compare(this.red, sDKColor.red) != 0 || Float.compare(this.green, sDKColor.green) != 0 || Float.compare(this.blue, sDKColor.blue) != 0 || Float.compare(this.alpha, sDKColor.alpha) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public final SDKColor valueOf(long j) {
            return SDKColor.valueOf(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A02((217 + Float.floatToIntBits(this.red)) * 31, this.green), this.blue) + Float.floatToIntBits(this.alpha);
    }

    public SDKColor(float f, float f2, float f3, float f4) {
        this.red = f;
        this.green = f2;
        this.blue = f3;
        this.alpha = f4;
    }
}
