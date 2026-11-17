package com.facebook.aura.nodes.core;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.conversation.api.ConversationCardPlacement;
import com.facebook.aura.conversation.api.ConversationCardRequest;
import java.util.List;

/* loaded from: classes3.dex */
public final class NodePermissionCardRequest extends C06G implements ConversationCardRequest {
    public static final Companion Companion = new Companion();
    public static final String TYPE_ID = "node_permission";
    public final long deadlineElapsedMs;
    public final String rowId;
    public final List<String> tokens;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NodePermissionCardRequest) {
                NodePermissionCardRequest nodePermissionCardRequest = (NodePermissionCardRequest) obj;
                if (!C7384Etj.areEqual(this.rowId, nodePermissionCardRequest.rowId) || !C7384Etj.areEqual(this.tokens, nodePermissionCardRequest.tokens) || this.deadlineElapsedMs != nodePermissionCardRequest.deadlineElapsedMs) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NodePermissionCardRequest copy$default(NodePermissionCardRequest nodePermissionCardRequest, String str, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nodePermissionCardRequest.rowId;
        }
        if ((i & 2) != 0) {
            list = nodePermissionCardRequest.tokens;
        }
        if ((i & 4) != 0) {
            j = nodePermissionCardRequest.deadlineElapsedMs;
        }
        return nodePermissionCardRequest.copy(str, list, j);
    }

    public final String component1() {
        return this.rowId;
    }

    public final List<String> component2() {
        return this.tokens;
    }

    public final long component3() {
        return this.deadlineElapsedMs;
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public long getDeadlineElapsedMs() {
        return this.deadlineElapsedMs;
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public String getKey() {
        return FGI.A0d("node_permission:", this.rowId, ":", C3cH.A0e(",", AbstractC0878AGe.A0W(this.tokens)));
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public ConversationCardPlacement getPlacement() {
        return ConversationCardPlacement.ActiveConversation.INSTANCE;
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public /* bridge */ boolean getRemembersDecline() {
        return true;
    }

    public final String getRowId() {
        return this.rowId;
    }

    public final List<String> getTokens() {
        return this.tokens;
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public String getTypeId() {
        return TYPE_ID;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.deadlineElapsedMs, AnonymousClass005.A0F(this.tokens, AnonymousClass001.A0G(this.rowId)));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodePermissionCardRequest(String str, List<String> list, long j) {
        AnonymousClass003.A0u(str, list);
        this.rowId = str;
        this.tokens = list;
        this.deadlineElapsedMs = j;
    }

    public final NodePermissionCardRequest copy(String str, List<String> list, long j) {
        AnonymousClass003.A0u(str, list);
        return new NodePermissionCardRequest(str, list, j);
    }

    public String toString() {
        return super.toString();
    }
}
