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
/* loaded from: classes2.dex */
public final class ViewerCtaConfirmationItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String icon;
    public final String subtext;
    public final String text;

    public final class Companion {
        public final C9hr<ViewerCtaConfirmationItemJson> serializer() {
            return ViewerCtaConfirmationItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCtaConfirmationItemJson viewerCtaConfirmationItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerCtaConfirmationItemJson.icon != null) {
            c9j5.AAP(viewerCtaConfirmationItemJson.icon, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerCtaConfirmationItemJson.text != null) {
            c9j5.AAP(viewerCtaConfirmationItemJson.text, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerCtaConfirmationItemJson.subtext != null) {
            c9j5.AAP(viewerCtaConfirmationItemJson.subtext, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerCtaConfirmationItemJson) {
                ViewerCtaConfirmationItemJson viewerCtaConfirmationItemJson = (ViewerCtaConfirmationItemJson) obj;
                if (!C7384Etj.areEqual(this.icon, viewerCtaConfirmationItemJson.icon) || !C7384Etj.areEqual(this.text, viewerCtaConfirmationItemJson.text) || !C7384Etj.areEqual(this.subtext, viewerCtaConfirmationItemJson.subtext)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerCtaConfirmationItemJson copy$default(ViewerCtaConfirmationItemJson viewerCtaConfirmationItemJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerCtaConfirmationItemJson.icon;
        }
        if ((i & 2) != 0) {
            str2 = viewerCtaConfirmationItemJson.text;
        }
        if ((i & 4) != 0) {
            str3 = viewerCtaConfirmationItemJson.subtext;
        }
        return new ViewerCtaConfirmationItemJson(str, str2, str3);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.subtext;
    }

    public final ViewerCtaConfirmationItemJson copy(String str, String str2, String str3) {
        return new ViewerCtaConfirmationItemJson(str, str2, str3);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.icon) * 31) + AnonymousClass006.A0G(this.text)) * 31) + AnonymousClass005.A0H(this.subtext);
    }

    public final SubscriptionConfirmationItem toDomain() {
        String str;
        String str2 = this.text;
        if (str2 == null || C7BY.A0j(str2) || (str = this.subtext) == null || C7BY.A0j(str)) {
            return null;
        }
        return new SubscriptionConfirmationItem(SubscriptionConfirmationIcon.Companion.fromServerValue(this.icon), str2, str);
    }

    public ViewerCtaConfirmationItemJson(String str, String str2, String str3) {
        this.icon = str;
        this.text = str2;
        this.subtext = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerCtaConfirmationItemJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = str2;
        }
        if ((i & 4) == 0) {
            this.subtext = null;
        } else {
            this.subtext = str3;
        }
    }

    public /* synthetic */ ViewerCtaConfirmationItemJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public ViewerCtaConfirmationItemJson() {
        this(null, null, null);
    }
}
