package com.facebook.aura.email.repo;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailAccountAddressesJson extends C06G {
    public final List<EmailAccountAddressJson> emails;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, EmailAccountAddressesJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<EmailAccountAddressesJson> serializer() {
            return EmailAccountAddressesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailAccountAddressesJson copy(List<EmailAccountAddressJson> list) {
        C7384Etj.A0Y(list, 0);
        return new EmailAccountAddressesJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailAccountAddressesJson) && C7384Etj.areEqual(this.emails, ((EmailAccountAddressesJson) obj).emails));
    }

    public /* synthetic */ EmailAccountAddressesJson(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list);
    }

    public static /* synthetic */ EmailAccountAddressesJson copy$default(EmailAccountAddressesJson emailAccountAddressesJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = emailAccountAddressesJson.emails;
        }
        C7384Etj.A0Y(list, 0);
        return new EmailAccountAddressesJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailAccountAddressesJson emailAccountAddressesJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C7384Etj.areEqual(emailAccountAddressesJson.emails, C0881AGi.A00)) {
            c9j5.AAQ(emailAccountAddressesJson.emails, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<EmailAccountAddressJson> component1() {
        return this.emails;
    }

    public final List<EmailAccountAddressJson> getEmails() {
        return this.emails;
    }

    public int hashCode() {
        return this.emails.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EmailAccountAddressesJson(List<EmailAccountAddressJson> list) {
        C7384Etj.A0Y(list, 0);
        this.emails = list;
    }

    public /* synthetic */ EmailAccountAddressesJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.emails = C0881AGi.A00;
        } else {
            this.emails = list;
        }
    }

    public EmailAccountAddressesJson() {
        this(C0881AGi.A00);
    }
}
