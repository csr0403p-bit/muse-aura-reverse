package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.email.model.EmailSetup;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailSetupJson extends C06G {
    public static final Companion Companion = new Companion();
    public final EmailSetupDisplayJson display;
    public final String domain;
    public final String handle;
    public final String name;
    public final String sender_name;

    public final class Companion {
        public final C9hr<EmailSetupJson> serializer() {
            return EmailSetupJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailSetupJson(String str, String str2, String str3, String str4, EmailSetupDisplayJson emailSetupDisplayJson) {
        AnonymousClass002.A1C(str, 0, emailSetupDisplayJson);
        this.domain = str;
        this.name = str2;
        this.handle = str3;
        this.sender_name = str4;
        this.display = emailSetupDisplayJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSetupJson emailSetupJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailSetupJson.domain, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailSetupJson.name != null) {
            c9j5.AAP(emailSetupJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || emailSetupJson.handle != null) {
            c9j5.AAP(emailSetupJson.handle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || emailSetupJson.sender_name != null) {
            c9j5.AAP(emailSetupJson.sender_name, C07779iq.A01, c9iZ, 3);
        }
        if (!zAfR) {
            if (C7384Etj.areEqual(emailSetupJson.display, new EmailSetupDisplayJson((EmailSetupIntroJson) null, (EmailSetupAddressJson) (0 == true ? 1 : 0), (EmailSetupOwnerJson) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0)))) {
                return;
            }
        }
        c9j5.AAQ(emailSetupJson.display, EmailSetupDisplaySerializer.INSTANCE, c9iZ, 4);
    }

    public final EmailSetupJson copy(String str, String str2, String str3, String str4, EmailSetupDisplayJson emailSetupDisplayJson) {
        AnonymousClass002.A1C(str, 0, emailSetupDisplayJson);
        return new EmailSetupJson(str, str2, str3, str4, emailSetupDisplayJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetupJson) {
                EmailSetupJson emailSetupJson = (EmailSetupJson) obj;
                if (!C7384Etj.areEqual(this.domain, emailSetupJson.domain) || !C7384Etj.areEqual(this.name, emailSetupJson.name) || !C7384Etj.areEqual(this.handle, emailSetupJson.handle) || !C7384Etj.areEqual(this.sender_name, emailSetupJson.sender_name) || !C7384Etj.areEqual(this.display, emailSetupJson.display)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSetupJson copy$default(EmailSetupJson emailSetupJson, String str, String str2, String str3, String str4, EmailSetupDisplayJson emailSetupDisplayJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSetupJson.domain;
        }
        if ((i & 2) != 0) {
            str2 = emailSetupJson.name;
        }
        if ((i & 4) != 0) {
            str3 = emailSetupJson.handle;
        }
        if ((i & 8) != 0) {
            str4 = emailSetupJson.sender_name;
        }
        if ((i & 16) != 0) {
            emailSetupDisplayJson = emailSetupJson.display;
        }
        return emailSetupJson.copy(str, str2, str3, str4, emailSetupDisplayJson);
    }

    @Serializable(with = EmailSetupDisplaySerializer.class)
    public static /* synthetic */ void getDisplay$annotations() {
    }

    public final String component1() {
        return this.domain;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.handle;
    }

    public final String component4() {
        return this.sender_name;
    }

    public final EmailSetupDisplayJson component5() {
        return this.display;
    }

    public final EmailSetupDisplayJson getDisplay() {
        return this.display;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSender_name() {
        return this.sender_name;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.display, (((((AnonymousClass001.A0G(this.domain) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.handle)) * 31) + AnonymousClass005.A0H(this.sender_name)) * 31);
    }

    public final EmailSetup toDomain() {
        return new EmailSetup(this.name, this.domain, this.handle, this.sender_name, this.display.toDomain());
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ EmailSetupJson(String str, String str2, String str3, String str4, EmailSetupDisplayJson emailSetupDisplayJson, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? new EmailSetupDisplayJson((EmailSetupIntroJson) null, (EmailSetupAddressJson) null, (EmailSetupOwnerJson) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0)) : emailSetupDisplayJson);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ EmailSetupJson(int i, String str, String str2, String str3, String str4, EmailSetupDisplayJson emailSetupDisplayJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailSetupJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.domain = str;
        EmailSetupIntroJson emailSetupIntroJson = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.handle = null;
        } else {
            this.handle = str3;
        }
        if ((i & 8) == 0) {
            this.sender_name = null;
        } else {
            this.sender_name = str4;
        }
        if ((i & 16) == 0) {
            this.display = new EmailSetupDisplayJson(emailSetupIntroJson, (EmailSetupAddressJson) (objArr3 == true ? 1 : 0), (EmailSetupOwnerJson) (objArr2 == true ? 1 : 0), 7, (C06H) (objArr == true ? 1 : 0));
            return;
        }
        this.display = emailSetupDisplayJson;
    }
}
