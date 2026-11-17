package com.facebook.aura.partners.voice.session.impl;

import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CapturedSpeech {
    public final short[] pcm;
    public final int voicedMs;

    public CapturedSpeech(short[] sArr, int i) {
        C7384Etj.A0Y(sArr, 0);
        this.pcm = sArr;
        this.voicedMs = i;
    }

    public final short[] getPcm() {
        return this.pcm;
    }

    public final int getVoicedMs() {
        return this.voicedMs;
    }
}
