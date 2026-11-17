package com.facebook.rsys.transport.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class SignalingProtocolParams {
    public static G50<SignalingProtocolParams> CONVERTER = C8922Fte.A00(36);
    public static long sMcfTypeId;
    public final UllcParams ullc;

    public static native SignalingProtocolParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalingProtocolParams) {
                UllcParams ullcParams = this.ullc;
                UllcParams ullcParams2 = ((SignalingProtocolParams) obj).ullc;
                if (ullcParams != null ? !ullcParams.equals(ullcParams2) : ullcParams2 != null) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AnonymousClass006.A0D(this.ullc);
    }

    public String toString() {
        return BV8.A0v(this.ullc, C60O.A0x("SignalingProtocolParams{ullc="));
    }

    public SignalingProtocolParams(UllcParams ullcParams) {
        this.ullc = ullcParams;
    }
}
