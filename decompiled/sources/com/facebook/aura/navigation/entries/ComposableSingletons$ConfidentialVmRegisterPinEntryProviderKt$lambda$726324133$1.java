package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.ConfidentialVmResetConfirmationBottomSheetKey;
import com.facebook.aura.settings.ResetConfirmSheetKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$726324133$1 extends AbstractC7559F3s implements G0W<ConfidentialVmResetConfirmationBottomSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$726324133$1 INSTANCE = new ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$726324133$1();

    public ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$726324133$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmResetConfirmationBottomSheetKey confidentialVmResetConfirmationBottomSheetKey, BFM bfm, Integer num) {
        invoke(confidentialVmResetConfirmationBottomSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConfidentialVmResetConfirmationBottomSheetKey confidentialVmResetConfirmationBottomSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            ResetConfirmSheetKt.ResetConfirmSheet(HatchSurface.CVM_PIN_RECOVERY, null, false, bfm, 6, 6);
        } else {
            bfm.Afo();
        }
    }
}
