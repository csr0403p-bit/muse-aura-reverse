package com.facebook.rsys.audiodevicestate.gen;

import X.C8926Fti;
import X.G50;
import X.GXw;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioDeviceStateListener {
    public static G50<AudioDeviceStateListener> CONVERTER = C8926Fti.A00(0);

    public final class CProxy extends AudioDeviceStateListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioDeviceStateListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.audiodevicestate.gen.AudioDeviceStateListener
        public native void onDeviceActive(int i);

        @Override // com.facebook.rsys.audiodevicestate.gen.AudioDeviceStateListener
        public native void onInputRouteChanged(AudioInputRoute audioInputRoute);

        @Override // com.facebook.rsys.audiodevicestate.gen.AudioDeviceStateListener
        public native void onOutputRouteChanged(AudioOutputRoute audioOutputRoute);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioDeviceStateListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GXw.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onDeviceActive(int i);

    public abstract void onInputRouteChanged(AudioInputRoute audioInputRoute);

    public abstract void onOutputRouteChanged(AudioOutputRoute audioOutputRoute);
}
