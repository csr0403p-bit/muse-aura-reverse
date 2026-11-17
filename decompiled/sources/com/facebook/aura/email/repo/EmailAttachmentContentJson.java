package com.facebook.aura.email.repo;

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
/* loaded from: classes.dex */
public final class EmailAttachmentContentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String content_base64;
    public final String filename;
    public final String mime_type;
    public final long size;

    public final class Companion {
        public final C9hr<EmailAttachmentContentJson> serializer() {
            return EmailAttachmentContentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ EmailAttachmentContentJson copy$default(EmailAttachmentContentJson emailAttachmentContentJson, String str, String str2, long j, String str3, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        String str6 = str3;
        if ((i & 1) != 0) {
            str4 = emailAttachmentContentJson.filename;
        }
        if ((i & 2) != 0) {
            str5 = emailAttachmentContentJson.mime_type;
        }
        if ((i & 4) != 0) {
            j2 = emailAttachmentContentJson.size;
        }
        if ((i & 8) != 0) {
            str6 = emailAttachmentContentJson.content_base64;
        }
        AnonymousClass005.A0y(str4, str5, str6);
        return new EmailAttachmentContentJson(str4, str5, j2, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailAttachmentContentJson emailAttachmentContentJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailAttachmentContentJson.filename, c9iZ, 0);
        c9j5.AAV(emailAttachmentContentJson.mime_type, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, emailAttachmentContentJson.size);
        c9j5.AAV(emailAttachmentContentJson.content_base64, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailAttachmentContentJson) {
                EmailAttachmentContentJson emailAttachmentContentJson = (EmailAttachmentContentJson) obj;
                if (!C7384Etj.areEqual(this.filename, emailAttachmentContentJson.filename) || !C7384Etj.areEqual(this.mime_type, emailAttachmentContentJson.mime_type) || this.size != emailAttachmentContentJson.size || !C7384Etj.areEqual(this.content_base64, emailAttachmentContentJson.content_base64)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.filename;
    }

    public final String component2() {
        return this.mime_type;
    }

    public final long component3() {
        return this.size;
    }

    public final String component4() {
        return this.content_base64;
    }

    public final String getContent_base64() {
        return this.content_base64;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.content_base64, AnonymousClass006.A06(this.size, AnonymousClass005.A0I(this.mime_type, AnonymousClass001.A0G(this.filename))));
    }

    public EmailAttachmentContentJson(String str, String str2, long j, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        this.filename = str;
        this.mime_type = str2;
        this.size = j;
        this.content_base64 = str3;
    }

    public final EmailAttachmentContentJson copy(String str, String str2, long j, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        return new EmailAttachmentContentJson(str, str2, j, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailAttachmentContentJson(int i, String str, String str2, long j, String str3, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(EmailAttachmentContentJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.filename = str;
        this.mime_type = str2;
        this.size = j;
        this.content_base64 = str3;
    }
}
