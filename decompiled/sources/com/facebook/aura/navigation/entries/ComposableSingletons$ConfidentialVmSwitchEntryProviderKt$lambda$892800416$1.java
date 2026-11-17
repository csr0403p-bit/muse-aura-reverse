package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmOffWaitlistSheetKt;
import com.facebook.aura.navigation.key.ConfidentialVmOffWaitlistSheetKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$892800416$1 extends AbstractC7559F3s implements G0W<ConfidentialVmOffWaitlistSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$892800416$1 INSTANCE = new ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$892800416$1();

    public ComposableSingletons$ConfidentialVmSwitchEntryProviderKt$lambda$892800416$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmOffWaitlistSheetKey confidentialVmOffWaitlistSheetKey, BFM bfm, Integer num) {
        invoke(confidentialVmOffWaitlistSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConfidentialVmOffWaitlistSheetKey confidentialVmOffWaitlistSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            ConfidentialVmOffWaitlistSheetKt.ConfidentialVmOffWaitlistSheet(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
