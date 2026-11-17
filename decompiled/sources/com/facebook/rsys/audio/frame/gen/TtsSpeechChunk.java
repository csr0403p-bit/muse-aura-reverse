package com.facebook.rsys.audio.frame.gen;

import X.C8923Ftf;
import X.G50;
import X.GUQ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class TtsSpeechChunk {
    public static G50<TtsSpeechChunk> CONVERTER = C8923Ftf.A00(32);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native TtsSpeechChunk createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, int i2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getChunkId();

    public native int getSpeechId();

    public native int hashCode();

    public native String toString();

    static {
        GUQ.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TtsSpeechChunk)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public TtsSpeechChunk(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public TtsSpeechChunk(int i, int i2) {
        this.mNativeHolder = initNativeHolder(i, i2);
    }
}
