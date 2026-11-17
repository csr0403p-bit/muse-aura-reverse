package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.applock.BiometricsSettingsScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.BiometricsSettingsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$BiometricsSettingsEntryProviderKt$lambda$1676168032$1 extends AbstractC7559F3s implements G0W<BiometricsSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$BiometricsSettingsEntryProviderKt$lambda$1676168032$1 INSTANCE = new ComposableSingletons$BiometricsSettingsEntryProviderKt$lambda$1676168032$1();

    public ComposableSingletons$BiometricsSettingsEntryProviderKt$lambda$1676168032$1() {
        super(3);
    }

    public final void invoke(BiometricsSettingsScreenKey biometricsSettingsScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$BiometricsSettingsEntryProviderKt$lambda$1676168032$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        BiometricsSettingsScreenKt.BiometricsSettingsScreen((Function0) objAaT, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BiometricsSettingsScreenKey biometricsSettingsScreenKey, BFM bfm, Integer num) {
        invoke(biometricsSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
