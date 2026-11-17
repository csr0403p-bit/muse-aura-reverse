package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalDecisionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String always_scope;
    public final String approval_id;
    public final String decision;
    public final Long expected_message_revision;
    public final String reason;

    public final class Companion {
        public final C9hr<ApprovalDecisionJson> serializer() {
            return ApprovalDecisionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalDecisionJson approvalDecisionJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(approvalDecisionJson.approval_id, c9iZ, 0);
        c9j5.AAV(approvalDecisionJson.decision, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalDecisionJson.reason != null) {
            c9j5.AAP(approvalDecisionJson.reason, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || approvalDecisionJson.always_scope != null) {
            c9j5.AAP(approvalDecisionJson.always_scope, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || approvalDecisionJson.expected_message_revision != null) {
            c9j5.AAP(approvalDecisionJson.expected_message_revision, C9j1.A00, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalDecisionJson) {
                ApprovalDecisionJson approvalDecisionJson = (ApprovalDecisionJson) obj;
                if (!C7384Etj.areEqual(this.approval_id, approvalDecisionJson.approval_id) || !C7384Etj.areEqual(this.decision, approvalDecisionJson.decision) || !C7384Etj.areEqual(this.reason, approvalDecisionJson.reason) || !C7384Etj.areEqual(this.always_scope, approvalDecisionJson.always_scope) || !C7384Etj.areEqual(this.expected_message_revision, approvalDecisionJson.expected_message_revision)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalDecisionJson copy$default(ApprovalDecisionJson approvalDecisionJson, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalDecisionJson.approval_id;
        }
        if ((i & 2) != 0) {
            str2 = approvalDecisionJson.decision;
        }
        if ((i & 4) != 0) {
            str3 = approvalDecisionJson.reason;
        }
        if ((i & 8) != 0) {
            str4 = approvalDecisionJson.always_scope;
        }
        if ((i & 16) != 0) {
            l = approvalDecisionJson.expected_message_revision;
        }
        return approvalDecisionJson.copy(str, str2, str3, str4, l);
    }

    public final String component1() {
        return this.approval_id;
    }

    public final String component2() {
        return this.decision;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.always_scope;
    }

    public final Long component5() {
        return this.expected_message_revision;
    }

    public final String getAlways_scope() {
        return this.always_scope;
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final String getDecision() {
        return this.decision;
    }

    public final Long getExpected_message_revision() {
        return this.expected_message_revision;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.decision, AnonymousClass001.A0G(this.approval_id)) + AnonymousClass006.A0G(this.reason)) * 31) + AnonymousClass006.A0G(this.always_scope)) * 31) + C3cH.A02(this.expected_message_revision);
    }

    public ApprovalDecisionJson(String str, String str2, String str3, String str4, Long l) {
        AnonymousClass003.A0u(str, str2);
        this.approval_id = str;
        this.decision = str2;
        this.reason = str3;
        this.always_scope = str4;
        this.expected_message_revision = l;
    }

    public final ApprovalDecisionJson copy(String str, String str2, String str3, String str4, Long l) {
        AnonymousClass003.A0u(str, str2);
        return new ApprovalDecisionJson(str, str2, str3, str4, l);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalDecisionJson(String str, String str2, String str3, String str4, Long l, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l);
    }

    public /* synthetic */ ApprovalDecisionJson(int i, String str, String str2, String str3, String str4, Long l, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ApprovalDecisionJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.approval_id = str;
        this.decision = str2;
        if ((i & 4) == 0) {
            this.reason = null;
        } else {
            this.reason = str3;
        }
        if ((i & 8) == 0) {
            this.always_scope = null;
        } else {
            this.always_scope = str4;
        }
        if ((i & 16) == 0) {
            this.expected_message_revision = null;
        } else {
            this.expected_message_revision = l;
        }
    }
}
