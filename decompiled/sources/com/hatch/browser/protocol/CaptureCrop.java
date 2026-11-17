package com.hatch.browser.protocol;

import X.AnonymousClass002;
import X.BV7;
import X.C06H;
import X.C60O;
import X.HsK;

/* loaded from: classes6.dex */
public final class CaptureCrop {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public double height;
    public double width;
    public double x;
    public double y;

    public static /* synthetic */ CaptureCrop copy$default(CaptureCrop captureCrop, double d, double d2, double d3, double d4, int i, Object obj) {
        double d5 = d;
        double d6 = d2;
        double d7 = d3;
        double d8 = d4;
        if ((i & 1) != 0) {
            d5 = captureCrop.x;
        }
        if ((i & 2) != 0) {
            d6 = captureCrop.y;
        }
        if ((i & 4) != 0) {
            d7 = captureCrop.width;
        }
        if ((i & 8) != 0) {
            d8 = captureCrop.height;
        }
        return new CaptureCrop(d5, d6, d7, d8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaptureCrop) {
                CaptureCrop captureCrop = (CaptureCrop) obj;
                if (Double.compare(this.x, captureCrop.x) != 0 || Double.compare(this.y, captureCrop.y) != 0 || Double.compare(this.width, captureCrop.width) != 0 || Double.compare(this.height, captureCrop.height) != 0) {
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
        return this.x;
    }

    public final double component2() {
        return this.y;
    }

    public final double component3() {
        return this.width;
    }

    public final double component4() {
        return this.height;
    }

    public final CaptureCrop copy(double d, double d2, double d3, double d4) {
        return new CaptureCrop(d, d2, d3, d4);
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getWidth() {
        return this.width;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return HsK.A01(this.width, HsK.A01(this.y, AnonymousClass002.A0A(Double.doubleToLongBits(this.x)) * 31)) + AnonymousClass002.A0A(Double.doubleToLongBits(this.height));
    }

    public final void setHeight(double d) {
        this.height = d;
    }

    public final void setWidth(double d) {
        this.width = d;
    }

    public final void setX(double d) {
        this.x = d;
    }

    public final void setY(double d) {
        this.y = d;
    }

    public String toString() {
        double d = this.x;
        double d2 = this.y;
        double d3 = this.width;
        double d4 = this.height;
        StringBuilder sbA0x = C60O.A0x("CaptureCrop(x=");
        sbA0x.append(d);
        sbA0x.append(", y=");
        sbA0x.append(d2);
        sbA0x.append(", width=");
        sbA0x.append(d3);
        sbA0x.append(", height=");
        sbA0x.append(d4);
        return BV7.A10(sbA0x);
    }

    public CaptureCrop(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
    }
}
