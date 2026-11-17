package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalDecisionResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String approval_id;
    public final ApprovalDecisionErrorJson error;
    public final Boolean success;

    public final class Companion {
        public final C9hr<ApprovalDecisionResultJson> serializer() {
            return ApprovalDecisionResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalDecisionResultJson approvalDecisionResultJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalDecisionResultJson.approval_id != null) {
            c9j5.AAP(approvalDecisionResultJson.approval_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || approvalDecisionResultJson.success != null) {
            c9j5.AAP(approvalDecisionResultJson.success, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || approvalDecisionResultJson.error != null) {
            c9j5.AAP(approvalDecisionResultJson.error, ApprovalDecisionErrorJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalDecisionResultJson) {
                ApprovalDecisionResultJson approvalDecisionResultJson = (ApprovalDecisionResultJson) obj;
                if (!C7384Etj.areEqual(this.approval_id, approvalDecisionResultJson.approval_id) || !C7384Etj.areEqual(this.success, approvalDecisionResultJson.success) || !C7384Etj.areEqual(this.error, approvalDecisionResultJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalDecisionResultJson copy$default(ApprovalDecisionResultJson approvalDecisionResultJson, String str, Boolean bool, ApprovalDecisionErrorJson approvalDecisionErrorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalDecisionResultJson.approval_id;
        }
        if ((i & 2) != 0) {
            bool = approvalDecisionResultJson.success;
        }
        if ((i & 4) != 0) {
            approvalDecisionErrorJson = approvalDecisionResultJson.error;
        }
        return new ApprovalDecisionResultJson(str, bool, approvalDecisionErrorJson);
    }

    public final String component1() {
        return this.approval_id;
    }

    public final Boolean component2() {
        return this.success;
    }

    public final ApprovalDecisionErrorJson component3() {
        return this.error;
    }

    public final ApprovalDecisionResultJson copy(String str, Boolean bool, ApprovalDecisionErrorJson approvalDecisionErrorJson) {
        return new ApprovalDecisionResultJson(str, bool, approvalDecisionErrorJson);
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final ApprovalDecisionErrorJson getError() {
        return this.error;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.approval_id) * 31) + AnonymousClass006.A0D(this.success)) * 31) + C3cH.A02(this.error);
    }

    public final String rejectionErrorType() {
        if (!AnonymousClass002.A1b(this.success, false)) {
            return null;
        }
        ApprovalDecisionErrorJson approvalDecisionErrorJson = this.error;
        if (approvalDecisionErrorJson == null) {
            return "rejected";
        }
        String str = approvalDecisionErrorJson.code;
        if (str != null) {
            return str;
        }
        Integer num = approvalDecisionErrorJson.status;
        return num != null ? FGI.A0H("http_", num.intValue()) : "rejected";
    }

    public ApprovalDecisionResultJson(String str, Boolean bool, ApprovalDecisionErrorJson approvalDecisionErrorJson) {
        this.approval_id = str;
        this.success = bool;
        this.error = approvalDecisionErrorJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalDecisionResultJson(int i, String str, Boolean bool, ApprovalDecisionErrorJson approvalDecisionErrorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.approval_id = null;
        } else {
            this.approval_id = str;
        }
        if ((i & 2) == 0) {
            this.success = null;
        } else {
            this.success = bool;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = approvalDecisionErrorJson;
        }
    }

    public /* synthetic */ ApprovalDecisionResultJson(String str, Boolean bool, ApprovalDecisionErrorJson approvalDecisionErrorJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : approvalDecisionErrorJson);
    }

    public ApprovalDecisionResultJson() {
        this(null, null, null);
    }
}
