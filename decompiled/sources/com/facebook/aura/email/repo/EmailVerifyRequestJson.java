package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
public final class EmailVerifyRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String email_address;
    public final String environment_id;

    public final class Companion {
        public final C9hr<EmailVerifyRequestJson> serializer() {
            return EmailVerifyRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailVerifyRequestJson emailVerifyRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailVerifyRequestJson.environment_id, c9iZ, 0);
        c9j5.AAV(emailVerifyRequestJson.email_address, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailVerifyRequestJson) {
                EmailVerifyRequestJson emailVerifyRequestJson = (EmailVerifyRequestJson) obj;
                if (!C7384Etj.areEqual(this.environment_id, emailVerifyRequestJson.environment_id) || !C7384Etj.areEqual(this.email_address, emailVerifyRequestJson.email_address)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailVerifyRequestJson copy$default(EmailVerifyRequestJson emailVerifyRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailVerifyRequestJson.environment_id;
        }
        if ((i & 2) != 0) {
            str2 = emailVerifyRequestJson.email_address;
        }
        AnonymousClass003.A0u(str, str2);
        return new EmailVerifyRequestJson(str, str2);
    }

    public final String component1() {
        return this.environment_id;
    }

    public final String component2() {
        return this.email_address;
    }

    public final String getEmail_address() {
        return this.email_address;
    }

    public final String getEnvironment_id() {
        return this.environment_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.email_address, AnonymousClass001.A0G(this.environment_id));
    }

    public EmailVerifyRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.environment_id = str;
        this.email_address = str2;
    }

    public final EmailVerifyRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new EmailVerifyRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailVerifyRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(EmailVerifyRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.environment_id = str;
        this.email_address = str2;
    }
}
