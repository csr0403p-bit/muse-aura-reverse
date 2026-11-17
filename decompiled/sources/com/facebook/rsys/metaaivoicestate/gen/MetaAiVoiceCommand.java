package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiVoiceCommand {
    public static G50<MetaAiVoiceCommand> CONVERTER = C8921Ftd.A00(41);
    public static long sMcfTypeId;
    public final CommandData commandData;
    public final String commandId;
    public final int commandType;
    public final String error;

    public static native MetaAiVoiceCommand createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiVoiceCommand) {
                MetaAiVoiceCommand metaAiVoiceCommand = (MetaAiVoiceCommand) obj;
                if (this.commandId.equals(metaAiVoiceCommand.commandId) && this.commandType == metaAiVoiceCommand.commandType) {
                    String str = this.error;
                    String str2 = metaAiVoiceCommand.error;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.commandData.equals(metaAiVoiceCommand.commandData)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.commandData, (((BV8.A0B(this.commandId) + this.commandType) * 31) + AnonymousClass006.A0G(this.error)) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetaAiVoiceCommand{commandId=");
        sbA0x.append(this.commandId);
        sbA0x.append(",commandType=");
        sbA0x.append(this.commandType);
        sbA0x.append(",error=");
        sbA0x.append(this.error);
        sbA0x.append(",commandData=");
        return BV8.A0v(this.commandData, sbA0x);
    }

    public MetaAiVoiceCommand(String str, int i, String str2, CommandData commandData) {
        str.getClass();
        commandData.getClass();
        this.commandId = str;
        this.commandType = i;
        this.error = str2;
        this.commandData = commandData;
    }
}
