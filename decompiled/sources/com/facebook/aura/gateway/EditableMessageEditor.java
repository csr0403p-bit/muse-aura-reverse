package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class EditableMessageEditor extends C06G {
    public static final int $stable = 0;
    public final String gatewayUrl;
    public final String host;
    public final EditableMessage message;
    public final long messageRevision;

    public EditableMessageEditor(String str, long j, EditableMessage editableMessage, String str2) {
        AnonymousClass005.A11(str, editableMessage, str2, 0);
        this.host = str;
        this.messageRevision = j;
        this.message = editableMessage;
        this.gatewayUrl = str2;
    }

    public final EditableMessageEditor copy(String str, long j, EditableMessage editableMessage, String str2) {
        AnonymousClass005.A11(str, editableMessage, str2, 0);
        return new EditableMessageEditor(str, j, editableMessage, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditableMessageEditor) {
                EditableMessageEditor editableMessageEditor = (EditableMessageEditor) obj;
                if (!C7384Etj.areEqual(this.host, editableMessageEditor.host) || this.messageRevision != editableMessageEditor.messageRevision || !C7384Etj.areEqual(this.message, editableMessageEditor.message) || !C7384Etj.areEqual(this.gatewayUrl, editableMessageEditor.gatewayUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EditableMessageEditor copy$default(EditableMessageEditor editableMessageEditor, String str, long j, EditableMessage editableMessage, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editableMessageEditor.host;
        }
        if ((i & 2) != 0) {
            j = editableMessageEditor.messageRevision;
        }
        if ((i & 4) != 0) {
            editableMessage = editableMessageEditor.message;
        }
        if ((i & 8) != 0) {
            str2 = editableMessageEditor.gatewayUrl;
        }
        return editableMessageEditor.copy(str, j, editableMessage, str2);
    }

    public final String component1() {
        return this.host;
    }

    public final long component2() {
        return this.messageRevision;
    }

    public final EditableMessage component3() {
        return this.message;
    }

    public final String component4() {
        return this.gatewayUrl;
    }

    public final String getGatewayUrl() {
        return this.gatewayUrl;
    }

    public final String getHost() {
        return this.host;
    }

    public final EditableMessage getMessage() {
        return this.message;
    }

    public final long getMessageRevision() {
        return this.messageRevision;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.gatewayUrl, AnonymousClass005.A0F(this.message, AnonymousClass006.A05(this.messageRevision, AnonymousClass001.A0G(this.host)) * 31));
    }

    public final boolean isEmail() {
        String str = this.host;
        return "gmail".equals(str) || "outlook_mail".equals(str);
    }

    public String toString() {
        return super.toString();
    }
}
