package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.WhatsAppSettingsScreenKey;
import com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$WhatsAppSettingsEntryProviderKt$lambda$-1363167099$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$WhatsAppSettingsEntryProviderKt$lambda$1363167099$1 extends AbstractC7559F3s implements G0W<WhatsAppSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$WhatsAppSettingsEntryProviderKt$lambda$1363167099$1 INSTANCE = new ComposableSingletons$WhatsAppSettingsEntryProviderKt$lambda$1363167099$1();

    public ComposableSingletons$WhatsAppSettingsEntryProviderKt$lambda$1363167099$1() {
        super(3);
    }

    public final void invoke(WhatsAppSettingsScreenKey whatsAppSettingsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(whatsAppSettingsScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$WhatsAppSettingsEntryProviderKt$lambda$1363167099$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchWhatsAppSettingsScreenKt.HatchWhatsAppSettingsScreen((Function0) objAaT, whatsAppSettingsScreenKey.isLinked, null, whatsAppSettingsScreenKey.needsAttention, null, bfm, 0, 20);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(WhatsAppSettingsScreenKey whatsAppSettingsScreenKey, BFM bfm, Integer num) {
        invoke(whatsAppSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
