package com.facebook.aura.email.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailOwnerChallengeRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String email_address;

    public final class Companion {
        public final C9hr<EmailOwnerChallengeRequestJson> serializer() {
            return EmailOwnerChallengeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailOwnerChallengeRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new EmailOwnerChallengeRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailOwnerChallengeRequestJson) && C7384Etj.areEqual(this.email_address, ((EmailOwnerChallengeRequestJson) obj).email_address));
    }

    public /* synthetic */ EmailOwnerChallengeRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailOwnerChallengeRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.email_address = str;
    }

    public static /* synthetic */ EmailOwnerChallengeRequestJson copy$default(EmailOwnerChallengeRequestJson emailOwnerChallengeRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailOwnerChallengeRequestJson.email_address;
        }
        C7384Etj.A0Y(str, 0);
        return new EmailOwnerChallengeRequestJson(str);
    }

    public final String component1() {
        return this.email_address;
    }

    public final String getEmail_address() {
        return this.email_address;
    }

    public int hashCode() {
        return this.email_address.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EmailOwnerChallengeRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.email_address = str;
    }
}
