package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.ReservationCheckoutDetailsSheetKt;
import com.facebook.aura.navigation.key.ReservationCheckoutDetailsSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1324493131$1 extends AbstractC7559F3s implements G0W<ReservationCheckoutDetailsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1324493131$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1324493131$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1324493131$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ReservationCheckoutDetailsSheetKey reservationCheckoutDetailsSheetKey, BFM bfm, Integer num) {
        invoke(reservationCheckoutDetailsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ReservationCheckoutDetailsSheetKey reservationCheckoutDetailsSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(reservationCheckoutDetailsSheetKey, 0);
        ReservationCheckoutDetailsSheetKt.ReservationCheckoutDetailsSheet(reservationCheckoutDetailsSheetKey.approvalId, null, bfm, 0, 2);
    }
}
