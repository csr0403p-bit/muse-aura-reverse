package com.facebook.rsys.ended.gen;

import X.BV8;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class UnsupportedCapabilityFallbacks {
    public static G50<UnsupportedCapabilityFallbacks> CONVERTER = C8925Fth.A00(25);
    public static long sMcfTypeId;
    public final ErrorMessageFallback errorMessage;

    public static native UnsupportedCapabilityFallbacks createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnsupportedCapabilityFallbacks) {
            return this.errorMessage.equals(((UnsupportedCapabilityFallbacks) obj).errorMessage);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.errorMessage.hashCode();
    }

    public String toString() {
        return BV8.A0v(this.errorMessage, C60O.A0x("UnsupportedCapabilityFallbacks{errorMessage="));
    }

    public UnsupportedCapabilityFallbacks(ErrorMessageFallback errorMessageFallback) {
        errorMessageFallback.getClass();
        this.errorMessage = errorMessageFallback;
    }
}
