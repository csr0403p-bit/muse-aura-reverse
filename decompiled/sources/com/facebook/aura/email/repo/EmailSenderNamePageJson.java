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
public final class EmailSenderNamePageJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String help;
    public final String label;
    public final String title;

    public final class Companion {
        public final C9hr<EmailSenderNamePageJson> serializer() {
            return EmailSenderNamePageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSenderNamePageJson emailSenderNamePageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailSenderNamePageJson.title != null) {
            c9j5.AAP(emailSenderNamePageJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailSenderNamePageJson.label != null) {
            c9j5.AAP(emailSenderNamePageJson.label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || emailSenderNamePageJson.help != null) {
            c9j5.AAP(emailSenderNamePageJson.help, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSenderNamePageJson) {
                EmailSenderNamePageJson emailSenderNamePageJson = (EmailSenderNamePageJson) obj;
                if (!C7384Etj.areEqual(this.title, emailSenderNamePageJson.title) || !C7384Etj.areEqual(this.label, emailSenderNamePageJson.label) || !C7384Etj.areEqual(this.help, emailSenderNamePageJson.help)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSenderNamePageJson copy$default(EmailSenderNamePageJson emailSenderNamePageJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSenderNamePageJson.title;
        }
        if ((i & 2) != 0) {
            str2 = emailSenderNamePageJson.label;
        }
        if ((i & 4) != 0) {
            str3 = emailSenderNamePageJson.help;
        }
        return new EmailSenderNamePageJson(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.help;
    }

    public final EmailSenderNamePageJson copy(String str, String str2, String str3) {
        return new EmailSenderNamePageJson(str, str2, str3);
    }

    public final String getHelp() {
        return this.help;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.help);
    }

    public EmailSenderNamePageJson(String str, String str2, String str3) {
        this.title = str;
        this.label = str2;
        this.help = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSenderNamePageJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.help = null;
        } else {
            this.help = str3;
        }
    }

    public /* synthetic */ EmailSenderNamePageJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public EmailSenderNamePageJson() {
        this(null, null, null);
    }
}
