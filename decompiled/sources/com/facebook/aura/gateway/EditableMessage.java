package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class EditableMessage extends C06G {
    public static final int $stable = 0;
    public final List<EditableMessageAttachment> attachments;
    public final List<String> bcc;
    public final String body;
    public final List<String> cc;
    public final String from;
    public final String subject;
    public final List<String> to;

    public EditableMessage(String str, List<String> list, List<String> list2, List<String> list3, String str2, String str3, List<EditableMessageAttachment> list4) {
        C7384Etj.A0Y(list, 1);
        AnonymousClass005.A16(list2, list3, str2, str3, 2);
        C7384Etj.A0Y(list4, 6);
        this.from = str;
        this.to = list;
        this.cc = list2;
        this.bcc = list3;
        this.subject = str2;
        this.body = str3;
        this.attachments = list4;
    }

    public final EditableMessage copy(String str, List<String> list, List<String> list2, List<String> list3, String str2, String str3, List<EditableMessageAttachment> list4) {
        C7384Etj.A0Y(list, 1);
        AnonymousClass005.A16(list2, list3, str2, str3, 2);
        C7384Etj.A0Y(list4, 6);
        return new EditableMessage(str, list, list2, list3, str2, str3, list4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditableMessage) {
                EditableMessage editableMessage = (EditableMessage) obj;
                if (!C7384Etj.areEqual(this.from, editableMessage.from) || !C7384Etj.areEqual(this.to, editableMessage.to) || !C7384Etj.areEqual(this.cc, editableMessage.cc) || !C7384Etj.areEqual(this.bcc, editableMessage.bcc) || !C7384Etj.areEqual(this.subject, editableMessage.subject) || !C7384Etj.areEqual(this.body, editableMessage.body) || !C7384Etj.areEqual(this.attachments, editableMessage.attachments)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditableMessage copy$default(EditableMessage editableMessage, String str, List list, List list2, List list3, String str2, String str3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editableMessage.from;
        }
        if ((i & 2) != 0) {
            list = editableMessage.to;
        }
        if ((i & 4) != 0) {
            list2 = editableMessage.cc;
        }
        if ((i & 8) != 0) {
            list3 = editableMessage.bcc;
        }
        if ((i & 16) != 0) {
            str2 = editableMessage.subject;
        }
        if ((i & 32) != 0) {
            str3 = editableMessage.body;
        }
        if ((i & 64) != 0) {
            list4 = editableMessage.attachments;
        }
        return editableMessage.copy(str, list, list2, list3, str2, str3, list4);
    }

    public final String component1() {
        return this.from;
    }

    public final List<String> component2() {
        return this.to;
    }

    public final List<String> component3() {
        return this.cc;
    }

    public final List<String> component4() {
        return this.bcc;
    }

    public final String component5() {
        return this.subject;
    }

    public final String component6() {
        return this.body;
    }

    public final List<EditableMessageAttachment> component7() {
        return this.attachments;
    }

    public final List<EditableMessageAttachment> getAttachments() {
        return this.attachments;
    }

    public final List<String> getBcc() {
        return this.bcc;
    }

    public final String getBody() {
        return this.body;
    }

    public final List<String> getCc() {
        return this.cc;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final List<String> getTo() {
        return this.to;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.attachments, AnonymousClass005.A0I(this.body, AnonymousClass005.A0I(this.subject, AnonymousClass005.A0F(this.bcc, AnonymousClass005.A0F(this.cc, AnonymousClass005.A0F(this.to, AnonymousClass006.A0G(this.from) * 31))))));
    }

    public String toString() {
        return super.toString();
    }
}
