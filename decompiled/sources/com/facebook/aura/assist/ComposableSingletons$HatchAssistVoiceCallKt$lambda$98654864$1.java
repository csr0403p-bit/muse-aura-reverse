package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BBI;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import com.facebook.aura.partners.voice.intf.VoiceUi;
import kotlin.Unit;

/* renamed from: com.facebook.aura.assist.ComposableSingletons$HatchAssistVoiceCallKt$lambda$-98654864$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchAssistVoiceCallKt$lambda$98654864$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchAssistVoiceCallKt$lambda$98654864$1 INSTANCE = new ComposableSingletons$HatchAssistVoiceCallKt$lambda$98654864$1();

    public ComposableSingletons$HatchAssistVoiceCallKt$lambda$98654864$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VoiceUi ui;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            Voice voice = Voice.INSTANCE;
            VoiceIntegration integration = voice.getIntegration();
            VoiceUi ui2 = null;
            if (integration != null) {
                ui2 = integration.getUi();
            }
            if (ui2 == null) {
                bfm.AgE(-1269391246);
            } else {
                bfm.AgE(-318042769);
                ui2.CompactCallMuteButton(BRg.A00, bfm, 6);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            VoiceIntegration integration2 = voice.getIntegration();
            if (integration2 != null && (ui = integration2.getUi()) != null) {
                bfm.AgE(-318040818);
                ui.CompactCallEndButton(BRg.A00, bfm, 6);
            } else {
                bfm.AgE(-1269330765);
            }
            BBI.A0R(bbi, false);
            return;
        }
        bfm.Afo();
    }
}
