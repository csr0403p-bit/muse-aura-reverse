package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class EditApprovalMessageRequestJson extends C06G {
    public static final int $stable = 8;
    public final List<String> attachment_ids;
    public final String body;
    public final long expected_message_revision;
    public final String subject;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, EditApprovalMessageRequestJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<EditApprovalMessageRequestJson> serializer() {
            return EditApprovalMessageRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ EditApprovalMessageRequestJson copy$default(EditApprovalMessageRequestJson editApprovalMessageRequestJson, String str, String str2, List list, long j, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        List list2 = list;
        long j2 = j;
        if ((i & 1) != 0) {
            str3 = editApprovalMessageRequestJson.subject;
        }
        if ((i & 2) != 0) {
            str4 = editApprovalMessageRequestJson.body;
        }
        if ((i & 4) != 0) {
            list2 = editApprovalMessageRequestJson.attachment_ids;
        }
        if ((i & 8) != 0) {
            j2 = editApprovalMessageRequestJson.expected_message_revision;
        }
        AnonymousClass005.A0x(str3, str4, list2);
        return new EditApprovalMessageRequestJson(str3, str4, list2, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditApprovalMessageRequestJson) {
                EditApprovalMessageRequestJson editApprovalMessageRequestJson = (EditApprovalMessageRequestJson) obj;
                if (!C7384Etj.areEqual(this.subject, editApprovalMessageRequestJson.subject) || !C7384Etj.areEqual(this.body, editApprovalMessageRequestJson.body) || !C7384Etj.areEqual(this.attachment_ids, editApprovalMessageRequestJson.attachment_ids) || this.expected_message_revision != editApprovalMessageRequestJson.expected_message_revision) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(EditApprovalMessageRequestJson editApprovalMessageRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(editApprovalMessageRequestJson.subject, c9iZ, 0);
        c9j5.AAV(editApprovalMessageRequestJson.body, c9iZ, 1);
        c9j5.AAQ(editApprovalMessageRequestJson.attachment_ids, C3cH.A15(f0cArr, 2), c9iZ, 2);
        c9j5.AAN(c9iZ, 3, editApprovalMessageRequestJson.expected_message_revision);
    }

    public final String component1() {
        return this.subject;
    }

    public final String component2() {
        return this.body;
    }

    public final List<String> component3() {
        return this.attachment_ids;
    }

    public final long component4() {
        return this.expected_message_revision;
    }

    public final List<String> getAttachment_ids() {
        return this.attachment_ids;
    }

    public final String getBody() {
        return this.body;
    }

    public final long getExpected_message_revision() {
        return this.expected_message_revision;
    }

    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.expected_message_revision, AnonymousClass005.A0F(this.attachment_ids, AnonymousClass005.A0I(this.body, AnonymousClass001.A0G(this.subject))));
    }

    public EditApprovalMessageRequestJson(String str, String str2, List<String> list, long j) {
        AnonymousClass005.A0x(str, str2, list);
        this.subject = str;
        this.body = str2;
        this.attachment_ids = list;
        this.expected_message_revision = j;
    }

    public final EditApprovalMessageRequestJson copy(String str, String str2, List<String> list, long j) {
        AnonymousClass005.A0x(str, str2, list);
        return new EditApprovalMessageRequestJson(str, str2, list, j);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EditApprovalMessageRequestJson(int i, String str, String str2, List list, long j, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(EditApprovalMessageRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.subject = str;
        this.body = str2;
        this.attachment_ids = list;
        this.expected_message_revision = j;
    }
}
