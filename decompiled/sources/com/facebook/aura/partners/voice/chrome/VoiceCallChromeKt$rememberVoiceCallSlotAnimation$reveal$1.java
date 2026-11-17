package com.facebook.aura.partners.voice.chrome;

import X.AOB;
import X.AOe;
import X.ASj;
import X.ASk;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C2HU;
import X.C7384Etj;
import X.G0W;

/* loaded from: classes.dex */
public final class VoiceCallChromeKt$rememberVoiceCallSlotAnimation$reveal$1 extends AbstractC7559F3s implements G0W<AOB<Boolean>, BFM, Integer, AOe<Float>> {
    public static final VoiceCallChromeKt$rememberVoiceCallSlotAnimation$reveal$1 INSTANCE = new VoiceCallChromeKt$rememberVoiceCallSlotAnimation$reveal$1();

    public VoiceCallChromeKt$rememberVoiceCallSlotAnimation$reveal$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AOe<Float> invoke(AOB<Boolean> aob, BFM bfm, Integer num) {
        return invoke(aob, bfm, AnonymousClass001.A0F(num));
    }

    public final AOe<Float> invoke(AOB<Boolean> aob, BFM bfm, int i) {
        AOe<Float> aSk;
        C7384Etj.A0Y(aob, 0);
        bfm.AgE(2110773128);
        if (AnonymousClass001.A1X(aob.ALW())) {
            aSk = new ASj<>(C2HU.A02, 160, 260);
        } else {
            aSk = new ASk<>();
        }
        AOe<Float> aOe = aSk;
        AnonymousClass001.A1D(bfm);
        return aOe;
    }
}
