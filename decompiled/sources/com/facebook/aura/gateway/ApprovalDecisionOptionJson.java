package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalDecisionOptionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final ApprovalDecisionOptionLabelJson label;
    public final String label_text;

    public final class Companion {
        public final C9hr<ApprovalDecisionOptionJson> serializer() {
            return ApprovalDecisionOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalDecisionOptionJson approvalDecisionOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(approvalDecisionOptionJson.kind)) {
            c9j5.AAV(approvalDecisionOptionJson.kind, c9iZ, 0);
        }
        if (zAfR || !"".equals(approvalDecisionOptionJson.label_text)) {
            c9j5.AAV(approvalDecisionOptionJson.label_text, c9iZ, 1);
        }
        if (zAfR || approvalDecisionOptionJson.label != null) {
            c9j5.AAP(approvalDecisionOptionJson.label, ApprovalDecisionOptionLabelJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalDecisionOptionJson) {
                ApprovalDecisionOptionJson approvalDecisionOptionJson = (ApprovalDecisionOptionJson) obj;
                if (!C7384Etj.areEqual(this.kind, approvalDecisionOptionJson.kind) || !C7384Etj.areEqual(this.label_text, approvalDecisionOptionJson.label_text) || !C7384Etj.areEqual(this.label, approvalDecisionOptionJson.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalDecisionOptionJson copy$default(ApprovalDecisionOptionJson approvalDecisionOptionJson, String str, String str2, ApprovalDecisionOptionLabelJson approvalDecisionOptionLabelJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalDecisionOptionJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = approvalDecisionOptionJson.label_text;
        }
        if ((i & 4) != 0) {
            approvalDecisionOptionLabelJson = approvalDecisionOptionJson.label;
        }
        return approvalDecisionOptionJson.copy(str, str2, approvalDecisionOptionLabelJson);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.label_text;
    }

    public final ApprovalDecisionOptionLabelJson component3() {
        return this.label;
    }

    public final String getKind() {
        return this.kind;
    }

    public final ApprovalDecisionOptionLabelJson getLabel() {
        return this.label;
    }

    public final String getLabel_text() {
        return this.label_text;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.label_text, AnonymousClass001.A0G(this.kind)) + AnonymousClass006.A0D(this.label);
    }

    public final AgentPermissionDecisionOption toDomainOrNull() {
        String str;
        String str2 = null;
        if (C7BY.A0j(this.kind) || C7BY.A0j(this.label_text)) {
            return null;
        }
        String str3 = this.kind;
        String str4 = this.label_text;
        ApprovalDecisionOptionLabelJson approvalDecisionOptionLabelJson = this.label;
        if (approvalDecisionOptionLabelJson != null && (str = approvalDecisionOptionLabelJson.scope) != null && !C7BY.A0j(str)) {
            str2 = str;
        }
        return new AgentPermissionDecisionOption(str3, str4, str2);
    }

    public ApprovalDecisionOptionJson(String str, String str2, ApprovalDecisionOptionLabelJson approvalDecisionOptionLabelJson) {
        AnonymousClass003.A0u(str, str2);
        this.kind = str;
        this.label_text = str2;
        this.label = approvalDecisionOptionLabelJson;
    }

    public final ApprovalDecisionOptionJson copy(String str, String str2, ApprovalDecisionOptionLabelJson approvalDecisionOptionLabelJson) {
        AnonymousClass003.A0u(str, str2);
        return new ApprovalDecisionOptionJson(str, str2, approvalDecisionOptionLabelJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalDecisionOptionJson(int i, String str, String str2, ApprovalDecisionOptionLabelJson approvalDecisionOptionLabelJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.label_text = "";
        } else {
            this.label_text = str2;
        }
        if ((i & 4) == 0) {
            this.label = null;
        } else {
            this.label = approvalDecisionOptionLabelJson;
        }
    }

    public /* synthetic */ ApprovalDecisionOptionJson(String str, String str2, ApprovalDecisionOptionLabelJson approvalDecisionOptionLabelJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : approvalDecisionOptionLabelJson);
    }

    public ApprovalDecisionOptionJson() {
        this("", "", null);
    }
}
