package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.DeliveryCheckoutSheetsKt;
import com.facebook.aura.navigation.key.DeliveryCheckoutStopSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$2043609504$1 extends AbstractC7559F3s implements G0W<DeliveryCheckoutStopSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$2043609504$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$2043609504$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$2043609504$1() {
        super(3);
    }

    public final void invoke(DeliveryCheckoutStopSheetKey deliveryCheckoutStopSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(deliveryCheckoutStopSheetKey, 0);
        DeliveryCheckoutSheetsKt.DeliveryCheckoutStopSheet(deliveryCheckoutStopSheetKey.approvalId, deliveryCheckoutStopSheetKey.stopId, null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(DeliveryCheckoutStopSheetKey deliveryCheckoutStopSheetKey, BFM bfm, Integer num) {
        invoke(deliveryCheckoutStopSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
