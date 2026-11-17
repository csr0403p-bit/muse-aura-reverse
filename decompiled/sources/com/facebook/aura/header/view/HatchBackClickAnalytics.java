package com.facebook.aura.header.view;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class HatchBackClickAnalytics extends C06G {
    public static final int $stable = 0;
    public final HatchScreen screen;
    public final HatchSurface surface;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchBackClickAnalytics) {
                HatchBackClickAnalytics hatchBackClickAnalytics = (HatchBackClickAnalytics) obj;
                if (this.surface != hatchBackClickAnalytics.surface || this.screen != hatchBackClickAnalytics.screen) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchBackClickAnalytics copy$default(HatchBackClickAnalytics hatchBackClickAnalytics, HatchSurface hatchSurface, HatchScreen hatchScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSurface = hatchBackClickAnalytics.surface;
        }
        if ((i & 2) != 0) {
            hatchScreen = hatchBackClickAnalytics.screen;
        }
        AnonymousClass003.A0u(hatchSurface, hatchScreen);
        return new HatchBackClickAnalytics(hatchSurface, hatchScreen);
    }

    public final HatchSurface component1() {
        return this.surface;
    }

    public final HatchScreen component2() {
        return this.screen;
    }

    public final HatchScreen getScreen() {
        return this.screen;
    }

    public final HatchSurface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.screen, AnonymousClass005.A0E(this.surface));
    }

    public HatchBackClickAnalytics(HatchSurface hatchSurface, HatchScreen hatchScreen) {
        AnonymousClass003.A0u(hatchSurface, hatchScreen);
        this.surface = hatchSurface;
        this.screen = hatchScreen;
    }

    public final HatchBackClickAnalytics copy(HatchSurface hatchSurface, HatchScreen hatchScreen) {
        AnonymousClass003.A0u(hatchSurface, hatchScreen);
        return new HatchBackClickAnalytics(hatchSurface, hatchScreen);
    }

    public String toString() {
        return super.toString();
    }
}
