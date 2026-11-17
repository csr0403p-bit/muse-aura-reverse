package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
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
public final class ApprovalRequestPreviewTextBlockJson extends C06G implements ApprovalRequestPreviewBlockJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String key;
    public final String label;
    public final String text;
    public final String type;

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewTextBlockJson> serializer() {
            return ApprovalRequestPreviewTextBlockJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewTextBlockJson approvalRequestPreviewTextBlockJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(approvalRequestPreviewTextBlockJson.getType(), c9iZ, 0);
        c9j5.AAV(approvalRequestPreviewTextBlockJson.key, c9iZ, 1);
        if (c9j5.AfR() || approvalRequestPreviewTextBlockJson.label != null) {
            c9j5.AAP(approvalRequestPreviewTextBlockJson.label, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAV(approvalRequestPreviewTextBlockJson.text, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewTextBlockJson) {
                ApprovalRequestPreviewTextBlockJson approvalRequestPreviewTextBlockJson = (ApprovalRequestPreviewTextBlockJson) obj;
                if (!C7384Etj.areEqual(this.type, approvalRequestPreviewTextBlockJson.type) || !C7384Etj.areEqual(this.key, approvalRequestPreviewTextBlockJson.key) || !C7384Etj.areEqual(this.label, approvalRequestPreviewTextBlockJson.label) || !C7384Etj.areEqual(this.text, approvalRequestPreviewTextBlockJson.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRequestPreviewTextBlockJson copy$default(ApprovalRequestPreviewTextBlockJson approvalRequestPreviewTextBlockJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalRequestPreviewTextBlockJson.type;
        }
        if ((i & 2) != 0) {
            str2 = approvalRequestPreviewTextBlockJson.key;
        }
        if ((i & 4) != 0) {
            str3 = approvalRequestPreviewTextBlockJson.label;
        }
        if ((i & 8) != 0) {
            str4 = approvalRequestPreviewTextBlockJson.text;
        }
        AnonymousClass005.A0y(str, str2, str4);
        return new ApprovalRequestPreviewTextBlockJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.text;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.facebook.aura.gateway.ApprovalRequestPreviewBlockJson
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, (AnonymousClass005.A0I(this.key, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0G(this.label)) * 31);
    }

    public ApprovalRequestPreviewTextBlockJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0y(str, str2, str4);
        this.type = str;
        this.key = str2;
        this.label = str3;
        this.text = str4;
    }

    public final ApprovalRequestPreviewTextBlockJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0y(str, str2, str4);
        return new ApprovalRequestPreviewTextBlockJson(str, str2, str3, str4);
    }

    @Override // com.facebook.aura.gateway.ApprovalRequestPreviewBlockJson
    public HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text toDomainOrNull() {
        if ("text".equals(getType()) && ApprovalRequestPreviewJsonKt.isValidKey(this.key) && ApprovalRequestPreviewJsonKt.isValidOptionalLabel(this.label)) {
            return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text(this.key, this.label, this.text);
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewTextBlockJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (11 != (i & 11)) {
            C9iI.A00(ApprovalRequestPreviewTextBlockJson$$serializer.descriptor, i, 11);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.key = str2;
        this.label = C3cI.A0W(i, str3);
        this.text = str4;
    }

    public /* synthetic */ ApprovalRequestPreviewTextBlockJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3), str4);
    }
}
