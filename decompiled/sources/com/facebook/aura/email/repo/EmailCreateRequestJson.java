package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailCreateRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean announce;
    public final String handle;
    public final String name;

    public final class Companion {
        public final C9hr<EmailCreateRequestJson> serializer() {
            return EmailCreateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailCreateRequestJson emailCreateRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailCreateRequestJson.handle, c9iZ, 0);
        c9j5.AAV(emailCreateRequestJson.name, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, emailCreateRequestJson.announce);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailCreateRequestJson) {
                EmailCreateRequestJson emailCreateRequestJson = (EmailCreateRequestJson) obj;
                if (!C7384Etj.areEqual(this.handle, emailCreateRequestJson.handle) || !C7384Etj.areEqual(this.name, emailCreateRequestJson.name) || this.announce != emailCreateRequestJson.announce) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailCreateRequestJson copy$default(EmailCreateRequestJson emailCreateRequestJson, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailCreateRequestJson.handle;
        }
        if ((i & 2) != 0) {
            str2 = emailCreateRequestJson.name;
        }
        if ((i & 4) != 0) {
            z = emailCreateRequestJson.announce;
        }
        return emailCreateRequestJson.copy(str, str2, z);
    }

    public final String component1() {
        return this.handle;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.announce;
    }

    public final boolean getAnnounce() {
        return this.announce;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.handle)), this.announce);
    }

    public EmailCreateRequestJson(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.handle = str;
        this.name = str2;
        this.announce = z;
    }

    public final EmailCreateRequestJson copy(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new EmailCreateRequestJson(str, str2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailCreateRequestJson(int i, String str, String str2, boolean z, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(EmailCreateRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.handle = str;
        this.name = str2;
        this.announce = z;
    }
}
