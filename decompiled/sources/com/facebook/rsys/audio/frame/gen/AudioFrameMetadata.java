package com.facebook.rsys.audio.frame.gen;

import X.C8923Ftf;
import X.G50;
import X.GUQ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class AudioFrameMetadata {
    public static G50<AudioFrameMetadata> CONVERTER = C8923Ftf.A00(30);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioFrameMetadata createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, int i2, int i3, boolean z, AudioFrameDetails audioFrameDetails);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native AudioFrameDetails getDetails();

    public native boolean getIsMuted();

    public native int getNumberOfChannels();

    public native int getNumberOfSamples();

    public native int getSampleRate();

    public native int hashCode();

    public native String toString();

    static {
        GUQ.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioFrameMetadata)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AudioFrameMetadata(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioFrameMetadata(int i, int i2, int i3, boolean z, AudioFrameDetails audioFrameDetails) {
        this.mNativeHolder = initNativeHolder(i, i2, i3, z, audioFrameDetails);
    }
}
