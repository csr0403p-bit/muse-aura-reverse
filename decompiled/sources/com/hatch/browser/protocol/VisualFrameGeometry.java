package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C8j4;
import X.HsK;
import X.HwO;

/* loaded from: classes6.dex */
public final class VisualFrameGeometry {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public long afterInput;
    public double captureFinishedMs;
    public double captureStartedMs;
    public int height;
    public long index;
    public CaptureCrop region;
    public int width;

    /* renamed from: copy-_-SFmOc, reason: not valid java name */
    public final VisualFrameGeometry m3828copy_SFmOc(long j, int i, int i2, CaptureCrop captureCrop, double d, double d2, long j2) {
        C7384Etj.A0Y(captureCrop, 3);
        return new VisualFrameGeometry(j, i, i2, captureCrop, d, d2, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualFrameGeometry) {
                VisualFrameGeometry visualFrameGeometry = (VisualFrameGeometry) obj;
                if (this.index != visualFrameGeometry.index || this.width != visualFrameGeometry.width || this.height != visualFrameGeometry.height || !C7384Etj.areEqual(this.region, visualFrameGeometry.region) || Double.compare(this.captureStartedMs, visualFrameGeometry.captureStartedMs) != 0 || Double.compare(this.captureFinishedMs, visualFrameGeometry.captureFinishedMs) != 0 || this.afterInput != visualFrameGeometry.afterInput) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRegion(CaptureCrop captureCrop) {
        C7384Etj.A0Y(captureCrop, 0);
        this.region = captureCrop;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-_-SFmOc$default, reason: not valid java name */
    public static /* synthetic */ VisualFrameGeometry m3823copy_SFmOc$default(VisualFrameGeometry visualFrameGeometry, long j, int i, int i2, CaptureCrop captureCrop, double d, double d2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = visualFrameGeometry.index;
        }
        if ((i3 & 2) != 0) {
            i = visualFrameGeometry.width;
        }
        if ((i3 & 4) != 0) {
            i2 = visualFrameGeometry.height;
        }
        if ((i3 & 8) != 0) {
            captureCrop = visualFrameGeometry.region;
        }
        if ((i3 & 16) != 0) {
            d = visualFrameGeometry.captureStartedMs;
        }
        if ((i3 & 32) != 0) {
            d2 = visualFrameGeometry.captureFinishedMs;
        }
        if ((i3 & 64) != 0) {
            j2 = visualFrameGeometry.afterInput;
        }
        return visualFrameGeometry.m3828copy_SFmOc(j, i, i2, captureCrop, d, d2, j2);
    }

    /* renamed from: component1-s-VKNKU, reason: not valid java name */
    public final long m3824component1sVKNKU() {
        return this.index;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3825component2pVg5ArA() {
        return this.width;
    }

    /* renamed from: component3-pVg5ArA, reason: not valid java name */
    public final int m3826component3pVg5ArA() {
        return this.height;
    }

    public final CaptureCrop component4() {
        return this.region;
    }

    public final double component5() {
        return this.captureStartedMs;
    }

    public final double component6() {
        return this.captureFinishedMs;
    }

    /* renamed from: component7-s-VKNKU, reason: not valid java name */
    public final long m3827component7sVKNKU() {
        return this.afterInput;
    }

    /* renamed from: getAfterInput-s-VKNKU, reason: not valid java name */
    public final long m3829getAfterInputsVKNKU() {
        return this.afterInput;
    }

    public final double getCaptureFinishedMs() {
        return this.captureFinishedMs;
    }

    public final double getCaptureStartedMs() {
        return this.captureStartedMs;
    }

    /* renamed from: getHeight-pVg5ArA, reason: not valid java name */
    public final int m3830getHeightpVg5ArA() {
        return this.height;
    }

    /* renamed from: getIndex-s-VKNKU, reason: not valid java name */
    public final long m3831getIndexsVKNKU() {
        return this.index;
    }

    public final CaptureCrop getRegion() {
        return this.region;
    }

    /* renamed from: getWidth-pVg5ArA, reason: not valid java name */
    public final int m3832getWidthpVg5ArA() {
        return this.width;
    }

    public int hashCode() {
        return C8j4.A0B(this.afterInput, HsK.A01(this.captureFinishedMs, HsK.A01(this.captureStartedMs, AnonymousClass005.A0F(this.region, (((AnonymousClass005.A07(this.index) + this.width) * 31) + this.height) * 31))));
    }

    /* renamed from: setAfterInput-VKZWuLQ, reason: not valid java name */
    public final void m3833setAfterInputVKZWuLQ(long j) {
        this.afterInput = j;
    }

    public final void setCaptureFinishedMs(double d) {
        this.captureFinishedMs = d;
    }

    public final void setCaptureStartedMs(double d) {
        this.captureStartedMs = d;
    }

    /* renamed from: setHeight-WZ4Q5Ns, reason: not valid java name */
    public final void m3834setHeightWZ4Q5Ns(int i) {
        this.height = i;
    }

    /* renamed from: setIndex-VKZWuLQ, reason: not valid java name */
    public final void m3835setIndexVKZWuLQ(long j) {
        this.index = j;
    }

    /* renamed from: setWidth-WZ4Q5Ns, reason: not valid java name */
    public final void m3836setWidthWZ4Q5Ns(int i) {
        this.width = i;
    }

    public String toString() {
        String strA01 = HwO.A01(this.index, 10);
        String strValueOf = String.valueOf(BV4.A03(this.width));
        String strValueOf2 = String.valueOf(BV4.A03(this.height));
        CaptureCrop captureCrop = this.region;
        double d = this.captureStartedMs;
        double d2 = this.captureFinishedMs;
        String strA012 = HwO.A01(this.afterInput, 10);
        StringBuilder sbA0x = C3cI.A0x("VisualFrameGeometry(index=", strA01);
        sbA0x.append(", width=");
        sbA0x.append(strValueOf);
        sbA0x.append(", height=");
        sbA0x.append(strValueOf2);
        sbA0x.append(", region=");
        sbA0x.append(captureCrop);
        sbA0x.append(", captureStartedMs=");
        sbA0x.append(d);
        sbA0x.append(", captureFinishedMs=");
        sbA0x.append(d2);
        return C3cJ.A0N(", afterInput=", strA012, sbA0x);
    }

    public /* synthetic */ VisualFrameGeometry(long j, int i, int i2, CaptureCrop captureCrop, double d, double d2, long j2, C06H c06h) {
        this(j, i, i2, captureCrop, d, d2, j2);
    }

    public VisualFrameGeometry(long j, int i, int i2, CaptureCrop captureCrop, double d, double d2, long j2) {
        C7384Etj.A0Y(captureCrop, 3);
        this.index = j;
        this.width = i;
        this.height = i2;
        this.region = captureCrop;
        this.captureStartedMs = d;
        this.captureFinishedMs = d2;
        this.afterInput = j2;
    }
}
