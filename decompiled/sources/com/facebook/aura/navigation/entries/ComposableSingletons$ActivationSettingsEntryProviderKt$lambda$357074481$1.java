package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationSettingsScreenKey;
import com.facebook.aura.settings.HatchActivationSettingsScreenKt;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.vmavailability.VmUnavailableViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1 extends AbstractC7559F3s implements G0W<ActivationSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1 INSTANCE = new ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1();

    public ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1() {
        super(3);
    }

    public final void invoke(ActivationSettingsScreenKey activationSettingsScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        VmUnavailableViewModel.Factory factory = new VmUnavailableViewModel.Factory(AnonymousClass002.A0h(bfm));
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        Object objA0H = C3cH.A0H(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), C3cG.A0x(VmUnavailableViewModel.class));
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        Object objAaT2 = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT2 == obj) {
            objAaT2 = ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1$2$1.INSTANCE;
            bfm.Ai0(objAaT2);
        }
        Function0 function02 = (Function0) objAaT2;
        boolean zA672 = bfm.A67(auraNavigatorA0b);
        Object objAaT3 = bfm.AaT();
        if (zA672 || objAaT3 == obj) {
            objAaT3 = new ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1$3$1(auraNavigatorA0b);
            bfm.Ai0(objAaT3);
        }
        Function0 function03 = (Function0) objAaT3;
        boolean zA673 = bfm.A67(auraNavigatorA0b);
        Object objAaT4 = bfm.AaT();
        if (zA673 || objAaT4 == obj) {
            objAaT4 = new ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1$4$1(auraNavigatorA0b);
            bfm.Ai0(objAaT4);
        }
        Function0 function04 = (Function0) objAaT4;
        Object objAaT5 = bfm.AaT();
        if (objAaT5 == obj) {
            objAaT5 = new ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1$5$1(null);
            bfm.Ai0(objAaT5);
        }
        G0U g0u = (G0U) objAaT5;
        boolean zA674 = bfm.A67(objA0H);
        Object objAaT6 = bfm.AaT();
        if (zA674 || objAaT6 == obj) {
            objAaT6 = new ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1$6$1(objA0H);
            bfm.Ai0(objAaT6);
        }
        HatchActivationSettingsScreenKt.HatchActivationSettingsScreen(function0, function02, function03, null, function04, g0u, null, (G0U) ((InterfaceC7353EnQ) objAaT6), null, bfm, 3120, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ActivationSettingsScreenKey activationSettingsScreenKey, BFM bfm, Integer num) {
        invoke(activationSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
