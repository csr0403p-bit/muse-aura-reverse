package com.facebook.rsys.appdrivenaudio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioStateManagerProxy {
    public static G50<AudioStateManagerProxy> CONVERTER = C8923Ftf.A00(23);

    public final class CProxy extends AudioStateManagerProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioStateManagerProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
        public native boolean builtInAecIsAvailable();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
        public native boolean builtInAgcIsAvailable();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
        public native boolean builtInNsIsAvailable();

        public native int hashCode();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
        public native void notifyMicrophoneMute(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy
        public native void setTransport(AppDrivenAudioTransport appDrivenAudioTransport);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioStateManagerProxy)) {
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

    public abstract boolean builtInAecIsAvailable();

    public abstract boolean builtInAgcIsAvailable();

    public abstract boolean builtInNsIsAvailable();

    public abstract void notifyMicrophoneMute(boolean z);

    public abstract void setTransport(AppDrivenAudioTransport appDrivenAudioTransport);
}
