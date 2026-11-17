package com.facebook.aura.subscription.view;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import X.C98d;

/* loaded from: classes4.dex */
public final class PaywallFunnel extends C06G {
    public static final int $stable = 0;
    public final boolean hasDowngradeOption;
    public final boolean hasUpgradeOption;
    public final C98d waterfallStage;

    public PaywallFunnel(C98d c98d, boolean z, boolean z2) {
        C7384Etj.A0Y(c98d, 0);
        this.waterfallStage = c98d;
        this.hasUpgradeOption = z;
        this.hasDowngradeOption = z2;
    }

    public final PaywallFunnel copy(C98d c98d, boolean z, boolean z2) {
        C7384Etj.A0Y(c98d, 0);
        return new PaywallFunnel(c98d, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaywallFunnel) {
                PaywallFunnel paywallFunnel = (PaywallFunnel) obj;
                if (this.waterfallStage != paywallFunnel.waterfallStage || this.hasUpgradeOption != paywallFunnel.hasUpgradeOption || this.hasDowngradeOption != paywallFunnel.hasDowngradeOption) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PaywallFunnel copy$default(PaywallFunnel paywallFunnel, C98d c98d, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            c98d = paywallFunnel.waterfallStage;
        }
        if ((i & 2) != 0) {
            z = paywallFunnel.hasUpgradeOption;
        }
        if ((i & 4) != 0) {
            z2 = paywallFunnel.hasDowngradeOption;
        }
        return paywallFunnel.copy(c98d, z, z2);
    }

    public final C98d component1() {
        return this.waterfallStage;
    }

    public final boolean component2() {
        return this.hasUpgradeOption;
    }

    public final boolean component3() {
        return this.hasDowngradeOption;
    }

    public final boolean getHasDowngradeOption() {
        return this.hasDowngradeOption;
    }

    public final boolean getHasUpgradeOption() {
        return this.hasUpgradeOption;
    }

    public final C98d getWaterfallStage() {
        return this.waterfallStage;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.waterfallStage), this.hasUpgradeOption), this.hasDowngradeOption);
    }

    public String toString() {
        return super.toString();
    }
}
