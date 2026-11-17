package com.facebook.rsys.transport.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class SignalingMessageIncomingStats {
    public static G50<SignalingMessageIncomingStats> CONVERTER = C8922Fte.A00(35);
    public static long sMcfTypeId;
    public final long receivedBytes;
    public final String trace;

    public static native SignalingMessageIncomingStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalingMessageIncomingStats) {
                SignalingMessageIncomingStats signalingMessageIncomingStats = (SignalingMessageIncomingStats) obj;
                if (this.receivedBytes == signalingMessageIncomingStats.receivedBytes) {
                    String str = this.trace;
                    String str2 = signalingMessageIncomingStats.trace;
                    if (str != null ? !str.equals(str2) : str2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC7608F5v.A02(AnonymousClass002.A0A(this.receivedBytes)) + AnonymousClass006.A0G(this.trace);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("SignalingMessageIncomingStats{receivedBytes=");
        sbA0x.append(this.receivedBytes);
        sbA0x.append(",trace=");
        return AbstractC7610F5x.A0w(this.trace, sbA0x);
    }

    public SignalingMessageIncomingStats(long j, String str) {
        this.receivedBytes = j;
        this.trace = str;
    }
}
