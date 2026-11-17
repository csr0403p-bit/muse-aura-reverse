package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroScreenKt;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchIntroScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$-25074449$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$25074449$1 extends AbstractC7559F3s implements G0W<ConfidentialVmSwitchIntroScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$25074449$1 INSTANCE = new ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$25074449$1();

    public ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$25074449$1() {
        super(3);
    }

    public final void invoke(ConfidentialVmSwitchIntroScreenKey confidentialVmSwitchIntroScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(confidentialVmSwitchIntroScreenKey, 0);
        ConfidentialVmSwitchIntroScreenKt.ConfidentialVmSwitchIntroScreen(confidentialVmSwitchIntroScreenKey.entryPoint, null, null, bfm, 0, 6);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmSwitchIntroScreenKey confidentialVmSwitchIntroScreenKey, BFM bfm, Integer num) {
        invoke(confidentialVmSwitchIntroScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
