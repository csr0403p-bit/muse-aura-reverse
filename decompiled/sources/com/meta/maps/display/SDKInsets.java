package com.meta.maps.display;

import X.AnonymousClass006;
import X.C3cG;
import X.C8j4;

/* loaded from: classes4.dex */
public final class SDKInsets {
    public double bottom;
    public double left;
    public double right;
    public double top;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof SDKInsets) {
                SDKInsets sDKInsets = (SDKInsets) obj;
                if (Double.compare(this.left, sDKInsets.left) != 0 || Double.compare(this.top, sDKInsets.top) != 0 || Double.compare(this.right, sDKInsets.right) != 0 || Double.compare(this.bottom, sDKInsets.bottom) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8j4.A0B(Double.doubleToLongBits(this.bottom), AnonymousClass006.A06(Double.doubleToLongBits(this.right), AnonymousClass006.A06(Double.doubleToLongBits(this.top), (217 + C3cG.A02(Double.doubleToLongBits(this.left))) * 31)));
    }

    public SDKInsets() {
        this.left = 0.0d;
        this.top = 0.0d;
        this.right = 0.0d;
        this.bottom = 0.0d;
    }

    public SDKInsets(double d, double d2, double d3, double d4) {
        this.left = d;
        this.top = d2;
        this.right = d3;
        this.bottom = d4;
    }
}
