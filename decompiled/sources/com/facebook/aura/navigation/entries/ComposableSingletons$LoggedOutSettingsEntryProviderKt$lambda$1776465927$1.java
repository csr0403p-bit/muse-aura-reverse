package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LoggedOutContactSupportScreenKey;
import com.facebook.aura.settings.support.HatchContactSupportScreenKt;
import com.facebook.aura.settings.support.HatchContactSupportViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1776465927$1 extends AbstractC7559F3s implements G0W<LoggedOutContactSupportScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1776465927$1 INSTANCE = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1776465927$1();

    public ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1776465927$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(LoggedOutContactSupportScreenKey loggedOutContactSupportScreenKey, BFM bfm, Integer num) {
        invoke(loggedOutContactSupportScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(LoggedOutContactSupportScreenKey loggedOutContactSupportScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1776465927$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            C7384Etj.A0X(applicationContext);
            HatchContactSupportViewModel.Factory factory = new HatchContactSupportViewModel.Factory(applicationContext, null);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 != null) {
                HatchContactSupportScreenKt.HatchContactSupportScreen(function0, (HatchContactSupportViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), HatchContactSupportViewModel.class, null), null, null, null, 0, null, null, null, bfm, HatchContactSupportViewModel.$stable << 3, 508);
                return;
            }
            throw AnonymousClass001.A0o();
        }
        bfm.Afo();
    }
}
