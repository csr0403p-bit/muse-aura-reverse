package com.hatch.browser.protocol;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.C8j2;
import X.HsK;
import X.HwO;

/* loaded from: classes6.dex */
public final class VisualTransformEstimate {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public double clockwiseDegrees;
    public double inlierTolerancePixels;
    public long inliers;
    public long matchedFeatures;
    public double medianErrorPixels;
    public Point regionCenterDisplacement;
    public double scale;
    public Point translation;

    public VisualTransformEstimate(double d, double d2, Point point, Point point2, long j, long j2, double d3, double d4) {
        AnonymousClass002.A1B(point, 2, point2);
        this.clockwiseDegrees = d;
        this.scale = d2;
        this.translation = point;
        this.regionCenterDisplacement = point2;
        this.matchedFeatures = j;
        this.inliers = j2;
        this.medianErrorPixels = d3;
        this.inlierTolerancePixels = d4;
    }

    /* renamed from: copy-fWCVa4c, reason: not valid java name */
    public final VisualTransformEstimate m3864copyfWCVa4c(double d, double d2, Point point, Point point2, long j, long j2, double d3, double d4) {
        AnonymousClass002.A1B(point, 2, point2);
        return new VisualTransformEstimate(d, d2, point, point2, j, j2, d3, d4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VisualTransformEstimate) {
                VisualTransformEstimate visualTransformEstimate = (VisualTransformEstimate) obj;
                if (Double.compare(this.clockwiseDegrees, visualTransformEstimate.clockwiseDegrees) != 0 || Double.compare(this.scale, visualTransformEstimate.scale) != 0 || !C7384Etj.areEqual(this.translation, visualTransformEstimate.translation) || !C7384Etj.areEqual(this.regionCenterDisplacement, visualTransformEstimate.regionCenterDisplacement) || this.matchedFeatures != visualTransformEstimate.matchedFeatures || this.inliers != visualTransformEstimate.inliers || Double.compare(this.medianErrorPixels, visualTransformEstimate.medianErrorPixels) != 0 || Double.compare(this.inlierTolerancePixels, visualTransformEstimate.inlierTolerancePixels) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRegionCenterDisplacement(Point point) {
        C7384Etj.A0Y(point, 0);
        this.regionCenterDisplacement = point;
    }

    public final void setTranslation(Point point) {
        C7384Etj.A0Y(point, 0);
        this.translation = point;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-fWCVa4c$default, reason: not valid java name */
    public static /* synthetic */ VisualTransformEstimate m3861copyfWCVa4c$default(VisualTransformEstimate visualTransformEstimate, double d, double d2, Point point, Point point2, long j, long j2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = visualTransformEstimate.clockwiseDegrees;
        }
        if ((i & 2) != 0) {
            d2 = visualTransformEstimate.scale;
        }
        if ((i & 4) != 0) {
            point = visualTransformEstimate.translation;
        }
        if ((i & 8) != 0) {
            point2 = visualTransformEstimate.regionCenterDisplacement;
        }
        if ((i & 16) != 0) {
            j = visualTransformEstimate.matchedFeatures;
        }
        if ((i & 32) != 0) {
            j2 = visualTransformEstimate.inliers;
        }
        if ((i & 64) != 0) {
            d3 = visualTransformEstimate.medianErrorPixels;
        }
        if ((i & 128) != 0) {
            d4 = visualTransformEstimate.inlierTolerancePixels;
        }
        return visualTransformEstimate.m3864copyfWCVa4c(d, d2, point, point2, j, j2, d3, d4);
    }

    public final double component1() {
        return this.clockwiseDegrees;
    }

    public final double component2() {
        return this.scale;
    }

    public final Point component3() {
        return this.translation;
    }

    public final Point component4() {
        return this.regionCenterDisplacement;
    }

    /* renamed from: component5-s-VKNKU, reason: not valid java name */
    public final long m3862component5sVKNKU() {
        return this.matchedFeatures;
    }

    /* renamed from: component6-s-VKNKU, reason: not valid java name */
    public final long m3863component6sVKNKU() {
        return this.inliers;
    }

    public final double component7() {
        return this.medianErrorPixels;
    }

    public final double component8() {
        return this.inlierTolerancePixels;
    }

    public final double getClockwiseDegrees() {
        return this.clockwiseDegrees;
    }

    public final double getInlierTolerancePixels() {
        return this.inlierTolerancePixels;
    }

    /* renamed from: getInliers-s-VKNKU, reason: not valid java name */
    public final long m3865getInlierssVKNKU() {
        return this.inliers;
    }

    /* renamed from: getMatchedFeatures-s-VKNKU, reason: not valid java name */
    public final long m3866getMatchedFeaturessVKNKU() {
        return this.matchedFeatures;
    }

    public final double getMedianErrorPixels() {
        return this.medianErrorPixels;
    }

    public final Point getRegionCenterDisplacement() {
        return this.regionCenterDisplacement;
    }

    public final double getScale() {
        return this.scale;
    }

    public final Point getTranslation() {
        return this.translation;
    }

    public int hashCode() {
        return HsK.A01(this.medianErrorPixels, AnonymousClass006.A06(this.inliers, AnonymousClass006.A06(this.matchedFeatures, AnonymousClass005.A0F(this.regionCenterDisplacement, AnonymousClass005.A0F(this.translation, HsK.A01(this.scale, AnonymousClass002.A0A(Double.doubleToLongBits(this.clockwiseDegrees)) * 31)))))) + AnonymousClass002.A0A(Double.doubleToLongBits(this.inlierTolerancePixels));
    }

    public final void setClockwiseDegrees(double d) {
        this.clockwiseDegrees = d;
    }

    public final void setInlierTolerancePixels(double d) {
        this.inlierTolerancePixels = d;
    }

    /* renamed from: setInliers-VKZWuLQ, reason: not valid java name */
    public final void m3867setInliersVKZWuLQ(long j) {
        this.inliers = j;
    }

    /* renamed from: setMatchedFeatures-VKZWuLQ, reason: not valid java name */
    public final void m3868setMatchedFeaturesVKZWuLQ(long j) {
        this.matchedFeatures = j;
    }

    public final void setMedianErrorPixels(double d) {
        this.medianErrorPixels = d;
    }

    public final void setScale(double d) {
        this.scale = d;
    }

    public String toString() {
        double d = this.clockwiseDegrees;
        double d2 = this.scale;
        Point point = this.translation;
        Point point2 = this.regionCenterDisplacement;
        String strA01 = HwO.A01(this.matchedFeatures, 10);
        String strA012 = HwO.A01(this.inliers, 10);
        double d3 = this.medianErrorPixels;
        double d4 = this.inlierTolerancePixels;
        StringBuilder sbA0x = C60O.A0x("VisualTransformEstimate(clockwiseDegrees=");
        sbA0x.append(d);
        sbA0x.append(C8j2.A00(12));
        sbA0x.append(d2);
        sbA0x.append(", translation=");
        sbA0x.append(point);
        sbA0x.append(", regionCenterDisplacement=");
        sbA0x.append(point2);
        sbA0x.append(", matchedFeatures=");
        sbA0x.append(strA01);
        sbA0x.append(", inliers=");
        sbA0x.append(strA012);
        sbA0x.append(", medianErrorPixels=");
        sbA0x.append(d3);
        sbA0x.append(", inlierTolerancePixels=");
        sbA0x.append(d4);
        return BV7.A10(sbA0x);
    }

    public /* synthetic */ VisualTransformEstimate(double d, double d2, Point point, Point point2, long j, long j2, double d3, double d4, C06H c06h) {
        this(d, d2, point, point2, j, j2, d3, d4);
    }
}
