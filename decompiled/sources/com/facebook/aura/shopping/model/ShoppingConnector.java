package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
/* loaded from: classes4.dex */
public final class ShoppingConnector extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ShoppingConnectorCapabilities capabilities;
    public final String iconUrl;
    public final String id;
    public final String name;

    public final class Companion {
        public final C9hr<ShoppingConnector> serializer() {
            return ShoppingConnector$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingConnector) {
                ShoppingConnector shoppingConnector = (ShoppingConnector) obj;
                if (!C7384Etj.areEqual(this.id, shoppingConnector.id) || !C7384Etj.areEqual(this.name, shoppingConnector.name) || !C7384Etj.areEqual(this.iconUrl, shoppingConnector.iconUrl) || !C7384Etj.areEqual(this.capabilities, shoppingConnector.capabilities)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingConnector copy$default(ShoppingConnector shoppingConnector, String str, String str2, String str3, ShoppingConnectorCapabilities shoppingConnectorCapabilities, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingConnector.id;
        }
        if ((i & 2) != 0) {
            str2 = shoppingConnector.name;
        }
        if ((i & 4) != 0) {
            str3 = shoppingConnector.iconUrl;
        }
        if ((i & 8) != 0) {
            shoppingConnectorCapabilities = shoppingConnector.capabilities;
        }
        AnonymousClass003.A0w(str, shoppingConnectorCapabilities);
        return new ShoppingConnector(str, str2, str3, shoppingConnectorCapabilities);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingConnector shoppingConnector, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingConnector.id, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingConnector.name != null) {
            c9j5.AAP(shoppingConnector.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shoppingConnector.iconUrl != null) {
            c9j5.AAP(shoppingConnector.iconUrl, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C7384Etj.areEqual(shoppingConnector.capabilities, new ShoppingConnectorCapabilities(false))) {
            c9j5.AAQ(shoppingConnector.capabilities, ShoppingConnectorCapabilities$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final ShoppingConnectorCapabilities component4() {
        return this.capabilities;
    }

    public final ShoppingConnectorCapabilities getCapabilities() {
        return this.capabilities;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.capabilities, (((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass005.A0H(this.iconUrl)) * 31);
    }

    public ShoppingConnector(String str, String str2, String str3, ShoppingConnectorCapabilities shoppingConnectorCapabilities) {
        AnonymousClass003.A0w(str, shoppingConnectorCapabilities);
        this.id = str;
        this.name = str2;
        this.iconUrl = str3;
        this.capabilities = shoppingConnectorCapabilities;
    }

    public final ShoppingConnector copy(String str, String str2, String str3, ShoppingConnectorCapabilities shoppingConnectorCapabilities) {
        AnonymousClass003.A0w(str, shoppingConnectorCapabilities);
        return new ShoppingConnector(str, str2, str3, shoppingConnectorCapabilities);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingConnector(int i, String str, String str2, String str3, ShoppingConnectorCapabilities shoppingConnectorCapabilities, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ShoppingConnector$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str3;
        }
        if ((i & 8) == 0) {
            this.capabilities = new ShoppingConnectorCapabilities(false);
        } else {
            this.capabilities = shoppingConnectorCapabilities;
        }
    }

    public /* synthetic */ ShoppingConnector(String str, String str2, String str3, ShoppingConnectorCapabilities shoppingConnectorCapabilities, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new ShoppingConnectorCapabilities(false) : shoppingConnectorCapabilities);
    }
}
