package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
/* loaded from: classes3.dex */
public final class ShoppingResultsAttributionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String icon_url;
    public final String provider;
    public final String subtitle;
    public final String title;
    public final String website;

    public final class Companion {
        public final C9hr<ShoppingResultsAttributionJson> serializer() {
            return ShoppingResultsAttributionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingResultsAttributionJson shoppingResultsAttributionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingResultsAttributionJson.provider)) {
            c9j5.AAV(shoppingResultsAttributionJson.provider, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingResultsAttributionJson.title)) {
            c9j5.AAV(shoppingResultsAttributionJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingResultsAttributionJson.icon_url)) {
            c9j5.AAV(shoppingResultsAttributionJson.icon_url, c9iZ, 2);
        }
        if (zAfR || shoppingResultsAttributionJson.subtitle != null) {
            c9j5.AAP(shoppingResultsAttributionJson.subtitle, LenientShoppingStringSerializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || shoppingResultsAttributionJson.website != null) {
            c9j5.AAP(shoppingResultsAttributionJson.website, LenientShoppingStringSerializer.INSTANCE, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultsAttributionJson) {
                ShoppingResultsAttributionJson shoppingResultsAttributionJson = (ShoppingResultsAttributionJson) obj;
                if (!C7384Etj.areEqual(this.provider, shoppingResultsAttributionJson.provider) || !C7384Etj.areEqual(this.title, shoppingResultsAttributionJson.title) || !C7384Etj.areEqual(this.icon_url, shoppingResultsAttributionJson.icon_url) || !C7384Etj.areEqual(this.subtitle, shoppingResultsAttributionJson.subtitle) || !C7384Etj.areEqual(this.website, shoppingResultsAttributionJson.website)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingResultsAttributionJson copy$default(ShoppingResultsAttributionJson shoppingResultsAttributionJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingResultsAttributionJson.provider;
        }
        if ((i & 2) != 0) {
            str2 = shoppingResultsAttributionJson.title;
        }
        if ((i & 4) != 0) {
            str3 = shoppingResultsAttributionJson.icon_url;
        }
        if ((i & 8) != 0) {
            str4 = shoppingResultsAttributionJson.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = shoppingResultsAttributionJson.website;
        }
        return shoppingResultsAttributionJson.copy(str, str2, str3, str4, str5);
    }

    @Serializable(with = LenientShoppingStringSerializer.class)
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @Serializable(with = LenientShoppingStringSerializer.class)
    public static /* synthetic */ void getWebsite$annotations() {
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

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.website;
    }

    public final String getIcon_url() {
        return this.icon_url;
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
        return ((AnonymousClass005.A0I(this.icon_url, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.provider))) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass005.A0H(this.website);
    }

    public final ShoppingResultsAttribution toDomain() {
        String strTrimToNonEmpty;
        if (C7BY.A0j(this.provider) || (strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(this.title)) == null) {
            return null;
        }
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(this.icon_url);
        String strA0l = AnonymousClass002.A0l(this.provider);
        String str = this.subtitle;
        return new ShoppingResultsAttribution(strTrimToNonEmpty, strTrimToNonEmpty2, strA0l, str != null ? ShoppingResultsPresentationJsonKt.toSingleLineOrNull(str) : null, ProductDetailsPresentationKt.httpsUrlOrNull(ProductDetailsPresentationKt.trimToNonEmpty(this.website)));
    }

    public ShoppingResultsAttributionJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        this.provider = str;
        this.title = str2;
        this.icon_url = str3;
        this.subtitle = str4;
        this.website = str5;
    }

    public final ShoppingResultsAttributionJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ShoppingResultsAttributionJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingResultsAttributionJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ ShoppingResultsAttributionJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
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

    public ShoppingResultsAttributionJson() {
        this("", "", "", null, null);
    }
}
