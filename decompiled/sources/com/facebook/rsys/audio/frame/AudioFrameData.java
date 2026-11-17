package com.facebook.rsys.audio.frame;

import X.ETi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class AudioFrameData {
    public static final AudioFrameData $redex_init_class = null;
    public final short[] mAudioData;
    public final NativeHolder mNativeHolder;

    public static native AudioFrameData createFromMcfType(McfReference mcfReference);

    public static native long getMcfTypeId();

    public static native NativeHolder initNativeHolder(short[] sArr);

    private native boolean nativeEquals(Object obj);

    private native void releaseAndSync(short[] sArr);

    public native short[] getAudioData(int i);

    public native int hashCode();

    public native String toString();

    static {
        ETi.loadLibrary("rsysaudioframejni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioFrameData)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public void releaseAndSyncFromNative() {
        short[] sArr = this.mAudioData;
        if (sArr != null) {
            releaseAndSync(sArr);
        }
    }

    public AudioFrameData(short[] sArr) {
        this.mNativeHolder = initNativeHolder(sArr);
        this.mAudioData = sArr;
    }

    public AudioFrameData(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
        this.mAudioData = null;
    }
}
