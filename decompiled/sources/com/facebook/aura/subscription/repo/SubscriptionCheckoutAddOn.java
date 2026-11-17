package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SubscriptionCheckoutAddOn extends C06G {
    public static final int $stable = 0;
    public final String label;
    public final String subtitle;
    public final String type;

    public SubscriptionCheckoutAddOn(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.label = str2;
        this.subtitle = str3;
    }

    public final SubscriptionCheckoutAddOn copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new SubscriptionCheckoutAddOn(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionCheckoutAddOn) {
                SubscriptionCheckoutAddOn subscriptionCheckoutAddOn = (SubscriptionCheckoutAddOn) obj;
                if (!C7384Etj.areEqual(this.type, subscriptionCheckoutAddOn.type) || !C7384Etj.areEqual(this.label, subscriptionCheckoutAddOn.label) || !C7384Etj.areEqual(this.subtitle, subscriptionCheckoutAddOn.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionCheckoutAddOn copy$default(SubscriptionCheckoutAddOn subscriptionCheckoutAddOn, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionCheckoutAddOn.type;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionCheckoutAddOn.label;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionCheckoutAddOn.subtitle;
        }
        return subscriptionCheckoutAddOn.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.subtitle);
    }

    public String toString() {
        return super.toString();
    }
}
