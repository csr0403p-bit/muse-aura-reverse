package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingResponseEnvelopeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ProductDetailsResponseJson data;
    public final Boolean is_tryon_eligible;
    public final String type;

    public final class Companion {
        public final C9hr<ShoppingResponseEnvelopeJson> serializer() {
            return ShoppingResponseEnvelopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ShoppingResponseEnvelopeJson(String str, ProductDetailsResponseJson productDetailsResponseJson, Boolean bool) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.data = productDetailsResponseJson;
        this.is_tryon_eligible = bool;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ShoppingResponseEnvelopeJson shoppingResponseEnvelopeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(shoppingResponseEnvelopeJson.type)) {
            c9j5.AAV(shoppingResponseEnvelopeJson.type, c9iZ, 0);
        }
        if (zAfR || shoppingResponseEnvelopeJson.data != null) {
            c9j5.AAP(shoppingResponseEnvelopeJson.data, ProductDetailsResponseJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || shoppingResponseEnvelopeJson.is_tryon_eligible != null) {
            c9j5.AAP(shoppingResponseEnvelopeJson.is_tryon_eligible, C07839ix.A00, c9iZ, 2);
        }
    }

    public final ShoppingResponseEnvelopeJson copy(String str, ProductDetailsResponseJson productDetailsResponseJson, Boolean bool) {
        C7384Etj.A0Y(str, 0);
        return new ShoppingResponseEnvelopeJson(str, productDetailsResponseJson, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResponseEnvelopeJson) {
                ShoppingResponseEnvelopeJson shoppingResponseEnvelopeJson = (ShoppingResponseEnvelopeJson) obj;
                if (!C7384Etj.areEqual(this.type, shoppingResponseEnvelopeJson.type) || !C7384Etj.areEqual(this.data, shoppingResponseEnvelopeJson.data) || !C7384Etj.areEqual(this.is_tryon_eligible, shoppingResponseEnvelopeJson.is_tryon_eligible)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingResponseEnvelopeJson copy$default(ShoppingResponseEnvelopeJson shoppingResponseEnvelopeJson, String str, ProductDetailsResponseJson productDetailsResponseJson, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingResponseEnvelopeJson.type;
        }
        if ((i & 2) != 0) {
            productDetailsResponseJson = shoppingResponseEnvelopeJson.data;
        }
        if ((i & 4) != 0) {
            bool = shoppingResponseEnvelopeJson.is_tryon_eligible;
        }
        return shoppingResponseEnvelopeJson.copy(str, productDetailsResponseJson, bool);
    }

    public final String component1() {
        return this.type;
    }

    public final ProductDetailsResponseJson component2() {
        return this.data;
    }

    public final Boolean component3() {
        return this.is_tryon_eligible;
    }

    public final ProductDetailsResponseJson getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0D(this.data)) * 31) + C3cH.A02(this.is_tryon_eligible);
    }

    public final Boolean is_tryon_eligible() {
        return this.is_tryon_eligible;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingResponseEnvelopeJson(int i, String str, ProductDetailsResponseJson productDetailsResponseJson, Boolean bool, C2hx c2hx) {
        this.type = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.data = null;
        } else {
            this.data = productDetailsResponseJson;
        }
        if ((i & 4) == 0) {
            this.is_tryon_eligible = null;
        } else {
            this.is_tryon_eligible = bool;
        }
    }

    public /* synthetic */ ShoppingResponseEnvelopeJson(String str, ProductDetailsResponseJson productDetailsResponseJson, Boolean bool, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : productDetailsResponseJson, (i & 4) != 0 ? null : bool);
    }

    public ShoppingResponseEnvelopeJson() {
        this("", null, null);
    }
}
