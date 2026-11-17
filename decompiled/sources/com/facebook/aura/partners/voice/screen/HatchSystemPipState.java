package com.facebook.aura.partners.voice.screen;

import X.BL4;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchSystemPipState {
    public static final int $stable = 0;
    public final HatchSystemPipGeometry geometry;
    public final boolean hideCallControls;
    public final G0U<BL4, Unit> onPipWindowSize;
    public final G0U<HatchSystemPipGeometry, Unit> onSourceChanged;
    public final HatchPipWindowMeasurement pipWindow;
    public final boolean showAvatarOnly;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchSystemPipState(boolean z, boolean z2, HatchSystemPipGeometry hatchSystemPipGeometry, G0U<? super HatchSystemPipGeometry, Unit> g0u, HatchPipWindowMeasurement hatchPipWindowMeasurement, G0U<? super BL4, Unit> g0u2) {
        C7384Etj.A0Y(g0u2, 5);
        this.showAvatarOnly = z;
        this.hideCallControls = z2;
        this.geometry = hatchSystemPipGeometry;
        this.onSourceChanged = g0u;
        this.pipWindow = hatchPipWindowMeasurement;
        this.onPipWindowSize = g0u2;
    }

    public final HatchSystemPipGeometry getGeometry() {
        return this.geometry;
    }

    public final boolean getHideCallControls() {
        return this.hideCallControls;
    }

    public final G0U<BL4, Unit> getOnPipWindowSize() {
        return this.onPipWindowSize;
    }

    public final G0U<HatchSystemPipGeometry, Unit> getOnSourceChanged() {
        return this.onSourceChanged;
    }

    public final boolean getShowAvatarOnly() {
        return this.showAvatarOnly;
    }

    /* renamed from: pipWindowSideFor-ozmzZPI, reason: not valid java name */
    public final int m1739pipWindowSideForozmzZPI(long j) {
        HatchPipWindowMeasurement hatchPipWindowMeasurement = this.pipWindow;
        if (hatchPipWindowMeasurement == null || hatchPipWindowMeasurement.appWindowSize != j) {
            return 0;
        }
        return hatchPipWindowMeasurement.pipWindowSide;
    }
}
