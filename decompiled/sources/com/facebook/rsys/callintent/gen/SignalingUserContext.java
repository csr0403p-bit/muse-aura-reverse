package com.facebook.rsys.callintent.gen;

import X.AbstractC7609F5w;
import X.C8926Fti;
import X.G50;
import X.GUb;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public class SignalingUserContext {
    public static G50<SignalingUserContext> CONVERTER = C8926Fti.A00(27);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native SignalingUserContext createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, String str3, SignalingTransportProxy signalingTransportProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, EnvironmentVariablesProxy environmentVariablesProxy);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getAppId();

    public native String getDeviceId();

    public native EnvironmentVariablesProxy getEnvironmentVariables();

    public native OverlayConfigManagerHolder getOverlayConfigManager();

    public native SignalingTransportProxy getSignalingTransport();

    public native String getUserId();

    public native int hashCode();

    public native String toString();

    static {
        GUb.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SignalingUserContext)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public SignalingUserContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SignalingUserContext(String str, String str2, String str3, SignalingTransportProxy signalingTransportProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, EnvironmentVariablesProxy environmentVariablesProxy) {
        AbstractC7609F5w.A1H(str, str2, str3);
        signalingTransportProxy.getClass();
        overlayConfigManagerHolder.getClass();
        this.mNativeHolder = initNativeHolder(str, str2, str3, signalingTransportProxy, overlayConfigManagerHolder, environmentVariablesProxy);
    }
}
