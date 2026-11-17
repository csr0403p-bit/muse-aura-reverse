package com.facebook.rsys.appdrivenaudio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class AppDrivenAudioDevice {
    public static G50<AppDrivenAudioDevice> CONVERTER = C8923Ftf.A00(17);

    public final class CProxy extends AppDrivenAudioDevice {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AppDrivenAudioDevice createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native boolean builtInAecIsAvailable();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native boolean builtInAgcIsAvailable();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native boolean builtInNsIsAvailable();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void enableBuiltInAec(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void enableBuiltInAgc(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void enableBuiltInNs(boolean z);

        public native int hashCode();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void initPlayout(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void initRecording(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native boolean isPlaying();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native boolean isRecording();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void notifyMicrophoneMute(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void playStartEarcon();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native Integer recordingSessionId();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void releasePlayout(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void releaseRecording();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void reset(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void setListener(AudioStateManagerListener audioStateManagerListener);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void setPlayoutSink(AppDrivenAudioPcmSink appDrivenAudioPcmSink);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void setRecordingSink(AppDrivenAudioPcmSink appDrivenAudioPcmSink);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void setTaskRunner(AudioStateManagerTaskRunner audioStateManagerTaskRunner);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void setTransport(AppDrivenAudioTransport appDrivenAudioTransport);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void setup(Map<String, String> map, Map<String, Integer> map2, Map<String, Boolean> map3);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void startPlayout();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void startRecording();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void stopPlayout(boolean z);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice
        public native void stopRecording();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AppDrivenAudioDevice)) {
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

    public abstract void enableBuiltInAec(boolean z);

    public abstract void enableBuiltInAgc(boolean z);

    public abstract void enableBuiltInNs(boolean z);

    public abstract void initPlayout(boolean z);

    public abstract void initRecording(boolean z);

    public abstract boolean isPlaying();

    public abstract boolean isRecording();

    public abstract void notifyMicrophoneMute(boolean z);

    public abstract void playStartEarcon();

    public abstract Integer recordingSessionId();

    public abstract void releasePlayout(boolean z);

    public abstract void releaseRecording();

    public abstract void reset(boolean z);

    public abstract void setListener(AudioStateManagerListener audioStateManagerListener);

    public abstract void setPlayoutSink(AppDrivenAudioPcmSink appDrivenAudioPcmSink);

    public abstract void setRecordingSink(AppDrivenAudioPcmSink appDrivenAudioPcmSink);

    public abstract void setTaskRunner(AudioStateManagerTaskRunner audioStateManagerTaskRunner);

    public abstract void setTransport(AppDrivenAudioTransport appDrivenAudioTransport);

    public abstract void setup(Map<String, String> map, Map<String, Integer> map2, Map<String, Boolean> map3);

    public abstract void startPlayout();

    public abstract void startRecording();

    public abstract void stopPlayout(boolean z);

    public abstract void stopRecording();
}
