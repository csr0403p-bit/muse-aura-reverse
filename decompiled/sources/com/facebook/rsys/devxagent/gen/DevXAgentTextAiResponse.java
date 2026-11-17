package com.facebook.rsys.devxagent.gen;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class DevXAgentTextAiResponse {
    public static G50<DevXAgentTextAiResponse> CONVERTER = C8925Fth.A00(10);
    public static long sMcfTypeId;
    public final String agentCommandId;
    public final ArrayList<DevXAgentTextAiContentBlock> contentBlocks;
    public final String conversationId;
    public final String errorMessage;
    public final int streamingState;

    public static native DevXAgentTextAiResponse createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevXAgentTextAiResponse) {
                DevXAgentTextAiResponse devXAgentTextAiResponse = (DevXAgentTextAiResponse) obj;
                if (this.agentCommandId.equals(devXAgentTextAiResponse.agentCommandId) && this.conversationId.equals(devXAgentTextAiResponse.conversationId) && this.contentBlocks.equals(devXAgentTextAiResponse.contentBlocks) && this.streamingState == devXAgentTextAiResponse.streamingState) {
                    String str = this.errorMessage;
                    String str2 = devXAgentTextAiResponse.errorMessage;
                    if (str != null ? !str.equals(str2) : str2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.contentBlocks, AnonymousClass005.A0I(this.conversationId, BV8.A0B(this.agentCommandId))) + this.streamingState) * 31) + AnonymousClass006.A0G(this.errorMessage);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DevXAgentTextAiResponse{agentCommandId=");
        sbA0x.append(this.agentCommandId);
        sbA0x.append(",conversationId=");
        sbA0x.append(this.conversationId);
        sbA0x.append(",contentBlocks=");
        sbA0x.append(this.contentBlocks);
        sbA0x.append(",streamingState=");
        sbA0x.append(this.streamingState);
        sbA0x.append(",errorMessage=");
        return AbstractC7610F5x.A0w(this.errorMessage, sbA0x);
    }

    public DevXAgentTextAiResponse(String str, String str2, ArrayList<DevXAgentTextAiContentBlock> arrayList, int i, String str3) {
        AbstractC7609F5w.A1H(str, str2, arrayList);
        this.agentCommandId = str;
        this.conversationId = str2;
        this.contentBlocks = arrayList;
        this.streamingState = i;
        this.errorMessage = str3;
    }
}
