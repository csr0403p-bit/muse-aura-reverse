package com.facebook.aura.partners.wearables.onboarding;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;

/* loaded from: classes3.dex */
public final class WearablesOnboardingDeeplinkTarget extends C06G {
    public final AuraNavKey key;
    public final LaunchFlag launchFlag;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WearablesOnboardingDeeplinkTarget) {
                WearablesOnboardingDeeplinkTarget wearablesOnboardingDeeplinkTarget = (WearablesOnboardingDeeplinkTarget) obj;
                if (!C7384Etj.areEqual(this.key, wearablesOnboardingDeeplinkTarget.key) || this.launchFlag != wearablesOnboardingDeeplinkTarget.launchFlag) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WearablesOnboardingDeeplinkTarget copy$default(WearablesOnboardingDeeplinkTarget wearablesOnboardingDeeplinkTarget, AuraNavKey auraNavKey, LaunchFlag launchFlag, int i, Object obj) {
        if ((i & 1) != 0) {
            auraNavKey = wearablesOnboardingDeeplinkTarget.key;
        }
        if ((i & 2) != 0) {
            launchFlag = wearablesOnboardingDeeplinkTarget.launchFlag;
        }
        AnonymousClass003.A0u(auraNavKey, launchFlag);
        return new WearablesOnboardingDeeplinkTarget(auraNavKey, launchFlag);
    }

    public final AuraNavKey component1() {
        return this.key;
    }

    public final LaunchFlag component2() {
        return this.launchFlag;
    }

    public final AuraNavKey getKey() {
        return this.key;
    }

    public final LaunchFlag getLaunchFlag() {
        return this.launchFlag;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.launchFlag, AnonymousClass005.A0E(this.key));
    }

    public WearablesOnboardingDeeplinkTarget(AuraNavKey auraNavKey, LaunchFlag launchFlag) {
        AnonymousClass003.A0u(auraNavKey, launchFlag);
        this.key = auraNavKey;
        this.launchFlag = launchFlag;
    }

    public final WearablesOnboardingDeeplinkTarget copy(AuraNavKey auraNavKey, LaunchFlag launchFlag) {
        AnonymousClass003.A0u(auraNavKey, launchFlag);
        return new WearablesOnboardingDeeplinkTarget(auraNavKey, launchFlag);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WearablesOnboardingDeeplinkTarget(AuraNavKey auraNavKey, LaunchFlag launchFlag, int i, C06H c06h) {
        this(auraNavKey, (i & 2) != 0 ? LaunchFlag.NAVIGATE : launchFlag);
    }
}
