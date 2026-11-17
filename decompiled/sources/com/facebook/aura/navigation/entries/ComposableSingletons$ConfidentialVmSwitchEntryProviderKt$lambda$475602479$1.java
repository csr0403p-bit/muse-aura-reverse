package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchProgressScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$475602479$1 extends AbstractC7559F3s implements G0W<ConfidentialVmSwitchProgressScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$475602479$1 INSTANCE = new ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$475602479$1();

    public ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$475602479$1() {
        super(3);
    }

    public final void invoke(ConfidentialVmSwitchProgressScreenKey confidentialVmSwitchProgressScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(confidentialVmSwitchProgressScreenKey, 0);
        ConfidentialVmSwitchProgressScreenKt.ConfidentialVmSwitchProgressScreen(confidentialVmSwitchProgressScreenKey.direction, null, null, bfm, 0, 6);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmSwitchProgressScreenKey confidentialVmSwitchProgressScreenKey, BFM bfm, Integer num) {
        invoke(confidentialVmSwitchProgressScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
