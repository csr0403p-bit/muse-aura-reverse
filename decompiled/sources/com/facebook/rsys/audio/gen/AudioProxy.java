package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioProxy {
    public static G50<AudioProxy> CONVERTER = C8923Ftf.A00(41);

    public final class CProxy extends AudioProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native AudioInputRoute createInitialAudioInputRoute();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native AudioOutputRoute createInitialAudioOutputRoute();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setApi(AudioApi audioApi);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioDeviceModule(AudioDeviceModule audioDeviceModule);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioInputRoute(AudioInputRoute audioInputRoute);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioOn(boolean z, boolean z2);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioOutputRouteAndVideoEnabled(AudioOutputRoute audioOutputRoute, boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setDeviceApi(AudioDeviceApi audioDeviceApi);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setIsCallActive(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUX.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract AudioInputRoute createInitialAudioInputRoute();

    public abstract AudioOutputRoute createInitialAudioOutputRoute();

    public abstract void setApi(AudioApi audioApi);

    public abstract void setAudioDeviceModule(AudioDeviceModule audioDeviceModule);

    public abstract void setAudioInputRoute(AudioInputRoute audioInputRoute);

    public abstract void setAudioOn(boolean z, boolean z2);

    public abstract void setAudioOutputRouteAndVideoEnabled(AudioOutputRoute audioOutputRoute, boolean z);

    public abstract void setDeviceApi(AudioDeviceApi audioDeviceApi);

    public abstract void setIsCallActive(boolean z);
}
