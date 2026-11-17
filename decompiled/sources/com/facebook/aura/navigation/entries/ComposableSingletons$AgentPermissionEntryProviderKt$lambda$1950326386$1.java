package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt;
import com.facebook.aura.navigation.key.CheckoutPayWithLinkSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1950326386$1 extends AbstractC7559F3s implements G0W<CheckoutPayWithLinkSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1950326386$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1950326386$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1950326386$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(CheckoutPayWithLinkSheetKey checkoutPayWithLinkSheetKey, BFM bfm, Integer num) {
        invoke(checkoutPayWithLinkSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(CheckoutPayWithLinkSheetKey checkoutPayWithLinkSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(checkoutPayWithLinkSheetKey, 0);
        CheckoutPayWithLinkSheetKt.CheckoutPayWithLinkSheet(checkoutPayWithLinkSheetKey.approvalId, bfm, 0);
    }
}
