package com.facebook.aura.partners.voice.session.impl;

import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PcmChunk {
    public final long end;
    public final short[] pcm;

    public PcmChunk(long j, short[] sArr) {
        C7384Etj.A0Y(sArr, 1);
        this.end = j;
        this.pcm = sArr;
    }

    public final long getEnd() {
        return this.end;
    }

    public final short[] getPcm() {
        return this.pcm;
    }
}
