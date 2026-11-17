package com.facebook.rsys.metaaivoicestate.api.gen;

import X.BV8;
import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class VoiceCommandExecutionResult {
    public static G50<VoiceCommandExecutionResult> CONVERTER = C8921Ftd.A00(16);
    public static long sMcfTypeId;
    public final String commandId;
    public final int voiceCommandType;

    public static native VoiceCommandExecutionResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCommandExecutionResult) {
                VoiceCommandExecutionResult voiceCommandExecutionResult = (VoiceCommandExecutionResult) obj;
                if (!this.commandId.equals(voiceCommandExecutionResult.commandId) || this.voiceCommandType != voiceCommandExecutionResult.voiceCommandType) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A0B(this.commandId) + this.voiceCommandType;
    }

    public String toString() {
        return FGI.A0A(this.voiceCommandType, "VoiceCommandExecutionResult{commandId=", this.commandId, ",voiceCommandType=", "}");
    }

    public VoiceCommandExecutionResult(String str, int i) {
        str.getClass();
        this.commandId = str;
        this.voiceCommandType = i;
    }
}
