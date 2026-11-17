package com.facebook.rsys.screenshare.gen;

import X.F60;
import com.facebook.rsys.audio.frame.gen.AudioFrame;

/* loaded from: classes6.dex */
public abstract class ScreenShareAudioProxy {
    public abstract void didReceiveAudioData(AudioFrame audioFrame);

    public ScreenShareAudioProxy() {
        throw F60.createAndThrow();
    }
}
