package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferProgressScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$-2046668626$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$2046668626$1 extends AbstractC7559F3s implements G0W<ConfidentialVmDataTransferProgressScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$2046668626$1 INSTANCE = new ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$2046668626$1();

    public ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$2046668626$1() {
        super(3);
    }

    public final void invoke(ConfidentialVmDataTransferProgressScreenKey confidentialVmDataTransferProgressScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(confidentialVmDataTransferProgressScreenKey, 0);
        ConfidentialVmSwitchProgressScreenKt.ConfidentialVmDataTransferProgressScreen(confidentialVmDataTransferProgressScreenKey.direction, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmDataTransferProgressScreenKey confidentialVmDataTransferProgressScreenKey, BFM bfm, Integer num) {
        invoke(confidentialVmDataTransferProgressScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
