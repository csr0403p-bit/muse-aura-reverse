package com.facebook.rsys.audiodevicestate.manager.gen;

import X.C8926Fti;
import X.G50;
import X.GVh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy;
import com.facebook.rsys.audio.gen.AudioDeviceApi;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceStateListener;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioDeviceRtcSession {
    public static G50<AudioDeviceRtcSession> CONVERTER = C8926Fti.A00(2);

    public final class CProxy extends AudioDeviceRtcSession {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioDeviceRtcSession createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native AudioStateManagerProxy getAppDrivenAudioProxy();

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native AudioDeviceApi getAudioDeviceApi();

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native String getSessionId();

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native void handleSelfParticipantState(int i);

        public native int hashCode();

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native String registerStateListenerCopyId(AudioDeviceStateListener audioDeviceStateListener);

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native void setAudioDeviceModuleLatch(AudioDeviceModuleLatch audioDeviceModuleLatch);

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native void setPerfLogger(PerfLoggerHolder perfLoggerHolder, int i);

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native void setWaitForDeviceActivation(boolean z);

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession
        public native void unregisterStateListener(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioDeviceRtcSession)) {
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

    public abstract AudioStateManagerProxy getAppDrivenAudioProxy();

    public abstract AudioDeviceApi getAudioDeviceApi();

    public abstract String getSessionId();

    public abstract void handleSelfParticipantState(int i);

    public abstract String registerStateListenerCopyId(AudioDeviceStateListener audioDeviceStateListener);

    public abstract void setAudioDeviceModuleLatch(AudioDeviceModuleLatch audioDeviceModuleLatch);

    public abstract void setPerfLogger(PerfLoggerHolder perfLoggerHolder, int i);

    public abstract void setWaitForDeviceActivation(boolean z);

    public abstract void unregisterStateListener(String str);
}
