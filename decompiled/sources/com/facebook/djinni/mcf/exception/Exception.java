package com.facebook.djinni.mcf.exception;

import X.AnonymousClass006;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class Exception extends Throwable {
    public static G50<Exception> CONVERTER = C8923Ftf.A00(0);
    public static long sMcfTypeId;
    public final String message;

    public static native Exception createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Exception) {
                String str = this.message;
                String str2 = ((Exception) obj).message;
                if (str != null ? !str.equals(str2) : str2 != null) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass006.A0G(this.message);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return FGI.A0U("Exception{message=", this.message, "}");
    }

    public Exception(String str) {
        super(str);
        this.message = str;
    }
}
