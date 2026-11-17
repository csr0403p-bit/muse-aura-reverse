package com.facebook.aura.partners.voice.intf;

import X.BFM;
import X.BRg;

/* loaded from: classes2.dex */
public interface VoiceCallControlsAction {
    void Button(BRg bRg, BFM bfm, int i);

    boolean isAvailable(BFM bfm, int i);
}
