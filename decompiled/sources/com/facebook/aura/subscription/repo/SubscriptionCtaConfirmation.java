package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SubscriptionCtaConfirmation extends C06G {
    public static final int $stable = 0;
    public final String body;
    public final String cancelLabel;
    public final String confirmLabel;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionCtaConfirmation) {
                SubscriptionCtaConfirmation subscriptionCtaConfirmation = (SubscriptionCtaConfirmation) obj;
                if (!C7384Etj.areEqual(this.title, subscriptionCtaConfirmation.title) || !C7384Etj.areEqual(this.body, subscriptionCtaConfirmation.body) || !C7384Etj.areEqual(this.confirmLabel, subscriptionCtaConfirmation.confirmLabel) || !C7384Etj.areEqual(this.cancelLabel, subscriptionCtaConfirmation.cancelLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionCtaConfirmation copy$default(SubscriptionCtaConfirmation subscriptionCtaConfirmation, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionCtaConfirmation.title;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionCtaConfirmation.body;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionCtaConfirmation.confirmLabel;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionCtaConfirmation.cancelLabel;
        }
        return subscriptionCtaConfirmation.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.confirmLabel;
    }

    public final String component4() {
        return this.cancelLabel;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCancelLabel() {
        return this.cancelLabel;
    }

    public final String getConfirmLabel() {
        return this.confirmLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.cancelLabel, AnonymousClass005.A0I(this.confirmLabel, AnonymousClass005.A0I(this.body, AnonymousClass001.A0G(this.title))));
    }

    public SubscriptionCtaConfirmation(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.title = str;
        this.body = str2;
        this.confirmLabel = str3;
        this.cancelLabel = str4;
    }

    public final SubscriptionCtaConfirmation copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new SubscriptionCtaConfirmation(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }
}
