package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AgentPermissionMessageEditorScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String approvalId;

    public final class Companion {
        public final C9hr<AgentPermissionMessageEditorScreenKey> serializer() {
            return AgentPermissionMessageEditorScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final AgentPermissionMessageEditorScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AgentPermissionMessageEditorScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AgentPermissionMessageEditorScreenKey) && C7384Etj.areEqual(this.approvalId, ((AgentPermissionMessageEditorScreenKey) obj).approvalId));
    }

    public /* synthetic */ AgentPermissionMessageEditorScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AgentPermissionMessageEditorScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
    }

    public static /* synthetic */ AgentPermissionMessageEditorScreenKey copy$default(AgentPermissionMessageEditorScreenKey agentPermissionMessageEditorScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentPermissionMessageEditorScreenKey.approvalId;
        }
        C7384Etj.A0Y(str, 0);
        return new AgentPermissionMessageEditorScreenKey(str);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public int hashCode() {
        return this.approvalId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public AgentPermissionMessageEditorScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.approvalId = str;
    }
}
