package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.CheckoutApprovalSummarySheetKt;
import com.facebook.aura.navigation.key.ShopifyCheckoutSummarySheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AgentPermissionEntryProviderKt$lambda$-1760263614$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1760263614$1 extends AbstractC7559F3s implements G0W<ShopifyCheckoutSummarySheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1760263614$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1760263614$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1760263614$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ShopifyCheckoutSummarySheetKey shopifyCheckoutSummarySheetKey, BFM bfm, Integer num) {
        invoke(shopifyCheckoutSummarySheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ShopifyCheckoutSummarySheetKey shopifyCheckoutSummarySheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(shopifyCheckoutSummarySheetKey, 0);
        CheckoutApprovalSummarySheetKt.CheckoutApprovalSummarySheet(shopifyCheckoutSummarySheetKey.approvalId, bfm, 0);
    }
}
