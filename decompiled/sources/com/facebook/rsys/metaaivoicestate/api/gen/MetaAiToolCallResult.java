package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiToolCallResult {
    public static G50<MetaAiToolCallResult> CONVERTER = C8921Ftd.A00(9);
    public static long sMcfTypeId;
    public final String errorMessage;
    public final String resultJson;
    public final int status;
    public final String toolCallId;

    public static native MetaAiToolCallResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiToolCallResult) {
                MetaAiToolCallResult metaAiToolCallResult = (MetaAiToolCallResult) obj;
                if (this.toolCallId.equals(metaAiToolCallResult.toolCallId)) {
                    String str = this.resultJson;
                    String str2 = metaAiToolCallResult.resultJson;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.status == metaAiToolCallResult.status) {
                            String str3 = this.errorMessage;
                            String str4 = metaAiToolCallResult.errorMessage;
                            if (str3 == null) {
                                if (str4 != null) {
                                    return false;
                                }
                            } else if (str3.equals(str4)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((BV8.A0B(this.toolCallId) + AnonymousClass006.A0G(this.resultJson)) * 31) + this.status) * 31) + AnonymousClass005.A0H(this.errorMessage);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetaAiToolCallResult{toolCallId=");
        sbA0x.append(this.toolCallId);
        sbA0x.append(",resultJson=");
        sbA0x.append(this.resultJson);
        sbA0x.append(",status=");
        sbA0x.append(this.status);
        sbA0x.append(",errorMessage=");
        return AbstractC7610F5x.A0w(this.errorMessage, sbA0x);
    }

    public MetaAiToolCallResult(String str, String str2, int i, String str3) {
        str.getClass();
        this.toolCallId = str;
        this.resultJson = str2;
        this.status = i;
        this.errorMessage = str3;
    }
}
