package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
public final class ApprovalRequestPreviewLinkJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String url;

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewLinkJson> serializer() {
            return ApprovalRequestPreviewLinkJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewLinkJson approvalRequestPreviewLinkJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(approvalRequestPreviewLinkJson.label, c9iZ, 0);
        c9j5.AAV(approvalRequestPreviewLinkJson.url, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewLinkJson) {
                ApprovalRequestPreviewLinkJson approvalRequestPreviewLinkJson = (ApprovalRequestPreviewLinkJson) obj;
                if (!C7384Etj.areEqual(this.label, approvalRequestPreviewLinkJson.label) || !C7384Etj.areEqual(this.url, approvalRequestPreviewLinkJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRequestPreviewLinkJson copy$default(ApprovalRequestPreviewLinkJson approvalRequestPreviewLinkJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalRequestPreviewLinkJson.label;
        }
        if ((i & 2) != 0) {
            str2 = approvalRequestPreviewLinkJson.url;
        }
        AnonymousClass003.A0u(str, str2);
        return new ApprovalRequestPreviewLinkJson(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.label));
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewLink toDomainOrNull() {
        if (ApprovalRequestPreviewJsonKt.isValidLabel(this.label) && ApprovalRequestPreviewJsonKt.isValidHttpsUrl(this.url)) {
            return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewLink(this.label, this.url);
        }
        return null;
    }

    public ApprovalRequestPreviewLinkJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.url = str2;
    }

    public final ApprovalRequestPreviewLinkJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ApprovalRequestPreviewLinkJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewLinkJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ApprovalRequestPreviewLinkJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.label = str;
        this.url = str2;
    }
}
