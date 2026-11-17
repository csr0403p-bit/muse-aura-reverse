package androidx.media3.exoplayer.audio;

import X.C6154Dwx;

/* loaded from: classes5.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final C6154Dwx format;

    public AudioSink$ConfigurationException(C6154Dwx c6154Dwx, String str) {
        super(str);
        this.format = c6154Dwx;
    }

    public AudioSink$ConfigurationException(C6154Dwx c6154Dwx, Throwable th) {
        super(th);
        this.format = c6154Dwx;
    }
}
