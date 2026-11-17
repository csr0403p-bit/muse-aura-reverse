package com.facebook.aura.partners.voice.session.impl;

import X.ADq;
import X.AbstractC7607F5u;
import X.C7384Etj;
import X.G8W;

/* loaded from: classes6.dex */
public abstract class HatchCallControllerConfigKt {
    public static final int DEFAULT_JOIN_REQUEST_RETRY_MIN_BACKOFF_S = 4;
    public static final int PRE_ENCODE_AUDIO_BUFFER_MS = 8000;
    public static final int RECONNECT_TIMEOUT_MS = 30000;
    public static final ADq VALID_JOIN_REQUEST_RETRY_MIN_BACKOFF_S = AbstractC7607F5u.A1C(1, 30);

    public static final void applyHatchVoiceH265Config(G8W g8w) {
        C7384Etj.A0Y(g8w, 0);
        int[] iArr = g8w.A00;
        iArr[2420] = 0;
        iArr[203] = 0;
        iArr[755] = 0;
        iArr[3660] = 0;
        iArr[2287] = 0;
        iArr[437] = 1;
        iArr[475] = 1;
        iArr[4284] = 1;
        iArr[510] = 1;
        iArr[4682] = 0;
        iArr[5200] = 1;
        iArr[5201] = 1;
        iArr[87] = 99;
        iArr[88] = 0;
        iArr[6375] = 1;
    }
}
