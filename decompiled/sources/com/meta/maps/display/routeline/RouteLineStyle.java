package com.meta.maps.display.routeline;

import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import com.meta.maps.display.SDKColor;

/* loaded from: classes3.dex */
public final class RouteLineStyle {
    public static final Companion Companion = new Companion();
    public double boundaryCasingRadius;
    public double boundaryInnerRadius;
    public double boundaryRadius;
    public double casingBandRatio;
    public SDKColor completedCasingColor;
    public SDKColor completedLineColor;
    public double dottedCasingWidthRatio;
    public SDKColor dottedCompletedCasingColor;
    public SDKColor dottedCompletedLineColor;
    public double dottedPeriodRatio;
    public SDKColor dottedRemainingCasingColor;
    public SDKColor dottedRemainingLineColor;
    public DottedRenderer dottedRenderer;
    public double dottedWidthRatio;
    public double endPointCasingRadius;
    public SDKColor endPointColor;
    public double endPointInnerRadius;
    public double endPointRadius;
    public boolean hideOverlappedBasemapLabels;
    public double lineWidth;
    public SDKColor remainingCasingColor;
    public SDKColor remainingLineColor;
    public boolean showBoardingLabels;
    public boolean showCasing;
    public boolean showCompletedLine;
    public boolean showLineBadgesOnRoute;
    public boolean showStartPoint;
    public double stopCasingRadius;
    public double stopInnerRadius;
    public double stopMinSpacingRatio;
    public double stopRadius;

    public RouteLineStyle(SDKColor sDKColor, SDKColor sDKColor2, SDKColor sDKColor3, SDKColor sDKColor4, SDKColor sDKColor5) {
        C7384Etj.A0Y(sDKColor, 0);
        AnonymousClass005.A11(sDKColor2, sDKColor3, sDKColor4, 1);
        C7384Etj.A0Y(sDKColor5, 4);
        this.remainingLineColor = sDKColor;
        this.remainingCasingColor = sDKColor2;
        this.completedLineColor = sDKColor3;
        this.completedCasingColor = sDKColor4;
        this.endPointColor = sDKColor5;
        this.showStartPoint = true;
        this.lineWidth = 10.0d;
        this.casingBandRatio = 0.2d;
        this.dottedWidthRatio = 0.8d;
        this.dottedRemainingLineColor = null;
        this.dottedCompletedLineColor = null;
        this.dottedRemainingCasingColor = null;
        this.dottedCompletedCasingColor = null;
        this.dottedCasingWidthRatio = 0.0d;
        this.dottedPeriodRatio = 1.81d;
        this.dottedRenderer = DottedRenderer.DASH;
        this.showCompletedLine = true;
        this.endPointCasingRadius = 1.4d;
        this.endPointRadius = 1.2d;
        this.endPointInnerRadius = 0.8d;
        this.boundaryCasingRadius = 1.55d;
        this.boundaryRadius = 1.35d;
        this.boundaryInnerRadius = 0.7d;
        this.stopCasingRadius = 1.1d;
        this.stopRadius = 0.9d;
        this.stopInnerRadius = 0.7d;
        this.stopMinSpacingRatio = 2.0d;
        this.showCasing = true;
        this.showBoardingLabels = false;
        this.showLineBadgesOnRoute = false;
        this.hideOverlappedBasemapLabels = false;
    }

    public static final native RouteLineStyle c50(SDKColor sDKColor, boolean z);

    public static final native RouteLineStyle hypernova(SDKColor sDKColor);

    public final class Companion {
        public final RouteLineStyle c50(SDKColor sDKColor, boolean z) {
            return RouteLineStyle.c50(sDKColor, z);
        }

        public final RouteLineStyle hypernova(SDKColor sDKColor) {
            return RouteLineStyle.hypernova(sDKColor);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
