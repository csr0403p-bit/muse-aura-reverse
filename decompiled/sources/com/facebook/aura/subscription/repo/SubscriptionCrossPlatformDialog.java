package com.facebook.aura.subscription.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class SubscriptionCrossPlatformDialog extends C06G {
    public static final int $stable = 0;
    public final String body;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionCrossPlatformDialog) {
                SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog = (SubscriptionCrossPlatformDialog) obj;
                if (!C7384Etj.areEqual(this.title, subscriptionCrossPlatformDialog.title) || !C7384Etj.areEqual(this.body, subscriptionCrossPlatformDialog.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionCrossPlatformDialog copy$default(SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionCrossPlatformDialog.title;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionCrossPlatformDialog.body;
        }
        return new SubscriptionCrossPlatformDialog(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final SubscriptionCrossPlatformDialog copy(String str, String str2) {
        return new SubscriptionCrossPlatformDialog(str, str2);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.body);
    }

    public SubscriptionCrossPlatformDialog(String str, String str2) {
        this.title = str;
        this.body = str2;
    }

    public String toString() {
        return super.toString();
    }
}
