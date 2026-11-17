package com.facebook.aura.navigation.key;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.C9hr;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import kotlinx.serialization.Serializable;

@Serializable(with = AuraSubscriptionSheetKeySerializer.class)
/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String canonicalNmeEntryPoint;
    public final SubscriptionPaywallEntryPoint entryPoint;
    public final AuraSubscriptionPage initialPage;

    public final class Companion {
        public final C9hr<AuraSubscriptionSheetKey> serializer() {
            return AuraSubscriptionSheetKeySerializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraSubscriptionSheetKey) {
                AuraSubscriptionSheetKey auraSubscriptionSheetKey = (AuraSubscriptionSheetKey) obj;
                if (!C7384Etj.areEqual(this.initialPage, auraSubscriptionSheetKey.initialPage) || this.entryPoint != auraSubscriptionSheetKey.entryPoint || !C7384Etj.areEqual(this.canonicalNmeEntryPoint, auraSubscriptionSheetKey.canonicalNmeEntryPoint)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraSubscriptionSheetKey copy$default(AuraSubscriptionSheetKey auraSubscriptionSheetKey, AuraSubscriptionPage auraSubscriptionPage, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            auraSubscriptionPage = auraSubscriptionSheetKey.initialPage;
        }
        if ((i & 2) != 0) {
            subscriptionPaywallEntryPoint = auraSubscriptionSheetKey.entryPoint;
        }
        if ((i & 4) != 0) {
            str = auraSubscriptionSheetKey.canonicalNmeEntryPoint;
        }
        return auraSubscriptionSheetKey.copy(auraSubscriptionPage, subscriptionPaywallEntryPoint, str);
    }

    public final AuraSubscriptionPage component1() {
        return this.initialPage;
    }

    public final SubscriptionPaywallEntryPoint component2() {
        return this.entryPoint;
    }

    public final String component3() {
        return this.canonicalNmeEntryPoint;
    }

    public final String getCanonicalNmeEntryPoint() {
        return this.canonicalNmeEntryPoint;
    }

    public final SubscriptionPaywallEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final AuraSubscriptionPage getInitialPage() {
        return this.initialPage;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.entryPoint, AnonymousClass005.A0E(this.initialPage)) + AnonymousClass006.A0G(this.canonicalNmeEntryPoint);
    }

    public AuraSubscriptionSheetKey(AuraSubscriptionPage auraSubscriptionPage, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str) {
        AnonymousClass003.A0u(auraSubscriptionPage, subscriptionPaywallEntryPoint);
        this.initialPage = auraSubscriptionPage;
        this.entryPoint = subscriptionPaywallEntryPoint;
        this.canonicalNmeEntryPoint = str;
    }

    public final AuraSubscriptionSheetKey copy(AuraSubscriptionPage auraSubscriptionPage, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str) {
        AnonymousClass003.A0u(auraSubscriptionPage, subscriptionPaywallEntryPoint);
        return new AuraSubscriptionSheetKey(auraSubscriptionPage, subscriptionPaywallEntryPoint, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraSubscriptionSheetKey(AuraSubscriptionPage auraSubscriptionPage, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? AuraSubscriptionPage.Usage.INSTANCE : auraSubscriptionPage, (i & 2) != 0 ? SubscriptionPaywallEntryPoint.DEFAULT : subscriptionPaywallEntryPoint, str);
    }
}
