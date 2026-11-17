package com.facebook.aura.email.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes.dex */
public final class EmailPermissionMethodJson extends C06G {
    public final String key;
    public final String label;
    public final String mode;
    public final List<String> mode_options;
    public final JsonElement mode_source;
    public final boolean restricted;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, EmailPermissionMethodJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<EmailPermissionMethodJson> serializer() {
            return EmailPermissionMethodJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public EmailPermissionMethodJson() {
        this("", "", null, null, "", false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailPermissionMethodJson) {
                EmailPermissionMethodJson emailPermissionMethodJson = (EmailPermissionMethodJson) obj;
                if (!C7384Etj.areEqual(this.key, emailPermissionMethodJson.key) || !C7384Etj.areEqual(this.mode, emailPermissionMethodJson.mode) || !C7384Etj.areEqual(this.mode_options, emailPermissionMethodJson.mode_options) || !C7384Etj.areEqual(this.mode_source, emailPermissionMethodJson.mode_source) || !C7384Etj.areEqual(this.label, emailPermissionMethodJson.label) || this.restricted != emailPermissionMethodJson.restricted) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmailPermissionMethodJson copy$default(EmailPermissionMethodJson emailPermissionMethodJson, String str, String str2, List list, JsonElement jsonElement, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailPermissionMethodJson.key;
        }
        if ((i & 2) != 0) {
            str2 = emailPermissionMethodJson.mode;
        }
        if ((i & 4) != 0) {
            list = emailPermissionMethodJson.mode_options;
        }
        if ((i & 8) != 0) {
            jsonElement = emailPermissionMethodJson.mode_source;
        }
        if ((i & 16) != 0) {
            str3 = emailPermissionMethodJson.label;
        }
        if ((i & 32) != 0) {
            z = emailPermissionMethodJson.restricted;
        }
        return emailPermissionMethodJson.copy(str, str2, list, jsonElement, str3, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailPermissionMethodJson emailPermissionMethodJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(emailPermissionMethodJson.key)) {
            c9j5.AAV(emailPermissionMethodJson.key, c9iZ, 0);
        }
        if (zAfR || !"".equals(emailPermissionMethodJson.mode)) {
            c9j5.AAV(emailPermissionMethodJson.mode, c9iZ, 1);
        }
        if (zAfR || emailPermissionMethodJson.mode_options != null) {
            c9j5.AAP(emailPermissionMethodJson.mode_options, C06G.A0e(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || emailPermissionMethodJson.mode_source != null) {
            c9j5.AAP(emailPermissionMethodJson.mode_source, JsonElementSerializer.A00, c9iZ, 3);
        }
        if (zAfR || !"".equals(emailPermissionMethodJson.label)) {
            c9j5.AAV(emailPermissionMethodJson.label, c9iZ, 4);
        }
        if (zAfR || emailPermissionMethodJson.restricted) {
            c9j5.AA7(c9iZ, 5, emailPermissionMethodJson.restricted);
        }
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.mode;
    }

    public final List<String> component3() {
        return this.mode_options;
    }

    public final JsonElement component4() {
        return this.mode_source;
    }

    public final String component5() {
        return this.label;
    }

    public final boolean component6() {
        return this.restricted;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<String> getMode_options() {
        return this.mode_options;
    }

    public final JsonElement getMode_source() {
        return this.mode_source;
    }

    public final boolean getRestricted() {
        return this.restricted;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.label, (((AnonymousClass005.A0I(this.mode, AnonymousClass001.A0G(this.key)) + AnonymousClass006.A0D(this.mode_options)) * 31) + C06G.A04(this.mode_source)) * 31), this.restricted);
    }

    public final EmailPermissionMethodJson copy(String str, String str2, List<String> list, JsonElement jsonElement, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 4);
        return new EmailPermissionMethodJson(str, str2, list, jsonElement, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailPermissionMethodJson(String str, String str2, List list, JsonElement jsonElement, String str3, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : jsonElement, (i & 16) != 0 ? "" : str3, AnonymousClass002.A1R(i, z));
    }

    public EmailPermissionMethodJson(String str, String str2, List<String> list, JsonElement jsonElement, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 4);
        this.key = str;
        this.mode = str2;
        this.mode_options = list;
        this.mode_source = jsonElement;
        this.label = str3;
        this.restricted = z;
    }

    public /* synthetic */ EmailPermissionMethodJson(int i, String str, String str2, List list, JsonElement jsonElement, String str3, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key = "";
        } else {
            this.key = str;
        }
        if ((i & 2) == 0) {
            this.mode = "";
        } else {
            this.mode = str2;
        }
        if ((i & 4) == 0) {
            this.mode_options = null;
        } else {
            this.mode_options = list;
        }
        if ((i & 8) == 0) {
            this.mode_source = null;
        } else {
            this.mode_source = jsonElement;
        }
        if ((i & 16) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i & 32) == 0) {
            this.restricted = false;
        } else {
            this.restricted = z;
        }
    }
}
