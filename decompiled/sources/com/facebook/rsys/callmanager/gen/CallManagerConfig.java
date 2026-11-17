package com.facebook.rsys.callmanager.gen;

import X.C8926Fti;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CallManagerConfig {
    public static G50<CallManagerConfig> CONVERTER = C8926Fti.A00(34);
    public static long sMcfTypeId;
    public final boolean allowMultipleActiveCalls;
    public final boolean allowSigSdk;

    public static native CallManagerConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallManagerConfig) {
                CallManagerConfig callManagerConfig = (CallManagerConfig) obj;
                if (this.allowMultipleActiveCalls != callManagerConfig.allowMultipleActiveCalls || this.allowSigSdk != callManagerConfig.allowSigSdk) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + (this.allowMultipleActiveCalls ? 1 : 0)) * 31) + (this.allowSigSdk ? 1 : 0);
    }

    public String toString() {
        return FGI.A0p("CallManagerConfig{allowMultipleActiveCalls=", ",allowSigSdk=", "}", this.allowMultipleActiveCalls, this.allowSigSdk);
    }

    public CallManagerConfig(boolean z, boolean z2) {
        this.allowMultipleActiveCalls = z;
        this.allowSigSdk = z2;
    }
}
