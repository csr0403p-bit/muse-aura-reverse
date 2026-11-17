package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingSecondaryActionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String type;
    public final String url;

    public final class Companion {
        public final C9hr<ShoppingSecondaryActionJson> serializer() {
            return ShoppingSecondaryActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingSecondaryActionJson shoppingSecondaryActionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingSecondaryActionJson.type)) {
            c9j5.AAV(shoppingSecondaryActionJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingSecondaryActionJson.label)) {
            c9j5.AAV(shoppingSecondaryActionJson.label, c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingSecondaryActionJson.url)) {
            c9j5.AAV(shoppingSecondaryActionJson.url, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingSecondaryActionJson) {
                ShoppingSecondaryActionJson shoppingSecondaryActionJson = (ShoppingSecondaryActionJson) obj;
                if (!C7384Etj.areEqual(this.type, shoppingSecondaryActionJson.type) || !C7384Etj.areEqual(this.label, shoppingSecondaryActionJson.label) || !C7384Etj.areEqual(this.url, shoppingSecondaryActionJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingSecondaryActionJson copy$default(ShoppingSecondaryActionJson shoppingSecondaryActionJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingSecondaryActionJson.type;
        }
        if ((i & 2) != 0) {
            str2 = shoppingSecondaryActionJson.label;
        }
        if ((i & 4) != 0) {
            str3 = shoppingSecondaryActionJson.url;
        }
        return shoppingSecondaryActionJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.url;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.type)));
    }

    public final ShoppingSecondaryAction toDomain() {
        String strTrimToNonEmpty;
        String strTrimToNonEmpty2;
        if (!C3cJ.A0J(this.type).equals("open_url") || (strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(this.label)) == null || (strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(this.url)) == null) {
            return null;
        }
        if (AnonymousClass006.A1b("https://", strTrimToNonEmpty2) || AnonymousClass006.A1b(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, strTrimToNonEmpty2)) {
            return new ShoppingSecondaryAction(strTrimToNonEmpty, strTrimToNonEmpty2);
        }
        return null;
    }

    public ShoppingSecondaryActionJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.type = str;
        this.label = str2;
        this.url = str3;
    }

    public final ShoppingSecondaryActionJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ShoppingSecondaryActionJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingSecondaryActionJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
    }

    public /* synthetic */ ShoppingSecondaryActionJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public ShoppingSecondaryActionJson() {
        this("", "", "");
    }
}
