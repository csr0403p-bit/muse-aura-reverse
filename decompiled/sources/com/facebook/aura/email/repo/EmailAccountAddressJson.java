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
public final class EmailAccountAddressJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String email_address;

    public final class Companion {
        public final C9hr<EmailAccountAddressJson> serializer() {
            return EmailAccountAddressJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailAccountAddressJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new EmailAccountAddressJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailAccountAddressJson) && C7384Etj.areEqual(this.email_address, ((EmailAccountAddressJson) obj).email_address));
    }

    public /* synthetic */ EmailAccountAddressJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailAccountAddressJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.email_address = str;
    }

    public static /* synthetic */ EmailAccountAddressJson copy$default(EmailAccountAddressJson emailAccountAddressJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailAccountAddressJson.email_address;
        }
        C7384Etj.A0Y(str, 0);
        return new EmailAccountAddressJson(str);
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

    public EmailAccountAddressJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.email_address = str;
    }
}
