package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiToolCallRequest {
    public static G50<MetaAiToolCallRequest> CONVERTER = C8921Ftd.A00(39);
    public static long sMcfTypeId;
    public final String argumentsJson;
    public final Integer timeoutMs;
    public final String toolCallId;
    public final String toolName;

    public static native MetaAiToolCallRequest createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiToolCallRequest) {
                MetaAiToolCallRequest metaAiToolCallRequest = (MetaAiToolCallRequest) obj;
                if (this.toolCallId.equals(metaAiToolCallRequest.toolCallId) && this.toolName.equals(metaAiToolCallRequest.toolName) && this.argumentsJson.equals(metaAiToolCallRequest.argumentsJson)) {
                    Integer num = this.timeoutMs;
                    Integer num2 = metaAiToolCallRequest.timeoutMs;
                    if (num != null ? !num.equals(num2) : num2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.argumentsJson, AnonymousClass005.A0I(this.toolName, BV8.A0B(this.toolCallId))) + AnonymousClass006.A0D(this.timeoutMs);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetaAiToolCallRequest{toolCallId=");
        sbA0x.append(this.toolCallId);
        sbA0x.append(",toolName=");
        sbA0x.append(this.toolName);
        sbA0x.append(",argumentsJson=");
        sbA0x.append(this.argumentsJson);
        sbA0x.append(",timeoutMs=");
        return BV8.A0v(this.timeoutMs, sbA0x);
    }

    public MetaAiToolCallRequest(String str, String str2, String str3, Integer num) {
        AbstractC7609F5w.A1H(str, str2, str3);
        this.toolCallId = str;
        this.toolName = str2;
        this.argumentsJson = str3;
        this.timeoutMs = num;
    }
}
