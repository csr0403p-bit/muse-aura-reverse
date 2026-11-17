package com.facebook.aura.markdown.parser.custom.extensions;

import X.AnonymousClass001;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes4.dex */
public final class NodeCardPayload {
    public final boolean isStreaming;
    public final String raw;

    public NodeCardPayload(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.raw = str;
        this.isStreaming = z;
    }

    public final NodeCardPayload copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new NodeCardPayload(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeCardPayload) {
                NodeCardPayload nodeCardPayload = (NodeCardPayload) obj;
                if (!C7384Etj.areEqual(this.raw, nodeCardPayload.raw) || this.isStreaming != nodeCardPayload.isStreaming) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeCardPayload copy$default(NodeCardPayload nodeCardPayload, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeCardPayload.raw;
        }
        if ((i & 2) != 0) {
            z = nodeCardPayload.isStreaming;
        }
        C7384Etj.A0Y(str, 0);
        return new NodeCardPayload(str, z);
    }

    public final String component1() {
        return this.raw;
    }

    public final boolean component2() {
        return this.isStreaming;
    }

    public final String getRaw() {
        return this.raw;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.raw), this.isStreaming);
    }

    public final boolean isStreaming() {
        return this.isStreaming;
    }

    public String toString() {
        return FGI.A0n("NodeCardPayload(raw=", this.raw, ", isStreaming=", ")", this.isStreaming);
    }

    public /* synthetic */ NodeCardPayload(String str, boolean z, int i, C06H c06h) {
        this(str, AnonymousClass001.A1Q(i, z));
    }
}
