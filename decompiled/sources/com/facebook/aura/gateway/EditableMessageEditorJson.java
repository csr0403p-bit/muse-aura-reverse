package com.facebook.aura.gateway;

import X.AnonymousClass001;
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

@Serializable
/* loaded from: classes2.dex */
public final class EditableMessageEditorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String approval_id;
    public final EditableApprovalMessageJson editable_message;
    public final String host;
    public final long message_revision;
    public final String status;

    public final class Companion {
        public final C9hr<EditableMessageEditorJson> serializer() {
            return EditableMessageEditorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(EditableMessageEditorJson editableMessageEditorJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(editableMessageEditorJson.approval_id, c9iZ, 0);
        c9j5.AAV(editableMessageEditorJson.host, c9iZ, 1);
        c9j5.AAV(editableMessageEditorJson.status, c9iZ, 2);
        c9j5.AAN(c9iZ, 3, editableMessageEditorJson.message_revision);
        c9j5.AAQ(editableMessageEditorJson.editable_message, EditableApprovalMessageJson$$serializer.INSTANCE, c9iZ, 4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditableMessageEditorJson) {
                EditableMessageEditorJson editableMessageEditorJson = (EditableMessageEditorJson) obj;
                if (!C7384Etj.areEqual(this.approval_id, editableMessageEditorJson.approval_id) || !C7384Etj.areEqual(this.host, editableMessageEditorJson.host) || !C7384Etj.areEqual(this.status, editableMessageEditorJson.status) || this.message_revision != editableMessageEditorJson.message_revision || !C7384Etj.areEqual(this.editable_message, editableMessageEditorJson.editable_message)) {
                }
            }
            return false;
        }
        return true;
    }

    public final EditableMessageEditor toDomain(String str) {
        C7384Etj.A0Y(str, 0);
        return new EditableMessageEditor(this.host, this.message_revision, this.editable_message.toDomain(), str);
    }

    public static /* synthetic */ EditableMessageEditorJson copy$default(EditableMessageEditorJson editableMessageEditorJson, String str, String str2, String str3, long j, EditableApprovalMessageJson editableApprovalMessageJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editableMessageEditorJson.approval_id;
        }
        if ((i & 2) != 0) {
            str2 = editableMessageEditorJson.host;
        }
        if ((i & 4) != 0) {
            str3 = editableMessageEditorJson.status;
        }
        if ((i & 8) != 0) {
            j = editableMessageEditorJson.message_revision;
        }
        if ((i & 16) != 0) {
            editableApprovalMessageJson = editableMessageEditorJson.editable_message;
        }
        return editableMessageEditorJson.copy(str, str2, str3, j, editableApprovalMessageJson);
    }

    public final String component1() {
        return this.approval_id;
    }

    public final String component2() {
        return this.host;
    }

    public final String component3() {
        return this.status;
    }

    public final long component4() {
        return this.message_revision;
    }

    public final EditableApprovalMessageJson component5() {
        return this.editable_message;
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final EditableApprovalMessageJson getEditable_message() {
        return this.editable_message;
    }

    public final String getHost() {
        return this.host;
    }

    public final long getMessage_revision() {
        return this.message_revision;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.editable_message, AnonymousClass006.A05(this.message_revision, AnonymousClass005.A0I(this.status, AnonymousClass005.A0I(this.host, AnonymousClass001.A0G(this.approval_id)))) * 31);
    }

    public EditableMessageEditorJson(String str, String str2, String str3, long j, EditableApprovalMessageJson editableApprovalMessageJson) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(editableApprovalMessageJson, 4);
        this.approval_id = str;
        this.host = str2;
        this.status = str3;
        this.message_revision = j;
        this.editable_message = editableApprovalMessageJson;
    }

    public final EditableMessageEditorJson copy(String str, String str2, String str3, long j, EditableApprovalMessageJson editableApprovalMessageJson) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(editableApprovalMessageJson, 4);
        return new EditableMessageEditorJson(str, str2, str3, j, editableApprovalMessageJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EditableMessageEditorJson(int i, String str, String str2, String str3, long j, EditableApprovalMessageJson editableApprovalMessageJson, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(EditableMessageEditorJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.approval_id = str;
        this.host = str2;
        this.status = str3;
        this.message_revision = j;
        this.editable_message = editableApprovalMessageJson;
    }
}
