package com.facebook.rsys.ended.gen;

import X.C8925Fth;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ErrorMessageFallback {
    public static G50<ErrorMessageFallback> CONVERTER = C8925Fth.A00(24);
    public static long sMcfTypeId;
    public final String message;

    public static native ErrorMessageFallback createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorMessageFallback) {
            return this.message.equals(((ErrorMessageFallback) obj).message);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.message.hashCode();
    }

    public String toString() {
        return FGI.A0U("ErrorMessageFallback{message=", this.message, "}");
    }

    public ErrorMessageFallback(String str) {
        str.getClass();
        this.message = str;
    }
}
