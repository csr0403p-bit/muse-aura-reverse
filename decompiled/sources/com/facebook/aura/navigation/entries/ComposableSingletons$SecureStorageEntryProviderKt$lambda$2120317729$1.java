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
import com.facebook.aura.navigation.key.SecureStorageOnePasswordScreenKey;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import com.facebook.aura.settings.HatchPasswordsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$SecureStorageEntryProviderKt$lambda$2120317729$1 extends AbstractC7559F3s implements G0W<SecureStorageOnePasswordScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SecureStorageEntryProviderKt$lambda$2120317729$1 INSTANCE = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$2120317729$1();

    public ComposableSingletons$SecureStorageEntryProviderKt$lambda$2120317729$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SecureStorageOnePasswordScreenKey secureStorageOnePasswordScreenKey, BFM bfm, Integer num) {
        invoke(secureStorageOnePasswordScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SecureStorageOnePasswordScreenKey secureStorageOnePasswordScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchCredentialsViewModel.Factory factory = new HatchCredentialsViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchCredentialsViewModel hatchCredentialsViewModel = (HatchCredentialsViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchCredentialsViewModel.class));
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$2120317729$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$2120317729$1$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            HatchPasswordsScreenKt.HatchOnePasswordLoginsScreen(hatchCredentialsViewModel, function0, (G0U) objAaT2, null, bfm, HatchCredentialsViewModel.$stable, 8);
            return;
        }
        bfm.Afo();
    }
}
