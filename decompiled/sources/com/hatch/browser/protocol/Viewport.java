package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.FKC;
import X.HsK;

/* loaded from: classes6.dex */
public final class Viewport {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Double deviceScaleFactor;
    public double height;
    public FKC pixelHeight;
    public FKC pixelWidth;
    public ViewportScope scope;
    public Long scrollMaxY;
    public Double scrollX;
    public Double scrollY;
    public double width;

    /* renamed from: copy--bTrTLA, reason: not valid java name */
    public final Viewport m3818copybTrTLA(double d, double d2, Double d3, ViewportScope viewportScope, Double d4, Double d5, Long l, FKC fkc, FKC fkc2) {
        C7384Etj.A0Y(viewportScope, 3);
        return new Viewport(d, d2, d3, viewportScope, d4, d5, l, fkc, fkc2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Viewport) {
                Viewport viewport = (Viewport) obj;
                if (Double.compare(this.width, viewport.width) != 0 || Double.compare(this.height, viewport.height) != 0 || !C7384Etj.areEqual(this.deviceScaleFactor, viewport.deviceScaleFactor) || !C7384Etj.areEqual(this.scope, viewport.scope) || !C7384Etj.areEqual(this.scrollX, viewport.scrollX) || !C7384Etj.areEqual(this.scrollY, viewport.scrollY) || !C7384Etj.areEqual(this.scrollMaxY, viewport.scrollMaxY) || !C7384Etj.areEqual(this.pixelWidth, viewport.pixelWidth) || !C7384Etj.areEqual(this.pixelHeight, viewport.pixelHeight)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setScope(ViewportScope viewportScope) {
        C7384Etj.A0Y(viewportScope, 0);
        this.scope = viewportScope;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy--bTrTLA$default, reason: not valid java name */
    public static /* synthetic */ Viewport m3815copybTrTLA$default(Viewport viewport, double d, double d2, Double d3, ViewportScope viewportScope, Double d4, Double d5, Long l, FKC fkc, FKC fkc2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = viewport.width;
        }
        if ((i & 2) != 0) {
            d2 = viewport.height;
        }
        if ((i & 4) != 0) {
            d3 = viewport.deviceScaleFactor;
        }
        if ((i & 8) != 0) {
            viewportScope = viewport.scope;
        }
        if ((i & 16) != 0) {
            d4 = viewport.scrollX;
        }
        if ((i & 32) != 0) {
            d5 = viewport.scrollY;
        }
        if ((i & 64) != 0) {
            l = viewport.scrollMaxY;
        }
        if ((i & 128) != 0) {
            fkc = viewport.pixelWidth;
        }
        if ((i & 256) != 0) {
            fkc2 = viewport.pixelHeight;
        }
        return viewport.m3818copybTrTLA(d, d2, d3, viewportScope, d4, d5, l, fkc, fkc2);
    }

    public final double component1() {
        return this.width;
    }

    public final double component2() {
        return this.height;
    }

    public final Double component3() {
        return this.deviceScaleFactor;
    }

    public final ViewportScope component4() {
        return this.scope;
    }

    public final Double component5() {
        return this.scrollX;
    }

    public final Double component6() {
        return this.scrollY;
    }

    public final Long component7() {
        return this.scrollMaxY;
    }

    /* renamed from: component8-0hXNFcg, reason: not valid java name */
    public final FKC m3816component80hXNFcg() {
        return this.pixelWidth;
    }

    /* renamed from: component9-0hXNFcg, reason: not valid java name */
    public final FKC m3817component90hXNFcg() {
        return this.pixelHeight;
    }

    public final Double getDeviceScaleFactor() {
        return this.deviceScaleFactor;
    }

    public final double getHeight() {
        return this.height;
    }

    /* renamed from: getPixelHeight-0hXNFcg, reason: not valid java name */
    public final FKC m3819getPixelHeight0hXNFcg() {
        return this.pixelHeight;
    }

    /* renamed from: getPixelWidth-0hXNFcg, reason: not valid java name */
    public final FKC m3820getPixelWidth0hXNFcg() {
        return this.pixelWidth;
    }

    public final ViewportScope getScope() {
        return this.scope;
    }

    public final Long getScrollMaxY() {
        return this.scrollMaxY;
    }

    public final Double getScrollX() {
        return this.scrollX;
    }

    public final Double getScrollY() {
        return this.scrollY;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iA0F = (((((AnonymousClass005.A0F(this.scope, (HsK.A01(this.height, AnonymousClass002.A0A(Double.doubleToLongBits(this.width)) * 31) + AnonymousClass006.A0D(this.deviceScaleFactor)) * 31) + AnonymousClass006.A0D(this.scrollX)) * 31) + AnonymousClass006.A0D(this.scrollY)) * 31) + AnonymousClass006.A0D(this.scrollMaxY)) * 31;
        FKC fkc = this.pixelWidth;
        int i = (iA0F + (fkc == null ? 0 : fkc.A00)) * 31;
        FKC fkc2 = this.pixelHeight;
        return i + (fkc2 != null ? fkc2.A00 : 0);
    }

    public final void setDeviceScaleFactor(Double d) {
        this.deviceScaleFactor = d;
    }

    public final void setHeight(double d) {
        this.height = d;
    }

    /* renamed from: setPixelHeight-ExVfyTY, reason: not valid java name */
    public final void m3821setPixelHeightExVfyTY(FKC fkc) {
        this.pixelHeight = fkc;
    }

    /* renamed from: setPixelWidth-ExVfyTY, reason: not valid java name */
    public final void m3822setPixelWidthExVfyTY(FKC fkc) {
        this.pixelWidth = fkc;
    }

    public final void setScrollMaxY(Long l) {
        this.scrollMaxY = l;
    }

    public final void setScrollX(Double d) {
        this.scrollX = d;
    }

    public final void setScrollY(Double d) {
        this.scrollY = d;
    }

    public final void setWidth(double d) {
        this.width = d;
    }

    public String toString() {
        double d = this.width;
        double d2 = this.height;
        Double d3 = this.deviceScaleFactor;
        ViewportScope viewportScope = this.scope;
        Double d4 = this.scrollX;
        Double d5 = this.scrollY;
        Long l = this.scrollMaxY;
        FKC fkc = this.pixelWidth;
        FKC fkc2 = this.pixelHeight;
        StringBuilder sbA0x = C60O.A0x("Viewport(width=");
        sbA0x.append(d);
        sbA0x.append(", height=");
        sbA0x.append(d2);
        sbA0x.append(", deviceScaleFactor=");
        sbA0x.append(d3);
        AbstractC7609F5w.A1M(sbA0x, viewportScope);
        sbA0x.append(", scrollX=");
        sbA0x.append(d4);
        sbA0x.append(", scrollY=");
        sbA0x.append(d5);
        sbA0x.append(", scrollMaxY=");
        sbA0x.append(l);
        sbA0x.append(", pixelWidth=");
        sbA0x.append(fkc);
        return C3cJ.A0L(fkc2, ", pixelHeight=", sbA0x);
    }

    public /* synthetic */ Viewport(double d, double d2, Double d3, ViewportScope viewportScope, Double d4, Double d5, Long l, FKC fkc, FKC fkc2, C06H c06h) {
        this(d, d2, d3, viewportScope, d4, d5, l, fkc, fkc2);
    }

    public Viewport(double d, double d2, Double d3, ViewportScope viewportScope, Double d4, Double d5, Long l, FKC fkc, FKC fkc2) {
        C7384Etj.A0Y(viewportScope, 3);
        this.width = d;
        this.height = d2;
        this.deviceScaleFactor = d3;
        this.scope = viewportScope;
        this.scrollX = d4;
        this.scrollY = d5;
        this.scrollMaxY = l;
        this.pixelWidth = fkc;
        this.pixelHeight = fkc2;
    }
}
