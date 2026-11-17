package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ConfidentialVmDataMigrationStepJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ConfidentialVmDataMigrationDeleteOptionJson delete_option;
    public final ConfidentialVmDataMigrationKeepOptionJson keep_option;
    public final String primary_button_text;
    public final String secondary_button_text;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<ConfidentialVmDataMigrationStepJson> serializer() {
            return ConfidentialVmDataMigrationStepJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(confidentialVmDataMigrationStepJson.title)) {
            c9j5.AAV(confidentialVmDataMigrationStepJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(confidentialVmDataMigrationStepJson.subtitle)) {
            c9j5.AAV(confidentialVmDataMigrationStepJson.subtitle, c9iZ, 1);
        }
        if (zAfR || confidentialVmDataMigrationStepJson.keep_option != null) {
            c9j5.AAP(confidentialVmDataMigrationStepJson.keep_option, ConfidentialVmDataMigrationKeepOptionJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || confidentialVmDataMigrationStepJson.delete_option != null) {
            c9j5.AAP(confidentialVmDataMigrationStepJson.delete_option, ConfidentialVmDataMigrationDeleteOptionJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || !"".equals(confidentialVmDataMigrationStepJson.primary_button_text)) {
            c9j5.AAV(confidentialVmDataMigrationStepJson.primary_button_text, c9iZ, 4);
        }
        if (zAfR || !"".equals(confidentialVmDataMigrationStepJson.secondary_button_text)) {
            c9j5.AAV(confidentialVmDataMigrationStepJson.secondary_button_text, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDataMigrationStepJson) {
                ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson = (ConfidentialVmDataMigrationStepJson) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmDataMigrationStepJson.title) || !C7384Etj.areEqual(this.subtitle, confidentialVmDataMigrationStepJson.subtitle) || !C7384Etj.areEqual(this.keep_option, confidentialVmDataMigrationStepJson.keep_option) || !C7384Etj.areEqual(this.delete_option, confidentialVmDataMigrationStepJson.delete_option) || !C7384Etj.areEqual(this.primary_button_text, confidentialVmDataMigrationStepJson.primary_button_text) || !C7384Etj.areEqual(this.secondary_button_text, confidentialVmDataMigrationStepJson.secondary_button_text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmDataMigrationStepJson copy$default(ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson, String str, String str2, ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson, ConfidentialVmDataMigrationDeleteOptionJson confidentialVmDataMigrationDeleteOptionJson, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmDataMigrationStepJson.title;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmDataMigrationStepJson.subtitle;
        }
        if ((i & 4) != 0) {
            confidentialVmDataMigrationKeepOptionJson = confidentialVmDataMigrationStepJson.keep_option;
        }
        if ((i & 8) != 0) {
            confidentialVmDataMigrationDeleteOptionJson = confidentialVmDataMigrationStepJson.delete_option;
        }
        if ((i & 16) != 0) {
            str3 = confidentialVmDataMigrationStepJson.primary_button_text;
        }
        if ((i & 32) != 0) {
            str4 = confidentialVmDataMigrationStepJson.secondary_button_text;
        }
        return confidentialVmDataMigrationStepJson.copy(str, str2, confidentialVmDataMigrationKeepOptionJson, confidentialVmDataMigrationDeleteOptionJson, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final ConfidentialVmDataMigrationKeepOptionJson component3() {
        return this.keep_option;
    }

    public final ConfidentialVmDataMigrationDeleteOptionJson component4() {
        return this.delete_option;
    }

    public final String component5() {
        return this.primary_button_text;
    }

    public final String component6() {
        return this.secondary_button_text;
    }

    public final ConfidentialVmDataMigrationDeleteOptionJson getDelete_option() {
        return this.delete_option;
    }

    public final ConfidentialVmDataMigrationKeepOptionJson getKeep_option() {
        return this.keep_option;
    }

    public final String getPrimary_button_text() {
        return this.primary_button_text;
    }

    public final String getSecondary_button_text() {
        return this.secondary_button_text;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.secondary_button_text, AnonymousClass005.A0I(this.primary_button_text, (((AnonymousClass005.A0I(this.subtitle, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0D(this.keep_option)) * 31) + C3cH.A02(this.delete_option)) * 31));
    }

    public /* synthetic */ ConfidentialVmDataMigrationStepJson(int i, String str, String str2, ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson, ConfidentialVmDataMigrationDeleteOptionJson confidentialVmDataMigrationDeleteOptionJson, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.keep_option = null;
        } else {
            this.keep_option = confidentialVmDataMigrationKeepOptionJson;
        }
        if ((i & 8) == 0) {
            this.delete_option = null;
        } else {
            this.delete_option = confidentialVmDataMigrationDeleteOptionJson;
        }
        if ((i & 16) == 0) {
            this.primary_button_text = "";
        } else {
            this.primary_button_text = str3;
        }
        if ((i & 32) == 0) {
            this.secondary_button_text = "";
        } else {
            this.secondary_button_text = str4;
        }
    }

    public final ConfidentialVmDataMigrationStepJson copy(String str, String str2, ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson, ConfidentialVmDataMigrationDeleteOptionJson confidentialVmDataMigrationDeleteOptionJson, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(str3, str4);
        return new ConfidentialVmDataMigrationStepJson(str, str2, confidentialVmDataMigrationKeepOptionJson, confidentialVmDataMigrationDeleteOptionJson, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmDataMigrationStepJson(String str, String str2, ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson, ConfidentialVmDataMigrationDeleteOptionJson confidentialVmDataMigrationDeleteOptionJson, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(str3, str4);
        this.title = str;
        this.subtitle = str2;
        this.keep_option = confidentialVmDataMigrationKeepOptionJson;
        this.delete_option = confidentialVmDataMigrationDeleteOptionJson;
        this.primary_button_text = str3;
        this.secondary_button_text = str4;
    }

    public /* synthetic */ ConfidentialVmDataMigrationStepJson(String str, String str2, ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson, ConfidentialVmDataMigrationDeleteOptionJson confidentialVmDataMigrationDeleteOptionJson, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : confidentialVmDataMigrationKeepOptionJson, (i & 8) != 0 ? null : confidentialVmDataMigrationDeleteOptionJson, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }

    public ConfidentialVmDataMigrationStepJson() {
        this("", "", null, null, "", "");
    }
}
