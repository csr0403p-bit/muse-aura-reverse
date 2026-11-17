package com.facebook.aura.email.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailSetupAddressJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String address_help;
    public final String sender_name_help;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<EmailSetupAddressJson> serializer() {
            return EmailSetupAddressJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailSetupAddressJson() {
        this(null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSetupAddressJson emailSetupAddressJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailSetupAddressJson.title != null) {
            c9j5.AAP(emailSetupAddressJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailSetupAddressJson.subtitle != null) {
            c9j5.AAP(emailSetupAddressJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || emailSetupAddressJson.address_help != null) {
            c9j5.AAP(emailSetupAddressJson.address_help, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || emailSetupAddressJson.sender_name_help != null) {
            c9j5.AAP(emailSetupAddressJson.sender_name_help, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetupAddressJson) {
                EmailSetupAddressJson emailSetupAddressJson = (EmailSetupAddressJson) obj;
                if (!C7384Etj.areEqual(this.title, emailSetupAddressJson.title) || !C7384Etj.areEqual(this.subtitle, emailSetupAddressJson.subtitle) || !C7384Etj.areEqual(this.address_help, emailSetupAddressJson.address_help) || !C7384Etj.areEqual(this.sender_name_help, emailSetupAddressJson.sender_name_help)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSetupAddressJson copy$default(EmailSetupAddressJson emailSetupAddressJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSetupAddressJson.title;
        }
        if ((i & 2) != 0) {
            str2 = emailSetupAddressJson.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = emailSetupAddressJson.address_help;
        }
        if ((i & 8) != 0) {
            str4 = emailSetupAddressJson.sender_name_help;
        }
        return new EmailSetupAddressJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.address_help;
    }

    public final String component4() {
        return this.sender_name_help;
    }

    public final EmailSetupAddressJson copy(String str, String str2, String str3, String str4) {
        return new EmailSetupAddressJson(str, str2, str3, str4);
    }

    public final String getAddress_help() {
        return this.address_help;
    }

    public final String getSender_name_help() {
        return this.sender_name_help;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.address_help)) * 31) + AnonymousClass005.A0H(this.sender_name_help);
    }

    public String toString() {
        return super.toString();
    }

    public EmailSetupAddressJson(String str, String str2, String str3, String str4) {
        this.title = str;
        this.subtitle = str2;
        this.address_help = str3;
        this.sender_name_help = str4;
    }

    public /* synthetic */ EmailSetupAddressJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public /* synthetic */ EmailSetupAddressJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.address_help = null;
        } else {
            this.address_help = str3;
        }
        if ((i & 8) == 0) {
            this.sender_name_help = null;
        } else {
            this.sender_name_help = str4;
        }
    }
}
