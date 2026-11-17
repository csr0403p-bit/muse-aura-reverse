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
public final class EmailOwnerCodeRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;

    public final class Companion {
        public final C9hr<EmailOwnerCodeRequestJson> serializer() {
            return EmailOwnerCodeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailOwnerCodeRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new EmailOwnerCodeRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailOwnerCodeRequestJson) && C7384Etj.areEqual(this.code, ((EmailOwnerCodeRequestJson) obj).code));
    }

    public /* synthetic */ EmailOwnerCodeRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailOwnerCodeRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.code = str;
    }

    public static /* synthetic */ EmailOwnerCodeRequestJson copy$default(EmailOwnerCodeRequestJson emailOwnerCodeRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailOwnerCodeRequestJson.code;
        }
        C7384Etj.A0Y(str, 0);
        return new EmailOwnerCodeRequestJson(str);
    }

    public final String component1() {
        return this.code;
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EmailOwnerCodeRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.code = str;
    }
}
