package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ConfidentialVmValuePropsVariantJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String banner_text;
    public final String joined_button_text;
    public final String primary_button_text;
    public final String secondary_button_text;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<ConfidentialVmValuePropsVariantJson> serializer() {
            return ConfidentialVmValuePropsVariantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ConfidentialVmValuePropsVariantJson copy$default(ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = confidentialVmValuePropsVariantJson.title;
        }
        if ((i & 2) != 0) {
            str8 = confidentialVmValuePropsVariantJson.subtitle;
        }
        if ((i & 4) != 0) {
            str9 = confidentialVmValuePropsVariantJson.primary_button_text;
        }
        if ((i & 8) != 0) {
            str10 = confidentialVmValuePropsVariantJson.secondary_button_text;
        }
        if ((i & 16) != 0) {
            str11 = confidentialVmValuePropsVariantJson.banner_text;
        }
        if ((i & 32) != 0) {
            str12 = confidentialVmValuePropsVariantJson.joined_button_text;
        }
        AnonymousClass003.A0v(str7, str9);
        return new ConfidentialVmValuePropsVariantJson(str7, str8, str9, str10, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(confidentialVmValuePropsVariantJson.title)) {
            c9j5.AAV(confidentialVmValuePropsVariantJson.title, c9iZ, 0);
        }
        if (zAfR || confidentialVmValuePropsVariantJson.subtitle != null) {
            c9j5.AAP(confidentialVmValuePropsVariantJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(confidentialVmValuePropsVariantJson.primary_button_text)) {
            c9j5.AAV(confidentialVmValuePropsVariantJson.primary_button_text, c9iZ, 2);
        }
        if (zAfR || confidentialVmValuePropsVariantJson.secondary_button_text != null) {
            c9j5.AAP(confidentialVmValuePropsVariantJson.secondary_button_text, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || confidentialVmValuePropsVariantJson.banner_text != null) {
            c9j5.AAP(confidentialVmValuePropsVariantJson.banner_text, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || confidentialVmValuePropsVariantJson.joined_button_text != null) {
            c9j5.AAP(confidentialVmValuePropsVariantJson.joined_button_text, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmValuePropsVariantJson) {
                ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson = (ConfidentialVmValuePropsVariantJson) obj;
                if (!C7384Etj.areEqual(this.title, confidentialVmValuePropsVariantJson.title) || !C7384Etj.areEqual(this.subtitle, confidentialVmValuePropsVariantJson.subtitle) || !C7384Etj.areEqual(this.primary_button_text, confidentialVmValuePropsVariantJson.primary_button_text) || !C7384Etj.areEqual(this.secondary_button_text, confidentialVmValuePropsVariantJson.secondary_button_text) || !C7384Etj.areEqual(this.banner_text, confidentialVmValuePropsVariantJson.banner_text) || !C7384Etj.areEqual(this.joined_button_text, confidentialVmValuePropsVariantJson.joined_button_text)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.primary_button_text;
    }

    public final String component4() {
        return this.secondary_button_text;
    }

    public final String component5() {
        return this.banner_text;
    }

    public final String component6() {
        return this.joined_button_text;
    }

    public final String getBanner_text() {
        return this.banner_text;
    }

    public final String getJoined_button_text() {
        return this.joined_button_text;
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
        return ((((AnonymousClass005.A0I(this.primary_button_text, (AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.secondary_button_text)) * 31) + AnonymousClass006.A0G(this.banner_text)) * 31) + AnonymousClass005.A0H(this.joined_button_text);
    }

    public /* synthetic */ ConfidentialVmValuePropsVariantJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.primary_button_text = "";
        } else {
            this.primary_button_text = str3;
        }
        if ((i & 8) == 0) {
            this.secondary_button_text = null;
        } else {
            this.secondary_button_text = str4;
        }
        if ((i & 16) == 0) {
            this.banner_text = null;
        } else {
            this.banner_text = str5;
        }
        if ((i & 32) == 0) {
            this.joined_button_text = null;
        } else {
            this.joined_button_text = str6;
        }
    }

    public final ConfidentialVmValuePropsVariantJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0v(str, str3);
        return new ConfidentialVmValuePropsVariantJson(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public ConfidentialVmValuePropsVariantJson(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0v(str, str3);
        this.title = str;
        this.subtitle = str2;
        this.primary_button_text = str3;
        this.secondary_button_text = str4;
        this.banner_text = str5;
        this.joined_button_text = str6;
    }

    public /* synthetic */ ConfidentialVmValuePropsVariantJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public ConfidentialVmValuePropsVariantJson() {
        this("", null, "", null, null, null);
    }
}
