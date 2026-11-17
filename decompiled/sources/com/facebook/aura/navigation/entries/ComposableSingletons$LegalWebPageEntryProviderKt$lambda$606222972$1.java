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
import com.facebook.aura.navigation.key.LegalWebPageScreenKey;
import com.facebook.aura.settings.HatchLegalWebPageScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$LegalWebPageEntryProviderKt$lambda$-606222972$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$LegalWebPageEntryProviderKt$lambda$606222972$1 extends AbstractC7559F3s implements G0W<LegalWebPageScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LegalWebPageEntryProviderKt$lambda$606222972$1 INSTANCE = new ComposableSingletons$LegalWebPageEntryProviderKt$lambda$606222972$1();

    public ComposableSingletons$LegalWebPageEntryProviderKt$lambda$606222972$1() {
        super(3);
    }

    public final void invoke(LegalWebPageScreenKey legalWebPageScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(legalWebPageScreenKey, 0);
        BBI bbi = (BBI) bfm;
        AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
        String str = legalWebPageScreenKey.url;
        String str2 = legalWebPageScreenKey.title;
        boolean zA67 = bfm.A67(auraNavigatorA05);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$LegalWebPageEntryProviderKt$lambda$606222972$1$1$1(auraNavigatorA05);
            BBI.A0O(bbi, objAaT);
        }
        HatchLegalWebPageScreenKt.HatchLegalWebPageScreen(str, str2, (Function0) objAaT, null, bfm, 0, 8);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(LegalWebPageScreenKey legalWebPageScreenKey, BFM bfm, Integer num) {
        invoke(legalWebPageScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
