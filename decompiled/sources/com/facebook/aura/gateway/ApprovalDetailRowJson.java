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
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalDetailRowJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String value;

    public final class Companion {
        public final C9hr<ApprovalDetailRowJson> serializer() {
            return ApprovalDetailRowJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalDetailRowJson approvalDetailRowJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalDetailRowJson.label != null) {
            c9j5.AAP(approvalDetailRowJson.label, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || approvalDetailRowJson.value != null) {
            c9j5.AAP(approvalDetailRowJson.value, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalDetailRowJson) {
                ApprovalDetailRowJson approvalDetailRowJson = (ApprovalDetailRowJson) obj;
                if (!C7384Etj.areEqual(this.label, approvalDetailRowJson.label) || !C7384Etj.areEqual(this.value, approvalDetailRowJson.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalDetailRowJson copy$default(ApprovalDetailRowJson approvalDetailRowJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalDetailRowJson.label;
        }
        if ((i & 2) != 0) {
            str2 = approvalDetailRowJson.value;
        }
        return new ApprovalDetailRowJson(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final ApprovalDetailRowJson copy(String str, String str2) {
        return new ApprovalDetailRowJson(str, str2);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.label) * 31) + AnonymousClass005.A0H(this.value);
    }

    public final HatchAgentPermissionsRepository.AgentPermissionDetailRow toDomainOrNull() {
        String strTrimToNonEmpty;
        String str;
        String strTrimToNonEmpty2;
        String str2 = this.label;
        if (str2 == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2)) == null || (str = this.value) == null || (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) == null) {
            return null;
        }
        return new HatchAgentPermissionsRepository.AgentPermissionDetailRow(strTrimToNonEmpty, strTrimToNonEmpty2);
    }

    public ApprovalDetailRowJson(String str, String str2) {
        this.label = str;
        this.value = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalDetailRowJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.value = null;
        } else {
            this.value = str2;
        }
    }

    public /* synthetic */ ApprovalDetailRowJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ApprovalDetailRowJson() {
        this(null, null);
    }
}
