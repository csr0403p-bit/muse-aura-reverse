package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.TelegramSettingsScreenKey;
import com.facebook.aura.settings.HatchTelegramSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$TelegramSettingsEntryProviderKt$lambda$1915094834$1 extends AbstractC7559F3s implements G0W<TelegramSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$TelegramSettingsEntryProviderKt$lambda$1915094834$1 INSTANCE = new ComposableSingletons$TelegramSettingsEntryProviderKt$lambda$1915094834$1();

    public ComposableSingletons$TelegramSettingsEntryProviderKt$lambda$1915094834$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(TelegramSettingsScreenKey telegramSettingsScreenKey, BFM bfm, Integer num) {
        invoke(telegramSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(TelegramSettingsScreenKey telegramSettingsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(telegramSettingsScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$TelegramSettingsEntryProviderKt$lambda$1915094834$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchTelegramSettingsScreenKt.HatchTelegramSettingsScreen((Function0) objAaT, telegramSettingsScreenKey.isLinked, null, null, bfm, 0, 12);
    }
}
