package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.CheckoutInfoSheetKt;
import com.facebook.aura.navigation.key.CheckoutInfoSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1717035947$1 extends AbstractC7559F3s implements G0W<CheckoutInfoSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1717035947$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1717035947$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1717035947$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(CheckoutInfoSheetKey checkoutInfoSheetKey, BFM bfm, Integer num) {
        invoke(checkoutInfoSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(CheckoutInfoSheetKey checkoutInfoSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(checkoutInfoSheetKey, 0);
        CheckoutInfoSheetKt.CheckoutInfoSheet(checkoutInfoSheetKey.approvalId, null, bfm, 0, 2);
    }
}
