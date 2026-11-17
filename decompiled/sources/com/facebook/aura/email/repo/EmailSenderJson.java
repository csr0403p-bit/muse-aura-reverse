package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.email.model.EmailSender;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailSenderJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String email_address;
    public final String id;
    public final String status;

    public final class Companion {
        public final C9hr<EmailSenderJson> serializer() {
            return EmailSenderJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSenderJson emailSenderJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailSenderJson.id, c9iZ, 0);
        c9j5.AAV(emailSenderJson.email_address, c9iZ, 1);
        c9j5.AAV(emailSenderJson.status, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSenderJson) {
                EmailSenderJson emailSenderJson = (EmailSenderJson) obj;
                if (!C7384Etj.areEqual(this.id, emailSenderJson.id) || !C7384Etj.areEqual(this.email_address, emailSenderJson.email_address) || !C7384Etj.areEqual(this.status, emailSenderJson.status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSenderJson copy$default(EmailSenderJson emailSenderJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSenderJson.id;
        }
        if ((i & 2) != 0) {
            str2 = emailSenderJson.email_address;
        }
        if ((i & 4) != 0) {
            str3 = emailSenderJson.status;
        }
        return emailSenderJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.email_address;
    }

    public final String component3() {
        return this.status;
    }

    public final String getEmail_address() {
        return this.email_address;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.status, AnonymousClass005.A0I(this.email_address, AnonymousClass001.A0G(this.id)));
    }

    public final EmailSender toDomain() {
        return new EmailSender(this.id, this.email_address, this.status);
    }

    public EmailSenderJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.email_address = str2;
        this.status = str3;
    }

    public final EmailSenderJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new EmailSenderJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSenderJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(EmailSenderJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.email_address = str2;
        this.status = str3;
    }
}
