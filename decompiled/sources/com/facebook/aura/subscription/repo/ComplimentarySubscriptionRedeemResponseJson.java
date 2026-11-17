package com.facebook.aura.subscription.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ComplimentarySubscriptionRedeemResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Boolean has_active_subscription;
    public final String subscription_tier_name;

    public final class Companion {
        public final C9hr<ComplimentarySubscriptionRedeemResponseJson> serializer() {
            return ComplimentarySubscriptionRedeemResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ComplimentarySubscriptionRedeemResponseJson complimentarySubscriptionRedeemResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || complimentarySubscriptionRedeemResponseJson.has_active_subscription != null) {
            c9j5.AAP(complimentarySubscriptionRedeemResponseJson.has_active_subscription, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || complimentarySubscriptionRedeemResponseJson.subscription_tier_name != null) {
            c9j5.AAP(complimentarySubscriptionRedeemResponseJson.subscription_tier_name, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComplimentarySubscriptionRedeemResponseJson) {
                ComplimentarySubscriptionRedeemResponseJson complimentarySubscriptionRedeemResponseJson = (ComplimentarySubscriptionRedeemResponseJson) obj;
                if (!C7384Etj.areEqual(this.has_active_subscription, complimentarySubscriptionRedeemResponseJson.has_active_subscription) || !C7384Etj.areEqual(this.subscription_tier_name, complimentarySubscriptionRedeemResponseJson.subscription_tier_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ComplimentarySubscriptionRedeemResponseJson copy$default(ComplimentarySubscriptionRedeemResponseJson complimentarySubscriptionRedeemResponseJson, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = complimentarySubscriptionRedeemResponseJson.has_active_subscription;
        }
        if ((i & 2) != 0) {
            str = complimentarySubscriptionRedeemResponseJson.subscription_tier_name;
        }
        return new ComplimentarySubscriptionRedeemResponseJson(bool, str);
    }

    public final Boolean component1() {
        return this.has_active_subscription;
    }

    public final String component2() {
        return this.subscription_tier_name;
    }

    public final ComplimentarySubscriptionRedeemResponseJson copy(Boolean bool, String str) {
        return new ComplimentarySubscriptionRedeemResponseJson(bool, str);
    }

    public final Boolean getHas_active_subscription() {
        return this.has_active_subscription;
    }

    public final String getSubscription_tier_name() {
        return this.subscription_tier_name;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.has_active_subscription) * 31) + AnonymousClass005.A0H(this.subscription_tier_name);
    }

    public ComplimentarySubscriptionRedeemResponseJson(Boolean bool, String str) {
        this.has_active_subscription = bool;
        this.subscription_tier_name = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ComplimentarySubscriptionRedeemResponseJson(int i, Boolean bool, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.has_active_subscription = null;
        } else {
            this.has_active_subscription = bool;
        }
        if ((i & 2) == 0) {
            this.subscription_tier_name = null;
        } else {
            this.subscription_tier_name = str;
        }
    }

    public /* synthetic */ ComplimentarySubscriptionRedeemResponseJson(Boolean bool, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }

    public ComplimentarySubscriptionRedeemResponseJson() {
        this(null, null);
    }
}
