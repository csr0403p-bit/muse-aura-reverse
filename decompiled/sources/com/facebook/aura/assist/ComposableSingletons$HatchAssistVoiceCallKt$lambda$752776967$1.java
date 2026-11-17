package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import com.facebook.aura.partners.voice.intf.VoiceUi;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchAssistVoiceCallKt$lambda$752776967$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchAssistVoiceCallKt$lambda$752776967$1 INSTANCE = new ComposableSingletons$HatchAssistVoiceCallKt$lambda$752776967$1();

    public ComposableSingletons$HatchAssistVoiceCallKt$lambda$752776967$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VoiceUi ui;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AssistVoiceCameraKt.AssistVoiceCameraButton(null, bfm, 0, 1);
            VoiceIntegration integration = Voice.INSTANCE.getIntegration();
            if (integration != null && (ui = integration.getUi()) != null) {
                bfm.AgE(1864161609);
                ui.CompactCallCaptionToggle(BRg.A00, bfm, 6);
            } else {
                bfm.AgE(1954435032);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
