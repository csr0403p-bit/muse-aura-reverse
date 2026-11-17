package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class AudioVadMetadata {
    public static G50<AudioVadMetadata> CONVERTER = C8923Ftf.A00(46);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioVadMetadata createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(byte[] bArr, int i);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native byte[] getScores();

    public native int getTimestamp();

    public native int hashCode();

    public native String toString();

    static {
        GUX.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioVadMetadata)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AudioVadMetadata(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioVadMetadata(byte[] bArr, int i) {
        bArr.getClass();
        this.mNativeHolder = initNativeHolder(bArr, i);
    }
}
