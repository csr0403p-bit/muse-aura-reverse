package com.facebook.rsys.devxagent.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DevXAgentTextAiParams {
    public static G50<DevXAgentTextAiParams> CONVERTER = C8925Fth.A00(8);
    public static long sMcfTypeId;
    public final String agentCommandId;
    public final int commandType;
    public final String conversationId;
    public final String messageText;
    public final boolean streamResponse;

    public static native DevXAgentTextAiParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevXAgentTextAiParams) {
                DevXAgentTextAiParams devXAgentTextAiParams = (DevXAgentTextAiParams) obj;
                if (this.agentCommandId.equals(devXAgentTextAiParams.agentCommandId) && this.commandType == devXAgentTextAiParams.commandType) {
                    String str = this.conversationId;
                    String str2 = devXAgentTextAiParams.conversationId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.messageText;
                        String str4 = devXAgentTextAiParams.messageText;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        if (this.streamResponse == devXAgentTextAiParams.streamResponse) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((BV8.A0B(this.agentCommandId) + this.commandType) * 31) + AnonymousClass006.A0G(this.conversationId)) * 31) + AnonymousClass005.A0H(this.messageText)) * 31) + (this.streamResponse ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DevXAgentTextAiParams{agentCommandId=");
        sbA0x.append(this.agentCommandId);
        sbA0x.append(",commandType=");
        sbA0x.append(this.commandType);
        sbA0x.append(",conversationId=");
        sbA0x.append(this.conversationId);
        sbA0x.append(",messageText=");
        sbA0x.append(this.messageText);
        sbA0x.append(",streamResponse=");
        return AbstractC7610F5x.A0y(sbA0x, this.streamResponse);
    }

    public DevXAgentTextAiParams(String str, int i, String str2, String str3, boolean z) {
        str.getClass();
        this.agentCommandId = str;
        this.commandType = i;
        this.conversationId = str2;
        this.messageText = str3;
        this.streamResponse = z;
    }
}
