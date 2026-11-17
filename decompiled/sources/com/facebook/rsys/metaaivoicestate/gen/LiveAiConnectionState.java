package com.facebook.rsys.metaaivoicestate.gen;

import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class LiveAiConnectionState {
    public static G50<LiveAiConnectionState> CONVERTER = C8921Ftd.A00(30);
    public static long sMcfTypeId;
    public final int state;

    public static native LiveAiConnectionState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LiveAiConnectionState) && this.state == ((LiveAiConnectionState) obj).state);
    }

    public int hashCode() {
        return 527 + this.state;
    }

    public String toString() {
        return FGI.A0I("LiveAiConnectionState{state=", this.state, "}");
    }

    public LiveAiConnectionState(int i) {
        this.state = i;
    }
}
