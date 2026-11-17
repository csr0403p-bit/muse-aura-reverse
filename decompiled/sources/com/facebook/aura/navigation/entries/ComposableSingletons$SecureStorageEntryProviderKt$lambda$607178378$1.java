package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.activity.ComponentActivity;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SecureStorageScreenKey;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import com.facebook.aura.settings.HatchSecureStorageScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1 extends AbstractC7559F3s implements G0W<SecureStorageScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1 INSTANCE = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1();

    public ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SecureStorageScreenKey secureStorageScreenKey, BFM bfm, Integer num) {
        invoke(secureStorageScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SecureStorageScreenKey secureStorageScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchCredentialsViewModel.Factory factory = new HatchCredentialsViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchCredentialsViewModel hatchCredentialsViewModel = (HatchCredentialsViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchCredentialsViewModel.class));
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            boolean zA673 = bfm.A67(auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1$3$1(auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            boolean zA674 = bfm.A67(auraNavigatorA0b);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$607178378$1$4$1(auraNavigatorA0b);
                bfm.Ai0(objAaT4);
            }
            HatchSecureStorageScreenKt.HatchSecureStorageScreen(hatchCredentialsViewModel, function0, function02, g0u, (G0U) objAaT4, null, bfm, HatchCredentialsViewModel.$stable, 32);
            return;
        }
        bfm.Afo();
    }
}
