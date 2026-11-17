package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.C31u;
import X.C60O;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.shopping.repo.MC;

/* loaded from: classes3.dex */
public abstract class HatchSavedProductsRepositoryKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchSavedProductsRepositoryKt.class, "isEnabled", "<v#0>", 1);

    public static final boolean isProductSaveEnabled() {
        return isProductSaveEnabled$lambda$0(AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_shopping.enable_pdp_save_button));
    }

    public static final boolean isProductSaveEnabled$lambda$0(C31u<Object, Boolean> c31u) {
        return AnonymousClass001.A1X(C31u.A00(c31u, $$delegatedProperties));
    }
}
