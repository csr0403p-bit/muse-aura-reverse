package com.facebook.aura.devices.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.devices.entries.ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$-961613358$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$961613358$1 extends AbstractC7559F3s implements G0W<HatchLinkOrderSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$961613358$1 INSTANCE = new ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$961613358$1();

    public ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$961613358$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchLinkOrderSheetKey hatchLinkOrderSheetKey, BFM bfm, Integer num) {
        invoke(hatchLinkOrderSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HatchLinkOrderSheetKey hatchLinkOrderSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchLinkOrderSheetKey, 0);
        HatchLinkOrderSheetKt.HatchLinkOrderSheet(hatchLinkOrderSheetKey.entryPoint, null, bfm, 0, 2);
    }
}
