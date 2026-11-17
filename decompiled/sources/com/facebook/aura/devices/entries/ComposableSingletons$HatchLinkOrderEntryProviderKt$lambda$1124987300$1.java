package com.facebook.aura.devices.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.navigation.key.HatchLinkActivationDelayedDialogKey;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$1124987300$1 extends AbstractC7559F3s implements G0W<HatchLinkActivationDelayedDialogKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$1124987300$1 INSTANCE = new ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$1124987300$1();

    public ComposableSingletons$HatchLinkOrderEntryProviderKt$lambda$1124987300$1() {
        super(3);
    }

    public final void invoke(HatchLinkActivationDelayedDialogKey hatchLinkActivationDelayedDialogKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchLinkOrderSheetKt.HatchLinkActivationDelayedDialog(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchLinkActivationDelayedDialogKey hatchLinkActivationDelayedDialogKey, BFM bfm, Integer num) {
        invoke(hatchLinkActivationDelayedDialogKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
