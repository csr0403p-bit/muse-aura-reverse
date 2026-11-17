package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ChannelsSettingsScreenKey;
import com.facebook.aura.settings.AuraChannelsSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$-846782561$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1 extends AbstractC7559F3s implements G0W<ChannelsSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1 INSTANCE = new ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1();

    public ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ChannelsSettingsScreenKey channelsSettingsScreenKey, BFM bfm, Integer num) {
        invoke(channelsSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ChannelsSettingsScreenKey channelsSettingsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA673 = bfm.A67(auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1$3$1(auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            G0V g0v = (G0V) objAaT3;
            boolean zA674 = bfm.A67(auraNavigatorA0b);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new ComposableSingletons$ChannelsSettingsEntryProviderKt$lambda$846782561$1$4$1(auraNavigatorA0b);
                bfm.Ai0(objAaT4);
            }
            AuraChannelsSettingsScreenKt.AuraChannelsSettingsScreen(function0, g0u, g0v, (G0U) objAaT4, null, null, bfm, 0, 48);
            return;
        }
        bfm.Afo();
    }
}
