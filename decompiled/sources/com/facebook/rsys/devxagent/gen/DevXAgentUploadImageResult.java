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
public class DevXAgentUploadImageResult {
    public static G50<DevXAgentUploadImageResult> CONVERTER = C8925Fth.A00(12);
    public static long sMcfTypeId;
    public final String agentCommandId;
    public final String attachmentId;
    public final String errorMessage;
    public final boolean success;

    public static native DevXAgentUploadImageResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevXAgentUploadImageResult) {
                DevXAgentUploadImageResult devXAgentUploadImageResult = (DevXAgentUploadImageResult) obj;
                if (this.agentCommandId.equals(devXAgentUploadImageResult.agentCommandId)) {
                    String str = this.attachmentId;
                    String str2 = devXAgentUploadImageResult.attachmentId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.success == devXAgentUploadImageResult.success) {
                            String str3 = this.errorMessage;
                            String str4 = devXAgentUploadImageResult.errorMessage;
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
        return ((((BV8.A0B(this.agentCommandId) + AnonymousClass006.A0G(this.attachmentId)) * 31) + (this.success ? 1 : 0)) * 31) + AnonymousClass005.A0H(this.errorMessage);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DevXAgentUploadImageResult{agentCommandId=");
        sbA0x.append(this.agentCommandId);
        sbA0x.append(",attachmentId=");
        sbA0x.append(this.attachmentId);
        sbA0x.append(",success=");
        sbA0x.append(this.success);
        sbA0x.append(",errorMessage=");
        return AbstractC7610F5x.A0w(this.errorMessage, sbA0x);
    }

    public DevXAgentUploadImageResult(String str, String str2, boolean z, String str3) {
        str.getClass();
        this.agentCommandId = str;
        this.attachmentId = str2;
        this.success = z;
        this.errorMessage = str3;
    }
}
