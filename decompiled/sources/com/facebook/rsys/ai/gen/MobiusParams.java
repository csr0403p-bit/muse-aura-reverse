package com.facebook.rsys.ai.gen;

import X.AnonymousClass006;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MobiusParams {
    public static G50<MobiusParams> CONVERTER = C8923Ftf.A00(9);
    public static long sMcfTypeId;
    public final String threadId;

    public class Builder {
        public String threadId;

        public MobiusParams build() {
            return new MobiusParams(this);
        }
    }

    public static native MobiusParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MobiusParams) {
                String str = this.threadId;
                String str2 = ((MobiusParams) obj).threadId;
                if (str != null ? !str.equals(str2) : str2 != null) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass006.A0G(this.threadId);
    }

    public String toString() {
        return FGI.A0U("MobiusParams{threadId=", this.threadId, "}");
    }

    public MobiusParams(Builder builder) {
        this.threadId = builder.threadId;
    }
}
