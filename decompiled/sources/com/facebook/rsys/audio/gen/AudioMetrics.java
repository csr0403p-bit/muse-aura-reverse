package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class AudioMetrics {
    public static G50<AudioMetrics> CONVERTER = C8923Ftf.A00(38);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioMetrics createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, int i2, int i3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getAudioLevel();

    public native int getFrameRate();

    public native int getInterframeTime();

    public native int hashCode();

    public native String toString();

    static {
        GUX.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioMetrics)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AudioMetrics(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioMetrics(int i, int i2, int i3) {
        this.mNativeHolder = initNativeHolder(i, i2, i3);
    }
}
