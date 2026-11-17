package com.hatch.browser.protocol;

import X.BV4;
import X.C06H;
import X.FGI;

/* loaded from: classes6.dex */
public final class PixelRegion {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int height;
    public int width;
    public int x;
    public int y;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PixelRegion) {
                PixelRegion pixelRegion = (PixelRegion) obj;
                if (this.x != pixelRegion.x || this.y != pixelRegion.y || this.width != pixelRegion.width || this.height != pixelRegion.height) {
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

    /* renamed from: copy-nAmpug0$default, reason: not valid java name */
    public static /* synthetic */ PixelRegion m3681copynAmpug0$default(PixelRegion pixelRegion, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = pixelRegion.x;
        }
        if ((i5 & 2) != 0) {
            i2 = pixelRegion.y;
        }
        if ((i5 & 4) != 0) {
            i3 = pixelRegion.width;
        }
        if ((i5 & 8) != 0) {
            i4 = pixelRegion.height;
        }
        return new PixelRegion(i, i2, i3, i4);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3682component1pVg5ArA() {
        return this.x;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3683component2pVg5ArA() {
        return this.y;
    }

    /* renamed from: component3-pVg5ArA, reason: not valid java name */
    public final int m3684component3pVg5ArA() {
        return this.width;
    }

    /* renamed from: component4-pVg5ArA, reason: not valid java name */
    public final int m3685component4pVg5ArA() {
        return this.height;
    }

    /* renamed from: copy-nAmpug0, reason: not valid java name */
    public final PixelRegion m3686copynAmpug0(int i, int i2, int i3, int i4) {
        return new PixelRegion(i, i2, i3, i4);
    }

    /* renamed from: getHeight-pVg5ArA, reason: not valid java name */
    public final int m3687getHeightpVg5ArA() {
        return this.height;
    }

    /* renamed from: getWidth-pVg5ArA, reason: not valid java name */
    public final int m3688getWidthpVg5ArA() {
        return this.width;
    }

    /* renamed from: getX-pVg5ArA, reason: not valid java name */
    public final int m3689getXpVg5ArA() {
        return this.x;
    }

    /* renamed from: getY-pVg5ArA, reason: not valid java name */
    public final int m3690getYpVg5ArA() {
        return this.y;
    }

    public int hashCode() {
        return (((((this.x * 31) + this.y) * 31) + this.width) * 31) + this.height;
    }

    /* renamed from: setHeight-WZ4Q5Ns, reason: not valid java name */
    public final void m3691setHeightWZ4Q5Ns(int i) {
        this.height = i;
    }

    /* renamed from: setWidth-WZ4Q5Ns, reason: not valid java name */
    public final void m3692setWidthWZ4Q5Ns(int i) {
        this.width = i;
    }

    /* renamed from: setX-WZ4Q5Ns, reason: not valid java name */
    public final void m3693setXWZ4Q5Ns(int i) {
        this.x = i;
    }

    /* renamed from: setY-WZ4Q5Ns, reason: not valid java name */
    public final void m3694setYWZ4Q5Ns(int i) {
        this.y = i;
    }

    public String toString() {
        return FGI.A0m("PixelRegion(x=", String.valueOf(BV4.A03(this.x)), ", y=", String.valueOf(BV4.A03(this.y)), ", width=", String.valueOf(BV4.A03(this.width)), ", height=", String.valueOf(BV4.A03(this.height)), ")");
    }

    public PixelRegion(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public /* synthetic */ PixelRegion(int i, int i2, int i3, int i4, C06H c06h) {
        this(i, i2, i3, i4);
    }
}
