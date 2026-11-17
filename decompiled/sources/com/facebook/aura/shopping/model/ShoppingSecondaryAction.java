package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
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
public final class ShoppingSecondaryAction extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String url;

    public final class Companion {
        public final C9hr<ShoppingSecondaryAction> serializer() {
            return ShoppingSecondaryAction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingSecondaryAction shoppingSecondaryAction, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingSecondaryAction.label, c9iZ, 0);
        c9j5.AAV(shoppingSecondaryAction.url, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingSecondaryAction) {
                ShoppingSecondaryAction shoppingSecondaryAction = (ShoppingSecondaryAction) obj;
                if (!C7384Etj.areEqual(this.label, shoppingSecondaryAction.label) || !C7384Etj.areEqual(this.url, shoppingSecondaryAction.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingSecondaryAction copy$default(ShoppingSecondaryAction shoppingSecondaryAction, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingSecondaryAction.label;
        }
        if ((i & 2) != 0) {
            str2 = shoppingSecondaryAction.url;
        }
        AnonymousClass003.A0u(str, str2);
        return new ShoppingSecondaryAction(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.label));
    }

    public ShoppingSecondaryAction(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.url = str2;
    }

    public final ShoppingSecondaryAction copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ShoppingSecondaryAction(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingSecondaryAction(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ShoppingSecondaryAction$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.label = str;
        this.url = str2;
    }
}
