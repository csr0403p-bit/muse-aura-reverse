package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailSettingDisplayJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String description;
    public final String title;
    public final boolean visible;

    /* loaded from: classes4.dex */
    public final class Companion {
        public final C9hr<EmailSettingDisplayJson> serializer() {
            return EmailSettingDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailSettingDisplayJson(boolean z, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        this.visible = z;
        this.title = str;
        this.description = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailSettingDisplayJson emailSettingDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailSettingDisplayJson.visible) {
            c9j5.AA7(c9iZ, 0, emailSettingDisplayJson.visible);
        }
        if (zAfR || !"".equals(emailSettingDisplayJson.title)) {
            c9j5.AAV(emailSettingDisplayJson.title, c9iZ, 1);
        }
        if (zAfR || emailSettingDisplayJson.description != null) {
            c9j5.AAP(emailSettingDisplayJson.description, C07779iq.A01, c9iZ, 2);
        }
    }

    public final EmailSettingDisplayJson copy(boolean z, String str, String str2) {
        C7384Etj.A0Y(str, 1);
        return new EmailSettingDisplayJson(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSettingDisplayJson) {
                EmailSettingDisplayJson emailSettingDisplayJson = (EmailSettingDisplayJson) obj;
                if (this.visible != emailSettingDisplayJson.visible || !C7384Etj.areEqual(this.title, emailSettingDisplayJson.title) || !C7384Etj.areEqual(this.description, emailSettingDisplayJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailSettingDisplayJson copy$default(EmailSettingDisplayJson emailSettingDisplayJson, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emailSettingDisplayJson.visible;
        }
        if ((i & 2) != 0) {
            str = emailSettingDisplayJson.title;
        }
        if ((i & 4) != 0) {
            str2 = emailSettingDisplayJson.description;
        }
        return emailSettingDisplayJson.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.visible;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.title, C0KA.A02(this.visible)) + AnonymousClass006.A0G(this.description);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailSettingDisplayJson(boolean z, String str, String str2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? "" : str, AnonymousClass006.A0t(i, str2));
    }

    public /* synthetic */ EmailSettingDisplayJson(int i, boolean z, String str, String str2, C2hx c2hx) {
        this.visible = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
    }

    public EmailSettingDisplayJson() {
        this(false, "", null);
    }
}
