package com.facebook.aura.composer.dictation.pcm;

import X.G0U;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes5.dex */
public interface PcmDictationStream {
    void append(short[] sArr);

    Object awaitAcknowledged(HtJ<? super Boolean> htJ);

    void close();

    Object finish(HtJ<? super String> htJ);

    G0U<String, Unit> getOnPartial();

    void setOnPartial(G0U<? super String, Unit> g0u);
}
