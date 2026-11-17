package com.facebook.aura.email.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailOwnerFailureJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer attempts_remaining;
    public final String code;

    public final class Companion {
        public final C9hr<EmailOwnerFailureJson> serializer() {
            return EmailOwnerFailureJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailOwnerFailureJson emailOwnerFailureJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailOwnerFailureJson.code != null) {
            c9j5.AAP(emailOwnerFailureJson.code, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailOwnerFailureJson.attempts_remaining != null) {
            c9j5.AAP(emailOwnerFailureJson.attempts_remaining, C07729ii.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailOwnerFailureJson) {
                EmailOwnerFailureJson emailOwnerFailureJson = (EmailOwnerFailureJson) obj;
                if (!C7384Etj.areEqual(this.code, emailOwnerFailureJson.code) || !C7384Etj.areEqual(this.attempts_remaining, emailOwnerFailureJson.attempts_remaining)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailOwnerFailureJson copy$default(EmailOwnerFailureJson emailOwnerFailureJson, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailOwnerFailureJson.code;
        }
        if ((i & 2) != 0) {
            num = emailOwnerFailureJson.attempts_remaining;
        }
        return new EmailOwnerFailureJson(str, num);
    }

    public final String component1() {
        return this.code;
    }

    public final Integer component2() {
        return this.attempts_remaining;
    }

    public final EmailOwnerFailureJson copy(String str, Integer num) {
        return new EmailOwnerFailureJson(str, num);
    }

    public final Integer getAttempts_remaining() {
        return this.attempts_remaining;
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.code) * 31) + C06G.A04(this.attempts_remaining);
    }

    public EmailOwnerFailureJson(String str, Integer num) {
        this.code = str;
        this.attempts_remaining = num;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailOwnerFailureJson(String str, Integer num, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }

    public /* synthetic */ EmailOwnerFailureJson(int i, String str, Integer num, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.attempts_remaining = null;
        } else {
            this.attempts_remaining = num;
        }
    }

    public EmailOwnerFailureJson() {
        this(null, null);
    }
}
