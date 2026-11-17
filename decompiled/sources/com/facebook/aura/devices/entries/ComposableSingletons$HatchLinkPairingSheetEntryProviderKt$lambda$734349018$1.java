package com.facebook.aura.devices.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.devices.link.HatchLinkPairingSheetKt;
import com.facebook.aura.navigation.key.HatchLinkPairingSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.devices.entries.ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$-734349018$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$734349018$1 extends AbstractC7559F3s implements G0W<HatchLinkPairingSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$734349018$1 INSTANCE = new ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$734349018$1();

    public ComposableSingletons$HatchLinkPairingSheetEntryProviderKt$lambda$734349018$1() {
        super(3);
    }

    public final void invoke(HatchLinkPairingSheetKey hatchLinkPairingSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchLinkPairingSheetKey, 0);
        HatchLinkPairingSheetKt.HatchLinkPairingSheet(hatchLinkPairingSheetKey.purpose, hatchLinkPairingSheetKey.fromDeeplink, hatchLinkPairingSheetKey.presentationId, hatchLinkPairingSheetKey.setUpAgainAddress, null, bfm, 0, 16);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchLinkPairingSheetKey hatchLinkPairingSheetKey, BFM bfm, Integer num) {
        invoke(hatchLinkPairingSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
