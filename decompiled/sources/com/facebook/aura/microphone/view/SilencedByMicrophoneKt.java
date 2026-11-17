package com.facebook.aura.microphone.view;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.C1BN;
import X.C78N;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.microphone.api.Microphone;
import com.facebook.aura.vds.compose.accessibility.ScreenReaderKt;

/* loaded from: classes.dex */
public abstract class SilencedByMicrophoneKt {
    public static final boolean rememberSilencedByMicrophone(Object obj, BFM bfm, int i) {
        bfm.AgE(690562694);
        if (!ScreenReaderKt.rememberIsScreenReaderEnabled(bfm, 0)) {
            AnonymousClass001.A1D(bfm);
            return false;
        }
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = Microphone.INSTANCE.holder(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        C1BN c1bn = (C1BN) objAaT;
        boolean zA1K = AnonymousClass003.A1K(bfm, obj, c1bn);
        Object objAaT2 = bfm.AaT();
        if (zA1K || objAaT2 == C78N.A00) {
            objAaT2 = AnonymousClass005.A0S(bfm, AnonymousClass002.A1X(c1bn.getValue()));
        }
        MutableState mutableState = (MutableState) objAaT2;
        boolean zA1N = AnonymousClass003.A1N(bfm, c1bn, mutableState);
        Object objAaT3 = bfm.AaT();
        if (zA1N || objAaT3 == C78N.A00) {
            objAaT3 = new SilencedByMicrophoneKt$rememberSilencedByMicrophone$1$1(c1bn, mutableState, null);
            bfm.Ai0(objAaT3);
        }
        AnonymousClass001.A18(bfm, objAaT3, mutableState);
        boolean zA0A = MutableState.A0A(mutableState);
        AnonymousClass001.A1D(bfm);
        return zA0A;
    }
}
