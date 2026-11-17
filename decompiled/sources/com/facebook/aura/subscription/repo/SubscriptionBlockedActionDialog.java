package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SubscriptionBlockedActionDialog extends C06G {
    public static final int $stable = 0;
    public final String body;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionBlockedActionDialog) {
                SubscriptionBlockedActionDialog subscriptionBlockedActionDialog = (SubscriptionBlockedActionDialog) obj;
                if (!C7384Etj.areEqual(this.title, subscriptionBlockedActionDialog.title) || !C7384Etj.areEqual(this.body, subscriptionBlockedActionDialog.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionBlockedActionDialog copy$default(SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionBlockedActionDialog.title;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionBlockedActionDialog.body;
        }
        AnonymousClass003.A0u(str, str2);
        return new SubscriptionBlockedActionDialog(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.body, AnonymousClass001.A0G(this.title));
    }

    public SubscriptionBlockedActionDialog(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.body = str2;
    }

    public final SubscriptionBlockedActionDialog copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new SubscriptionBlockedActionDialog(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
