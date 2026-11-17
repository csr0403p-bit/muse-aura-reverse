package com.facebook.aura.email.repo;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.email.model.EmailAttachment;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class EmailAttachmentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String content_id;
    public final String filename;
    public final int index;
    public final boolean is_inline;
    public final String mime_type;
    public final long size;

    public final class Companion {
        public final C9hr<EmailAttachmentJson> serializer() {
            return EmailAttachmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ EmailAttachmentJson copy$default(EmailAttachmentJson emailAttachmentJson, int i, String str, String str2, long j, String str3, boolean z, int i2, Object obj) {
        int i3 = i;
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        String str6 = str3;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            i3 = emailAttachmentJson.index;
        }
        if ((i2 & 2) != 0) {
            str4 = emailAttachmentJson.filename;
        }
        if ((i2 & 4) != 0) {
            str5 = emailAttachmentJson.mime_type;
        }
        if ((i2 & 8) != 0) {
            j2 = emailAttachmentJson.size;
        }
        if ((i2 & 16) != 0) {
            str6 = emailAttachmentJson.content_id;
        }
        if ((i2 & 32) != 0) {
            z2 = emailAttachmentJson.is_inline;
        }
        AnonymousClass003.A0x(str4, str5);
        return new EmailAttachmentJson(i3, str4, str5, j2, str6, z2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailAttachmentJson emailAttachmentJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAK(c9iZ, 0, emailAttachmentJson.index);
        c9j5.AAV(emailAttachmentJson.filename, c9iZ, 1);
        c9j5.AAV(emailAttachmentJson.mime_type, c9iZ, 2);
        c9j5.AAN(c9iZ, 3, emailAttachmentJson.size);
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailAttachmentJson.content_id != null) {
            c9j5.AAP(emailAttachmentJson.content_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || emailAttachmentJson.is_inline) {
            c9j5.AA7(c9iZ, 5, emailAttachmentJson.is_inline);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailAttachmentJson) {
                EmailAttachmentJson emailAttachmentJson = (EmailAttachmentJson) obj;
                if (this.index != emailAttachmentJson.index || !C7384Etj.areEqual(this.filename, emailAttachmentJson.filename) || !C7384Etj.areEqual(this.mime_type, emailAttachmentJson.mime_type) || this.size != emailAttachmentJson.size || !C7384Etj.areEqual(this.content_id, emailAttachmentJson.content_id) || this.is_inline != emailAttachmentJson.is_inline) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ EmailAttachmentJson(int i, int i2, String str, String str2, long j, String str3, boolean z, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(EmailAttachmentJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.index = i2;
        this.filename = str;
        this.mime_type = str2;
        this.size = j;
        this.content_id = (i & 16) == 0 ? null : str3;
        if ((i & 32) == 0) {
            this.is_inline = false;
        } else {
            this.is_inline = z;
        }
    }

    public final int component1() {
        return this.index;
    }

    public final String component2() {
        return this.filename;
    }

    public final String component3() {
        return this.mime_type;
    }

    public final long component4() {
        return this.size;
    }

    public final String component5() {
        return this.content_id;
    }

    public final boolean component6() {
        return this.is_inline;
    }

    public final String getContent_id() {
        return this.content_id;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return C0KA.A00(((AnonymousClass006.A05(this.size, AnonymousClass005.A0I(this.mime_type, AnonymousClass005.A0I(this.filename, this.index * 31))) * 31) + AnonymousClass006.A0G(this.content_id)) * 31, this.is_inline);
    }

    public final boolean is_inline() {
        return this.is_inline;
    }

    public final EmailAttachment toDomain() {
        return new EmailAttachment(this.index, this.filename, this.mime_type, this.size, this.content_id, this.is_inline);
    }

    public final EmailAttachmentJson copy(int i, String str, String str2, long j, String str3, boolean z) {
        AnonymousClass003.A0x(str, str2);
        return new EmailAttachmentJson(i, str, str2, j, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public EmailAttachmentJson(int i, String str, String str2, long j, String str3, boolean z) {
        AnonymousClass003.A0x(str, str2);
        this.index = i;
        this.filename = str;
        this.mime_type = str2;
        this.size = j;
        this.content_id = str3;
        this.is_inline = z;
    }

    public /* synthetic */ EmailAttachmentJson(int i, String str, String str2, long j, String str3, boolean z, int i2, C06H c06h) {
        this(i, str, str2, j, (i2 & 16) != 0 ? null : str3, AnonymousClass002.A1R(i2, z));
    }
}
