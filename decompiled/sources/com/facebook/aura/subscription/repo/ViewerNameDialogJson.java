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
public final class ViewerNameDialogJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<ViewerNameDialogJson> serializer() {
            return ViewerNameDialogJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerNameDialogJson viewerNameDialogJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerNameDialogJson.title != null) {
            c9j5.AAP(viewerNameDialogJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerNameDialogJson.subtitle != null) {
            c9j5.AAP(viewerNameDialogJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerNameDialogJson) {
                ViewerNameDialogJson viewerNameDialogJson = (ViewerNameDialogJson) obj;
                if (!C7384Etj.areEqual(this.title, viewerNameDialogJson.title) || !C7384Etj.areEqual(this.subtitle, viewerNameDialogJson.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerNameDialogJson copy$default(ViewerNameDialogJson viewerNameDialogJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerNameDialogJson.title;
        }
        if ((i & 2) != 0) {
            str2 = viewerNameDialogJson.subtitle;
        }
        return new ViewerNameDialogJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final ViewerNameDialogJson copy(String str, String str2) {
        return new ViewerNameDialogJson(str, str2);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.subtitle);
    }

    public final SubscriptionNameDialog toDomain() {
        String str;
        String str2 = this.title;
        if (str2 == null || C7BY.A0j(str2) || (str = this.subtitle) == null || C7BY.A0j(str)) {
            return null;
        }
        return new SubscriptionNameDialog(str2, str);
    }

    public ViewerNameDialogJson(String str, String str2) {
        this.title = str;
        this.subtitle = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerNameDialogJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
    }

    public /* synthetic */ ViewerNameDialogJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ViewerNameDialogJson() {
        this(null, null);
    }
}
