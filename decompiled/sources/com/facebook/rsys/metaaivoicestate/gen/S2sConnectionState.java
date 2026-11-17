package com.facebook.rsys.metaaivoicestate.gen;

import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class S2sConnectionState {
    public static G50<S2sConnectionState> CONVERTER = C8921Ftd.A00(49);
    public static long sMcfTypeId;
    public final int reason;
    public final int state;

    public static native S2sConnectionState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S2sConnectionState) {
                S2sConnectionState s2sConnectionState = (S2sConnectionState) obj;
                if (this.state != s2sConnectionState.state || this.reason != s2sConnectionState.reason) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.state) * 31) + this.reason;
    }

    public String toString() {
        return FGI.A0Y("S2sConnectionState{state=", ",reason=", "}", this.state, this.reason);
    }

    public S2sConnectionState(int i, int i2) {
        this.state = i;
        this.reason = i2;
    }
}
