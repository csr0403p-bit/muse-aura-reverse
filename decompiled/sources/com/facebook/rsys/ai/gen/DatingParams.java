package com.facebook.rsys.ai.gen;

import X.BV8;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes6.dex */
public class DatingParams {
    public static G50<DatingParams> CONVERTER = C8923Ftf.A00(4);
    public static long sMcfTypeId;
    public final Map<String, String> promptInput;
    public final String promptType;

    public class Builder {
        public Map<String, String> promptInput;
        public String promptType;

        public DatingParams build() {
            return new DatingParams(this);
        }
    }

    public static native DatingParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DatingParams) {
                DatingParams datingParams = (DatingParams) obj;
                if (this.promptType.equals(datingParams.promptType)) {
                    Map<String, String> map = this.promptInput;
                    Map<String, String> map2 = datingParams.promptInput;
                    if (map != null ? !map.equals(map2) : map2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA0B = BV8.A0B(this.promptType);
        Map<String, String> map = this.promptInput;
        return iA0B + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DatingParams{promptType=");
        sbA0x.append(this.promptType);
        sbA0x.append(",promptInput=");
        return BV8.A0v(this.promptInput, sbA0x);
    }

    public DatingParams(Builder builder) {
        builder.promptType.getClass();
        this.promptType = builder.promptType;
        this.promptInput = builder.promptInput;
    }
}
