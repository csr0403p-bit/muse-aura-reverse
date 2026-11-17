package com.meta.maps.fancypins;

import X.AnonymousClass002;
import X.BV7;
import X.C06H;
import X.C60O;
import X.HsK;

/* loaded from: classes6.dex */
public final class RectInsets {
    public static final Companion Companion = new Companion();
    public static final RectInsets ZERO = new RectInsets(0.0d);
    public final double bottom;
    public final double left;
    public final double right;
    public final double top;

    public RectInsets(double d) {
        this(d, d, d, d);
    }

    public static /* synthetic */ RectInsets copy$default(RectInsets rectInsets, double d, double d2, double d3, double d4, int i, Object obj) {
        double d5 = d;
        double d6 = d2;
        double d7 = d3;
        double d8 = d4;
        if ((i & 1) != 0) {
            d5 = rectInsets.top;
        }
        if ((i & 2) != 0) {
            d6 = rectInsets.left;
        }
        if ((i & 4) != 0) {
            d7 = rectInsets.bottom;
        }
        if ((i & 8) != 0) {
            d8 = rectInsets.right;
        }
        return new RectInsets(d5, d6, d7, d8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RectInsets) {
                RectInsets rectInsets = (RectInsets) obj;
                if (Double.compare(this.top, rectInsets.top) != 0 || Double.compare(this.left, rectInsets.left) != 0 || Double.compare(this.bottom, rectInsets.bottom) != 0 || Double.compare(this.right, rectInsets.right) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final double component1() {
        return this.top;
    }

    public final double component2() {
        return this.left;
    }

    public final double component3() {
        return this.bottom;
    }

    public final double component4() {
        return this.right;
    }

    public final RectInsets copy(double d, double d2, double d3, double d4) {
        return new RectInsets(d, d2, d3, d4);
    }

    public final double getBottom() {
        return this.bottom;
    }

    public final double getLeft() {
        return this.left;
    }

    public final double getRight() {
        return this.right;
    }

    public final double getTop() {
        return this.top;
    }

    public int hashCode() {
        return HsK.A01(this.bottom, HsK.A01(this.left, AnonymousClass002.A0A(Double.doubleToLongBits(this.top)) * 31)) + AnonymousClass002.A0A(Double.doubleToLongBits(this.right));
    }

    public String toString() {
        double d = this.top;
        double d2 = this.left;
        double d3 = this.bottom;
        double d4 = this.right;
        StringBuilder sbA0x = C60O.A0x("RectInsets(top=");
        sbA0x.append(d);
        sbA0x.append(", left=");
        sbA0x.append(d2);
        sbA0x.append(", bottom=");
        sbA0x.append(d3);
        sbA0x.append(", right=");
        sbA0x.append(d4);
        return BV7.A10(sbA0x);
    }

    public RectInsets(double d, double d2, double d3, double d4) {
        this.top = d;
        this.left = d2;
        this.bottom = d3;
        this.right = d4;
    }
}
