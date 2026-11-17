package com.facebook.rsys.audiodevicestate.manager.gen;

import X.C8926Fti;
import X.G50;
import X.GUo;
import X.GVh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceStateListener;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.util.future.RsysFuture;
import com.facebook.simplejni.NativeHolder;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes6.dex */
public abstract class AudioDeviceStateManager {
    public static G50<AudioDeviceStateManager> CONVERTER = C8926Fti.A00(5);

    public final class CProxy extends AudioDeviceStateManager {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioDeviceStateManager createFromMcfType(McfReference mcfReference);

        private native void destroy(RsysFuture<Void, Void> rsysFuture, TaskExecutor taskExecutor);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceStateManager
        public native AudioDeviceRtcSessionCreationResult createAudioDeviceRtcSession(String str, AudioDeviceRtcSessionStartParams audioDeviceRtcSessionStartParams);

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceStateManager
        public native AudioDeviceStateListener getListener();

        public native int hashCode();

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceStateManager
        public ListenableFuture<Void> destroy() {
            RsysFuture<Void, Void> rsysFuture = new RsysFuture<>();
            destroy(rsysFuture, new GUo());
            return rsysFuture;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioDeviceStateManager)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GVh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract AudioDeviceRtcSessionCreationResult createAudioDeviceRtcSession(String str, AudioDeviceRtcSessionStartParams audioDeviceRtcSessionStartParams);

    public abstract ListenableFuture<Void> destroy();

    public abstract AudioDeviceStateListener getListener();
}
