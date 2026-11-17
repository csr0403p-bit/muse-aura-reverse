package com.facebook.aura.navigation.entries;

import X.AKH;
import X.AKL;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SecureStorageCustomConnectorDetailsScreenKey;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt;
import com.facebook.aura.settings.HatchCustomConnectorDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SecureStorageEntryProviderKt$lambda$-930274570$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SecureStorageEntryProviderKt$lambda$930274570$1 extends AbstractC7559F3s implements G0W<SecureStorageCustomConnectorDetailsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SecureStorageEntryProviderKt$lambda$930274570$1 INSTANCE = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$930274570$1();

    public ComposableSingletons$SecureStorageEntryProviderKt$lambda$930274570$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, BFM bfm, Integer num) {
        invoke(secureStorageCustomConnectorDetailsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(secureStorageCustomConnectorDetailsScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        HatchCustomConnectorDetailsViewModel.Factory factory = new HatchCustomConnectorDetailsViewModel.Factory(abstractC3358CGzA0g);
        AKH<Activity> akh = AKL.A00;
        Object objA6v = bfm.A6v(akh);
        C7384Etj.A0Z(objA6v, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ComponentActivity componentActivity = (ComponentActivity) objA6v;
        HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel = (HatchCustomConnectorDetailsViewModel) BQN.A00(factory, componentActivity, AnonymousClass003.A0Z(componentActivity), null, new C0861A6i(HatchCustomConnectorDetailsViewModel.class));
        HatchCredentialsViewModel.Factory factory2 = new HatchCredentialsViewModel.Factory(abstractC3358CGzA0g);
        Object objA6v2 = bfm.A6v(akh);
        C7384Etj.A0Z(objA6v2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ComponentActivity componentActivity2 = (ComponentActivity) objA6v2;
        HatchCredentialsViewModel hatchCredentialsViewModel = (HatchCredentialsViewModel) AnonymousClass003.A0Y(factory2, componentActivity2, AnonymousClass003.A0Z(componentActivity2), HatchCredentialsViewModel.class, null);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$930274570$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        boolean zA1M = AnonymousClass003.A1M(bfm, hatchCredentialsViewModel, auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA1M || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$SecureStorageEntryProviderKt$lambda$930274570$1$2$1(hatchCredentialsViewModel, auraNavigatorA0b);
            bfm.Ai0(objAaT2);
        }
        HatchCustomConnectorDetailsScreenKt.HatchCustomConnectorDetailsScreen(secureStorageCustomConnectorDetailsScreenKey, hatchCustomConnectorDetailsViewModel, function0, (Function0) objAaT2, null, bfm, (i & 14) | (HatchCustomConnectorDetailsViewModel.$stable << 3), 16);
    }
}
