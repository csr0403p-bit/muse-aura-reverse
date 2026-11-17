package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0W;

/* loaded from: classes2.dex */
public final class VoiceConversationHeaderAction$rememberAction$action$1$2 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, BRg> {
    public final /* synthetic */ VoiceCallChromeState $chrome;

    public final BRg invoke(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(938016172);
        BRg bRgVoiceCallEntrance = VoiceCallChromeKt.voiceCallEntrance(bRg, this.$chrome);
        AnonymousClass001.A1D(bfm);
        return bRgVoiceCallEntrance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceConversationHeaderAction$rememberAction$action$1$2(VoiceCallChromeState voiceCallChromeState) {
        super(3);
        this.$chrome = voiceCallChromeState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ BRg invoke(BRg bRg, BFM bfm, Integer num) {
        return invoke(bRg, bfm, AnonymousClass001.A0F(num));
    }
}
