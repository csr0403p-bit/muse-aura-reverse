package com.facebook.rsys.appdrivenaudio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class AppDrivenAudioTransport {
    public static G50<AppDrivenAudioTransport> CONVERTER = C8923Ftf.A00(21);

    public final class CProxy extends AppDrivenAudioTransport {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AppDrivenAudioTransport createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport
        public native int needMorePlayData(AudioFrame audioFrame);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport
        public native void notifyBoolEvents(int i, Map<String, Boolean> map);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport
        public native void notifyIntEvents(int i, Map<String, Integer> map);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport
        public native void notifyStringEvents(int i, Map<String, String> map);

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport
        public native void recordedDataIsAvailable(AudioFrame audioFrame);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AppDrivenAudioTransport)) {
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

    public abstract int needMorePlayData(AudioFrame audioFrame);

    public abstract void notifyBoolEvents(int i, Map<String, Boolean> map);

    public abstract void notifyIntEvents(int i, Map<String, Integer> map);

    public abstract void notifyStringEvents(int i, Map<String, String> map);

    public abstract void recordedDataIsAvailable(AudioFrame audioFrame);
}
