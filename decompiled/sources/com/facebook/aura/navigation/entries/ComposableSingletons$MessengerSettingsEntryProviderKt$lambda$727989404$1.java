package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.MessengerSettingsScreenKey;
import com.facebook.aura.settings.HatchMessengerSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$MessengerSettingsEntryProviderKt$lambda$727989404$1 extends AbstractC7559F3s implements G0W<MessengerSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$MessengerSettingsEntryProviderKt$lambda$727989404$1 INSTANCE = new ComposableSingletons$MessengerSettingsEntryProviderKt$lambda$727989404$1();

    public ComposableSingletons$MessengerSettingsEntryProviderKt$lambda$727989404$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(MessengerSettingsScreenKey messengerSettingsScreenKey, BFM bfm, Integer num) {
        invoke(messengerSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(MessengerSettingsScreenKey messengerSettingsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(messengerSettingsScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$MessengerSettingsEntryProviderKt$lambda$727989404$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchMessengerSettingsScreenKt.HatchMessengerSettingsScreen((Function0) objAaT, messengerSettingsScreenKey.isLinked, null, null, bfm, 0, 12);
    }
}
