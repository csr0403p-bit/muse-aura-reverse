package com.facebook.aura.navigation.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.BQN;
import X.C0861A6i;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ContactSupportScreenKey;
import com.facebook.aura.settings.support.HatchContactSupportScreenKt;
import com.facebook.aura.settings.support.HatchContactSupportViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$ContactSupportEntryProviderKt$lambda$938063827$1 extends AbstractC7559F3s implements G0W<ContactSupportScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ContactSupportEntryProviderKt$lambda$938063827$1 INSTANCE = new ComposableSingletons$ContactSupportEntryProviderKt$lambda$938063827$1();

    public ComposableSingletons$ContactSupportEntryProviderKt$lambda$938063827$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ContactSupportScreenKey contactSupportScreenKey, BFM bfm, Integer num) {
        invoke(contactSupportScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ContactSupportScreenKey contactSupportScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
            C7384Etj.A0X(applicationContext);
            HatchContactSupportViewModel.Factory factory = new HatchContactSupportViewModel.Factory(applicationContext, abstractC3358CGzA0g);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 != null) {
                HatchContactSupportViewModel hatchContactSupportViewModel = (HatchContactSupportViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchContactSupportViewModel.class));
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ComposableSingletons$ContactSupportEntryProviderKt$lambda$938063827$1$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA0b, hatchContactSupportViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA1M || objAaT2 == C78N.A00) {
                    objAaT2 = new ComposableSingletons$ContactSupportEntryProviderKt$lambda$938063827$1$2$1(auraNavigatorA0b, hatchContactSupportViewModel);
                    bfm.Ai0(objAaT2);
                }
                HatchContactSupportScreenKt.HatchContactSupportScreen(function0, hatchContactSupportViewModel, null, abstractC3358CGzA0g, (Function0) objAaT2, 0, null, null, null, bfm, HatchContactSupportViewModel.$stable << 3, 484);
                return;
            }
            throw AnonymousClass001.A0o();
        }
        bfm.Afo();
    }
}
