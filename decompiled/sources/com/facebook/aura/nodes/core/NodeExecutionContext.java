package com.facebook.aura.nodes.core;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.nodes.transport.HatchNodeHttpClient;

/* loaded from: classes3.dex */
public final class NodeExecutionContext extends C06G {
    public final HatchNodeHttpClient httpClient;
    public final String nodeId;
    public final long replyDeadlineElapsedMs;
    public final String requestId;
    public final String resultDescription;
    public final NodeResultSender sender;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodeExecutionContext) {
                NodeExecutionContext nodeExecutionContext = (NodeExecutionContext) obj;
                if (!C7384Etj.areEqual(this.nodeId, nodeExecutionContext.nodeId) || !C7384Etj.areEqual(this.requestId, nodeExecutionContext.requestId) || !C7384Etj.areEqual(this.sender, nodeExecutionContext.sender) || !C7384Etj.areEqual(this.httpClient, nodeExecutionContext.httpClient) || !C7384Etj.areEqual(this.resultDescription, nodeExecutionContext.resultDescription) || this.replyDeadlineElapsedMs != nodeExecutionContext.replyDeadlineElapsedMs) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NodeExecutionContext copy$default(NodeExecutionContext nodeExecutionContext, String str, String str2, NodeResultSender nodeResultSender, HatchNodeHttpClient hatchNodeHttpClient, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodeExecutionContext.nodeId;
        }
        if ((i & 2) != 0) {
            str2 = nodeExecutionContext.requestId;
        }
        if ((i & 4) != 0) {
            nodeResultSender = nodeExecutionContext.sender;
        }
        if ((i & 8) != 0) {
            hatchNodeHttpClient = nodeExecutionContext.httpClient;
        }
        if ((i & 16) != 0) {
            str3 = nodeExecutionContext.resultDescription;
        }
        if ((i & 32) != 0) {
            j = nodeExecutionContext.replyDeadlineElapsedMs;
        }
        return nodeExecutionContext.copy(str, str2, nodeResultSender, hatchNodeHttpClient, str3, j);
    }

    public final String component1() {
        return this.nodeId;
    }

    public final String component2() {
        return this.requestId;
    }

    public final NodeResultSender component3() {
        return this.sender;
    }

    public final HatchNodeHttpClient component4() {
        return this.httpClient;
    }

    public final String component5() {
        return this.resultDescription;
    }

    public final long component6() {
        return this.replyDeadlineElapsedMs;
    }

    public final HatchNodeHttpClient getHttpClient() {
        return this.httpClient;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final long getReplyDeadlineElapsedMs() {
        return this.replyDeadlineElapsedMs;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getResultDescription() {
        return this.resultDescription;
    }

    public final NodeResultSender getSender() {
        return this.sender;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.replyDeadlineElapsedMs, (AnonymousClass005.A0F(this.httpClient, AnonymousClass005.A0F(this.sender, AnonymousClass005.A0I(this.requestId, AnonymousClass001.A0G(this.nodeId)))) + AnonymousClass006.A0G(this.resultDescription)) * 31);
    }

    public NodeExecutionContext(String str, String str2, NodeResultSender nodeResultSender, HatchNodeHttpClient hatchNodeHttpClient, String str3, long j) {
        AnonymousClass005.A14(str, str2, nodeResultSender, hatchNodeHttpClient);
        this.nodeId = str;
        this.requestId = str2;
        this.sender = nodeResultSender;
        this.httpClient = hatchNodeHttpClient;
        this.resultDescription = str3;
        this.replyDeadlineElapsedMs = j;
    }

    public final NodeExecutionContext copy(String str, String str2, NodeResultSender nodeResultSender, HatchNodeHttpClient hatchNodeHttpClient, String str3, long j) {
        AnonymousClass005.A14(str, str2, nodeResultSender, hatchNodeHttpClient);
        return new NodeExecutionContext(str, str2, nodeResultSender, hatchNodeHttpClient, str3, j);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NodeExecutionContext(String str, String str2, NodeResultSender nodeResultSender, HatchNodeHttpClient hatchNodeHttpClient, String str3, long j, int i, C06H c06h) {
        this(str, str2, nodeResultSender, hatchNodeHttpClient, (i & 16) != 0 ? null : str3, j);
    }
}
