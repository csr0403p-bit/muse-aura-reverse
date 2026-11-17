package com.facebook.rsys.appdrivenaudio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioStateManagerListener {
    public static G50<AudioStateManagerListener> CONVERTER = C8923Ftf.A00(22);

    public final class CProxy extends AudioStateManagerListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioStateManagerListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener
        public native void onError(String str);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener
        public native void onFirstFramePlayed();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener
        public native void onFirstFrameRecorded();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener
        public native void onPlayoutPathLive();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioStateManagerListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUW.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onError(String str);

    public abstract void onFirstFramePlayed();

    public abstract void onFirstFrameRecorded();

    public abstract void onPlayoutPathLive();
}
