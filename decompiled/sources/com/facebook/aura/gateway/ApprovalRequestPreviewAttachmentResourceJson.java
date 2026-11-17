package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
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
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalRequestPreviewAttachmentResourceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String content_type;
    public final Integer height;
    public final Long updated_at_ms;
    public final String url;
    public final Integer width;

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewAttachmentResourceJson> serializer() {
            return ApprovalRequestPreviewAttachmentResourceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ApprovalRequestPreviewAttachmentResourceJson(String str, Integer num, Integer num2, String str2, Long l) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.width = num;
        this.height = num2;
        this.content_type = str2;
        this.updated_at_ms = l;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(approvalRequestPreviewAttachmentResourceJson.url, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalRequestPreviewAttachmentResourceJson.width != null) {
            c9j5.AAP(approvalRequestPreviewAttachmentResourceJson.width, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || approvalRequestPreviewAttachmentResourceJson.height != null) {
            c9j5.AAP(approvalRequestPreviewAttachmentResourceJson.height, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || approvalRequestPreviewAttachmentResourceJson.content_type != null) {
            c9j5.AAP(approvalRequestPreviewAttachmentResourceJson.content_type, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || approvalRequestPreviewAttachmentResourceJson.updated_at_ms != null) {
            c9j5.AAP(approvalRequestPreviewAttachmentResourceJson.updated_at_ms, C9j1.A00, c9iZ, 4);
        }
    }

    public final ApprovalRequestPreviewAttachmentResourceJson copy(String str, Integer num, Integer num2, String str2, Long l) {
        C7384Etj.A0Y(str, 0);
        return new ApprovalRequestPreviewAttachmentResourceJson(str, num, num2, str2, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewAttachmentResourceJson) {
                ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson = (ApprovalRequestPreviewAttachmentResourceJson) obj;
                if (!C7384Etj.areEqual(this.url, approvalRequestPreviewAttachmentResourceJson.url) || !C7384Etj.areEqual(this.width, approvalRequestPreviewAttachmentResourceJson.width) || !C7384Etj.areEqual(this.height, approvalRequestPreviewAttachmentResourceJson.height) || !C7384Etj.areEqual(this.content_type, approvalRequestPreviewAttachmentResourceJson.content_type) || !C7384Etj.areEqual(this.updated_at_ms, approvalRequestPreviewAttachmentResourceJson.updated_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRequestPreviewAttachmentResourceJson copy$default(ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson, String str, Integer num, Integer num2, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalRequestPreviewAttachmentResourceJson.url;
        }
        if ((i & 2) != 0) {
            num = approvalRequestPreviewAttachmentResourceJson.width;
        }
        if ((i & 4) != 0) {
            num2 = approvalRequestPreviewAttachmentResourceJson.height;
        }
        if ((i & 8) != 0) {
            str2 = approvalRequestPreviewAttachmentResourceJson.content_type;
        }
        if ((i & 16) != 0) {
            l = approvalRequestPreviewAttachmentResourceJson.updated_at_ms;
        }
        return approvalRequestPreviewAttachmentResourceJson.copy(str, num, num2, str2, l);
    }

    public final String component1() {
        return this.url;
    }

    public final Integer component2() {
        return this.width;
    }

    public final Integer component3() {
        return this.height;
    }

    public final String component4() {
        return this.content_type;
    }

    public final Long component5() {
        return this.updated_at_ms;
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Long getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.url) + AnonymousClass006.A0D(this.width)) * 31) + AnonymousClass006.A0D(this.height)) * 31) + AnonymousClass006.A0G(this.content_type)) * 31) + C3cH.A02(this.updated_at_ms);
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentResource toDomainOrNull() {
        Integer num;
        Integer num2;
        String str;
        int iIntValue;
        int iIntValue2;
        if (!ApprovalRequestPreviewJsonKt.isValidWorkspaceUrl(this.url) || (((num = this.width) != null && (1 > (iIntValue2 = num.intValue()) || iIntValue2 >= 32769)) || (((num2 = this.height) != null && (1 > (iIntValue = num2.intValue()) || iIntValue >= 32769)) || !((str = this.content_type) == null || ApprovalRequestPreviewJsonKt.isValidContentType(str))))) {
            return null;
        }
        return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentResource(this.url, this.width, this.height, this.content_type, this.updated_at_ms);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewAttachmentResourceJson(String str, Integer num, Integer num2, String str2, Long l, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l);
    }

    public /* synthetic */ ApprovalRequestPreviewAttachmentResourceJson(int i, String str, Integer num, Integer num2, String str2, Long l, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ApprovalRequestPreviewAttachmentResourceJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 4) == 0) {
            this.height = null;
        } else {
            this.height = num2;
        }
        if ((i & 8) == 0) {
            this.content_type = null;
        } else {
            this.content_type = str2;
        }
        if ((i & 16) == 0) {
            this.updated_at_ms = null;
        } else {
            this.updated_at_ms = l;
        }
    }
}
