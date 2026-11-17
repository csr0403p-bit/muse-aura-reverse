package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import androidx.activity.ComponentActivity;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import com.facebook.aura.settings.HatchSecureStorageScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SecureStorageEntryProviderKt$lambda$-1830354550$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SecureStorageEntryProviderKt$lambda$1830354550$1 extends AbstractC7559F3s implements G0W<SecureStorageCredentialDetailsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SecureStorageEntryProviderKt$lambda$1830354550$1 INSTANCE = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$1830354550$1();

    public ComposableSingletons$SecureStorageEntryProviderKt$lambda$1830354550$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, BFM bfm, Integer num) {
        invoke(secureStorageCredentialDetailsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(secureStorageCredentialDetailsScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
        HatchCredentialsViewModel.Factory factory = new HatchCredentialsViewModel.Factory(AnonymousClass002.A0h(bfm));
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        HatchCredentialsViewModel hatchCredentialsViewModel = (HatchCredentialsViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchCredentialsViewModel.class));
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$1830354550$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchSecureStorageScreenKt.HatchSecureStorageCredentialDetailsScreen(secureStorageCredentialDetailsScreenKey, hatchCredentialsViewModel, (Function0) objAaT, null, bfm, (i & 14) | (HatchCredentialsViewModel.$stable << 3), 8);
    }
}
