package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LoggedOutSettingsListScreenKey;
import com.facebook.aura.settings.LoggedOutSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$-99991533$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1 extends AbstractC7559F3s implements G0W<LoggedOutSettingsListScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1 INSTANCE = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1();

    public ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1() {
        super(3);
    }

    public final void invoke(LoggedOutSettingsListScreenKey loggedOutSettingsListScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        boolean zA672 = bfm.A67(auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA672 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1$2$1(auraNavigatorA0b);
            bfm.Ai0(objAaT2);
        }
        Function0 function02 = (Function0) objAaT2;
        boolean zA673 = bfm.A67(auraNavigatorA0b);
        Object objAaT3 = bfm.AaT();
        if (zA673 || objAaT3 == C78N.A00) {
            objAaT3 = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1$3$1(auraNavigatorA0b);
            bfm.Ai0(objAaT3);
        }
        Function0 function03 = (Function0) objAaT3;
        boolean zA674 = bfm.A67(auraNavigatorA0b);
        Object objAaT4 = bfm.AaT();
        if (zA674 || objAaT4 == C78N.A00) {
            objAaT4 = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$99991533$1$4$1(auraNavigatorA0b);
            bfm.Ai0(objAaT4);
        }
        LoggedOutSettingsScreenKt.LoggedOutSettingsScreen(function0, function02, function03, (Function0) objAaT4, null, bfm, 0, 16);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(LoggedOutSettingsListScreenKey loggedOutSettingsListScreenKey, BFM bfm, Integer num) {
        invoke(loggedOutSettingsListScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
