package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SubscriptionConfirmationItem extends C06G {
    public static final int $stable = 0;
    public final SubscriptionConfirmationIcon icon;
    public final String subtext;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionConfirmationItem) {
                SubscriptionConfirmationItem subscriptionConfirmationItem = (SubscriptionConfirmationItem) obj;
                if (this.icon != subscriptionConfirmationItem.icon || !C7384Etj.areEqual(this.text, subscriptionConfirmationItem.text) || !C7384Etj.areEqual(this.subtext, subscriptionConfirmationItem.subtext)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionConfirmationItem copy$default(SubscriptionConfirmationItem subscriptionConfirmationItem, SubscriptionConfirmationIcon subscriptionConfirmationIcon, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriptionConfirmationIcon = subscriptionConfirmationItem.icon;
        }
        if ((i & 2) != 0) {
            str = subscriptionConfirmationItem.text;
        }
        if ((i & 4) != 0) {
            str2 = subscriptionConfirmationItem.subtext;
        }
        return subscriptionConfirmationItem.copy(subscriptionConfirmationIcon, str, str2);
    }

    public final SubscriptionConfirmationIcon component1() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.subtext;
    }

    public final SubscriptionConfirmationIcon getIcon() {
        return this.icon;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.subtext, AnonymousClass005.A0I(this.text, AnonymousClass006.A0D(this.icon) * 31));
    }

    public SubscriptionConfirmationItem(SubscriptionConfirmationIcon subscriptionConfirmationIcon, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        this.icon = subscriptionConfirmationIcon;
        this.text = str;
        this.subtext = str2;
    }

    public final SubscriptionConfirmationItem copy(SubscriptionConfirmationIcon subscriptionConfirmationIcon, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        return new SubscriptionConfirmationItem(subscriptionConfirmationIcon, str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
