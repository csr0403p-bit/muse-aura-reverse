package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SubscriptionManagementCta extends C06G {
    public static final int $stable = 0;
    public final SubscriptionManagementAction action;
    public final SubscriptionConfidentialVmConfirmation confidentialVmConfirmation;
    public final SubscriptionCtaConfirmation confirmation;
    public final String label;
    public final String productId;
    public final String shortLabel;
    public final String subtitle;
    public final String targetTierId;
    public final String url;

    public static /* synthetic */ SubscriptionManagementCta copy$default(SubscriptionManagementCta subscriptionManagementCta, String str, SubscriptionManagementAction subscriptionManagementAction, String str2, String str3, String str4, SubscriptionCtaConfirmation subscriptionCtaConfirmation, String str5, SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation, String str6, int i, Object obj) {
        String str7 = str;
        SubscriptionManagementAction subscriptionManagementAction2 = subscriptionManagementAction;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        SubscriptionCtaConfirmation subscriptionCtaConfirmation2 = subscriptionCtaConfirmation;
        String str11 = str5;
        SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation2 = subscriptionConfidentialVmConfirmation;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = subscriptionManagementCta.label;
        }
        if ((i & 2) != 0) {
            subscriptionManagementAction2 = subscriptionManagementCta.action;
        }
        if ((i & 4) != 0) {
            str8 = subscriptionManagementCta.targetTierId;
        }
        if ((i & 8) != 0) {
            str9 = subscriptionManagementCta.productId;
        }
        if ((i & 16) != 0) {
            str10 = subscriptionManagementCta.url;
        }
        if ((i & 32) != 0) {
            subscriptionCtaConfirmation2 = subscriptionManagementCta.confirmation;
        }
        if ((i & 64) != 0) {
            str11 = subscriptionManagementCta.subtitle;
        }
        if ((i & 128) != 0) {
            subscriptionConfidentialVmConfirmation2 = subscriptionManagementCta.confidentialVmConfirmation;
        }
        if ((i & 256) != 0) {
            str12 = subscriptionManagementCta.shortLabel;
        }
        AnonymousClass003.A0u(str7, subscriptionManagementAction2);
        return new SubscriptionManagementCta(str7, subscriptionManagementAction2, str8, str9, str10, subscriptionCtaConfirmation2, str11, subscriptionConfidentialVmConfirmation2, str12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionManagementCta) {
                SubscriptionManagementCta subscriptionManagementCta = (SubscriptionManagementCta) obj;
                if (!C7384Etj.areEqual(this.label, subscriptionManagementCta.label) || this.action != subscriptionManagementCta.action || !C7384Etj.areEqual(this.targetTierId, subscriptionManagementCta.targetTierId) || !C7384Etj.areEqual(this.productId, subscriptionManagementCta.productId) || !C7384Etj.areEqual(this.url, subscriptionManagementCta.url) || !C7384Etj.areEqual(this.confirmation, subscriptionManagementCta.confirmation) || !C7384Etj.areEqual(this.subtitle, subscriptionManagementCta.subtitle) || !C7384Etj.areEqual(this.confidentialVmConfirmation, subscriptionManagementCta.confidentialVmConfirmation) || !C7384Etj.areEqual(this.shortLabel, subscriptionManagementCta.shortLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SubscriptionManagementCta(String str, SubscriptionManagementAction subscriptionManagementAction, String str2, String str3, String str4, SubscriptionCtaConfirmation subscriptionCtaConfirmation, String str5, SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation, String str6, int i, C06H c06h) {
        this(str, subscriptionManagementAction, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : subscriptionCtaConfirmation, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : subscriptionConfidentialVmConfirmation, (i & 256) != 0 ? null : str6);
    }

    public final String component1() {
        return this.label;
    }

    public final SubscriptionManagementAction component2() {
        return this.action;
    }

    public final String component3() {
        return this.targetTierId;
    }

    public final String component4() {
        return this.productId;
    }

    public final String component5() {
        return this.url;
    }

    public final SubscriptionCtaConfirmation component6() {
        return this.confirmation;
    }

    public final String component7() {
        return this.subtitle;
    }

    public final SubscriptionConfidentialVmConfirmation component8() {
        return this.confidentialVmConfirmation;
    }

    public final String component9() {
        return this.shortLabel;
    }

    public final SubscriptionManagementAction getAction() {
        return this.action;
    }

    public final SubscriptionConfidentialVmConfirmation getConfidentialVmConfirmation() {
        return this.confidentialVmConfirmation;
    }

    public final SubscriptionCtaConfirmation getConfirmation() {
        return this.confirmation;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getShortLabel() {
        return this.shortLabel;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTargetTierId() {
        return this.targetTierId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass005.A0F(this.action, AnonymousClass001.A0G(this.label)) + AnonymousClass006.A0G(this.targetTierId)) * 31) + AnonymousClass006.A0G(this.productId)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0D(this.confirmation)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0D(this.confidentialVmConfirmation)) * 31) + AnonymousClass005.A0H(this.shortLabel);
    }

    public final SubscriptionManagementCta copy(String str, SubscriptionManagementAction subscriptionManagementAction, String str2, String str3, String str4, SubscriptionCtaConfirmation subscriptionCtaConfirmation, String str5, SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation, String str6) {
        AnonymousClass003.A0u(str, subscriptionManagementAction);
        return new SubscriptionManagementCta(str, subscriptionManagementAction, str2, str3, str4, subscriptionCtaConfirmation, str5, subscriptionConfidentialVmConfirmation, str6);
    }

    public String toString() {
        return super.toString();
    }

    public SubscriptionManagementCta(String str, SubscriptionManagementAction subscriptionManagementAction, String str2, String str3, String str4, SubscriptionCtaConfirmation subscriptionCtaConfirmation, String str5, SubscriptionConfidentialVmConfirmation subscriptionConfidentialVmConfirmation, String str6) {
        AnonymousClass003.A0u(str, subscriptionManagementAction);
        this.label = str;
        this.action = subscriptionManagementAction;
        this.targetTierId = str2;
        this.productId = str3;
        this.url = str4;
        this.confirmation = subscriptionCtaConfirmation;
        this.subtitle = str5;
        this.confidentialVmConfirmation = subscriptionConfidentialVmConfirmation;
        this.shortLabel = str6;
    }
}
