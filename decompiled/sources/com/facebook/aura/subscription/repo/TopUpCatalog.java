package com.facebook.aura.subscription.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class TopUpCatalog extends C06G {
    public static final int $stable = 8;
    public final String ctaLabel;
    public final Disclaimer disclaimer;
    public final SubscriptionNameDialog nameDialog;
    public final List<TopUpPack> packs;
    public final boolean requiresName;

    public final TopUpCatalog copy(List<TopUpPack> list, Disclaimer disclaimer, boolean z, SubscriptionNameDialog subscriptionNameDialog, String str) {
        C7384Etj.A0Y(list, 0);
        return new TopUpCatalog(list, disclaimer, z, subscriptionNameDialog, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TopUpCatalog) {
                TopUpCatalog topUpCatalog = (TopUpCatalog) obj;
                if (!C7384Etj.areEqual(this.packs, topUpCatalog.packs) || !C7384Etj.areEqual(this.disclaimer, topUpCatalog.disclaimer) || this.requiresName != topUpCatalog.requiresName || !C7384Etj.areEqual(this.nameDialog, topUpCatalog.nameDialog) || !C7384Etj.areEqual(this.ctaLabel, topUpCatalog.ctaLabel)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ TopUpCatalog(List list, Disclaimer disclaimer, boolean z, SubscriptionNameDialog subscriptionNameDialog, String str, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? null : disclaimer, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : subscriptionNameDialog, (i & 16) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopUpCatalog copy$default(TopUpCatalog topUpCatalog, List list, Disclaimer disclaimer, boolean z, SubscriptionNameDialog subscriptionNameDialog, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = topUpCatalog.packs;
        }
        if ((i & 2) != 0) {
            disclaimer = topUpCatalog.disclaimer;
        }
        if ((i & 4) != 0) {
            z = topUpCatalog.requiresName;
        }
        if ((i & 8) != 0) {
            subscriptionNameDialog = topUpCatalog.nameDialog;
        }
        if ((i & 16) != 0) {
            str = topUpCatalog.ctaLabel;
        }
        return topUpCatalog.copy(list, disclaimer, z, subscriptionNameDialog, str);
    }

    public final List<TopUpPack> component1() {
        return this.packs;
    }

    public final Disclaimer component2() {
        return this.disclaimer;
    }

    public final boolean component3() {
        return this.requiresName;
    }

    public final SubscriptionNameDialog component4() {
        return this.nameDialog;
    }

    public final String component5() {
        return this.ctaLabel;
    }

    public final String getCtaLabel() {
        return this.ctaLabel;
    }

    public final Disclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public final SubscriptionNameDialog getNameDialog() {
        return this.nameDialog;
    }

    public final List<TopUpPack> getPacks() {
        return this.packs;
    }

    public final boolean getRequiresName() {
        return this.requiresName;
    }

    public int hashCode() {
        return ((C0KA.A01((AnonymousClass005.A0E(this.packs) + AnonymousClass006.A0D(this.disclaimer)) * 31, this.requiresName) + AnonymousClass006.A0D(this.nameDialog)) * 31) + AnonymousClass005.A0H(this.ctaLabel);
    }

    public String toString() {
        return super.toString();
    }

    public TopUpCatalog(List<TopUpPack> list, Disclaimer disclaimer, boolean z, SubscriptionNameDialog subscriptionNameDialog, String str) {
        C7384Etj.A0Y(list, 0);
        this.packs = list;
        this.disclaimer = disclaimer;
        this.requiresName = z;
        this.nameDialog = subscriptionNameDialog;
        this.ctaLabel = str;
    }
}
