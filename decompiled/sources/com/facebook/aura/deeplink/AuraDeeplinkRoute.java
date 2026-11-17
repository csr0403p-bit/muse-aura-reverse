package com.facebook.aura.deeplink;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;

/* loaded from: classes3.dex */
public final class AuraDeeplinkRoute extends C06G {
    public static final int $stable = 0;
    public final AuraNavKey baseKey;
    public final AuraNavKey key;
    public final LaunchFlag launchFlag;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraDeeplinkRoute) {
                AuraDeeplinkRoute auraDeeplinkRoute = (AuraDeeplinkRoute) obj;
                if (!C7384Etj.areEqual(this.key, auraDeeplinkRoute.key) || this.launchFlag != auraDeeplinkRoute.launchFlag || !C7384Etj.areEqual(this.baseKey, auraDeeplinkRoute.baseKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraDeeplinkRoute copy$default(AuraDeeplinkRoute auraDeeplinkRoute, AuraNavKey auraNavKey, LaunchFlag launchFlag, AuraNavKey auraNavKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            auraNavKey = auraDeeplinkRoute.key;
        }
        if ((i & 2) != 0) {
            launchFlag = auraDeeplinkRoute.launchFlag;
        }
        if ((i & 4) != 0) {
            auraNavKey2 = auraDeeplinkRoute.baseKey;
        }
        return auraDeeplinkRoute.copy(auraNavKey, launchFlag, auraNavKey2);
    }

    public final AuraNavKey component1() {
        return this.key;
    }

    public final LaunchFlag component2() {
        return this.launchFlag;
    }

    public final AuraNavKey component3() {
        return this.baseKey;
    }

    public final AuraNavKey getBaseKey() {
        return this.baseKey;
    }

    public final AuraNavKey getKey() {
        return this.key;
    }

    public final LaunchFlag getLaunchFlag() {
        return this.launchFlag;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.launchFlag, AnonymousClass005.A0E(this.key)) + AnonymousClass006.A0D(this.baseKey);
    }

    public AuraDeeplinkRoute(AuraNavKey auraNavKey, LaunchFlag launchFlag, AuraNavKey auraNavKey2) {
        AnonymousClass003.A0u(auraNavKey, launchFlag);
        this.key = auraNavKey;
        this.launchFlag = launchFlag;
        this.baseKey = auraNavKey2;
    }

    public final AuraDeeplinkRoute copy(AuraNavKey auraNavKey, LaunchFlag launchFlag, AuraNavKey auraNavKey2) {
        AnonymousClass003.A0u(auraNavKey, launchFlag);
        return new AuraDeeplinkRoute(auraNavKey, launchFlag, auraNavKey2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraDeeplinkRoute(AuraNavKey auraNavKey, LaunchFlag launchFlag, AuraNavKey auraNavKey2, int i, C06H c06h) {
        this(auraNavKey, (i & 2) != 0 ? LaunchFlag.NAVIGATE : launchFlag, (i & 4) != 0 ? null : auraNavKey2);
    }
}
