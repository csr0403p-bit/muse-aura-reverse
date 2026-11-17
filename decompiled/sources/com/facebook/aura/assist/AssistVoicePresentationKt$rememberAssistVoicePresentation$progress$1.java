package com.facebook.aura.assist;

import X.AOB;
import X.AOe;
import X.ASj;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C28s;
import X.C2HU;
import X.C7384Etj;
import X.G0W;

/* loaded from: classes.dex */
public final class AssistVoicePresentationKt$rememberAssistVoicePresentation$progress$1 extends AbstractC7559F3s implements G0W<AOB<Boolean>, BFM, Integer, AOe<Float>> {
    public static final AssistVoicePresentationKt$rememberAssistVoicePresentation$progress$1 INSTANCE = new AssistVoicePresentationKt$rememberAssistVoicePresentation$progress$1();

    public AssistVoicePresentationKt$rememberAssistVoicePresentation$progress$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AOe<Float> invoke(AOB<Boolean> aob, BFM bfm, Integer num) {
        return invoke(aob, bfm, AnonymousClass001.A0F(num));
    }

    public final AOe<Float> invoke(AOB<Boolean> aob, BFM bfm, int i) {
        C28s c28s;
        C7384Etj.A0Y(aob, 0);
        bfm.AgE(131524038);
        if (AnonymousClass001.A1X(aob.ALW())) {
            c28s = C2HU.A01;
        } else {
            c28s = AssistVoicePresentationKt.reverseVoiceEasing;
        }
        ASj aSj = new ASj(c28s, 350, 0);
        AnonymousClass001.A1D(bfm);
        return aSj;
    }
}
