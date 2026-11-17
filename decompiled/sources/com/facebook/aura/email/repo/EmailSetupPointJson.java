package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailSetupPointJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String description;
    public final String icon;
    public final String title;

    public final class Companion {
        public final C9hr<EmailSetupPointJson> serializer() {
            return EmailSetupPointJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSetupPointJson emailSetupPointJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailSetupPointJson.title, c9iZ, 0);
        c9j5.AAV(emailSetupPointJson.description, c9iZ, 1);
        if (c9j5.AfR() || emailSetupPointJson.icon != null) {
            c9j5.AAP(emailSetupPointJson.icon, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetupPointJson) {
                EmailSetupPointJson emailSetupPointJson = (EmailSetupPointJson) obj;
                if (!C7384Etj.areEqual(this.title, emailSetupPointJson.title) || !C7384Etj.areEqual(this.description, emailSetupPointJson.description) || !C7384Etj.areEqual(this.icon, emailSetupPointJson.icon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSetupPointJson copy$default(EmailSetupPointJson emailSetupPointJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSetupPointJson.title;
        }
        if ((i & 2) != 0) {
            str2 = emailSetupPointJson.description;
        }
        if ((i & 4) != 0) {
            str3 = emailSetupPointJson.icon;
        }
        return emailSetupPointJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.icon;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.description, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.icon);
    }

    public EmailSetupPointJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.description = str2;
        this.icon = str3;
    }

    public final EmailSetupPointJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new EmailSetupPointJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSetupPointJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(EmailSetupPointJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.title = str;
        this.description = str2;
        this.icon = C3cI.A0W(i, str3);
    }

    public /* synthetic */ EmailSetupPointJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
