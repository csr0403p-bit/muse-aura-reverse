package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AgentPermissionHistoryDetailsSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String approvalId;
    public final String sessionId;

    public final class Companion {
        public final C9hr<AgentPermissionHistoryDetailsSheetKey> serializer() {
            return AgentPermissionHistoryDetailsSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AgentPermissionHistoryDetailsSheetKey(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.approvalId = str;
        this.sessionId = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(AgentPermissionHistoryDetailsSheetKey agentPermissionHistoryDetailsSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(agentPermissionHistoryDetailsSheetKey.approvalId, c9iZ, 0);
        if (c9j5.AfR() || agentPermissionHistoryDetailsSheetKey.sessionId != null) {
            c9j5.AAP(agentPermissionHistoryDetailsSheetKey.sessionId, C07779iq.A01, c9iZ, 1);
        }
    }

    public final AgentPermissionHistoryDetailsSheetKey copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new AgentPermissionHistoryDetailsSheetKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentPermissionHistoryDetailsSheetKey) {
                AgentPermissionHistoryDetailsSheetKey agentPermissionHistoryDetailsSheetKey = (AgentPermissionHistoryDetailsSheetKey) obj;
                if (!C7384Etj.areEqual(this.approvalId, agentPermissionHistoryDetailsSheetKey.approvalId) || !C7384Etj.areEqual(this.sessionId, agentPermissionHistoryDetailsSheetKey.sessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgentPermissionHistoryDetailsSheetKey copy$default(AgentPermissionHistoryDetailsSheetKey agentPermissionHistoryDetailsSheetKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentPermissionHistoryDetailsSheetKey.approvalId;
        }
        if ((i & 2) != 0) {
            str2 = agentPermissionHistoryDetailsSheetKey.sessionId;
        }
        C7384Etj.A0Y(str, 0);
        return new AgentPermissionHistoryDetailsSheetKey(str, str2);
    }

    public final String component1() {
        return this.approvalId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.approvalId) + AnonymousClass006.A0G(this.sessionId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AgentPermissionHistoryDetailsSheetKey(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AgentPermissionHistoryDetailsSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
        this.sessionId = (i & 2) == 0 ? null : str2;
    }

    public /* synthetic */ AgentPermissionHistoryDetailsSheetKey(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
