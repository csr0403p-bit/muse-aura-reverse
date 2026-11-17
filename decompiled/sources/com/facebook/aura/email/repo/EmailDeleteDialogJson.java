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
public final class EmailDeleteDialogJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String deleting;
    public final String message;
    public final String title;

    public final class Companion {
        public final C9hr<EmailDeleteDialogJson> serializer() {
            return EmailDeleteDialogJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailDeleteDialogJson emailDeleteDialogJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailDeleteDialogJson.title != null) {
            c9j5.AAP(emailDeleteDialogJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailDeleteDialogJson.message != null) {
            c9j5.AAP(emailDeleteDialogJson.message, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || emailDeleteDialogJson.deleting != null) {
            c9j5.AAP(emailDeleteDialogJson.deleting, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailDeleteDialogJson) {
                EmailDeleteDialogJson emailDeleteDialogJson = (EmailDeleteDialogJson) obj;
                if (!C7384Etj.areEqual(this.title, emailDeleteDialogJson.title) || !C7384Etj.areEqual(this.message, emailDeleteDialogJson.message) || !C7384Etj.areEqual(this.deleting, emailDeleteDialogJson.deleting)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailDeleteDialogJson copy$default(EmailDeleteDialogJson emailDeleteDialogJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailDeleteDialogJson.title;
        }
        if ((i & 2) != 0) {
            str2 = emailDeleteDialogJson.message;
        }
        if ((i & 4) != 0) {
            str3 = emailDeleteDialogJson.deleting;
        }
        return new EmailDeleteDialogJson(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.deleting;
    }

    public final EmailDeleteDialogJson copy(String str, String str2, String str3) {
        return new EmailDeleteDialogJson(str, str2, str3);
    }

    public final String getDeleting() {
        return this.deleting;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.message)) * 31) + AnonymousClass005.A0H(this.deleting);
    }

    public EmailDeleteDialogJson(String str, String str2, String str3) {
        this.title = str;
        this.message = str2;
        this.deleting = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailDeleteDialogJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
        if ((i & 4) == 0) {
            this.deleting = null;
        } else {
            this.deleting = str3;
        }
    }

    public /* synthetic */ EmailDeleteDialogJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public EmailDeleteDialogJson() {
        this(null, null, null);
    }
}
