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
public final class EmailSetupOwnerJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String email_help;
    public final String email_help_with_links;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<EmailSetupOwnerJson> serializer() {
            return EmailSetupOwnerJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailSetupOwnerJson() {
        this(null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSetupOwnerJson emailSetupOwnerJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailSetupOwnerJson.title != null) {
            c9j5.AAP(emailSetupOwnerJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailSetupOwnerJson.subtitle != null) {
            c9j5.AAP(emailSetupOwnerJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || emailSetupOwnerJson.email_help != null) {
            c9j5.AAP(emailSetupOwnerJson.email_help, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || emailSetupOwnerJson.email_help_with_links != null) {
            c9j5.AAP(emailSetupOwnerJson.email_help_with_links, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetupOwnerJson) {
                EmailSetupOwnerJson emailSetupOwnerJson = (EmailSetupOwnerJson) obj;
                if (!C7384Etj.areEqual(this.title, emailSetupOwnerJson.title) || !C7384Etj.areEqual(this.subtitle, emailSetupOwnerJson.subtitle) || !C7384Etj.areEqual(this.email_help, emailSetupOwnerJson.email_help) || !C7384Etj.areEqual(this.email_help_with_links, emailSetupOwnerJson.email_help_with_links)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSetupOwnerJson copy$default(EmailSetupOwnerJson emailSetupOwnerJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSetupOwnerJson.title;
        }
        if ((i & 2) != 0) {
            str2 = emailSetupOwnerJson.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = emailSetupOwnerJson.email_help;
        }
        if ((i & 8) != 0) {
            str4 = emailSetupOwnerJson.email_help_with_links;
        }
        return new EmailSetupOwnerJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.email_help;
    }

    public final String component4() {
        return this.email_help_with_links;
    }

    public final EmailSetupOwnerJson copy(String str, String str2, String str3, String str4) {
        return new EmailSetupOwnerJson(str, str2, str3, str4);
    }

    public final String getEmail_help() {
        return this.email_help;
    }

    public final String getEmail_help_with_links() {
        return this.email_help_with_links;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.email_help)) * 31) + AnonymousClass005.A0H(this.email_help_with_links);
    }

    public String toString() {
        return super.toString();
    }

    public EmailSetupOwnerJson(String str, String str2, String str3, String str4) {
        this.title = str;
        this.subtitle = str2;
        this.email_help = str3;
        this.email_help_with_links = str4;
    }

    public /* synthetic */ EmailSetupOwnerJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public /* synthetic */ EmailSetupOwnerJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
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
            this.email_help = null;
        } else {
            this.email_help = str3;
        }
        if ((i & 8) == 0) {
            this.email_help_with_links = null;
        } else {
            this.email_help_with_links = str4;
        }
    }
}
