package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class EditableApprovalAttachmentJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String id;
    public final String name;
    public final JsonElement preview;

    public final class Companion {
        public final C9hr<EditableApprovalAttachmentJson> serializer() {
            return EditableApprovalAttachmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(EditableApprovalAttachmentJson editableApprovalAttachmentJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(editableApprovalAttachmentJson.id, c9iZ, 0);
        c9j5.AAV(editableApprovalAttachmentJson.name, c9iZ, 1);
        if (c9j5.AfR() || editableApprovalAttachmentJson.preview != null) {
            c9j5.AAP(editableApprovalAttachmentJson.preview, JsonElementSerializer.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditableApprovalAttachmentJson) {
                EditableApprovalAttachmentJson editableApprovalAttachmentJson = (EditableApprovalAttachmentJson) obj;
                if (!C7384Etj.areEqual(this.id, editableApprovalAttachmentJson.id) || !C7384Etj.areEqual(this.name, editableApprovalAttachmentJson.name) || !C7384Etj.areEqual(this.preview, editableApprovalAttachmentJson.preview)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EditableApprovalAttachmentJson copy$default(EditableApprovalAttachmentJson editableApprovalAttachmentJson, String str, String str2, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editableApprovalAttachmentJson.id;
        }
        if ((i & 2) != 0) {
            str2 = editableApprovalAttachmentJson.name;
        }
        if ((i & 4) != 0) {
            jsonElement = editableApprovalAttachmentJson.preview;
        }
        return editableApprovalAttachmentJson.copy(str, str2, jsonElement);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final JsonElement component3() {
        return this.preview;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final JsonElement getPreview() {
        return this.preview;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0D(this.preview);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[PHI: r3
  0x0035: PHI (r3v3 com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment) = 
  (r3v1 com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment)
  (r3v4 com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment)
 binds: [B:17:0x0033, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.EditableMessageAttachment toDomain() {
        /*
            r7 = this;
            kotlinx.serialization.json.JsonElement r3 = r7.preview
            r1 = 0
            if (r3 == 0) goto L10
            X.9sU r2 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L12
            com.facebook.aura.gateway.EditableApprovalAttachmentPreviewJson$$serializer r0 = com.facebook.aura.gateway.EditableApprovalAttachmentPreviewJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L12
            java.lang.Object r6 = X.C3cI.A0T(r0, r2, r3)     // Catch: java.lang.Throwable -> L12
            com.facebook.aura.gateway.EditableApprovalAttachmentPreviewJson r6 = (com.facebook.aura.gateway.EditableApprovalAttachmentPreviewJson) r6     // Catch: java.lang.Throwable -> L12
            goto L17
        L10:
            r6 = r1
            goto L1e
        L12:
            r0 = move-exception
            X.Hud r6 = X.C3cG.A0s(r0)
        L17:
            boolean r0 = r6 instanceof X.C10571Hud
            if (r0 == 0) goto L1c
            r6 = r1
        L1c:
            com.facebook.aura.gateway.EditableApprovalAttachmentPreviewJson r6 = (com.facebook.aura.gateway.EditableApprovalAttachmentPreviewJson) r6
        L1e:
            java.lang.String r5 = r7.id
            java.lang.String r4 = r7.name
            if (r6 == 0) goto L2a
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment r3 = r6.toDomain()
            if (r3 != 0) goto L35
        L2a:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachmentKind r2 = com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachmentKind.FILE
            java.lang.String r0 = r7.name
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment r3 = new com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRequestPreviewAttachment
            r3.<init>(r2, r0, r1, r1)
            if (r6 == 0) goto L37
        L35:
            java.lang.String r1 = r6.alt_text
        L37:
            com.facebook.aura.gateway.EditableMessageAttachment r0 = new com.facebook.aura.gateway.EditableMessageAttachment
            r0.<init>(r5, r4, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.EditableApprovalAttachmentJson.toDomain():com.facebook.aura.gateway.EditableMessageAttachment");
    }

    public EditableApprovalAttachmentJson(String str, String str2, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.name = str2;
        this.preview = jsonElement;
    }

    public final EditableApprovalAttachmentJson copy(String str, String str2, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, str2);
        return new EditableApprovalAttachmentJson(str, str2, jsonElement);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EditableApprovalAttachmentJson(int i, String str, String str2, JsonElement jsonElement, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(EditableApprovalAttachmentJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.name = str2;
        this.preview = (i & 4) == 0 ? null : jsonElement;
    }

    public /* synthetic */ EditableApprovalAttachmentJson(String str, String str2, JsonElement jsonElement, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : jsonElement);
    }
}
