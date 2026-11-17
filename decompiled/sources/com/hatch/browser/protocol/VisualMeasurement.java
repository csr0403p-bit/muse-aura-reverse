package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9314GDq;
import X.HwO;

/* loaded from: classes6.dex */
public final class VisualMeasurement {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public long afterFrame;
    public long beforeFrame;
    public PixelRegion changedBounds;
    public C9314GDq changedPixels;
    public long input;
    public Double meanAbsoluteRgbChange;
    public PixelRegion region;
    public VisualTransformEstimate transform;
    public VisualMeasurementUnavailable unavailable;

    /* renamed from: copy-nyq00pc, reason: not valid java name */
    public final VisualMeasurement m3847copynyq00pc(long j, long j2, long j3, PixelRegion pixelRegion, C9314GDq c9314GDq, Double d, PixelRegion pixelRegion2, VisualTransformEstimate visualTransformEstimate, VisualMeasurementUnavailable visualMeasurementUnavailable) {
        C7384Etj.A0Y(pixelRegion, 3);
        return new VisualMeasurement(j, j2, j3, pixelRegion, c9314GDq, d, pixelRegion2, visualTransformEstimate, visualMeasurementUnavailable);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualMeasurement) {
                VisualMeasurement visualMeasurement = (VisualMeasurement) obj;
                if (this.input != visualMeasurement.input || this.beforeFrame != visualMeasurement.beforeFrame || this.afterFrame != visualMeasurement.afterFrame || !C7384Etj.areEqual(this.region, visualMeasurement.region) || !C7384Etj.areEqual(this.changedPixels, visualMeasurement.changedPixels) || !C7384Etj.areEqual(this.meanAbsoluteRgbChange, visualMeasurement.meanAbsoluteRgbChange) || !C7384Etj.areEqual(this.changedBounds, visualMeasurement.changedBounds) || !C7384Etj.areEqual(this.transform, visualMeasurement.transform) || this.unavailable != visualMeasurement.unavailable) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRegion(PixelRegion pixelRegion) {
        C7384Etj.A0Y(pixelRegion, 0);
        this.region = pixelRegion;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-nyq00pc$default, reason: not valid java name */
    public static /* synthetic */ VisualMeasurement m3842copynyq00pc$default(VisualMeasurement visualMeasurement, long j, long j2, long j3, PixelRegion pixelRegion, C9314GDq c9314GDq, Double d, PixelRegion pixelRegion2, VisualTransformEstimate visualTransformEstimate, VisualMeasurementUnavailable visualMeasurementUnavailable, int i, Object obj) {
        if ((i & 1) != 0) {
            j = visualMeasurement.input;
        }
        if ((i & 2) != 0) {
            j2 = visualMeasurement.beforeFrame;
        }
        if ((i & 4) != 0) {
            j3 = visualMeasurement.afterFrame;
        }
        if ((i & 8) != 0) {
            pixelRegion = visualMeasurement.region;
        }
        if ((i & 16) != 0) {
            c9314GDq = visualMeasurement.changedPixels;
        }
        if ((i & 32) != 0) {
            d = visualMeasurement.meanAbsoluteRgbChange;
        }
        if ((i & 64) != 0) {
            pixelRegion2 = visualMeasurement.changedBounds;
        }
        if ((i & 128) != 0) {
            visualTransformEstimate = visualMeasurement.transform;
        }
        if ((i & 256) != 0) {
            visualMeasurementUnavailable = visualMeasurement.unavailable;
        }
        return visualMeasurement.m3847copynyq00pc(j, j2, j3, pixelRegion, c9314GDq, d, pixelRegion2, visualTransformEstimate, visualMeasurementUnavailable);
    }

    /* renamed from: component1-s-VKNKU, reason: not valid java name */
    public final long m3843component1sVKNKU() {
        return this.input;
    }

    /* renamed from: component2-s-VKNKU, reason: not valid java name */
    public final long m3844component2sVKNKU() {
        return this.beforeFrame;
    }

    /* renamed from: component3-s-VKNKU, reason: not valid java name */
    public final long m3845component3sVKNKU() {
        return this.afterFrame;
    }

    public final PixelRegion component4() {
        return this.region;
    }

    /* renamed from: component5-6VbMDqA, reason: not valid java name */
    public final C9314GDq m3846component56VbMDqA() {
        return this.changedPixels;
    }

    public final Double component6() {
        return this.meanAbsoluteRgbChange;
    }

    public final PixelRegion component7() {
        return this.changedBounds;
    }

    public final VisualTransformEstimate component8() {
        return this.transform;
    }

    public final VisualMeasurementUnavailable component9() {
        return this.unavailable;
    }

    /* renamed from: getAfterFrame-s-VKNKU, reason: not valid java name */
    public final long m3848getAfterFramesVKNKU() {
        return this.afterFrame;
    }

    /* renamed from: getBeforeFrame-s-VKNKU, reason: not valid java name */
    public final long m3849getBeforeFramesVKNKU() {
        return this.beforeFrame;
    }

    public final PixelRegion getChangedBounds() {
        return this.changedBounds;
    }

    /* renamed from: getChangedPixels-6VbMDqA, reason: not valid java name */
    public final C9314GDq m3850getChangedPixels6VbMDqA() {
        return this.changedPixels;
    }

    /* renamed from: getInput-s-VKNKU, reason: not valid java name */
    public final long m3851getInputsVKNKU() {
        return this.input;
    }

    public final Double getMeanAbsoluteRgbChange() {
        return this.meanAbsoluteRgbChange;
    }

    public final PixelRegion getRegion() {
        return this.region;
    }

    public final VisualTransformEstimate getTransform() {
        return this.transform;
    }

    public final VisualMeasurementUnavailable getUnavailable() {
        return this.unavailable;
    }

    public int hashCode() {
        int i;
        int iA0F = AnonymousClass005.A0F(this.region, AnonymousClass006.A06(this.afterFrame, AnonymousClass006.A06(this.beforeFrame, AnonymousClass005.A07(this.input))));
        C9314GDq c9314GDq = this.changedPixels;
        if (c9314GDq == null) {
            i = 0;
        } else {
            long j = c9314GDq.A00;
            i = (int) (j ^ (j >>> 32));
        }
        return ((((((((iA0F + i) * 31) + AnonymousClass006.A0D(this.meanAbsoluteRgbChange)) * 31) + AnonymousClass006.A0D(this.changedBounds)) * 31) + AnonymousClass006.A0D(this.transform)) * 31) + C3cH.A02(this.unavailable);
    }

    /* renamed from: setAfterFrame-VKZWuLQ, reason: not valid java name */
    public final void m3852setAfterFrameVKZWuLQ(long j) {
        this.afterFrame = j;
    }

    /* renamed from: setBeforeFrame-VKZWuLQ, reason: not valid java name */
    public final void m3853setBeforeFrameVKZWuLQ(long j) {
        this.beforeFrame = j;
    }

    public final void setChangedBounds(PixelRegion pixelRegion) {
        this.changedBounds = pixelRegion;
    }

    /* renamed from: setChangedPixels-ADd3fzo, reason: not valid java name */
    public final void m3854setChangedPixelsADd3fzo(C9314GDq c9314GDq) {
        this.changedPixels = c9314GDq;
    }

    /* renamed from: setInput-VKZWuLQ, reason: not valid java name */
    public final void m3855setInputVKZWuLQ(long j) {
        this.input = j;
    }

    public final void setMeanAbsoluteRgbChange(Double d) {
        this.meanAbsoluteRgbChange = d;
    }

    public final void setTransform(VisualTransformEstimate visualTransformEstimate) {
        this.transform = visualTransformEstimate;
    }

    public final void setUnavailable(VisualMeasurementUnavailable visualMeasurementUnavailable) {
        this.unavailable = visualMeasurementUnavailable;
    }

    public String toString() {
        String strA01 = HwO.A01(this.input, 10);
        String strA012 = HwO.A01(this.beforeFrame, 10);
        String strA013 = HwO.A01(this.afterFrame, 10);
        PixelRegion pixelRegion = this.region;
        C9314GDq c9314GDq = this.changedPixels;
        Double d = this.meanAbsoluteRgbChange;
        PixelRegion pixelRegion2 = this.changedBounds;
        VisualTransformEstimate visualTransformEstimate = this.transform;
        VisualMeasurementUnavailable visualMeasurementUnavailable = this.unavailable;
        StringBuilder sbA0x = C3cI.A0x("VisualMeasurement(input=", strA01);
        sbA0x.append(", beforeFrame=");
        sbA0x.append(strA012);
        sbA0x.append(", afterFrame=");
        sbA0x.append(strA013);
        sbA0x.append(", region=");
        sbA0x.append(pixelRegion);
        sbA0x.append(", changedPixels=");
        sbA0x.append(c9314GDq);
        sbA0x.append(", meanAbsoluteRgbChange=");
        sbA0x.append(d);
        sbA0x.append(", changedBounds=");
        sbA0x.append(pixelRegion2);
        sbA0x.append(", transform=");
        sbA0x.append(visualTransformEstimate);
        return C3cJ.A0L(visualMeasurementUnavailable, ", unavailable=", sbA0x);
    }

    public /* synthetic */ VisualMeasurement(long j, long j2, long j3, PixelRegion pixelRegion, C9314GDq c9314GDq, Double d, PixelRegion pixelRegion2, VisualTransformEstimate visualTransformEstimate, VisualMeasurementUnavailable visualMeasurementUnavailable, C06H c06h) {
        this(j, j2, j3, pixelRegion, c9314GDq, d, pixelRegion2, visualTransformEstimate, visualMeasurementUnavailable);
    }

    public VisualMeasurement(long j, long j2, long j3, PixelRegion pixelRegion, C9314GDq c9314GDq, Double d, PixelRegion pixelRegion2, VisualTransformEstimate visualTransformEstimate, VisualMeasurementUnavailable visualMeasurementUnavailable) {
        C7384Etj.A0Y(pixelRegion, 3);
        this.input = j;
        this.beforeFrame = j2;
        this.afterFrame = j3;
        this.region = pixelRegion;
        this.changedPixels = c9314GDq;
        this.meanAbsoluteRgbChange = d;
        this.changedBounds = pixelRegion2;
        this.transform = visualTransformEstimate;
        this.unavailable = visualMeasurementUnavailable;
    }
}
