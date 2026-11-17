package com.facebook.aura.markdown.parser.custom.extensions;

import X.AnonymousClass001;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes4.dex */
public final class MermaidPayload {
    public final boolean isStreaming;
    public final String source;

    public MermaidPayload(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.source = str;
        this.isStreaming = z;
    }

    public final MermaidPayload copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new MermaidPayload(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MermaidPayload) {
                MermaidPayload mermaidPayload = (MermaidPayload) obj;
                if (!C7384Etj.areEqual(this.source, mermaidPayload.source) || this.isStreaming != mermaidPayload.isStreaming) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MermaidPayload copy$default(MermaidPayload mermaidPayload, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mermaidPayload.source;
        }
        if ((i & 2) != 0) {
            z = mermaidPayload.isStreaming;
        }
        C7384Etj.A0Y(str, 0);
        return new MermaidPayload(str, z);
    }

    public final String component1() {
        return this.source;
    }

    public final boolean component2() {
        return this.isStreaming;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.source), this.isStreaming);
    }

    public final boolean isStreaming() {
        return this.isStreaming;
    }

    public String toString() {
        return FGI.A0n("MermaidPayload(source=", this.source, ", isStreaming=", ")", this.isStreaming);
    }

    public /* synthetic */ MermaidPayload(String str, boolean z, int i, C06H c06h) {
        this(str, AnonymousClass001.A1Q(i, z));
    }
}
