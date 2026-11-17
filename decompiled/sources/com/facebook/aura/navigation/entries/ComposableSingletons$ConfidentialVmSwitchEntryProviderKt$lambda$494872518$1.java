package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferResumeOverlayScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$-494872518$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$494872518$1 extends AbstractC7559F3s implements G0W<ConfidentialVmDataTransferResumeOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$494872518$1 INSTANCE = new ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$494872518$1();

    public ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$494872518$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmDataTransferResumeOverlayScreenKey confidentialVmDataTransferResumeOverlayScreenKey, BFM bfm, Integer num) {
        invoke(confidentialVmDataTransferResumeOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConfidentialVmDataTransferResumeOverlayScreenKey confidentialVmDataTransferResumeOverlayScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(confidentialVmDataTransferResumeOverlayScreenKey, 0);
        ConfidentialVmSwitchProgressScreenKt.ConfidentialVmDataTransferResumeScreen(confidentialVmDataTransferResumeOverlayScreenKey.direction, null, null, bfm, 0, 6);
    }
}
