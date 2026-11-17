package com.meta.maps.display;

import X.C3cG;
import X.C8j4;

/* loaded from: classes4.dex */
public final class SDKAlignment {
    public double nX;
    public double nY;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof SDKAlignment) {
                SDKAlignment sDKAlignment = (SDKAlignment) obj;
                if (Double.compare(this.nX, sDKAlignment.nX) != 0 || Double.compare(this.nY, sDKAlignment.nY) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8j4.A0B(Double.doubleToLongBits(this.nY), (217 + C3cG.A02(Double.doubleToLongBits(this.nX))) * 31);
    }

    public SDKAlignment(double d, double d2) {
        this.nX = d;
        this.nY = d2;
    }
}
