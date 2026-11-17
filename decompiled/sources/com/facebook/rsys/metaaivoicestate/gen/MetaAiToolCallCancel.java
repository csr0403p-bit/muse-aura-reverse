package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiToolCallCancel {
    public static G50<MetaAiToolCallCancel> CONVERTER = C8921Ftd.A00(38);
    public static long sMcfTypeId;
    public final String reason;
    public final String toolCallId;

    public static native MetaAiToolCallCancel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiToolCallCancel) {
                MetaAiToolCallCancel metaAiToolCallCancel = (MetaAiToolCallCancel) obj;
                if (this.toolCallId.equals(metaAiToolCallCancel.toolCallId)) {
                    String str = this.reason;
                    String str2 = metaAiToolCallCancel.reason;
                    if (str != null ? !str.equals(str2) : str2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A0B(this.toolCallId) + AnonymousClass006.A0G(this.reason);
    }

    public String toString() {
        return FGI.A0h("MetaAiToolCallCancel{toolCallId=", this.toolCallId, ",reason=", this.reason, "}");
    }

    public MetaAiToolCallCancel(String str, String str2) {
        str.getClass();
        this.toolCallId = str;
        this.reason = str2;
    }
}
