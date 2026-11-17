package com.facebook.rsys.audio.frame.gen;

import X.C8923Ftf;
import X.G50;
import X.GUQ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class AudioTtsMetadata {
    public static G50<AudioTtsMetadata> CONVERTER = C8923Ftf.A00(31);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioTtsMetadata createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(boolean z, boolean z2, byte b, byte[] bArr, TtsSpeechChunk ttsSpeechChunk);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native byte[] getInteractionId();

    public native boolean getIsSilence();

    public native boolean getIsTts();

    public native TtsSpeechChunk getSpeechChunk();

    public native byte getUseCase();

    public native int hashCode();

    public native String toString();

    static {
        GUQ.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioTtsMetadata)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AudioTtsMetadata(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioTtsMetadata(boolean z, boolean z2, byte b, byte[] bArr, TtsSpeechChunk ttsSpeechChunk) {
        this.mNativeHolder = initNativeHolder(z, z2, b, bArr, ttsSpeechChunk);
    }
}
