package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.FlightCheckoutSummarySheetKt;
import com.facebook.aura.navigation.key.FlightCheckoutSummarySheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$424295232$1 extends AbstractC7559F3s implements G0W<FlightCheckoutSummarySheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$424295232$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$424295232$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$424295232$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FlightCheckoutSummarySheetKey flightCheckoutSummarySheetKey, BFM bfm, Integer num) {
        invoke(flightCheckoutSummarySheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FlightCheckoutSummarySheetKey flightCheckoutSummarySheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(flightCheckoutSummarySheetKey, 0);
        FlightCheckoutSummarySheetKt.FlightCheckoutSummarySheet(flightCheckoutSummarySheetKey.approvalId, null, bfm, 0, 2);
    }
}
