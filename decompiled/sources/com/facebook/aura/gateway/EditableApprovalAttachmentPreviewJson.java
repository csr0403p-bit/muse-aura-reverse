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
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class EditableApprovalAttachmentPreviewJson extends C06G {
    public final String alt_text;
    public final String file_name;
    public final String kind;
    public final ApprovalRequestPreviewAttachmentResourceJson resource;
    public final Long size_bytes;
    public static final Companion Companion = new Companion();
    public static final int $stable = ApprovalRequestPreviewAttachmentResourceJson.$stable;

    public final class Companion {
        public final C9hr<EditableApprovalAttachmentPreviewJson> serializer() {
            return EditableApprovalAttachmentPreviewJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(EditableApprovalAttachmentPreviewJson editableApprovalAttachmentPreviewJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(editableApprovalAttachmentPreviewJson.kind, c9iZ, 0);
        c9j5.AAV(editableApprovalAttachmentPreviewJson.file_name, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || editableApprovalAttachmentPreviewJson.alt_text != null) {
            c9j5.AAP(editableApprovalAttachmentPreviewJson.alt_text, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || editableApprovalAttachmentPreviewJson.size_bytes != null) {
            c9j5.AAP(editableApprovalAttachmentPreviewJson.size_bytes, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || editableApprovalAttachmentPreviewJson.resource != null) {
            c9j5.AAP(editableApprovalAttachmentPreviewJson.resource, ApprovalRequestPreviewAttachmentResourceJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditableApprovalAttachmentPreviewJson) {
                EditableApprovalAttachmentPreviewJson editableApprovalAttachmentPreviewJson = (EditableApprovalAttachmentPreviewJson) obj;
                if (!C7384Etj.areEqual(this.kind, editableApprovalAttachmentPreviewJson.kind) || !C7384Etj.areEqual(this.file_name, editableApprovalAttachmentPreviewJson.file_name) || !C7384Etj.areEqual(this.alt_text, editableApprovalAttachmentPreviewJson.alt_text) || !C7384Etj.areEqual(this.size_bytes, editableApprovalAttachmentPreviewJson.size_bytes) || !C7384Etj.areEqual(this.resource, editableApprovalAttachmentPreviewJson.resource)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EditableApprovalAttachmentPreviewJson copy$default(EditableApprovalAttachmentPreviewJson editableApprovalAttachmentPreviewJson, String str, String str2, String str3, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editableApprovalAttachmentPreviewJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = editableApprovalAttachmentPreviewJson.file_name;
        }
        if ((i & 4) != 0) {
            str3 = editableApprovalAttachmentPreviewJson.alt_text;
        }
        if ((i & 8) != 0) {
            l = editableApprovalAttachmentPreviewJson.size_bytes;
        }
        if ((i & 16) != 0) {
            approvalRequestPreviewAttachmentResourceJson = editableApprovalAttachmentPreviewJson.resource;
        }
        return editableApprovalAttachmentPreviewJson.copy(str, str2, str3, l, approvalRequestPreviewAttachmentResourceJson);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.file_name;
    }

    public final String component3() {
        return this.alt_text;
    }

    public final Long component4() {
        return this.size_bytes;
    }

    public final ApprovalRequestPreviewAttachmentResourceJson component5() {
        return this.resource;
    }

    public final String getAlt_text() {
        return this.alt_text;
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
        return ((((AnonymousClass005.A0I(this.file_name, AnonymousClass001.A0G(this.kind)) + AnonymousClass006.A0G(this.alt_text)) * 31) + AnonymousClass006.A0D(this.size_bytes)) * 31) + C3cH.A02(this.resource);
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment toDomain() {
        String str = this.kind;
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind agentPermissionRequestPreviewAttachmentKind = "image".equals(str) ? HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.IMAGE : "video".equals(str) ? HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.VIDEO : HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.FILE;
        String str2 = this.file_name;
        Long l = this.size_bytes;
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentResource domainOrNull = null;
        if (l == null || l.longValue() < 0) {
            l = null;
        }
        ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson = this.resource;
        if (approvalRequestPreviewAttachmentResourceJson != null) {
            Integer num = approvalRequestPreviewAttachmentResourceJson.width;
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            Integer num2 = approvalRequestPreviewAttachmentResourceJson.height;
            if (num2 == null || num2.intValue() <= 0) {
                num2 = null;
            }
            Long l2 = approvalRequestPreviewAttachmentResourceJson.updated_at_ms;
            if (l2 == null || l2.longValue() < 0) {
                l2 = null;
            }
            ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJsonCopy = approvalRequestPreviewAttachmentResourceJson.copy(approvalRequestPreviewAttachmentResourceJson.url, num, num2, approvalRequestPreviewAttachmentResourceJson.content_type, l2);
            if (approvalRequestPreviewAttachmentResourceJsonCopy != null) {
                domainOrNull = approvalRequestPreviewAttachmentResourceJsonCopy.toDomainOrNull();
            }
        }
        return new HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment(agentPermissionRequestPreviewAttachmentKind, str2, l, domainOrNull);
    }

    public EditableApprovalAttachmentPreviewJson(String str, String str2, String str3, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson) {
        AnonymousClass003.A0u(str, str2);
        this.kind = str;
        this.file_name = str2;
        this.alt_text = str3;
        this.size_bytes = l;
        this.resource = approvalRequestPreviewAttachmentResourceJson;
    }

    public final EditableApprovalAttachmentPreviewJson copy(String str, String str2, String str3, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson) {
        AnonymousClass003.A0u(str, str2);
        return new EditableApprovalAttachmentPreviewJson(str, str2, str3, l, approvalRequestPreviewAttachmentResourceJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EditableApprovalAttachmentPreviewJson(String str, String str2, String str3, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : approvalRequestPreviewAttachmentResourceJson);
    }

    public /* synthetic */ EditableApprovalAttachmentPreviewJson(int i, String str, String str2, String str3, Long l, ApprovalRequestPreviewAttachmentResourceJson approvalRequestPreviewAttachmentResourceJson, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(EditableApprovalAttachmentPreviewJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.kind = str;
        this.file_name = str2;
        if ((i & 4) == 0) {
            this.alt_text = null;
        } else {
            this.alt_text = str3;
        }
        if ((i & 8) == 0) {
            this.size_bytes = null;
        } else {
            this.size_bytes = l;
        }
        if ((i & 16) == 0) {
            this.resource = null;
        } else {
            this.resource = approvalRequestPreviewAttachmentResourceJson;
        }
    }
}
