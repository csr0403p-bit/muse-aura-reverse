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
public final class EmailMuseMailPageJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String delete_action;
    public final String title;

    public final class Companion {
        public final C9hr<EmailMuseMailPageJson> serializer() {
            return EmailMuseMailPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailMuseMailPageJson emailMuseMailPageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailMuseMailPageJson.title != null) {
            c9j5.AAP(emailMuseMailPageJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailMuseMailPageJson.delete_action != null) {
            c9j5.AAP(emailMuseMailPageJson.delete_action, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailMuseMailPageJson) {
                EmailMuseMailPageJson emailMuseMailPageJson = (EmailMuseMailPageJson) obj;
                if (!C7384Etj.areEqual(this.title, emailMuseMailPageJson.title) || !C7384Etj.areEqual(this.delete_action, emailMuseMailPageJson.delete_action)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailMuseMailPageJson copy$default(EmailMuseMailPageJson emailMuseMailPageJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailMuseMailPageJson.title;
        }
        if ((i & 2) != 0) {
            str2 = emailMuseMailPageJson.delete_action;
        }
        return new EmailMuseMailPageJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.delete_action;
    }

    public final EmailMuseMailPageJson copy(String str, String str2) {
        return new EmailMuseMailPageJson(str, str2);
    }

    public final String getDelete_action() {
        return this.delete_action;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.delete_action);
    }

    public EmailMuseMailPageJson(String str, String str2) {
        this.title = str;
        this.delete_action = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailMuseMailPageJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.delete_action = null;
        } else {
            this.delete_action = str2;
        }
    }

    public /* synthetic */ EmailMuseMailPageJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public EmailMuseMailPageJson() {
        this(null, null);
    }
}
