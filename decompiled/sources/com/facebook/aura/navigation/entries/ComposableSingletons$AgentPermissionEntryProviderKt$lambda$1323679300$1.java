package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.CheckoutApprovalCartSheetKt;
import com.facebook.aura.navigation.key.ShopifyCheckoutCartSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1323679300$1 extends AbstractC7559F3s implements G0W<ShopifyCheckoutCartSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1323679300$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1323679300$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1323679300$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ShopifyCheckoutCartSheetKey shopifyCheckoutCartSheetKey, BFM bfm, Integer num) {
        invoke(shopifyCheckoutCartSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ShopifyCheckoutCartSheetKey shopifyCheckoutCartSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(shopifyCheckoutCartSheetKey, 0);
        CheckoutApprovalCartSheetKt.CheckoutApprovalCartSheet(shopifyCheckoutCartSheetKey.approvalId, bfm, 0);
    }
}
