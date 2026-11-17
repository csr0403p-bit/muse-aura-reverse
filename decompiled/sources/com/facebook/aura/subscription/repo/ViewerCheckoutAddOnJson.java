package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import java.util.Locale;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerCheckoutAddOnJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String subtitle;
    public final String type;

    public final class Companion {
        public final C9hr<ViewerCheckoutAddOnJson> serializer() {
            return ViewerCheckoutAddOnJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ViewerCheckoutAddOnJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.label = str2;
        this.subtitle = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCheckoutAddOnJson viewerCheckoutAddOnJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(viewerCheckoutAddOnJson.type)) {
            c9j5.AAV(viewerCheckoutAddOnJson.type, c9iZ, 0);
        }
        if (zAfR || viewerCheckoutAddOnJson.label != null) {
            c9j5.AAP(viewerCheckoutAddOnJson.label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerCheckoutAddOnJson.subtitle != null) {
            c9j5.AAP(viewerCheckoutAddOnJson.subtitle, C07779iq.A01, c9iZ, 2);
        }
    }

    public final ViewerCheckoutAddOnJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new ViewerCheckoutAddOnJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerCheckoutAddOnJson) {
                ViewerCheckoutAddOnJson viewerCheckoutAddOnJson = (ViewerCheckoutAddOnJson) obj;
                if (!C7384Etj.areEqual(this.type, viewerCheckoutAddOnJson.type) || !C7384Etj.areEqual(this.label, viewerCheckoutAddOnJson.label) || !C7384Etj.areEqual(this.subtitle, viewerCheckoutAddOnJson.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerCheckoutAddOnJson copy$default(ViewerCheckoutAddOnJson viewerCheckoutAddOnJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerCheckoutAddOnJson.type;
        }
        if ((i & 2) != 0) {
            str2 = viewerCheckoutAddOnJson.label;
        }
        if ((i & 4) != 0) {
            str3 = viewerCheckoutAddOnJson.subtitle;
        }
        return viewerCheckoutAddOnJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.subtitle);
    }

    public final SubscriptionCheckoutAddOn toDomain() {
        String strA0l;
        String strA0l2;
        String strA0l3 = AnonymousClass002.A0l(this.type);
        String str = null;
        if (strA0l3.length() <= 0) {
            return null;
        }
        Locale locale = Locale.ROOT;
        C7384Etj.A0V(locale);
        String upperCase = strA0l3.toUpperCase(locale);
        String str2 = this.label;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        String str3 = this.subtitle;
        if (str3 != null && (strA0l2 = AnonymousClass002.A0l(str3)) != null && strA0l2.length() > 0) {
            str = strA0l2;
        }
        return new SubscriptionCheckoutAddOn(upperCase, strA0l, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerCheckoutAddOnJson(int i, String str, String str2, String str3, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
    }

    public /* synthetic */ ViewerCheckoutAddOnJson(String str, String str2, String str3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public ViewerCheckoutAddOnJson() {
        this("", null, null);
    }
}
