package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SubscriptionNameDialog extends C06G {
    public static final int $stable = 0;
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionNameDialog) {
                SubscriptionNameDialog subscriptionNameDialog = (SubscriptionNameDialog) obj;
                if (!C7384Etj.areEqual(this.title, subscriptionNameDialog.title) || !C7384Etj.areEqual(this.subtitle, subscriptionNameDialog.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionNameDialog copy$default(SubscriptionNameDialog subscriptionNameDialog, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionNameDialog.title;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionNameDialog.subtitle;
        }
        AnonymousClass003.A0u(str, str2);
        return new SubscriptionNameDialog(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.subtitle, AnonymousClass001.A0G(this.title));
    }

    public SubscriptionNameDialog(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.subtitle = str2;
    }

    public final SubscriptionNameDialog copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new SubscriptionNameDialog(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
