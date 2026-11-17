package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class EmailForwardedJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String format;
    public final String html_body;
    public final String text_body;

    public final class Companion {
        public final C9hr<EmailForwardedJson> serializer() {
            return EmailForwardedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailForwardedJson emailForwardedJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailForwardedJson.format, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(emailForwardedJson.text_body)) {
            c9j5.AAV(emailForwardedJson.text_body, c9iZ, 1);
        }
        if (zAfR || emailForwardedJson.html_body != null) {
            c9j5.AAP(emailForwardedJson.html_body, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailForwardedJson) {
                EmailForwardedJson emailForwardedJson = (EmailForwardedJson) obj;
                if (!C7384Etj.areEqual(this.format, emailForwardedJson.format) || !C7384Etj.areEqual(this.text_body, emailForwardedJson.text_body) || !C7384Etj.areEqual(this.html_body, emailForwardedJson.html_body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailForwardedJson copy$default(EmailForwardedJson emailForwardedJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailForwardedJson.format;
        }
        if ((i & 2) != 0) {
            str2 = emailForwardedJson.text_body;
        }
        if ((i & 4) != 0) {
            str3 = emailForwardedJson.html_body;
        }
        return emailForwardedJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.format;
    }

    public final String component2() {
        return this.text_body;
    }

    public final String component3() {
        return this.html_body;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getHtml_body() {
        return this.html_body;
    }

    public final String getText_body() {
        return this.text_body;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.text_body, AnonymousClass001.A0G(this.format)) + AnonymousClass006.A0G(this.html_body);
    }

    public EmailForwardedJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.format = str;
        this.text_body = str2;
        this.html_body = str3;
    }

    public final EmailForwardedJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new EmailForwardedJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailForwardedJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailForwardedJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.format = str;
        this.text_body = (i & 2) == 0 ? "" : str2;
        if ((i & 4) == 0) {
            this.html_body = null;
        } else {
            this.html_body = str3;
        }
    }

    public /* synthetic */ EmailForwardedJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }
}
