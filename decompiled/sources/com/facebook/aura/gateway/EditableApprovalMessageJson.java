package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class EditableApprovalMessageJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<EditableApprovalAttachmentJson> attachments;
    public final List<String> bcc;
    public final String body;
    public final List<String> cc;
    public final String from;
    public final String subject;
    public final List<String> to;

    public final class Companion {
        public final C9hr<EditableApprovalMessageJson> serializer() {
            return EditableApprovalMessageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, EditableApprovalMessageJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, EditableApprovalMessageJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, EditableApprovalMessageJson$Companion$$childSerializers$3.INSTANCE), null, null, AbstractC5321DgF.A02(num, EditableApprovalMessageJson$Companion$$childSerializers$4.INSTANCE)};
    }

    public final EditableApprovalMessageJson copy(String str, List<String> list, List<String> list2, List<String> list3, String str2, String str3, List<EditableApprovalAttachmentJson> list4) {
        C7384Etj.A0Y(list, 1);
        AnonymousClass005.A16(list2, list3, str2, str3, 2);
        C7384Etj.A0Y(list4, 6);
        return new EditableApprovalMessageJson(str, list, list2, list3, str2, str3, list4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditableApprovalMessageJson) {
                EditableApprovalMessageJson editableApprovalMessageJson = (EditableApprovalMessageJson) obj;
                if (!C7384Etj.areEqual(this.from, editableApprovalMessageJson.from) || !C7384Etj.areEqual(this.to, editableApprovalMessageJson.to) || !C7384Etj.areEqual(this.cc, editableApprovalMessageJson.cc) || !C7384Etj.areEqual(this.bcc, editableApprovalMessageJson.bcc) || !C7384Etj.areEqual(this.subject, editableApprovalMessageJson.subject) || !C7384Etj.areEqual(this.body, editableApprovalMessageJson.body) || !C7384Etj.areEqual(this.attachments, editableApprovalMessageJson.attachments)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ EditableApprovalMessageJson(int i, String str, List list, List list2, List list3, String str2, String str3, List list4, C2hx c2hx) {
        if (50 != (i & 50)) {
            C9iI.A00(EditableApprovalMessageJson$$serializer.descriptor, i, 50);
            throw F60.createAndThrow();
        }
        this.from = (i & 1) == 0 ? null : str;
        this.to = list;
        if ((i & 4) == 0) {
            this.cc = C0881AGi.A00;
        } else {
            this.cc = list2;
        }
        if ((i & 8) == 0) {
            this.bcc = C0881AGi.A00;
        } else {
            this.bcc = list3;
        }
        this.subject = str2;
        this.body = str3;
        if ((i & 64) == 0) {
            this.attachments = C0881AGi.A00;
        } else {
            this.attachments = list4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditableApprovalMessageJson copy$default(EditableApprovalMessageJson editableApprovalMessageJson, String str, List list, List list2, List list3, String str2, String str3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editableApprovalMessageJson.from;
        }
        if ((i & 2) != 0) {
            list = editableApprovalMessageJson.to;
        }
        if ((i & 4) != 0) {
            list2 = editableApprovalMessageJson.cc;
        }
        if ((i & 8) != 0) {
            list3 = editableApprovalMessageJson.bcc;
        }
        if ((i & 16) != 0) {
            str2 = editableApprovalMessageJson.subject;
        }
        if ((i & 32) != 0) {
            str3 = editableApprovalMessageJson.body;
        }
        if ((i & 64) != 0) {
            list4 = editableApprovalMessageJson.attachments;
        }
        return editableApprovalMessageJson.copy(str, list, list2, list3, str2, str3, list4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(EditableApprovalMessageJson editableApprovalMessageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || editableApprovalMessageJson.from != null) {
            c9j5.AAP(editableApprovalMessageJson.from, C07779iq.A01, c9iZ, 0);
        }
        c9j5.AAQ(editableApprovalMessageJson.to, C3cH.A15(f0cArr, 1), c9iZ, 1);
        if (zAfR || !C3cG.A1L(editableApprovalMessageJson.cc)) {
            c9j5.AAQ(editableApprovalMessageJson.cc, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(editableApprovalMessageJson.bcc)) {
            c9j5.AAQ(editableApprovalMessageJson.bcc, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        c9j5.AAV(editableApprovalMessageJson.subject, c9iZ, 4);
        c9j5.AAV(editableApprovalMessageJson.body, c9iZ, 5);
        if (zAfR || !C3cG.A1L(editableApprovalMessageJson.attachments)) {
            c9j5.AAQ(editableApprovalMessageJson.attachments, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
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

    public final List<EditableApprovalAttachmentJson> component7() {
        return this.attachments;
    }

    public final List<EditableApprovalAttachmentJson> getAttachments() {
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

    public final EditableMessage toDomain() {
        String str = this.from;
        List<String> list = this.to;
        List<String> list2 = this.cc;
        List<String> list3 = this.bcc;
        String str2 = this.subject;
        String str3 = this.body;
        List<EditableApprovalAttachmentJson> list4 = this.attachments;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list4);
        Iterator<EditableApprovalAttachmentJson> it = list4.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new EditableMessage(str, list, list2, list3, str2, str3, arrayListA0i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EditableApprovalMessageJson(String str, List list, List list2, List list3, String str2, String str3, List list4, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), list, C3cI.A12(list2, i), (i & 8) != 0 ? C0881AGi.A00 : list3, str2, str3, (i & 64) != 0 ? C0881AGi.A00 : list4);
    }

    public EditableApprovalMessageJson(String str, List<String> list, List<String> list2, List<String> list3, String str2, String str3, List<EditableApprovalAttachmentJson> list4) {
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
}
