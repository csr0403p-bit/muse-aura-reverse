package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0V;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import com.facebook.aura.partners.voice.intf.VoiceUi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$9$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$9$2$1(String str, Function0<Unit> function0) {
        super(2);
        this.$threadId = str;
        this.$onClick = function0;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VoiceUi ui;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            VoiceIntegration integration = Voice.INSTANCE.getIntegration();
            if (integration != null && (ui = integration.getUi()) != null) {
                bfm.AgE(1465235089);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onClick, bfm.A65(this.$threadId));
                String str = this.$threadId;
                Function0<Unit> function0 = this.$onClick;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$9$2$1$1$1(str, function0);
                    bfm.Ai0(objAaT);
                }
                ui.ComposerCallButton((Function0) objAaT, BRg.A00, bfm, 48);
            } else {
                bfm.AgE(-1822352496);
            }
            AnonymousClass002.A19(bfm);
            return;
        }
        bfm.Afo();
    }
}
