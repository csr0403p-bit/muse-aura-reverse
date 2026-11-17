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
public final class ViewerCrossPlatformDialogJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String body;
    public final String title;

    public final class Companion {
        public final C9hr<ViewerCrossPlatformDialogJson> serializer() {
            return ViewerCrossPlatformDialogJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerCrossPlatformDialogJson.title != null) {
            c9j5.AAP(viewerCrossPlatformDialogJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerCrossPlatformDialogJson.body != null) {
            c9j5.AAP(viewerCrossPlatformDialogJson.body, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerCrossPlatformDialogJson) {
                ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson = (ViewerCrossPlatformDialogJson) obj;
                if (!C7384Etj.areEqual(this.title, viewerCrossPlatformDialogJson.title) || !C7384Etj.areEqual(this.body, viewerCrossPlatformDialogJson.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerCrossPlatformDialogJson copy$default(ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerCrossPlatformDialogJson.title;
        }
        if ((i & 2) != 0) {
            str2 = viewerCrossPlatformDialogJson.body;
        }
        return new ViewerCrossPlatformDialogJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final ViewerCrossPlatformDialogJson copy(String str, String str2) {
        return new ViewerCrossPlatformDialogJson(str, str2);
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

    public final SubscriptionCrossPlatformDialog toDomain() {
        String str = this.title;
        String str2 = null;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        String str3 = this.body;
        if (str3 != null && !C7BY.A0j(str3)) {
            str2 = str3;
        }
        return new SubscriptionCrossPlatformDialog(str, str2);
    }

    public ViewerCrossPlatformDialogJson(String str, String str2) {
        this.title = str;
        this.body = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerCrossPlatformDialogJson(int i, String str, String str2, C2hx c2hx) {
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

    public /* synthetic */ ViewerCrossPlatformDialogJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ViewerCrossPlatformDialogJson() {
        this(null, null);
    }
}
