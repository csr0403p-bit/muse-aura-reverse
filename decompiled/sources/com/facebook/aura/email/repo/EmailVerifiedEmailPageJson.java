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
public final class EmailVerifiedEmailPageJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String how_it_works_body;
    public final String how_it_works_title;
    public final String list_label;
    public final String title;

    public final class Companion {
        public final C9hr<EmailVerifiedEmailPageJson> serializer() {
            return EmailVerifiedEmailPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailVerifiedEmailPageJson() {
        this(null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailVerifiedEmailPageJson emailVerifiedEmailPageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailVerifiedEmailPageJson.title != null) {
            c9j5.AAP(emailVerifiedEmailPageJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailVerifiedEmailPageJson.how_it_works_title != null) {
            c9j5.AAP(emailVerifiedEmailPageJson.how_it_works_title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || emailVerifiedEmailPageJson.how_it_works_body != null) {
            c9j5.AAP(emailVerifiedEmailPageJson.how_it_works_body, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || emailVerifiedEmailPageJson.list_label != null) {
            c9j5.AAP(emailVerifiedEmailPageJson.list_label, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailVerifiedEmailPageJson) {
                EmailVerifiedEmailPageJson emailVerifiedEmailPageJson = (EmailVerifiedEmailPageJson) obj;
                if (!C7384Etj.areEqual(this.title, emailVerifiedEmailPageJson.title) || !C7384Etj.areEqual(this.how_it_works_title, emailVerifiedEmailPageJson.how_it_works_title) || !C7384Etj.areEqual(this.how_it_works_body, emailVerifiedEmailPageJson.how_it_works_body) || !C7384Etj.areEqual(this.list_label, emailVerifiedEmailPageJson.list_label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailVerifiedEmailPageJson copy$default(EmailVerifiedEmailPageJson emailVerifiedEmailPageJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailVerifiedEmailPageJson.title;
        }
        if ((i & 2) != 0) {
            str2 = emailVerifiedEmailPageJson.how_it_works_title;
        }
        if ((i & 4) != 0) {
            str3 = emailVerifiedEmailPageJson.how_it_works_body;
        }
        if ((i & 8) != 0) {
            str4 = emailVerifiedEmailPageJson.list_label;
        }
        return new EmailVerifiedEmailPageJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.how_it_works_title;
    }

    public final String component3() {
        return this.how_it_works_body;
    }

    public final String component4() {
        return this.list_label;
    }

    public final EmailVerifiedEmailPageJson copy(String str, String str2, String str3, String str4) {
        return new EmailVerifiedEmailPageJson(str, str2, str3, str4);
    }

    public final String getHow_it_works_body() {
        return this.how_it_works_body;
    }

    public final String getHow_it_works_title() {
        return this.how_it_works_title;
    }

    public final String getList_label() {
        return this.list_label;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.how_it_works_title)) * 31) + AnonymousClass006.A0G(this.how_it_works_body)) * 31) + AnonymousClass005.A0H(this.list_label);
    }

    public String toString() {
        return super.toString();
    }

    public EmailVerifiedEmailPageJson(String str, String str2, String str3, String str4) {
        this.title = str;
        this.how_it_works_title = str2;
        this.how_it_works_body = str3;
        this.list_label = str4;
    }

    public /* synthetic */ EmailVerifiedEmailPageJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public /* synthetic */ EmailVerifiedEmailPageJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.how_it_works_title = null;
        } else {
            this.how_it_works_title = str2;
        }
        if ((i & 4) == 0) {
            this.how_it_works_body = null;
        } else {
            this.how_it_works_body = str3;
        }
        if ((i & 8) == 0) {
            this.list_label = null;
        } else {
            this.list_label = str4;
        }
    }
}
