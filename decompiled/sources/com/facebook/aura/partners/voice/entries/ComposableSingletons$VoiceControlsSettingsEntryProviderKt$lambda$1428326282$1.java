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
import com.facebook.aura.navigation.key.VoiceControlsSettingsScreenKey;
import com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.voice.entries.ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$-1428326282$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$1428326282$1 extends AbstractC7559F3s implements G0W<VoiceControlsSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$1428326282$1 INSTANCE = new ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$1428326282$1();

    public ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$1428326282$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VoiceControlsSettingsScreenKey voiceControlsSettingsScreenKey, BFM bfm, Integer num) {
        invoke(voiceControlsSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(VoiceControlsSettingsScreenKey voiceControlsSettingsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            VoiceControlsSettingsViewModel.Factory factory = new VoiceControlsSettingsViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 != null) {
                VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = (VoiceControlsSettingsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(VoiceControlsSettingsViewModel.class));
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$1428326282$1$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                boolean zA672 = bfm.A67(auraNavigatorA0b);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ComposableSingletons$VoiceControlsSettingsEntryProviderKt$lambda$1428326282$1$2$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                VoiceControlsSettingsScreenKt.VoiceControlsSettingsScreen(voiceControlsSettingsViewModel, function0, (Function0) objAaT2, null, bfm, VoiceControlsSettingsViewModel.$stable, 8);
                return;
            }
            throw AnonymousClass001.A0o();
        }
        bfm.Afo();
    }
}
