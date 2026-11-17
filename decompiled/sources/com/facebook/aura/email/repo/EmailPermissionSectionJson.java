package com.facebook.aura.email.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class EmailPermissionSectionJson extends C06G {
    public final List<EmailPermissionGroupJson> groups;
    public final String label;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, EmailPermissionSectionJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<EmailPermissionSectionJson> serializer() {
            return EmailPermissionSectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailPermissionSectionJson(String str, List<EmailPermissionGroupJson> list) {
        C7384Etj.A0Y(list, 1);
        this.label = str;
        this.groups = list;
    }

    public final EmailPermissionSectionJson copy(String str, List<EmailPermissionGroupJson> list) {
        C7384Etj.A0Y(list, 1);
        return new EmailPermissionSectionJson(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailPermissionSectionJson) {
                EmailPermissionSectionJson emailPermissionSectionJson = (EmailPermissionSectionJson) obj;
                if (!C7384Etj.areEqual(this.label, emailPermissionSectionJson.label) || !C7384Etj.areEqual(this.groups, emailPermissionSectionJson.groups)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailPermissionSectionJson copy$default(EmailPermissionSectionJson emailPermissionSectionJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailPermissionSectionJson.label;
        }
        if ((i & 2) != 0) {
            list = emailPermissionSectionJson.groups;
        }
        C7384Etj.A0Y(list, 1);
        return new EmailPermissionSectionJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailPermissionSectionJson emailPermissionSectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailPermissionSectionJson.label != null) {
            c9j5.AAP(emailPermissionSectionJson.label, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(emailPermissionSectionJson.groups, C0881AGi.A00)) {
            c9j5.AAQ(emailPermissionSectionJson.groups, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final List<EmailPermissionGroupJson> component2() {
        return this.groups;
    }

    public final List<EmailPermissionGroupJson> getGroups() {
        return this.groups;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.groups, AnonymousClass006.A0G(this.label) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailPermissionSectionJson(String str, List list, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), (i & 2) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ EmailPermissionSectionJson(int i, String str, List list, C2hx c2hx) {
        this.label = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.groups = C0881AGi.A00;
        } else {
            this.groups = list;
        }
    }

    public EmailPermissionSectionJson() {
        this(null, C0881AGi.A00);
    }
}
