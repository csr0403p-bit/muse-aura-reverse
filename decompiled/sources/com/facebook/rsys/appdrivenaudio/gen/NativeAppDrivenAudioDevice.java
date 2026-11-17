package com.facebook.rsys.appdrivenaudio.gen;

import X.GUW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public abstract class NativeAppDrivenAudioDevice {

    public final class CProxy extends NativeAppDrivenAudioDevice {
        public static native AppDrivenAudioDevice create();

        public static native NativeAppDrivenAudioDevice createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();

        static {
            GUW.A00();
        }
    }
}
