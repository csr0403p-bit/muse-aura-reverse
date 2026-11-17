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
public final class EmailVerifiedEmailRowJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String note;
    public final String title;

    public final class Companion {
        public final C9hr<EmailVerifiedEmailRowJson> serializer() {
            return EmailVerifiedEmailRowJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailVerifiedEmailRowJson emailVerifiedEmailRowJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailVerifiedEmailRowJson.title != null) {
            c9j5.AAP(emailVerifiedEmailRowJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailVerifiedEmailRowJson.note != null) {
            c9j5.AAP(emailVerifiedEmailRowJson.note, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailVerifiedEmailRowJson) {
                EmailVerifiedEmailRowJson emailVerifiedEmailRowJson = (EmailVerifiedEmailRowJson) obj;
                if (!C7384Etj.areEqual(this.title, emailVerifiedEmailRowJson.title) || !C7384Etj.areEqual(this.note, emailVerifiedEmailRowJson.note)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailVerifiedEmailRowJson copy$default(EmailVerifiedEmailRowJson emailVerifiedEmailRowJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailVerifiedEmailRowJson.title;
        }
        if ((i & 2) != 0) {
            str2 = emailVerifiedEmailRowJson.note;
        }
        return new EmailVerifiedEmailRowJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.note;
    }

    public final EmailVerifiedEmailRowJson copy(String str, String str2) {
        return new EmailVerifiedEmailRowJson(str, str2);
    }

    public final String getNote() {
        return this.note;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.note);
    }

    public EmailVerifiedEmailRowJson(String str, String str2) {
        this.title = str;
        this.note = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailVerifiedEmailRowJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.note = null;
        } else {
            this.note = str2;
        }
    }

    public /* synthetic */ EmailVerifiedEmailRowJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public EmailVerifiedEmailRowJson() {
        this(null, null);
    }
}
