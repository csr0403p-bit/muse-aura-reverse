package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingResultsAttribution extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String iconUrl;
    public final String provider;
    public final String subtitle;
    public final String title;
    public final String website;

    public final class Companion {
        public final C9hr<ShoppingResultsAttribution> serializer() {
            return ShoppingResultsAttribution$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ShoppingResultsAttribution(String str, String str2, String str3, String str4, String str5) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.iconUrl = str2;
        this.provider = str3;
        this.subtitle = str4;
        this.website = str5;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingResultsAttribution shoppingResultsAttribution, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingResultsAttribution.title, c9iZ, 0);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(shoppingResultsAttribution.iconUrl, c07779iq, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingResultsAttribution.provider != null) {
            c9j5.AAP(shoppingResultsAttribution.provider, c07779iq, c9iZ, 2);
        }
        if (zAfR || shoppingResultsAttribution.subtitle != null) {
            c9j5.AAP(shoppingResultsAttribution.subtitle, c07779iq, c9iZ, 3);
        }
        if (zAfR || shoppingResultsAttribution.website != null) {
            c9j5.AAP(shoppingResultsAttribution.website, c07779iq, c9iZ, 4);
        }
    }

    public final ShoppingResultsAttribution copy(String str, String str2, String str3, String str4, String str5) {
        C7384Etj.A0Y(str, 0);
        return new ShoppingResultsAttribution(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultsAttribution) {
                ShoppingResultsAttribution shoppingResultsAttribution = (ShoppingResultsAttribution) obj;
                if (!C7384Etj.areEqual(this.title, shoppingResultsAttribution.title) || !C7384Etj.areEqual(this.iconUrl, shoppingResultsAttribution.iconUrl) || !C7384Etj.areEqual(this.provider, shoppingResultsAttribution.provider) || !C7384Etj.areEqual(this.subtitle, shoppingResultsAttribution.subtitle) || !C7384Etj.areEqual(this.website, shoppingResultsAttribution.website)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingResultsAttribution copy$default(ShoppingResultsAttribution shoppingResultsAttribution, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingResultsAttribution.title;
        }
        if ((i & 2) != 0) {
            str2 = shoppingResultsAttribution.iconUrl;
        }
        if ((i & 4) != 0) {
            str3 = shoppingResultsAttribution.provider;
        }
        if ((i & 8) != 0) {
            str4 = shoppingResultsAttribution.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = shoppingResultsAttribution.website;
        }
        return shoppingResultsAttribution.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.provider;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.website;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0G(this.provider)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass005.A0H(this.website);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingResultsAttribution(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ ShoppingResultsAttribution(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ShoppingResultsAttribution$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.title = str;
        this.iconUrl = str2;
        if ((i & 4) == 0) {
            this.provider = null;
        } else {
            this.provider = str3;
        }
        if ((i & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        if ((i & 16) == 0) {
            this.website = null;
        } else {
            this.website = str5;
        }
    }
}
