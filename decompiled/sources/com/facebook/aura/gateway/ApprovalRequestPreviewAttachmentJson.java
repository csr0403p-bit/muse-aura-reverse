package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
public final class ApprovalRequestPreviewAttachmentJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String file_name;
    public final String kind;
    public final ApprovalRequestPreviewAttachmentResourceJson resource;
    public final Long size_bytes;

    public final class Companion {
        public final C9hr<ApprovalRequestPreviewAttachmentJson> serializer() {
            return ApprovalRequestPreviewAttachmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalRequestPreviewAttachmentJson approvalRequestPreviewAttachmentJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(approvalRequestPreviewAttachmentJson.kind, c9iZ, 0);
        c9j5.AAV(approvalRequestPreviewAttachmentJson.file_name, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalRequestPreviewAttachmentJson.size_bytes != null) {
            c9j5.AAP(approvalRequestPreviewAttachmentJson.size_bytes, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || approvalRequestPreviewAttachmentJson.resource != null) {
            c9j5.AAP(approvalRequestPreviewAttachmentJson.resource, ApprovalRequestPreviewAttachmentResourceJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalRequestPreviewAttachmentJson) {
                ApprovalRequestPreviewAttachmentJson approvalRequestPreviewAttachmentJson = (ApprovalRequestPreviewAttachmentJson) obj;
                if (!C7384Etj.areEqual(this.kind, approvalRequestPreviewAttachmentJson.kind) || !C7384Etj.areEqual(this.file_name, approvalRequestPreviewAttachmentJson.file_name) || !C7384Etj.areEqual(this.size_bytes, approvalRequestPreviewAttachmentJson.size_bytes) || !C7384Etj.areEqual(this.resource, approvalRequestPreviewAttachmentJson.resource)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalRequestPreviewAttachmentJson copy$default(ApprovalRequestPreviewAttachmentJson approvalRequestPreviewAttachmentJson, String str, String str2, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalRequestPreviewAttachmentJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = approvalRequestPreviewAttachmentJson.file_name;
        }
        if ((i & 4) != 0) {
            l = approvalRequestPreviewAttachmentJson.size_bytes;
        }
        if ((i & 8) != 0) {
            approvalRequestPreviewAttachmentResourceJson = approvalRequestPreviewAttachmentJson.resource;
        }
        AnonymousClass003.A0u(str, str2);
        return new ApprovalRequestPreviewAttachmentJson(str, str2, l, approvalRequestPreviewAttachmentResourceJson);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.file_name;
    }

    public final Long component3() {
        return this.size_bytes;
    }

    public final ApprovalRequestPreviewAttachmentResourceJson component4() {
        return this.resource;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getKind() {
        return this.kind;
    }

    public final ApprovalRequestPreviewAttachmentResourceJson getResource() {
        return this.resource;
    }

    public final Long getSize_bytes() {
        return this.size_bytes;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.file_name, AnonymousClass001.A0G(this.kind)) + AnonymousClass006.A0D(this.size_bytes)) * 31) + C3cH.A02(this.resource);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment toDomainOrNull() {
        /*
            r7 = this;
            java.lang.String r2 = r7.kind
            int r1 = r2.hashCode()
            r0 = 3143036(0x2ff57c, float:4.404332E-39)
            r6 = 0
            if (r1 == r0) goto L34
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r1 == r0) goto L29
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 != r0) goto L70
            java.lang.String r0 = "video"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L70
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachmentKind r5 = com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.VIDEO
        L20:
            java.lang.String r0 = r7.file_name
            boolean r0 = com.facebook.aura.gateway.ApprovalRequestPreviewJsonKt.isValidFileName(r0)
            if (r0 != 0) goto L3f
            return r6
        L29:
            java.lang.String r0 = "image"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L70
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachmentKind r5 = com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.IMAGE
            goto L20
        L34:
            java.lang.String r0 = "file"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L70
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachmentKind r5 = com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.FILE
            goto L20
        L3f:
            java.lang.Long r0 = r7.size_bytes
            if (r0 == 0) goto L54
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L6f
            r1 = 1073741825(0x40000001, double:5.30498948E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6f
        L54:
            com.facebook.aura.gateway.ApprovalRequestPreviewAttachmentResourceJson r0 = r7.resource
            if (r0 == 0) goto L63
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachmentResource r3 = r0.toDomainOrNull()
        L5c:
            com.facebook.aura.gateway.ApprovalRequestPreviewAttachmentResourceJson r0 = r7.resource
            if (r0 == 0) goto L65
            if (r3 != 0) goto L65
            return r6
        L63:
            r3 = r6
            goto L5c
        L65:
            java.lang.String r2 = r7.file_name
            java.lang.Long r1 = r7.size_bytes
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment r0 = new com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment
            r0.<init>(r5, r2, r1, r3)
            return r0
        L6f:
            return r6
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.ApprovalRequestPreviewAttachmentJson.toDomainOrNull():com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment");
    }

    public ApprovalRequestPreviewAttachmentJson(String str, String str2, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson) {
        AnonymousClass003.A0u(str, str2);
        this.kind = str;
        this.file_name = str2;
        this.size_bytes = l;
        this.resource = approvalRequestPreviewAttachmentResourceJson;
    }

    public final ApprovalRequestPreviewAttachmentJson copy(String str, String str2, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson) {
        AnonymousClass003.A0u(str, str2);
        return new ApprovalRequestPreviewAttachmentJson(str, str2, l, approvalRequestPreviewAttachmentResourceJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalRequestPreviewAttachmentJson(int i, String str, String str2, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ApprovalRequestPreviewAttachmentJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.kind = str;
        this.file_name = str2;
        if ((i & 4) == 0) {
            this.size_bytes = null;
        } else {
            this.size_bytes = l;
        }
        if ((i & 8) == 0) {
            this.resource = null;
        } else {
            this.resource = approvalRequestPreviewAttachmentResourceJson;
        }
    }

    public /* synthetic */ ApprovalRequestPreviewAttachmentJson(String str, String str2, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : approvalRequestPreviewAttachmentResourceJson);
    }
}
