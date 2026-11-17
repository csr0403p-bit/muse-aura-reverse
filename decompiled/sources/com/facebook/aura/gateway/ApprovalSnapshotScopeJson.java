package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalSnapshotScopeJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String root_agent_id;
    public final String thread_id;

    public final class Companion {
        public final C9hr<ApprovalSnapshotScopeJson> serializer() {
            return ApprovalSnapshotScopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalSnapshotScopeJson approvalSnapshotScopeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalSnapshotScopeJson.root_agent_id != null) {
            c9j5.AAP(approvalSnapshotScopeJson.root_agent_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || approvalSnapshotScopeJson.display_name != null) {
            c9j5.AAP(approvalSnapshotScopeJson.display_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || approvalSnapshotScopeJson.thread_id != null) {
            c9j5.AAP(approvalSnapshotScopeJson.thread_id, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalSnapshotScopeJson) {
                ApprovalSnapshotScopeJson approvalSnapshotScopeJson = (ApprovalSnapshotScopeJson) obj;
                if (!C7384Etj.areEqual(this.root_agent_id, approvalSnapshotScopeJson.root_agent_id) || !C7384Etj.areEqual(this.display_name, approvalSnapshotScopeJson.display_name) || !C7384Etj.areEqual(this.thread_id, approvalSnapshotScopeJson.thread_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalSnapshotScopeJson copy$default(ApprovalSnapshotScopeJson approvalSnapshotScopeJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalSnapshotScopeJson.root_agent_id;
        }
        if ((i & 2) != 0) {
            str2 = approvalSnapshotScopeJson.display_name;
        }
        if ((i & 4) != 0) {
            str3 = approvalSnapshotScopeJson.thread_id;
        }
        return new ApprovalSnapshotScopeJson(str, str2, str3);
    }

    public final String component1() {
        return this.root_agent_id;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String component3() {
        return this.thread_id;
    }

    public final ApprovalSnapshotScopeJson copy(String str, String str2, String str3) {
        return new ApprovalSnapshotScopeJson(str, str2, str3);
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getRoot_agent_id() {
        return this.root_agent_id;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.root_agent_id) * 31) + AnonymousClass006.A0G(this.display_name)) * 31) + AnonymousClass005.A0H(this.thread_id);
    }

    public ApprovalSnapshotScopeJson(String str, String str2, String str3) {
        this.root_agent_id = str;
        this.display_name = str2;
        this.thread_id = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalSnapshotScopeJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.root_agent_id = null;
        } else {
            this.root_agent_id = str;
        }
        if ((i & 2) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.thread_id = null;
        } else {
            this.thread_id = str3;
        }
    }

    public /* synthetic */ ApprovalSnapshotScopeJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public ApprovalSnapshotScopeJson() {
        this(null, null, null);
    }
}
