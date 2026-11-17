package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingConnectorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ShoppingConnectorCapabilitiesJson capabilities;
    public final String icon_url;
    public final String id;
    public final String name;

    public final class Companion {
        public final C9hr<ShoppingConnectorJson> serializer() {
            return ShoppingConnectorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingConnectorJson shoppingConnectorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingConnectorJson.id)) {
            c9j5.AAV(shoppingConnectorJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingConnectorJson.name)) {
            c9j5.AAV(shoppingConnectorJson.name, c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingConnectorJson.icon_url)) {
            c9j5.AAV(shoppingConnectorJson.icon_url, c9iZ, 2);
        }
        if (zAfR || shoppingConnectorJson.capabilities != null) {
            c9j5.AAP(shoppingConnectorJson.capabilities, LenientShoppingConnectorCapabilitiesSerializer.INSTANCE, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingConnectorJson) {
                ShoppingConnectorJson shoppingConnectorJson = (ShoppingConnectorJson) obj;
                if (!C7384Etj.areEqual(this.id, shoppingConnectorJson.id) || !C7384Etj.areEqual(this.name, shoppingConnectorJson.name) || !C7384Etj.areEqual(this.icon_url, shoppingConnectorJson.icon_url) || !C7384Etj.areEqual(this.capabilities, shoppingConnectorJson.capabilities)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingConnectorJson copy$default(ShoppingConnectorJson shoppingConnectorJson, String str, String str2, String str3, ShoppingConnectorCapabilitiesJson shoppingConnectorCapabilitiesJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingConnectorJson.id;
        }
        if ((i & 2) != 0) {
            str2 = shoppingConnectorJson.name;
        }
        if ((i & 4) != 0) {
            str3 = shoppingConnectorJson.icon_url;
        }
        if ((i & 8) != 0) {
            shoppingConnectorCapabilitiesJson = shoppingConnectorJson.capabilities;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new ShoppingConnectorJson(str, str2, str3, shoppingConnectorCapabilitiesJson);
    }

    @Serializable(with = LenientShoppingConnectorCapabilitiesSerializer.class)
    public static /* synthetic */ void getCapabilities$annotations() {
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.icon_url;
    }

    public final ShoppingConnectorCapabilitiesJson component4() {
        return this.capabilities;
    }

    public final ShoppingConnectorCapabilitiesJson getCapabilities() {
        return this.capabilities;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.icon_url, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0D(this.capabilities);
    }

    public final ShoppingConnector toDomain() {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(this.id);
        if (strTrimToNonEmpty == null) {
            return null;
        }
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(this.name);
        String strTrimToNonEmpty3 = ProductDetailsPresentationKt.trimToNonEmpty(this.icon_url);
        ShoppingConnectorCapabilitiesJson shoppingConnectorCapabilitiesJson = this.capabilities;
        return new ShoppingConnector(strTrimToNonEmpty, strTrimToNonEmpty2, strTrimToNonEmpty3, new ShoppingConnectorCapabilities(shoppingConnectorCapabilitiesJson != null ? shoppingConnectorCapabilitiesJson.product_details : false));
    }

    public /* synthetic */ ShoppingConnectorJson(int i, String str, String str2, String str3, ShoppingConnectorCapabilitiesJson shoppingConnectorCapabilitiesJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.icon_url = "";
        } else {
            this.icon_url = str3;
        }
        if ((i & 8) == 0) {
            this.capabilities = null;
        } else {
            this.capabilities = shoppingConnectorCapabilitiesJson;
        }
    }

    public final ShoppingConnectorJson copy(String str, String str2, String str3, ShoppingConnectorCapabilitiesJson shoppingConnectorCapabilitiesJson) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ShoppingConnectorJson(str, str2, str3, shoppingConnectorCapabilitiesJson);
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingConnectorJson(String str, String str2, String str3, ShoppingConnectorCapabilitiesJson shoppingConnectorCapabilitiesJson) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.name = str2;
        this.icon_url = str3;
        this.capabilities = shoppingConnectorCapabilitiesJson;
    }

    public /* synthetic */ ShoppingConnectorJson(String str, String str2, String str3, ShoppingConnectorCapabilitiesJson shoppingConnectorCapabilitiesJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : shoppingConnectorCapabilitiesJson);
    }

    public ShoppingConnectorJson() {
        this("", "", "", null);
    }
}
