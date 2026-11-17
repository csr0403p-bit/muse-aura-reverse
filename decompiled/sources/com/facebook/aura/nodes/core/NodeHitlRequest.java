package com.facebook.aura.nodes.core;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class NodeHitlRequest extends C06G {
    public final boolean canPrompt;
    public final NodeHitlRequestKind kind;
    public final String payloadJson;
    public final String requestId;
    public final String subjectId;
    public final Long timeoutMs;

    public static /* synthetic */ NodeHitlRequest copy$default(NodeHitlRequest nodeHitlRequest, NodeHitlRequestKind nodeHitlRequestKind, String str, String str2, boolean z, String str3, Long l, int i, Object obj) {
        NodeHitlRequestKind nodeHitlRequestKind2 = nodeHitlRequestKind;
        String str4 = str;
        String str5 = str2;
        boolean z2 = z;
        String str6 = str3;
        Long l2 = l;
        if ((i & 1) != 0) {
            nodeHitlRequestKind2 = nodeHitlRequest.kind;
        }
        if ((i & 2) != 0) {
            str4 = nodeHitlRequest.subjectId;
        }
        if ((i & 4) != 0) {
            str5 = nodeHitlRequest.requestId;
        }
        if ((i & 8) != 0) {
            z2 = nodeHitlRequest.canPrompt;
        }
        if ((i & 16) != 0) {
            str6 = nodeHitlRequest.payloadJson;
        }
        if ((i & 32) != 0) {
            l2 = nodeHitlRequest.timeoutMs;
        }
        AnonymousClass003.A0u(nodeHitlRequestKind2, str4);
        return new NodeHitlRequest(nodeHitlRequestKind2, str4, str5, z2, str6, l2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeHitlRequest) {
                NodeHitlRequest nodeHitlRequest = (NodeHitlRequest) obj;
                if (this.kind != nodeHitlRequest.kind || !C7384Etj.areEqual(this.subjectId, nodeHitlRequest.subjectId) || !C7384Etj.areEqual(this.requestId, nodeHitlRequest.requestId) || this.canPrompt != nodeHitlRequest.canPrompt || !C7384Etj.areEqual(this.payloadJson, nodeHitlRequest.payloadJson) || !C7384Etj.areEqual(this.timeoutMs, nodeHitlRequest.timeoutMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public final NodeHitlRequestKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.subjectId;
    }

    public final String component3() {
        return this.requestId;
    }

    public final boolean component4() {
        return this.canPrompt;
    }

    public final String component5() {
        return this.payloadJson;
    }

    public final Long component6() {
        return this.timeoutMs;
    }

    public final boolean getCanPrompt() {
        return this.canPrompt;
    }

    public final long getEffectiveTimeoutMs() {
        Long l = this.timeoutMs;
        if (l == null) {
            return 60000L;
        }
        long jLongValue = l.longValue();
        if (jLongValue > 0) {
            return jLongValue;
        }
        return 60000L;
    }

    public final NodeHitlRequestKind getKind() {
        return this.kind;
    }

    public final String getPayloadJson() {
        return this.payloadJson;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public int hashCode() {
        return ((C0KA.A01((AnonymousClass005.A0I(this.subjectId, AnonymousClass005.A0E(this.kind)) + AnonymousClass006.A0G(this.requestId)) * 31, this.canPrompt) + AnonymousClass006.A0G(this.payloadJson)) * 31) + C3cH.A02(this.timeoutMs);
    }

    public NodeHitlRequest(NodeHitlRequestKind nodeHitlRequestKind, String str, String str2, boolean z, String str3, Long l) {
        AnonymousClass003.A0u(nodeHitlRequestKind, str);
        this.kind = nodeHitlRequestKind;
        this.subjectId = str;
        this.requestId = str2;
        this.canPrompt = z;
        this.payloadJson = str3;
        this.timeoutMs = l;
    }

    public final NodeHitlRequest copy(NodeHitlRequestKind nodeHitlRequestKind, String str, String str2, boolean z, String str3, Long l) {
        AnonymousClass003.A0u(nodeHitlRequestKind, str);
        return new NodeHitlRequest(nodeHitlRequestKind, str, str2, z, str3, l);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeHitlRequest(NodeHitlRequestKind nodeHitlRequestKind, String str, String str2, boolean z, String str3, Long l, int i, C06H c06h) {
        this(nodeHitlRequestKind, str, str2, z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l);
    }
}
