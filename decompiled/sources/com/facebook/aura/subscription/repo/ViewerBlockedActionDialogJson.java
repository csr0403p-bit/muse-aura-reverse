package com.facebook.aura.subscription.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerBlockedActionDialogJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String body;
    public final String title;

    public final class Companion {
        public final C9hr<ViewerBlockedActionDialogJson> serializer() {
            return ViewerBlockedActionDialogJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerBlockedActionDialogJson viewerBlockedActionDialogJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerBlockedActionDialogJson.title != null) {
            c9j5.AAP(viewerBlockedActionDialogJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerBlockedActionDialogJson.body != null) {
            c9j5.AAP(viewerBlockedActionDialogJson.body, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerBlockedActionDialogJson) {
                ViewerBlockedActionDialogJson viewerBlockedActionDialogJson = (ViewerBlockedActionDialogJson) obj;
                if (!C7384Etj.areEqual(this.title, viewerBlockedActionDialogJson.title) || !C7384Etj.areEqual(this.body, viewerBlockedActionDialogJson.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerBlockedActionDialogJson copy$default(ViewerBlockedActionDialogJson viewerBlockedActionDialogJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerBlockedActionDialogJson.title;
        }
        if ((i & 2) != 0) {
            str2 = viewerBlockedActionDialogJson.body;
        }
        return new ViewerBlockedActionDialogJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final ViewerBlockedActionDialogJson copy(String str, String str2) {
        return new ViewerBlockedActionDialogJson(str, str2);
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

    public final SubscriptionBlockedActionDialog toDomain() {
        String str;
        String str2 = this.title;
        if (str2 == null || C7BY.A0j(str2) || (str = this.body) == null || C7BY.A0j(str)) {
            return null;
        }
        return new SubscriptionBlockedActionDialog(str2, str);
    }

    public ViewerBlockedActionDialogJson(String str, String str2) {
        this.title = str;
        this.body = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerBlockedActionDialogJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = null;
        } else {
            this.body = str2;
        }
    }

    public /* synthetic */ ViewerBlockedActionDialogJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ViewerBlockedActionDialogJson() {
        this(null, null);
    }
}
