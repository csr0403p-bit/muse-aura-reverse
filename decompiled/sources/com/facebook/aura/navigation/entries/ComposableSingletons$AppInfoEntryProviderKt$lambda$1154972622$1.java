package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraAppInfoScreenKey;
import com.facebook.aura.settings.AuraAppInfoScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AppInfoEntryProviderKt$lambda$-1154972622$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AppInfoEntryProviderKt$lambda$1154972622$1 extends AbstractC7559F3s implements G0W<AuraAppInfoScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AppInfoEntryProviderKt$lambda$1154972622$1 INSTANCE = new ComposableSingletons$AppInfoEntryProviderKt$lambda$1154972622$1();

    public ComposableSingletons$AppInfoEntryProviderKt$lambda$1154972622$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AuraAppInfoScreenKey auraAppInfoScreenKey, BFM bfm, Integer num) {
        invoke(auraAppInfoScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AuraAppInfoScreenKey auraAppInfoScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$AppInfoEntryProviderKt$lambda$1154972622$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraAppInfoScreenKt.AuraAppInfoScreen((Function0) objAaT, null, bfm, 0, 2);
            return;
        }
        bfm.Afo();
    }
}
