package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt;
import com.facebook.aura.navigation.key.ConfidentialVmRegisterPinScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$-812809799$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$812809799$1 extends AbstractC7559F3s implements G0W<ConfidentialVmRegisterPinScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$812809799$1 INSTANCE = new ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$812809799$1();

    public ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$812809799$1() {
        super(3);
    }

    public final void invoke(ConfidentialVmRegisterPinScreenKey confidentialVmRegisterPinScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(confidentialVmRegisterPinScreenKey, 0);
        ConfidentialVmRegisterPinScreenKt.ConfidentialVmRegisterPinScreen(confidentialVmRegisterPinScreenKey.entryPoint, null, null, bfm, 0, 6);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmRegisterPinScreenKey confidentialVmRegisterPinScreenKey, BFM bfm, Integer num) {
        invoke(confidentialVmRegisterPinScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
