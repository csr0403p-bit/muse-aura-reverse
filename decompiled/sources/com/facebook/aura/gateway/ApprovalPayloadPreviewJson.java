package com.facebook.aura.gateway;

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
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalPayloadPreviewJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String payload_preview;
    public final Boolean turn_grant_eligible;

    public final class Companion {
        public final C9hr<ApprovalPayloadPreviewJson> serializer() {
            return ApprovalPayloadPreviewJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalPayloadPreviewJson approvalPayloadPreviewJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalPayloadPreviewJson.payload_preview != null) {
            c9j5.AAP(approvalPayloadPreviewJson.payload_preview, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || approvalPayloadPreviewJson.turn_grant_eligible != null) {
            c9j5.AAP(approvalPayloadPreviewJson.turn_grant_eligible, C07839ix.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalPayloadPreviewJson) {
                ApprovalPayloadPreviewJson approvalPayloadPreviewJson = (ApprovalPayloadPreviewJson) obj;
                if (!C7384Etj.areEqual(this.payload_preview, approvalPayloadPreviewJson.payload_preview) || !C7384Etj.areEqual(this.turn_grant_eligible, approvalPayloadPreviewJson.turn_grant_eligible)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalPayloadPreviewJson copy$default(ApprovalPayloadPreviewJson approvalPayloadPreviewJson, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalPayloadPreviewJson.payload_preview;
        }
        if ((i & 2) != 0) {
            bool = approvalPayloadPreviewJson.turn_grant_eligible;
        }
        return new ApprovalPayloadPreviewJson(str, bool);
    }

    public final String component1() {
        return this.payload_preview;
    }

    public final Boolean component2() {
        return this.turn_grant_eligible;
    }

    public final ApprovalPayloadPreviewJson copy(String str, Boolean bool) {
        return new ApprovalPayloadPreviewJson(str, bool);
    }

    public final String getPayload_preview() {
        return this.payload_preview;
    }

    public final Boolean getTurn_grant_eligible() {
        return this.turn_grant_eligible;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.payload_preview) * 31) + C3cH.A02(this.turn_grant_eligible);
    }

    public ApprovalPayloadPreviewJson(String str, Boolean bool) {
        this.payload_preview = str;
        this.turn_grant_eligible = bool;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalPayloadPreviewJson(int i, String str, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payload_preview = null;
        } else {
            this.payload_preview = str;
        }
        if ((i & 2) == 0) {
            this.turn_grant_eligible = null;
        } else {
            this.turn_grant_eligible = bool;
        }
    }

    public /* synthetic */ ApprovalPayloadPreviewJson(String str, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }

    public ApprovalPayloadPreviewJson() {
        this(null, null);
    }
}
