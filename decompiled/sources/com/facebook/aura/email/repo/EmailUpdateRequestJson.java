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
public final class EmailUpdateRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String name;

    public final class Companion {
        public final C9hr<EmailUpdateRequestJson> serializer() {
            return EmailUpdateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailUpdateRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new EmailUpdateRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailUpdateRequestJson) && C7384Etj.areEqual(this.name, ((EmailUpdateRequestJson) obj).name));
    }

    public /* synthetic */ EmailUpdateRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailUpdateRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.name = str;
    }

    public static /* synthetic */ EmailUpdateRequestJson copy$default(EmailUpdateRequestJson emailUpdateRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailUpdateRequestJson.name;
        }
        C7384Etj.A0Y(str, 0);
        return new EmailUpdateRequestJson(str);
    }

    public final String component1() {
        return this.name;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EmailUpdateRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
    }
}
