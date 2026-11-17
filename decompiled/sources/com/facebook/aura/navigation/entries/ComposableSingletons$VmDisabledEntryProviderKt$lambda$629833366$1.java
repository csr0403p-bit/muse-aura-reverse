package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.VmRecoveryFlowPreviewScreenKey;
import com.facebook.aura.vmdisabled.content.VmRecoveryFlowPreviewScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$VmDisabledEntryProviderKt$lambda$-629833366$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$VmDisabledEntryProviderKt$lambda$629833366$1 extends AbstractC7559F3s implements G0W<VmRecoveryFlowPreviewScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VmDisabledEntryProviderKt$lambda$629833366$1 INSTANCE = new ComposableSingletons$VmDisabledEntryProviderKt$lambda$629833366$1();

    public ComposableSingletons$VmDisabledEntryProviderKt$lambda$629833366$1() {
        super(3);
    }

    public final void invoke(VmRecoveryFlowPreviewScreenKey vmRecoveryFlowPreviewScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(vmRecoveryFlowPreviewScreenKey, 0);
        VmRecoveryFlowPreviewScreenKt.VmRecoveryFlowPreviewScreen(vmRecoveryFlowPreviewScreenKey.flowType, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VmRecoveryFlowPreviewScreenKey vmRecoveryFlowPreviewScreenKey, BFM bfm, Integer num) {
        invoke(vmRecoveryFlowPreviewScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
