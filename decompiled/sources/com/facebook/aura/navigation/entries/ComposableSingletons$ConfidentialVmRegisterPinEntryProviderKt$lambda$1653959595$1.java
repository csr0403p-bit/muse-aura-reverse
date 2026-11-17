package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt;
import com.facebook.aura.navigation.key.ConfidentialVmPinHelpBottomSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$-1653959595$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$1653959595$1 extends AbstractC7559F3s implements G0W<ConfidentialVmPinHelpBottomSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$1653959595$1 INSTANCE = new ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$1653959595$1();

    public ComposableSingletons$ConfidentialVmRegisterPinEntryProviderKt$lambda$1653959595$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConfidentialVmPinHelpBottomSheetKey confidentialVmPinHelpBottomSheetKey, BFM bfm, Integer num) {
        invoke(confidentialVmPinHelpBottomSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConfidentialVmPinHelpBottomSheetKey confidentialVmPinHelpBottomSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            ConfidentialVmPinHelpBottomSheetKt.ConfidentialVmPinHelpBottomSheet(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
