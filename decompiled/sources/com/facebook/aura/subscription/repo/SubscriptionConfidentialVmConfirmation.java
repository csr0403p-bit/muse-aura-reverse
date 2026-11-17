package com.facebook.aura.subscription.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SubscriptionConfidentialVmConfirmation extends C06G {
    public static final int $stable = 0;
    public final String cancelLabel;
    public final String confirmLabel;
    public final AHD<SubscriptionConfirmationItem> items;
    public final String summary;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionConfidentialVmConfirmation) {
                SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation = (SubscriptionConfidentialVmConfirmation) obj;
                if (!C7384Etj.areEqual(this.title, subscriptionConfidentialVmConfirmation.title) || !C7384Etj.areEqual(this.summary, subscriptionConfidentialVmConfirmation.summary) || !C7384Etj.areEqual(this.items, subscriptionConfidentialVmConfirmation.items) || !C7384Etj.areEqual(this.confirmLabel, subscriptionConfidentialVmConfirmation.confirmLabel) || !C7384Etj.areEqual(this.cancelLabel, subscriptionConfidentialVmConfirmation.cancelLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionConfidentialVmConfirmation copy$default(SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation, String str, String str2, AHD ahd, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionConfidentialVmConfirmation.title;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionConfidentialVmConfirmation.summary;
        }
        if ((i & 4) != 0) {
            ahd = subscriptionConfidentialVmConfirmation.items;
        }
        if ((i & 8) != 0) {
            str3 = subscriptionConfidentialVmConfirmation.confirmLabel;
        }
        if ((i & 16) != 0) {
            str4 = subscriptionConfidentialVmConfirmation.cancelLabel;
        }
        return subscriptionConfidentialVmConfirmation.copy(str, str2, ahd, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.summary;
    }

    public final AHD<SubscriptionConfirmationItem> component3() {
        return this.items;
    }

    public final String component4() {
        return this.confirmLabel;
    }

    public final String component5() {
        return this.cancelLabel;
    }

    public final String getCancelLabel() {
        return this.cancelLabel;
    }

    public final String getConfirmLabel() {
        return this.confirmLabel;
    }

    public final AHD<SubscriptionConfirmationItem> getItems() {
        return this.items;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.cancelLabel, AnonymousClass005.A0I(this.confirmLabel, AnonymousClass005.A0F(this.items, AnonymousClass005.A0I(this.summary, AnonymousClass001.A0G(this.title)))));
    }

    public SubscriptionConfidentialVmConfirmation(String str, String str2, AHD<SubscriptionConfirmationItem> ahd, String str3, String str4) {
        AnonymousClass005.A17(str, str2, ahd, str3, str4);
        this.title = str;
        this.summary = str2;
        this.items = ahd;
        this.confirmLabel = str3;
        this.cancelLabel = str4;
    }

    public final SubscriptionConfidentialVmConfirmation copy(String str, String str2, AHD<SubscriptionConfirmationItem> ahd, String str3, String str4) {
        AnonymousClass005.A17(str, str2, ahd, str3, str4);
        return new SubscriptionConfidentialVmConfirmation(str, str2, ahd, str3, str4);
    }

    public String toString() {
        return super.toString();
    }
}
