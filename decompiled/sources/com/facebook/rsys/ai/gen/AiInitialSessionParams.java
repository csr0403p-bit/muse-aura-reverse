package com.facebook.rsys.ai.gen;

import X.GUV;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.outgoingcallconfig.gen.StateSyncMessage;

/* loaded from: classes6.dex */
public abstract class AiInitialSessionParams {

    public final class CProxy extends AiInitialSessionParams {
        public static native StateSyncMessage create(String str, int i, String str2, OptionalParams optionalParams);

        public static native AiInitialSessionParams createFromMcfType(McfReference mcfReference);

        public static native AiSessionCreateResult createWithSessionParams(String str, int i, String str2, OptionalParams optionalParams);

        public static native long nativeGetMcfTypeId();

        static {
            GUV.A00();
        }
    }
}
