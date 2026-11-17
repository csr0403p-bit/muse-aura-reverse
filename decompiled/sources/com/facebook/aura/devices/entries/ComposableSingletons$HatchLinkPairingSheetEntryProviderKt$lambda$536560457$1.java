package com.facebook.aura.devices.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.devices.link.HatchLinkPairingSheetKt;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.devices.entries.ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$-536560457$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$536560457$1 extends AbstractC7559F3s implements G0W<HatchLinkActivePairingSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$536560457$1 INSTANCE = new ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$536560457$1();

    public ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$536560457$1() {
        super(3);
    }

    public final void invoke(HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchLinkActivePairingSheetKey, 0);
        HatchLinkPairingSheetKt.HatchLinkActivePairingSheet(hatchLinkActivePairingSheetKey.purpose, hatchLinkActivePairingSheetKey.fromDeeplink, hatchLinkActivePairingSheetKey.presentationId, null, bfm, 0, 8);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey, BFM bfm, Integer num) {
        invoke(hatchLinkActivePairingSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
