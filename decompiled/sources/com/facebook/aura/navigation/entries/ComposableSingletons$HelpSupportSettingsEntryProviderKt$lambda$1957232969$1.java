package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HelpSupportSettingsScreenKey;
import com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$HelpSupportSettingsEntryProviderKt$lambda$-1957232969$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$HelpSupportSettingsEntryProviderKt$lambda$1957232969$1 extends AbstractC7559F3s implements G0W<HelpSupportSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HelpSupportSettingsEntryProviderKt$lambda$1957232969$1 INSTANCE = new ComposableSingletons$HelpSupportSettingsEntryProviderKt$lambda$1957232969$1();

    public ComposableSingletons$HelpSupportSettingsEntryProviderKt$lambda$1957232969$1() {
        super(3);
    }

    public final void invoke(HelpSupportSettingsScreenKey helpSupportSettingsScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$HelpSupportSettingsEntryProviderKt$lambda$1957232969$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        boolean zA672 = bfm.A67(auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA672 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$HelpSupportSettingsEntryProviderKt$lambda$1957232969$1$2$1(auraNavigatorA0b);
            bfm.Ai0(objAaT2);
        }
        G0V g0v = (G0V) objAaT2;
        boolean zA673 = bfm.A67(auraNavigatorA0b);
        Object objAaT3 = bfm.AaT();
        if (zA673 || objAaT3 == C78N.A00) {
            objAaT3 = new ComposableSingletons$HelpSupportSettingsEntryProviderKt$lambda$1957232969$1$3$1(auraNavigatorA0b);
            bfm.Ai0(objAaT3);
        }
        HatchHelpSupportSettingsScreenKt.HatchHelpSupportSettingsScreen(function0, g0v, (Function0) objAaT3, null, null, bfm, 0, 24);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HelpSupportSettingsScreenKey helpSupportSettingsScreenKey, BFM bfm, Integer num) {
        invoke(helpSupportSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
