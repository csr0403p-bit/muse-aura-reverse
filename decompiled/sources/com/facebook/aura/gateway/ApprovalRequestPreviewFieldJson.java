package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalRequestPreviewFieldJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String key;
    public final String label;
    public final String value;

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewFieldJson> serializer() {
            return ApprovalRequestPreviewFieldJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewFieldJson approvalRequestPreviewFieldJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(approvalRequestPreviewFieldJson.key, c9iZ, 0);
        c9j5.AAV(approvalRequestPreviewFieldJson.label, c9iZ, 1);
        c9j5.AAV(approvalRequestPreviewFieldJson.value, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewFieldJson) {
                ApprovalRequestPreviewFieldJson approvalRequestPreviewFieldJson = (ApprovalRequestPreviewFieldJson) obj;
                if (!C7384Etj.areEqual(this.key, approvalRequestPreviewFieldJson.key) || !C7384Etj.areEqual(this.label, approvalRequestPreviewFieldJson.label) || !C7384Etj.areEqual(this.value, approvalRequestPreviewFieldJson.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRequestPreviewFieldJson copy$default(ApprovalRequestPreviewFieldJson approvalRequestPreviewFieldJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalRequestPreviewFieldJson.key;
        }
        if ((i & 2) != 0) {
            str2 = approvalRequestPreviewFieldJson.label;
        }
        if ((i & 4) != 0) {
            str3 = approvalRequestPreviewFieldJson.value;
        }
        return approvalRequestPreviewFieldJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.value;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.key)));
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField toDomainOrNull() {
        if (!ApprovalRequestPreviewJsonKt.isValidKey(this.key) || !ApprovalRequestPreviewJsonKt.isValidLabel(this.label) || !ApprovalRequestPreviewJsonKt.isValidFieldOrListValue(this.value)) {
            return null;
        }
        return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField(this.label, this.value, this.key);
    }

    public ApprovalRequestPreviewFieldJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.key = str;
        this.label = str2;
        this.value = str3;
    }

    public final ApprovalRequestPreviewFieldJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ApprovalRequestPreviewFieldJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewFieldJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ApprovalRequestPreviewFieldJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.key = str;
        this.label = str2;
        this.value = str3;
    }
}
