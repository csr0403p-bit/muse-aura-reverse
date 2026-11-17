package com.facebook.rsys.metaaivoicestate.gen;

import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CreatorBotClientReadyMessage {
    public static G50<CreatorBotClientReadyMessage> CONVERTER = C8921Ftd.A00(20);
    public static long sMcfTypeId;
    public final boolean ready;

    public static native CreatorBotClientReadyMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CreatorBotClientReadyMessage) && this.ready == ((CreatorBotClientReadyMessage) obj).ready);
    }

    public int hashCode() {
        return 527 + (this.ready ? 1 : 0);
    }

    public String toString() {
        return FGI.A0q("CreatorBotClientReadyMessage{ready=", "}", this.ready);
    }

    public CreatorBotClientReadyMessage(boolean z) {
        this.ready = z;
    }
}
