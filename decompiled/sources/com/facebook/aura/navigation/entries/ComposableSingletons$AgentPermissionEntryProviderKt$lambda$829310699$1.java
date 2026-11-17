package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.CheckoutWalletSheetKt;
import com.facebook.aura.navigation.key.CheckoutWalletCardSelectionSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AgentPermissionEntryProviderKt$lambda$-829310699$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$829310699$1 extends AbstractC7559F3s implements G0W<CheckoutWalletCardSelectionSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$829310699$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$829310699$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$829310699$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(CheckoutWalletCardSelectionSheetKey checkoutWalletCardSelectionSheetKey, BFM bfm, Integer num) {
        invoke(checkoutWalletCardSelectionSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(CheckoutWalletCardSelectionSheetKey checkoutWalletCardSelectionSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(checkoutWalletCardSelectionSheetKey, 0);
        CheckoutWalletSheetKt.CheckoutWalletCardSelectionSheet(checkoutWalletCardSelectionSheetKey.approvalId, checkoutWalletCardSelectionSheetKey.paymentMethod, bfm, 0);
    }
}
