package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt;
import com.facebook.aura.navigation.key.ConfidentialVmSetupLoginScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$919517867$1 extends AbstractC7559F3s implements G0W<ConfidentialVmSetupLoginScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$919517867$1 INSTANCE = new ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$919517867$1();

    public ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$919517867$1() {
        super(3);
    }

    public final void invoke(ConfidentialVmSetupLoginScreenKey confidentialVmSetupLoginScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(confidentialVmSetupLoginScreenKey, 0);
        ConfidentialVmLoginScreenKt.ConfidentialVmLoginScreen(null, confidentialVmSetupLoginScreenKey.entryPoint, null, bfm, 0, 5);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmSetupLoginScreenKey confidentialVmSetupLoginScreenKey, BFM bfm, Integer num) {
        invoke(confidentialVmSetupLoginScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
