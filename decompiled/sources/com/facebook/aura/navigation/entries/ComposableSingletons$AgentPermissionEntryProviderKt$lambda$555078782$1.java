package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.CheckoutWalletSheetKt;
import com.facebook.aura.navigation.key.CheckoutWalletSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$555078782$1 extends AbstractC7559F3s implements G0W<CheckoutWalletSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$555078782$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$555078782$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$555078782$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(CheckoutWalletSheetKey checkoutWalletSheetKey, BFM bfm, Integer num) {
        invoke(checkoutWalletSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(CheckoutWalletSheetKey checkoutWalletSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(checkoutWalletSheetKey, 0);
        CheckoutWalletSheetKt.CheckoutWalletSheet(checkoutWalletSheetKey.approvalId, bfm, 0);
    }
}
