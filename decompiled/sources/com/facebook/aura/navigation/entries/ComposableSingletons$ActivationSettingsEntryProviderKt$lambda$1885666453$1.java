package com.facebook.aura.navigation.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.BQN;
import X.C0861A6i;
import X.C5wL;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationDataPrivacySettingsScreenKey;
import com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$1885666453$1 extends AbstractC7559F3s implements G0W<ActivationDataPrivacySettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$1885666453$1 INSTANCE = new ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$1885666453$1();

    public ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$1885666453$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ActivationDataPrivacySettingsScreenKey activationDataPrivacySettingsScreenKey, BFM bfm, Integer num) {
        invoke(activationDataPrivacySettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ActivationDataPrivacySettingsScreenKey activationDataPrivacySettingsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$1885666453$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            HatchDataPrivacySettingsViewModel.Factory factory = new HatchDataPrivacySettingsViewModel.Factory(abstractC3358CGzA0h);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 != null) {
                HatchDataPrivacySettingsScreenKt.HatchDataPrivacySettingsScreen(function0, (HatchDataPrivacySettingsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchDataPrivacySettingsViewModel.class)), null, bfm, HatchDataPrivacySettingsViewModel.$stable << 3, 4);
                return;
            }
            throw AnonymousClass001.A0o();
        }
        bfm.Afo();
    }
}
