package com.facebook.aura.partners.voice.chrome;

import X.AOB;
import X.AOe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.header.view.HeaderButtonKt;

/* loaded from: classes2.dex */
public final class VoiceCallChromeKt$rememberVoiceCallSlotAnimation$width$1 extends AbstractC7559F3s implements G0W<AOB<Boolean>, BFM, Integer, AOe<Float>> {
    public static final VoiceCallChromeKt$rememberVoiceCallSlotAnimation$width$1 INSTANCE = new VoiceCallChromeKt$rememberVoiceCallSlotAnimation$width$1();

    public VoiceCallChromeKt$rememberVoiceCallSlotAnimation$width$1() {
        super(3);
    }

    public final AOe<Float> invoke(AOB<Boolean> aob, BFM bfm, int i) {
        C7384Etj.A0Y(aob, 0);
        bfm.AgE(-407009745);
        AOe<Float> aOeHeaderPillSpring = AnonymousClass001.A1X(aob.ALW()) ? HeaderButtonKt.headerPillSpring() : VoiceCallChromeKt.delayedHeaderPillSpring();
        AnonymousClass001.A1D(bfm);
        return aOeHeaderPillSpring;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AOe<Float> invoke(AOB<Boolean> aob, BFM bfm, Integer num) {
        return invoke(aob, bfm, AnonymousClass001.A0F(num));
    }
}
