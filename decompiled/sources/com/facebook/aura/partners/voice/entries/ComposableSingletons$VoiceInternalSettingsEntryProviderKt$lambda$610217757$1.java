package com.facebook.aura.partners.voice.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.BQN;
import X.C0861A6i;
import X.C5wL;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.VoiceInternalSettingsScreenKey;
import com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$VoiceInternalSettingsEntryProviderKt$lambda$610217757$1 extends AbstractC7559F3s implements G0W<VoiceInternalSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VoiceInternalSettingsEntryProviderKt$lambda$610217757$1 INSTANCE = new ComposableSingletons$VoiceInternalSettingsEntryProviderKt$lambda$610217757$1();

    public ComposableSingletons$VoiceInternalSettingsEntryProviderKt$lambda$610217757$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VoiceInternalSettingsScreenKey voiceInternalSettingsScreenKey, BFM bfm, Integer num) {
        invoke(voiceInternalSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(VoiceInternalSettingsScreenKey voiceInternalSettingsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            VoiceControlsSettingsViewModel.Factory factory = new VoiceControlsSettingsViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 != null) {
                VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = (VoiceControlsSettingsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(VoiceControlsSettingsViewModel.class));
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ComposableSingletons$VoiceInternalSettingsEntryProviderKt$lambda$610217757$1$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                VoiceInternalSettingsScreenKt.VoiceInternalSettingsScreen(voiceControlsSettingsViewModel, (Function0) objAaT, null, bfm, VoiceControlsSettingsViewModel.$stable, 4);
                return;
            }
            throw AnonymousClass001.A0o();
        }
        bfm.Afo();
    }
}
