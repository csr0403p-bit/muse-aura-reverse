package com.facebook.aura.email.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
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
public final class EmailPermissionGroupJson extends C06G {
    public final String label;
    public final List<EmailPermissionMethodJson> methods;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, EmailPermissionGroupJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<EmailPermissionGroupJson> serializer() {
            return EmailPermissionGroupJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailPermissionGroupJson) {
                EmailPermissionGroupJson emailPermissionGroupJson = (EmailPermissionGroupJson) obj;
                if (!C7384Etj.areEqual(this.label, emailPermissionGroupJson.label) || !C7384Etj.areEqual(this.methods, emailPermissionGroupJson.methods)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailPermissionGroupJson copy$default(EmailPermissionGroupJson emailPermissionGroupJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailPermissionGroupJson.label;
        }
        if ((i & 2) != 0) {
            list = emailPermissionGroupJson.methods;
        }
        AnonymousClass003.A0u(str, list);
        return new EmailPermissionGroupJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailPermissionGroupJson emailPermissionGroupJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(emailPermissionGroupJson.label)) {
            c9j5.AAV(emailPermissionGroupJson.label, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(emailPermissionGroupJson.methods, C0881AGi.A00)) {
            c9j5.AAQ(emailPermissionGroupJson.methods, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final List<EmailPermissionMethodJson> component2() {
        return this.methods;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<EmailPermissionMethodJson> getMethods() {
        return this.methods;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.methods, AnonymousClass001.A0G(this.label));
    }

    public EmailPermissionGroupJson(String str, List<EmailPermissionMethodJson> list) {
        AnonymousClass003.A0u(str, list);
        this.label = str;
        this.methods = list;
    }

    public final EmailPermissionGroupJson copy(String str, List<EmailPermissionMethodJson> list) {
        AnonymousClass003.A0u(str, list);
        return new EmailPermissionGroupJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailPermissionGroupJson(String str, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ EmailPermissionGroupJson(int i, String str, List list, C2hx c2hx) {
        this.label = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.methods = C0881AGi.A00;
        } else {
            this.methods = list;
        }
    }

    public EmailPermissionGroupJson() {
        this("", C0881AGi.A00);
    }
}
