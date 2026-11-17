package com.facebook.aura.email.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailSetupIntroJson extends C06G {
    public final String footer;
    public final List<EmailSetupPointJson> points;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, EmailSetupIntroJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<EmailSetupIntroJson> serializer() {
            return EmailSetupIntroJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSetupIntroJson) {
                EmailSetupIntroJson emailSetupIntroJson = (EmailSetupIntroJson) obj;
                if (!C7384Etj.areEqual(this.title, emailSetupIntroJson.title) || !C7384Etj.areEqual(this.points, emailSetupIntroJson.points) || !C7384Etj.areEqual(this.footer, emailSetupIntroJson.footer)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSetupIntroJson copy$default(EmailSetupIntroJson emailSetupIntroJson, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSetupIntroJson.title;
        }
        if ((i & 2) != 0) {
            list = emailSetupIntroJson.points;
        }
        if ((i & 4) != 0) {
            str2 = emailSetupIntroJson.footer;
        }
        return new EmailSetupIntroJson(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSetupIntroJson emailSetupIntroJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailSetupIntroJson.title != null) {
            c9j5.AAP(emailSetupIntroJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || emailSetupIntroJson.points != null) {
            c9j5.AAP(emailSetupIntroJson.points, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || emailSetupIntroJson.footer != null) {
            c9j5.AAP(emailSetupIntroJson.footer, C07779iq.A01, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final List<EmailSetupPointJson> component2() {
        return this.points;
    }

    public final String component3() {
        return this.footer;
    }

    public final EmailSetupIntroJson copy(String str, List<EmailSetupPointJson> list, String str2) {
        return new EmailSetupIntroJson(str, list, str2);
    }

    public final String getFooter() {
        return this.footer;
    }

    public final List<EmailSetupPointJson> getPoints() {
        return this.points;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0D(this.points)) * 31) + AnonymousClass005.A0H(this.footer);
    }

    public EmailSetupIntroJson(String str, List<EmailSetupPointJson> list, String str2) {
        this.title = str;
        this.points = list;
        this.footer = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSetupIntroJson(int i, String str, List list, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.points = null;
        } else {
            this.points = list;
        }
        if ((i & 4) == 0) {
            this.footer = null;
        } else {
            this.footer = str2;
        }
    }

    public /* synthetic */ EmailSetupIntroJson(String str, List list, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }

    public EmailSetupIntroJson() {
        this(null, null, null);
    }
}
