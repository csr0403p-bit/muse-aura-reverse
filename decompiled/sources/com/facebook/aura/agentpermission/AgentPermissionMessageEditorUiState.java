package com.facebook.aura.agentpermission;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.DCl;
import com.facebook.aura.gateway.EditableMessageAttachment;
import com.facebook.aura.gateway.EditableMessageEditor;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes2.dex */
public final class AgentPermissionMessageEditorUiState extends C06G {
    public static final int $stable = EditableMessageEditor.$stable;
    public final List<EditableMessageAttachment> attachments;
    public final String body;
    public final EditableMessageEditor editor;
    public final boolean loading;
    public final boolean saved;
    public final boolean saving;
    public final String subject;
    public final boolean unavailable;

    public final AgentPermissionMessageEditorUiState copy(EditableMessageEditor editableMessageEditor, String str, String str2, List<EditableMessageAttachment> list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass005.A11(str, str2, list, 1);
        return new AgentPermissionMessageEditorUiState(editableMessageEditor, str, str2, list, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentPermissionMessageEditorUiState) {
                AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState = (AgentPermissionMessageEditorUiState) obj;
                if (!C7384Etj.areEqual(this.editor, agentPermissionMessageEditorUiState.editor) || !C7384Etj.areEqual(this.subject, agentPermissionMessageEditorUiState.subject) || !C7384Etj.areEqual(this.body, agentPermissionMessageEditorUiState.body) || !C7384Etj.areEqual(this.attachments, agentPermissionMessageEditorUiState.attachments) || this.loading != agentPermissionMessageEditorUiState.loading || this.saving != agentPermissionMessageEditorUiState.saving || this.saved != agentPermissionMessageEditorUiState.saved || this.unavailable != agentPermissionMessageEditorUiState.unavailable) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AgentPermissionMessageEditorUiState(EditableMessageEditor editableMessageEditor, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : editableMessageEditor, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? C0881AGi.A00 : list, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, C3cH.A1N(i, z4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgentPermissionMessageEditorUiState copy$default(AgentPermissionMessageEditorUiState agentPermissionMessageEditorUiState, EditableMessageEditor editableMessageEditor, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            editableMessageEditor = agentPermissionMessageEditorUiState.editor;
        }
        if ((i & 2) != 0) {
            str = agentPermissionMessageEditorUiState.subject;
        }
        if ((i & 4) != 0) {
            str2 = agentPermissionMessageEditorUiState.body;
        }
        if ((i & 8) != 0) {
            list = agentPermissionMessageEditorUiState.attachments;
        }
        if ((i & 16) != 0) {
            z = agentPermissionMessageEditorUiState.loading;
        }
        if ((i & 32) != 0) {
            z2 = agentPermissionMessageEditorUiState.saving;
        }
        if ((i & 64) != 0) {
            z3 = agentPermissionMessageEditorUiState.saved;
        }
        if ((i & 128) != 0) {
            z4 = agentPermissionMessageEditorUiState.unavailable;
        }
        return agentPermissionMessageEditorUiState.copy(editableMessageEditor, str, str2, list, z, z2, z3, z4);
    }

    public final EditableMessageEditor component1() {
        return this.editor;
    }

    public final String component2() {
        return this.subject;
    }

    public final String component3() {
        return this.body;
    }

    public final List<EditableMessageAttachment> component4() {
        return this.attachments;
    }

    public final boolean component5() {
        return this.loading;
    }

    public final boolean component6() {
        return this.saving;
    }

    public final boolean component7() {
        return this.saved;
    }

    public final boolean component8() {
        return this.unavailable;
    }

    public final List<EditableMessageAttachment> getAttachments() {
        return this.attachments;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getCanSave() {
        return (this.editor == null || this.loading || this.saving || this.saved || this.unavailable) ? false : true;
    }

    public final EditableMessageEditor getEditor() {
        return this.editor;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getSaved() {
        return this.saved;
    }

    public final boolean getSaving() {
        return this.saving;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final boolean getUnavailable() {
        return this.unavailable;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.attachments, AnonymousClass005.A0I(this.body, AnonymousClass005.A0I(this.subject, AnonymousClass006.A0D(this.editor) * 31))), this.loading), this.saving), this.saved), this.unavailable);
    }

    public final AgentPermissionMessageEditorError validationError$fbandroid_express_aura_java_com_facebook_aura_agentpermission_agentpermission() {
        String str = this.subject;
        Charset charset = DCl.A05;
        if (str.getBytes(charset).length > 2048) {
            return AgentPermissionMessageEditorError.SUBJECT_TOO_LONG;
        }
        if (this.body.getBytes(charset).length > 65536) {
            return AgentPermissionMessageEditorError.BODY_TOO_LONG;
        }
        EditableMessageEditor editableMessageEditor = this.editor;
        if (editableMessageEditor == null || editableMessageEditor.isEmail() || !C7BY.A0j(this.body) || !this.attachments.isEmpty()) {
            return null;
        }
        return AgentPermissionMessageEditorError.EMPTY_MESSAGE;
    }

    public String toString() {
        return super.toString();
    }

    public AgentPermissionMessageEditorUiState(EditableMessageEditor editableMessageEditor, String str, String str2, List<EditableMessageAttachment> list, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass005.A11(str, str2, list, 1);
        this.editor = editableMessageEditor;
        this.subject = str;
        this.body = str2;
        this.attachments = list;
        this.loading = z;
        this.saving = z2;
        this.saved = z3;
        this.unavailable = z4;
    }

    public AgentPermissionMessageEditorUiState() {
        this(null, "", "", C0881AGi.A00, false, false, false, false);
    }
}
