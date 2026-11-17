package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.email.model.EmailOwnerVerification;
import com.facebook.aura.email.model.EmailOwnerVerificationException;
import com.facebook.aura.email.model.EmailSender;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailOwnerResultJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String challenge_id;
    public final String email_address;
    public final String id;
    public final String status;

    public final class Companion {
        public final C9hr<EmailOwnerResultJson> serializer() {
            return EmailOwnerResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailOwnerResultJson emailOwnerResultJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailOwnerResultJson.id, c9iZ, 0);
        c9j5.AAV(emailOwnerResultJson.email_address, c9iZ, 1);
        c9j5.AAV(emailOwnerResultJson.status, c9iZ, 2);
        if (c9j5.AfR() || emailOwnerResultJson.challenge_id != null) {
            c9j5.AAP(emailOwnerResultJson.challenge_id, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailOwnerResultJson) {
                EmailOwnerResultJson emailOwnerResultJson = (EmailOwnerResultJson) obj;
                if (!C7384Etj.areEqual(this.id, emailOwnerResultJson.id) || !C7384Etj.areEqual(this.email_address, emailOwnerResultJson.email_address) || !C7384Etj.areEqual(this.status, emailOwnerResultJson.status) || !C7384Etj.areEqual(this.challenge_id, emailOwnerResultJson.challenge_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailOwnerResultJson copy$default(EmailOwnerResultJson emailOwnerResultJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailOwnerResultJson.id;
        }
        if ((i & 2) != 0) {
            str2 = emailOwnerResultJson.email_address;
        }
        if ((i & 4) != 0) {
            str3 = emailOwnerResultJson.status;
        }
        if ((i & 8) != 0) {
            str4 = emailOwnerResultJson.challenge_id;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new EmailOwnerResultJson(str, str2, str3, str4);
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

    public final String component4() {
        return this.challenge_id;
    }

    public final String getChallenge_id() {
        return this.challenge_id;
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
        return AnonymousClass005.A0I(this.status, AnonymousClass005.A0I(this.email_address, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.challenge_id);
    }

    public final EmailOwnerVerification toDomain() throws EmailOwnerVerificationException {
        String str;
        if (C7BY.A0j(this.id) || C7BY.A0j(this.email_address) || C7BY.A0j(this.status) || ((str = this.challenge_id) != null && C7BY.A0j(str))) {
            throw new EmailOwnerVerificationException(null, null);
        }
        return new EmailOwnerVerification(new EmailSender(this.id, this.email_address, this.status), this.challenge_id);
    }

    public EmailOwnerResultJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.email_address = str2;
        this.status = str3;
        this.challenge_id = str4;
    }

    public final EmailOwnerResultJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        return new EmailOwnerResultJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailOwnerResultJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass006.A0u(i, str4));
    }

    public /* synthetic */ EmailOwnerResultJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(EmailOwnerResultJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.email_address = str2;
        this.status = str3;
        this.challenge_id = (i & 8) == 0 ? null : str4;
    }
}
