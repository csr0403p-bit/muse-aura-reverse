package com.facebook.aura.subscription.repo;

import X.AbstractC0878AGe;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import java.util.Locale;
import java.util.Set;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerChangeResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String change_status;
    public final ViewerSubscriptionResponseJson subscription;

    public final class Companion {
        public final C9hr<ViewerChangeResponseJson> serializer() {
            return ViewerChangeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerChangeResponseJson viewerChangeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerChangeResponseJson.change_status != null) {
            c9j5.AAP(viewerChangeResponseJson.change_status, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerChangeResponseJson.subscription != null) {
            c9j5.AAP(viewerChangeResponseJson.subscription, ViewerSubscriptionResponseJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerChangeResponseJson) {
                ViewerChangeResponseJson viewerChangeResponseJson = (ViewerChangeResponseJson) obj;
                if (!C7384Etj.areEqual(this.change_status, viewerChangeResponseJson.change_status) || !C7384Etj.areEqual(this.subscription, viewerChangeResponseJson.subscription)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerChangeResponseJson copy$default(ViewerChangeResponseJson viewerChangeResponseJson, String str, ViewerSubscriptionResponseJson viewerSubscriptionResponseJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerChangeResponseJson.change_status;
        }
        if ((i & 2) != 0) {
            viewerSubscriptionResponseJson = viewerChangeResponseJson.subscription;
        }
        return new ViewerChangeResponseJson(str, viewerSubscriptionResponseJson);
    }

    public final String component1() {
        return this.change_status;
    }

    public final ViewerSubscriptionResponseJson component2() {
        return this.subscription;
    }

    public final ViewerChangeResponseJson copy(String str, ViewerSubscriptionResponseJson viewerSubscriptionResponseJson) {
        return new ViewerChangeResponseJson(str, viewerSubscriptionResponseJson);
    }

    public final String getChange_status() {
        return this.change_status;
    }

    public final ViewerSubscriptionResponseJson getSubscription() {
        return this.subscription;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.change_status) * 31) + C3cH.A02(this.subscription);
    }

    public final boolean needsReread() {
        Set<String> set = AuraSubscriptionRepositoryJsonKt.SETTLED_CHANGE_STATUSES;
        return !AbstractC0878AGe.A0k(set, this.change_status != null ? r1.toUpperCase(Locale.ROOT) : null);
    }

    public ViewerChangeResponseJson(String str, ViewerSubscriptionResponseJson viewerSubscriptionResponseJson) {
        this.change_status = str;
        this.subscription = viewerSubscriptionResponseJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerChangeResponseJson(int i, String str, ViewerSubscriptionResponseJson viewerSubscriptionResponseJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.change_status = null;
        } else {
            this.change_status = str;
        }
        if ((i & 2) == 0) {
            this.subscription = null;
        } else {
            this.subscription = viewerSubscriptionResponseJson;
        }
    }

    public /* synthetic */ ViewerChangeResponseJson(String str, ViewerSubscriptionResponseJson viewerSubscriptionResponseJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : viewerSubscriptionResponseJson);
    }

    public ViewerChangeResponseJson() {
        this(null, null);
    }
}
