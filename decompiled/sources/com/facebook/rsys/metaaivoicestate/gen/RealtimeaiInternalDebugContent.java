package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass006;
import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class RealtimeaiInternalDebugContent {
    public static G50<RealtimeaiInternalDebugContent> CONVERTER = C8921Ftd.A00(48);
    public static long sMcfTypeId;
    public final String message;

    public static native RealtimeaiInternalDebugContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RealtimeaiInternalDebugContent) {
                String str = this.message;
                String str2 = ((RealtimeaiInternalDebugContent) obj).message;
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

    public String toString() {
        return FGI.A0U("RealtimeaiInternalDebugContent{message=", this.message, "}");
    }

    public RealtimeaiInternalDebugContent(String str) {
        this.message = str;
    }
}
