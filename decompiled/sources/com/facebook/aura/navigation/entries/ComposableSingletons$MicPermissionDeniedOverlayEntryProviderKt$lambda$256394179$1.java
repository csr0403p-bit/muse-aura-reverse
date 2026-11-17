package com.facebook.aura.navigation.entries;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.MicPermissionDeniedOverlayScreenKey;
import com.facebook.aura.utils.HatchPermissionDeniedDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$MicPermissionDeniedOverlayEntryProviderKt$lambda$256394179$1 extends AbstractC7559F3s implements G0W<MicPermissionDeniedOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$MicPermissionDeniedOverlayEntryProviderKt$lambda$256394179$1 INSTANCE = new ComposableSingletons$MicPermissionDeniedOverlayEntryProviderKt$lambda$256394179$1();

    public ComposableSingletons$MicPermissionDeniedOverlayEntryProviderKt$lambda$256394179$1() {
        super(3);
    }

    public final void invoke(MicPermissionDeniedOverlayScreenKey micPermissionDeniedOverlayScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12066d);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12066c);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$MicPermissionDeniedOverlayEntryProviderKt$lambda$256394179$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchPermissionDeniedDialogKt.HatchPermissionDeniedDialog(strA01, strA012, (Function0) objAaT, null, null, null, null, null, null, bfm, 0, 504);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(MicPermissionDeniedOverlayScreenKey micPermissionDeniedOverlayScreenKey, BFM bfm, Integer num) {
        invoke(micPermissionDeniedOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
