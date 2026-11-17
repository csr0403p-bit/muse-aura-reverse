package com.facebook.aura.navigation.key;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SubscriptionAttribution extends C06G {
    public final String canonicalNmeEntryPoint;
    public final SubscriptionPaywallEntryPoint localEntryPoint;

    public SubscriptionAttribution(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str) {
        C7384Etj.A0Y(subscriptionPaywallEntryPoint, 0);
        this.localEntryPoint = subscriptionPaywallEntryPoint;
        this.canonicalNmeEntryPoint = str;
    }

    public final SubscriptionAttribution copy(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str) {
        C7384Etj.A0Y(subscriptionPaywallEntryPoint, 0);
        return new SubscriptionAttribution(subscriptionPaywallEntryPoint, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionAttribution) {
                SubscriptionAttribution subscriptionAttribution = (SubscriptionAttribution) obj;
                if (this.localEntryPoint != subscriptionAttribution.localEntryPoint || !C7384Etj.areEqual(this.canonicalNmeEntryPoint, subscriptionAttribution.canonicalNmeEntryPoint)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionAttribution copy$default(SubscriptionAttribution subscriptionAttribution, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionPaywallEntryPoint = subscriptionAttribution.localEntryPoint;
        }
        if ((i & 2) != 0) {
            str = subscriptionAttribution.canonicalNmeEntryPoint;
        }
        C7384Etj.A0Y(subscriptionPaywallEntryPoint, 0);
        return new SubscriptionAttribution(subscriptionPaywallEntryPoint, str);
    }

    public final SubscriptionPaywallEntryPoint component1() {
        return this.localEntryPoint;
    }

    public final String component2() {
        return this.canonicalNmeEntryPoint;
    }

    public final String getCanonicalNmeEntryPoint() {
        return this.canonicalNmeEntryPoint;
    }

    public final SubscriptionPaywallEntryPoint getLocalEntryPoint() {
        return this.localEntryPoint;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.localEntryPoint) + AnonymousClass006.A0G(this.canonicalNmeEntryPoint);
    }

    public String toString() {
        return super.toString();
    }
}
