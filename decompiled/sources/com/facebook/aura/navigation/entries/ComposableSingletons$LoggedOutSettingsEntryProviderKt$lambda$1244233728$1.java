package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LoggedOutLegalSafetyScreenKey;
import com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1244233728$1 extends AbstractC7559F3s implements G0W<LoggedOutLegalSafetyScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1244233728$1 INSTANCE = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1244233728$1();

    public ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1244233728$1() {
        super(3);
    }

    public final void invoke(LoggedOutLegalSafetyScreenKey loggedOutLegalSafetyScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1244233728$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        boolean zA672 = bfm.A67(auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA672 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1244233728$1$2$1(auraNavigatorA0b);
            bfm.Ai0(objAaT2);
        }
        HatchLegalSafetySettingsScreenKt.HatchLegalSafetySettingsScreen(function0, (G0V) objAaT2, null, false, bfm, 3072, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(LoggedOutLegalSafetyScreenKey loggedOutLegalSafetyScreenKey, BFM bfm, Integer num) {
        invoke(loggedOutLegalSafetyScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
