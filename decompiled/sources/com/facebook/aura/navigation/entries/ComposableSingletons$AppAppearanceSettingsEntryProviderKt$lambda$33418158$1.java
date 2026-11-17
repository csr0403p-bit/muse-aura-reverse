package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AppAppearanceSettingsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$AppAppearanceSettingsEntryProviderKt$lambda$33418158$1 extends AbstractC7559F3s implements G0W<AppAppearanceSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AppAppearanceSettingsEntryProviderKt$lambda$33418158$1 INSTANCE = new ComposableSingletons$AppAppearanceSettingsEntryProviderKt$lambda$33418158$1();

    public ComposableSingletons$AppAppearanceSettingsEntryProviderKt$lambda$33418158$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AppAppearanceSettingsScreenKey appAppearanceSettingsScreenKey, BFM bfm, Integer num) {
        invoke(appAppearanceSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AppAppearanceSettingsScreenKey appAppearanceSettingsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$AppAppearanceSettingsEntryProviderKt$lambda$33418158$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchAppAppearanceSettingsScreenKt.HatchAppAppearanceSettingsScreen((Function0) objAaT, bfm, 0);
            return;
        }
        bfm.Afo();
    }
}
