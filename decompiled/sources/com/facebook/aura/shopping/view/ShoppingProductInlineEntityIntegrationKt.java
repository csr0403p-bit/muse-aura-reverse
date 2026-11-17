package com.facebook.aura.shopping.view;

import X.AnonymousClass001;
import X.C31u;
import X.C60O;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.shopping.view.MC;

/* loaded from: classes4.dex */
public abstract class ShoppingProductInlineEntityIntegrationKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(ShoppingProductInlineEntityIntegrationKt.class, "productEntityChipsEnabled", "getProductEntityChipsEnabled()Z", 1);
    public static final C31u productEntityChipsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_product_entity_chips);

    public static final boolean getProductEntityChipsEnabled() {
        return AnonymousClass001.A1X(C31u.A00(productEntityChipsEnabled$delegate, $$delegatedProperties));
    }
}
