package com.facebook.rsys.audiomodule.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.C8926Fti;
import X.ETi;
import X.G50;
import X.GW6;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioModule {
    public static G50<AudioModule> CONVERTER = C8926Fti.A00(7);

    public final class CProxy extends AudioModule {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioModule createFromMcfType(McfReference mcfReference);

        public static native AudioModule createImp(OverlayConfigManagerHolder overlayConfigManagerHolder);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void deliverAppLevelAudio(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void enableNoiseSuppression(boolean z);

        public native int hashCode();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native int injectPlayoutAudio(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void setBotPlayoutPaused(boolean z);

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void startPlayout();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void startRecording();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void stopPlayout();

        @Override // com.facebook.rsys.audiomodule.gen.AudioModule
        public native void stopRecording();

        static {
            if (GW6.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("webrtcLatest");
                ETi.loadLibrary("rsysaudiomodulejniLatest");
                GW6.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioModule)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void deliverAppLevelAudio(AudioFrame audioFrame);

    public abstract void enableNoiseSuppression(boolean z);

    public abstract int injectPlayoutAudio(AudioFrame audioFrame);

    public abstract void setBotPlayoutPaused(boolean z);

    public abstract void startPlayout();

    public abstract void startRecording();

    public abstract void stopPlayout();

    public abstract void stopRecording();
}
