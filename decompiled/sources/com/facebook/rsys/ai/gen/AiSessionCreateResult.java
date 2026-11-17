package com.facebook.rsys.ai.gen;

import X.BV8;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.outgoingcallconfig.gen.StateSyncMessage;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class AiSessionCreateResult {
    public static G50<AiSessionCreateResult> CONVERTER = C8923Ftf.A00(1);
    public static long sMcfTypeId;
    public final byte[] sessionParamsPayload;
    public final StateSyncMessage stateSyncMessage;

    public class Builder {
        public byte[] sessionParamsPayload;
        public StateSyncMessage stateSyncMessage;

        public AiSessionCreateResult build() {
            return new AiSessionCreateResult(this);
        }
    }

    public static native AiSessionCreateResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiSessionCreateResult) {
                AiSessionCreateResult aiSessionCreateResult = (AiSessionCreateResult) obj;
                if (!this.stateSyncMessage.equals(aiSessionCreateResult.stateSyncMessage) || !Arrays.equals(this.sessionParamsPayload, aiSessionCreateResult.sessionParamsPayload)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A09(this.stateSyncMessage) + Arrays.hashCode(this.sessionParamsPayload);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AiSessionCreateResult{stateSyncMessage=");
        sbA0x.append(this.stateSyncMessage);
        sbA0x.append(",sessionParamsPayload=");
        return BV8.A0v(this.sessionParamsPayload, sbA0x);
    }

    public AiSessionCreateResult(Builder builder) {
        builder.stateSyncMessage.getClass();
        builder.sessionParamsPayload.getClass();
        this.stateSyncMessage = builder.stateSyncMessage;
        this.sessionParamsPayload = builder.sessionParamsPayload;
    }
}
