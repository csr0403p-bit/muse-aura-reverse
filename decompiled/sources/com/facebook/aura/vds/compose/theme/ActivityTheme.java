package com.facebook.aura.vds.compose.theme;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class ActivityTheme extends C06G {
    public static final int $stable = 0;
    public final boolean forceUseDefaultPrimaryColor;
    public final Integer navBarColor;
    public final boolean resetOnStop;
    public final boolean transparentStatusBar;

    public ActivityTheme() {
        this(true, null, false, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityTheme) {
                ActivityTheme activityTheme = (ActivityTheme) obj;
                if (this.transparentStatusBar != activityTheme.transparentStatusBar || !C7384Etj.areEqual(this.navBarColor, activityTheme.navBarColor) || this.resetOnStop != activityTheme.resetOnStop || this.forceUseDefaultPrimaryColor != activityTheme.forceUseDefaultPrimaryColor) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityTheme copy$default(ActivityTheme activityTheme, boolean z, Integer num, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = activityTheme.transparentStatusBar;
        }
        if ((i & 2) != 0) {
            num = activityTheme.navBarColor;
        }
        if ((i & 4) != 0) {
            z2 = activityTheme.resetOnStop;
        }
        if ((i & 8) != 0) {
            z3 = activityTheme.forceUseDefaultPrimaryColor;
        }
        return new ActivityTheme(z, num, z2, z3);
    }

    public final boolean component1() {
        return this.transparentStatusBar;
    }

    public final Integer component2() {
        return this.navBarColor;
    }

    public final boolean component3() {
        return this.resetOnStop;
    }

    public final boolean component4() {
        return this.forceUseDefaultPrimaryColor;
    }

    public final ActivityTheme copy(boolean z, Integer num, boolean z2, boolean z3) {
        return new ActivityTheme(z, num, z2, z3);
    }

    public final boolean getForceUseDefaultPrimaryColor() {
        return this.forceUseDefaultPrimaryColor;
    }

    public final Integer getNavBarColor() {
        return this.navBarColor;
    }

    public final boolean getResetOnStop() {
        return this.resetOnStop;
    }

    public final boolean getTransparentStatusBar() {
        return this.transparentStatusBar;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((C0KA.A02(this.transparentStatusBar) + AnonymousClass006.A0D(this.navBarColor)) * 31, this.resetOnStop), this.forceUseDefaultPrimaryColor);
    }

    public String toString() {
        return super.toString();
    }

    public ActivityTheme(boolean z, Integer num, boolean z2, boolean z3) {
        this.transparentStatusBar = z;
        this.navBarColor = num;
        this.resetOnStop = z2;
        this.forceUseDefaultPrimaryColor = z3;
    }

    public /* synthetic */ ActivityTheme(boolean z, Integer num, boolean z2, boolean z3, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : num, AnonymousClass005.A1O(i, z2), AnonymousClass005.A1P(i, z3));
    }
}
