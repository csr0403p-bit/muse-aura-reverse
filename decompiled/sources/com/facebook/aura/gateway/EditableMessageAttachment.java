package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public final class EditableMessageAttachment extends C06G {
    public static final int $stable = HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment.$stable;
    public final String altText;
    public final String id;
    public final String name;
    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment preview;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditableMessageAttachment) {
                EditableMessageAttachment editableMessageAttachment = (EditableMessageAttachment) obj;
                if (!C7384Etj.areEqual(this.id, editableMessageAttachment.id) || !C7384Etj.areEqual(this.name, editableMessageAttachment.name) || !C7384Etj.areEqual(this.preview, editableMessageAttachment.preview) || !C7384Etj.areEqual(this.altText, editableMessageAttachment.altText)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EditableMessageAttachment copy$default(EditableMessageAttachment editableMessageAttachment, String str, String str2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editableMessageAttachment.id;
        }
        if ((i & 2) != 0) {
            str2 = editableMessageAttachment.name;
        }
        if ((i & 4) != 0) {
            agentPermissionRequestPreviewAttachment = editableMessageAttachment.preview;
        }
        if ((i & 8) != 0) {
            str3 = editableMessageAttachment.altText;
        }
        AnonymousClass005.A0x(str, str2, agentPermissionRequestPreviewAttachment);
        return new EditableMessageAttachment(str, str2, agentPermissionRequestPreviewAttachment, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment component3() {
        return this.preview;
    }

    public final String component4() {
        return this.altText;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment getPreview() {
        return this.preview;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.preview, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.altText);
    }

    public EditableMessageAttachment(String str, String str2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, String str3) {
        AnonymousClass005.A0x(str, str2, agentPermissionRequestPreviewAttachment);
        this.id = str;
        this.name = str2;
        this.preview = agentPermissionRequestPreviewAttachment;
        this.altText = str3;
    }

    public final EditableMessageAttachment copy(String str, String str2, HatchAgentPermissionsRepository.AgentPermissionRequestPreviewAttachment agentPermissionRequestPreviewAttachment, String str3) {
        AnonymousClass005.A0x(str, str2, agentPermissionRequestPreviewAttachment);
        return new EditableMessageAttachment(str, str2, agentPermissionRequestPreviewAttachment, str3);
    }

    public String toString() {
        return super.toString();
    }
}
