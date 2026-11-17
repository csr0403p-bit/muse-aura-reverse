package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingCartAttributionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String icon_url;
    public final String provider;
    public final String title;

    public final class Companion {
        public final C9hr<ShoppingCartAttributionJson> serializer() {
            return ShoppingCartAttributionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCartAttributionJson shoppingCartAttributionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingCartAttributionJson.provider)) {
            c9j5.AAV(shoppingCartAttributionJson.provider, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingCartAttributionJson.title)) {
            c9j5.AAV(shoppingCartAttributionJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingCartAttributionJson.icon_url)) {
            c9j5.AAV(shoppingCartAttributionJson.icon_url, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartAttributionJson) {
                ShoppingCartAttributionJson shoppingCartAttributionJson = (ShoppingCartAttributionJson) obj;
                if (!C7384Etj.areEqual(this.provider, shoppingCartAttributionJson.provider) || !C7384Etj.areEqual(this.title, shoppingCartAttributionJson.title) || !C7384Etj.areEqual(this.icon_url, shoppingCartAttributionJson.icon_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCartAttributionJson copy$default(ShoppingCartAttributionJson shoppingCartAttributionJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartAttributionJson.provider;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCartAttributionJson.title;
        }
        if ((i & 4) != 0) {
            str3 = shoppingCartAttributionJson.icon_url;
        }
        return shoppingCartAttributionJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.provider;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.icon_url;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.icon_url, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.provider)));
    }

    public final ShoppingResultsAttribution toDomain() {
        String strTrimToNonEmpty;
        if (C7BY.A0j(this.provider) || (strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(this.title)) == null) {
            return null;
        }
        return new ShoppingResultsAttribution(strTrimToNonEmpty, ProductDetailsPresentationKt.trimToNonEmpty(this.icon_url), AnonymousClass002.A0l(this.provider), null, null);
    }

    public ShoppingCartAttributionJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.provider = str;
        this.title = str2;
        this.icon_url = str3;
    }

    public final ShoppingCartAttributionJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ShoppingCartAttributionJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCartAttributionJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.provider = "";
        } else {
            this.provider = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.icon_url = "";
        } else {
            this.icon_url = str3;
        }
    }

    public /* synthetic */ ShoppingCartAttributionJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public ShoppingCartAttributionJson() {
        this("", "", "");
    }
}
