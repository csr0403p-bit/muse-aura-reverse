package com.facebook.aura.permissions.defaults;

import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ConfidentialVmSettingJson extends C06G {
    public final String description;
    public final String key;
    public final String mode;
    public final List<String> mode_options;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, ConfidentialVmSettingJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ConfidentialVmSettingJson> serializer() {
            return ConfidentialVmSettingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmSettingJson) {
                ConfidentialVmSettingJson confidentialVmSettingJson = (ConfidentialVmSettingJson) obj;
                if (!C7384Etj.areEqual(this.key, confidentialVmSettingJson.key) || !C7384Etj.areEqual(this.title, confidentialVmSettingJson.title) || !C7384Etj.areEqual(this.description, confidentialVmSettingJson.description) || !C7384Etj.areEqual(this.mode, confidentialVmSettingJson.mode) || !C7384Etj.areEqual(this.mode_options, confidentialVmSettingJson.mode_options)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfidentialVmSettingJson copy$default(ConfidentialVmSettingJson confidentialVmSettingJson, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmSettingJson.key;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmSettingJson.title;
        }
        if ((i & 4) != 0) {
            str3 = confidentialVmSettingJson.description;
        }
        if ((i & 8) != 0) {
            str4 = confidentialVmSettingJson.mode;
        }
        if ((i & 16) != 0) {
            list = confidentialVmSettingJson.mode_options;
        }
        return confidentialVmSettingJson.copy(str, str2, str3, str4, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_permissions_defaults_defaults(ConfidentialVmSettingJson confidentialVmSettingJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || confidentialVmSettingJson.key != null) {
            c9j5.AAP(confidentialVmSettingJson.key, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || confidentialVmSettingJson.title != null) {
            c9j5.AAP(confidentialVmSettingJson.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || confidentialVmSettingJson.description != null) {
            c9j5.AAP(confidentialVmSettingJson.description, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || confidentialVmSettingJson.mode != null) {
            c9j5.AAP(confidentialVmSettingJson.mode, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || confidentialVmSettingJson.mode_options != null) {
            c9j5.AAP(confidentialVmSettingJson.mode_options, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.mode;
    }

    public final List<String> component5() {
        return this.mode_options;
    }

    public final ConfidentialVmSettingJson copy(String str, String str2, String str3, String str4, List<String> list) {
        return new ConfidentialVmSettingJson(str, str2, str3, str4, list);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<String> getMode_options() {
        return this.mode_options;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.key) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.mode)) * 31) + C3cH.A02(this.mode_options);
    }

    public final ConfidentialVmToggle toToggle() {
        String str;
        String str2 = this.key;
        if (str2 == null || C7BY.A0j(str2) || (str = this.title) == null || C7BY.A0j(str) || !C7384Etj.areEqual(this.mode_options, ConfidentialVmSettingsJsonKt.TOGGLE_MODE_OPTIONS)) {
            return null;
        }
        String str3 = this.key;
        String str4 = this.title;
        String str5 = this.description;
        if (str5 == null || C7BY.A0j(str5)) {
            str5 = null;
        }
        return new ConfidentialVmToggle(str3, str4, str5, ConfidentialVmSettingsJsonKt.MODE_ALLOW.equals(this.mode), false);
    }

    public ConfidentialVmSettingJson(String str, String str2, String str3, String str4, List<String> list) {
        this.key = str;
        this.title = str2;
        this.description = str3;
        this.mode = str4;
        this.mode_options = list;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmSettingJson(String str, String str2, String str3, String str4, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }

    public /* synthetic */ ConfidentialVmSettingJson(int i, String str, String str2, String str3, String str4, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.key = null;
        } else {
            this.key = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.mode = null;
        } else {
            this.mode = str4;
        }
        if ((i & 16) == 0) {
            this.mode_options = null;
        } else {
            this.mode_options = list;
        }
    }

    public ConfidentialVmSettingJson() {
        this(null, null, null, null, null);
    }
}
