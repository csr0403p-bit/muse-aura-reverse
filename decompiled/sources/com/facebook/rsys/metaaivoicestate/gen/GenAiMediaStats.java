package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass002;
import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class GenAiMediaStats {
    public static G50<GenAiMediaStats> CONVERTER = C8921Ftd.A00(28);
    public static long sMcfTypeId;
    public final long serverToClientAudioCtpLatencyMs;

    public static native GenAiMediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GenAiMediaStats) && this.serverToClientAudioCtpLatencyMs == ((GenAiMediaStats) obj).serverToClientAudioCtpLatencyMs);
    }

    public int hashCode() {
        return 527 + AnonymousClass002.A0A(this.serverToClientAudioCtpLatencyMs);
    }

    public String toString() {
        return FGI.A0J("GenAiMediaStats{serverToClientAudioCtpLatencyMs=", this.serverToClientAudioCtpLatencyMs, "}");
    }

    public GenAiMediaStats(long j) {
        this.serverToClientAudioCtpLatencyMs = j;
    }
}
