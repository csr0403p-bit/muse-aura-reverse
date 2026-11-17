package com.facebook.rsys.appdrivenaudio.gen;

import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AppDrivenAudioDeviceConfig {
    public static G50<AppDrivenAudioDeviceConfig> CONVERTER = C8923Ftf.A00(18);
    public static long sMcfTypeId;

    public static native AppDrivenAudioDeviceConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public String toString() {
        return "AppDrivenAudioDeviceConfig{}";
    }
}
