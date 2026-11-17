package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.agentpermission.FlightCheckoutLegSheetKt;
import com.facebook.aura.navigation.key.FlightCheckoutLegSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AgentPermissionEntryProviderKt$lambda$-1369321337$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1369321337$1 extends AbstractC7559F3s implements G0W<FlightCheckoutLegSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1369321337$1 INSTANCE = new ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1369321337$1();

    public ComposableSingletons$AgentPermissionEntryProviderKt$lambda$1369321337$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FlightCheckoutLegSheetKey flightCheckoutLegSheetKey, BFM bfm, Integer num) {
        invoke(flightCheckoutLegSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FlightCheckoutLegSheetKey flightCheckoutLegSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(flightCheckoutLegSheetKey, 0);
        FlightCheckoutLegSheetKt.FlightCheckoutLegSheet(flightCheckoutLegSheetKey.approvalId, flightCheckoutLegSheetKey.sliceIndex, bfm, 0);
    }
}
