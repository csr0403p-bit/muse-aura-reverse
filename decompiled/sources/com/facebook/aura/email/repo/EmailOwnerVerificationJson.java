package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.email.model.EmailOwnerVerification;
import com.facebook.aura.email.model.EmailOwnerVerificationException;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailOwnerVerificationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String challenge_id;
    public final String email_address;
    public final EmailOwnerFailureJson error;
    public final String id;
    public final Boolean ok;
    public final EmailOwnerResultJson result;
    public final String status;

    public final class Companion {
        public final C9hr<EmailOwnerVerificationJson> serializer() {
            return EmailOwnerVerificationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailOwnerVerificationJson() {
        this(null, null, null, null, null, null, null);
    }

    public static /* synthetic */ EmailOwnerVerificationJson copy$default(EmailOwnerVerificationJson emailOwnerVerificationJson, EmailOwnerResultJson emailOwnerResultJson, EmailOwnerFailureJson emailOwnerFailureJson, Boolean bool, String str, String str2, String str3, String str4, int i, Object obj) {
        EmailOwnerResultJson emailOwnerResultJson2 = emailOwnerResultJson;
        EmailOwnerFailureJson emailOwnerFailureJson2 = emailOwnerFailureJson;
        Boolean bool2 = bool;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if ((i & 1) != 0) {
            emailOwnerResultJson2 = emailOwnerVerificationJson.result;
        }
        if ((i & 2) != 0) {
            emailOwnerFailureJson2 = emailOwnerVerificationJson.error;
        }
        if ((i & 4) != 0) {
            bool2 = emailOwnerVerificationJson.ok;
        }
        if ((i & 8) != 0) {
            str5 = emailOwnerVerificationJson.id;
        }
        if ((i & 16) != 0) {
            str6 = emailOwnerVerificationJson.email_address;
        }
        if ((i & 32) != 0) {
            str7 = emailOwnerVerificationJson.status;
        }
        if ((i & 64) != 0) {
            str8 = emailOwnerVerificationJson.challenge_id;
        }
        return new EmailOwnerVerificationJson(emailOwnerResultJson2, emailOwnerFailureJson2, bool2, str5, str6, str7, str8);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailOwnerVerificationJson emailOwnerVerificationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailOwnerVerificationJson.result != null) {
            c9j5.AAP(emailOwnerVerificationJson.result, EmailOwnerResultJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || emailOwnerVerificationJson.error != null) {
            c9j5.AAP(emailOwnerVerificationJson.error, EmailOwnerFailureJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || emailOwnerVerificationJson.ok != null) {
            c9j5.AAP(emailOwnerVerificationJson.ok, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || emailOwnerVerificationJson.id != null) {
            c9j5.AAP(emailOwnerVerificationJson.id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || emailOwnerVerificationJson.email_address != null) {
            c9j5.AAP(emailOwnerVerificationJson.email_address, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || emailOwnerVerificationJson.status != null) {
            c9j5.AAP(emailOwnerVerificationJson.status, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || emailOwnerVerificationJson.challenge_id != null) {
            c9j5.AAP(emailOwnerVerificationJson.challenge_id, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailOwnerVerificationJson) {
                EmailOwnerVerificationJson emailOwnerVerificationJson = (EmailOwnerVerificationJson) obj;
                if (!C7384Etj.areEqual(this.result, emailOwnerVerificationJson.result) || !C7384Etj.areEqual(this.error, emailOwnerVerificationJson.error) || !C7384Etj.areEqual(this.ok, emailOwnerVerificationJson.ok) || !C7384Etj.areEqual(this.id, emailOwnerVerificationJson.id) || !C7384Etj.areEqual(this.email_address, emailOwnerVerificationJson.email_address) || !C7384Etj.areEqual(this.status, emailOwnerVerificationJson.status) || !C7384Etj.areEqual(this.challenge_id, emailOwnerVerificationJson.challenge_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public final EmailOwnerResultJson component1() {
        return this.result;
    }

    public final EmailOwnerFailureJson component2() {
        return this.error;
    }

    public final Boolean component3() {
        return this.ok;
    }

    public final String component4() {
        return this.id;
    }

    public final String component5() {
        return this.email_address;
    }

    public final String component6() {
        return this.status;
    }

    public final String component7() {
        return this.challenge_id;
    }

    public final EmailOwnerVerificationJson copy(EmailOwnerResultJson emailOwnerResultJson, EmailOwnerFailureJson emailOwnerFailureJson, Boolean bool, String str, String str2, String str3, String str4) {
        return new EmailOwnerVerificationJson(emailOwnerResultJson, emailOwnerFailureJson, bool, str, str2, str3, str4);
    }

    public final String getChallenge_id() {
        return this.challenge_id;
    }

    public final String getEmail_address() {
        return this.email_address;
    }

    public final EmailOwnerFailureJson getError() {
        return this.error;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getOk() {
        return this.ok;
    }

    public final EmailOwnerResultJson getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass006.A0D(this.result) * 31) + AnonymousClass006.A0D(this.error)) * 31) + AnonymousClass006.A0D(this.ok)) * 31) + AnonymousClass006.A0G(this.id)) * 31) + AnonymousClass006.A0G(this.email_address)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass005.A0H(this.challenge_id);
    }

    public final EmailOwnerVerification toDomain() throws EmailOwnerVerificationException {
        String str;
        String str2;
        EmailOwnerFailureJson emailOwnerFailureJson = this.error;
        if (emailOwnerFailureJson != null) {
            throw new EmailOwnerVerificationException(emailOwnerFailureJson.code, emailOwnerFailureJson.attempts_remaining);
        }
        if (AnonymousClass001.A0h().equals(this.ok)) {
            throw new EmailOwnerVerificationException(null, null);
        }
        EmailOwnerResultJson emailOwnerResultJson = this.result;
        if (emailOwnerResultJson == null) {
            String str3 = this.id;
            if (str3 == null || (str = this.email_address) == null || (str2 = this.status) == null) {
                throw new EmailOwnerVerificationException(null, null);
            }
            emailOwnerResultJson = new EmailOwnerResultJson(str3, str, str2, this.challenge_id);
        }
        return emailOwnerResultJson.toDomain();
    }

    public String toString() {
        return super.toString();
    }

    public EmailOwnerVerificationJson(EmailOwnerResultJson emailOwnerResultJson, EmailOwnerFailureJson emailOwnerFailureJson, Boolean bool, String str, String str2, String str3, String str4) {
        this.result = emailOwnerResultJson;
        this.error = emailOwnerFailureJson;
        this.ok = bool;
        this.id = str;
        this.email_address = str2;
        this.status = str3;
        this.challenge_id = str4;
    }

    public /* synthetic */ EmailOwnerVerificationJson(EmailOwnerResultJson emailOwnerResultJson, EmailOwnerFailureJson emailOwnerFailureJson, Boolean bool, String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : emailOwnerResultJson, (i & 2) != 0 ? null : emailOwnerFailureJson, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    public /* synthetic */ EmailOwnerVerificationJson(int i, EmailOwnerResultJson emailOwnerResultJson, EmailOwnerFailureJson emailOwnerFailureJson, Boolean bool, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = emailOwnerResultJson;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = emailOwnerFailureJson;
        }
        if ((i & 4) == 0) {
            this.ok = null;
        } else {
            this.ok = bool;
        }
        if ((i & 8) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 16) == 0) {
            this.email_address = null;
        } else {
            this.email_address = str2;
        }
        if ((i & 32) == 0) {
            this.status = null;
        } else {
            this.status = str3;
        }
        if ((i & 64) == 0) {
            this.challenge_id = null;
        } else {
            this.challenge_id = str4;
        }
    }
}
