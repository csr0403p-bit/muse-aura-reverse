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
/* loaded from: classes.dex */
public final class EmailCursorsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String after;

    /* loaded from: classes4.dex */
    public final class Companion {
        public final C9hr<EmailCursorsJson> serializer() {
            return EmailCursorsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailCursorsJson emailCursorsJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || emailCursorsJson.after != null) {
            c9j5.AAP(emailCursorsJson.after, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailCursorsJson) && C7384Etj.areEqual(this.after, ((EmailCursorsJson) obj).after));
    }

    public static /* synthetic */ EmailCursorsJson copy$default(EmailCursorsJson emailCursorsJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailCursorsJson.after;
        }
        return new EmailCursorsJson(str);
    }

    public final String component1() {
        return this.after;
    }

    public final EmailCursorsJson copy(String str) {
        return new EmailCursorsJson(str);
    }

    public final String getAfter() {
        return this.after;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.after);
    }

    public /* synthetic */ EmailCursorsJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public String toString() {
        return super.toString();
    }

    public EmailCursorsJson(String str) {
        this.after = str;
    }

    public /* synthetic */ EmailCursorsJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.after = null;
        } else {
            this.after = str;
        }
    }

    public EmailCursorsJson() {
        this(null);
    }
}
