package com.facebook.aura.email.repo;

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
/* loaded from: classes2.dex */
public final class EmailAuthenticationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String verdict;

    public final class Companion {
        public final C9hr<EmailAuthenticationJson> serializer() {
            return EmailAuthenticationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailAuthenticationJson emailAuthenticationJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || emailAuthenticationJson.verdict != null) {
            c9j5.AAP(emailAuthenticationJson.verdict, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailAuthenticationJson) && C7384Etj.areEqual(this.verdict, ((EmailAuthenticationJson) obj).verdict));
    }

    public static /* synthetic */ EmailAuthenticationJson copy$default(EmailAuthenticationJson emailAuthenticationJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailAuthenticationJson.verdict;
        }
        return new EmailAuthenticationJson(str);
    }

    public final String component1() {
        return this.verdict;
    }

    public final EmailAuthenticationJson copy(String str) {
        return new EmailAuthenticationJson(str);
    }

    public final String getVerdict() {
        return this.verdict;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.verdict);
    }

    public /* synthetic */ EmailAuthenticationJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.verdict = null;
        } else {
            this.verdict = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public EmailAuthenticationJson(String str) {
        this.verdict = str;
    }

    public /* synthetic */ EmailAuthenticationJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public EmailAuthenticationJson() {
        this(null);
    }
}
