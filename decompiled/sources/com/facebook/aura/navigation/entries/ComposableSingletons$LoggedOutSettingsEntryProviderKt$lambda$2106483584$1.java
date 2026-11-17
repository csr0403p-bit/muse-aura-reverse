package com.facebook.aura.navigation.entries;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.LoggedOutLegalWebPageScreenKey;
import com.facebook.aura.settings.HatchLegalWebPageScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$2106483584$1 extends AbstractC7559F3s implements G0W<LoggedOutLegalWebPageScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$2106483584$1 INSTANCE = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$2106483584$1();

    public ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$2106483584$1() {
        super(3);
    }

    public final void invoke(LoggedOutLegalWebPageScreenKey loggedOutLegalWebPageScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(loggedOutLegalWebPageScreenKey, 0);
        BBI bbi = (BBI) bfm;
        AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
        String str = loggedOutLegalWebPageScreenKey.url;
        String str2 = loggedOutLegalWebPageScreenKey.title;
        boolean zA67 = bfm.A67(auraNavigatorA05);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$2106483584$1$1$1(auraNavigatorA05);
            BBI.A0O(bbi, objAaT);
        }
        HatchLegalWebPageScreenKt.HatchLegalWebPageScreen(str, str2, (Function0) objAaT, null, bfm, 0, 8);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(LoggedOutLegalWebPageScreenKey loggedOutLegalWebPageScreenKey, BFM bfm, Integer num) {
        invoke(loggedOutLegalWebPageScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
