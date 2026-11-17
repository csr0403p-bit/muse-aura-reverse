package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PairingLauncherPresentationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String action;
    public final String body;
    public final String button_label;
    public final String invitation_url;
    public final String level;
    public final String muse_id;
    public final String person_name;
    public final String title;
    public final Integer version;

    public final class Companion {
        public final C9hr<PairingLauncherPresentationJson> serializer() {
            return PairingLauncherPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ PairingLauncherPresentationJson copy$default(PairingLauncherPresentationJson pairingLauncherPresentationJson, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        Integer num2 = num;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        if ((i & 1) != 0) {
            num2 = pairingLauncherPresentationJson.version;
        }
        if ((i & 2) != 0) {
            str9 = pairingLauncherPresentationJson.action;
        }
        if ((i & 4) != 0) {
            str10 = pairingLauncherPresentationJson.title;
        }
        if ((i & 8) != 0) {
            str11 = pairingLauncherPresentationJson.body;
        }
        if ((i & 16) != 0) {
            str12 = pairingLauncherPresentationJson.button_label;
        }
        if ((i & 32) != 0) {
            str13 = pairingLauncherPresentationJson.person_name;
        }
        if ((i & 64) != 0) {
            str14 = pairingLauncherPresentationJson.level;
        }
        if ((i & 128) != 0) {
            str15 = pairingLauncherPresentationJson.invitation_url;
        }
        if ((i & 256) != 0) {
            str16 = pairingLauncherPresentationJson.muse_id;
        }
        return new PairingLauncherPresentationJson(num2, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    private final String trimmedOrNull(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(PairingLauncherPresentationJson pairingLauncherPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || pairingLauncherPresentationJson.version != null) {
            c9j5.AAP(pairingLauncherPresentationJson.version, C07729ii.A00, c9iZ, 0);
        }
        if (zAfR || pairingLauncherPresentationJson.action != null) {
            c9j5.AAP(pairingLauncherPresentationJson.action, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || pairingLauncherPresentationJson.title != null) {
            c9j5.AAP(pairingLauncherPresentationJson.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || pairingLauncherPresentationJson.body != null) {
            c9j5.AAP(pairingLauncherPresentationJson.body, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || pairingLauncherPresentationJson.button_label != null) {
            c9j5.AAP(pairingLauncherPresentationJson.button_label, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || pairingLauncherPresentationJson.person_name != null) {
            c9j5.AAP(pairingLauncherPresentationJson.person_name, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || pairingLauncherPresentationJson.level != null) {
            c9j5.AAP(pairingLauncherPresentationJson.level, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || pairingLauncherPresentationJson.invitation_url != null) {
            c9j5.AAP(pairingLauncherPresentationJson.invitation_url, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || pairingLauncherPresentationJson.muse_id != null) {
            c9j5.AAP(pairingLauncherPresentationJson.muse_id, C07779iq.A01, c9iZ, 8);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairingLauncherPresentationJson) {
                PairingLauncherPresentationJson pairingLauncherPresentationJson = (PairingLauncherPresentationJson) obj;
                if (!C7384Etj.areEqual(this.version, pairingLauncherPresentationJson.version) || !C7384Etj.areEqual(this.action, pairingLauncherPresentationJson.action) || !C7384Etj.areEqual(this.title, pairingLauncherPresentationJson.title) || !C7384Etj.areEqual(this.body, pairingLauncherPresentationJson.body) || !C7384Etj.areEqual(this.button_label, pairingLauncherPresentationJson.button_label) || !C7384Etj.areEqual(this.person_name, pairingLauncherPresentationJson.person_name) || !C7384Etj.areEqual(this.level, pairingLauncherPresentationJson.level) || !C7384Etj.areEqual(this.invitation_url, pairingLauncherPresentationJson.invitation_url) || !C7384Etj.areEqual(this.muse_id, pairingLauncherPresentationJson.muse_id)) {
                }
            }
            return false;
        }
        return true;
    }

    private final boolean isFragmentChar(char c) {
        char c2;
        if ('A' <= c) {
            if (c < '[') {
                return true;
            }
            if ('a' > c) {
                return c == '_';
            }
            c2 = '{';
        } else {
            if ('0' > c) {
                return c == '-';
            }
            c2 = HatchMapSceneKt.ARTIFACT_ID_SEPARATOR;
        }
        return c < c2;
    }

    private final String route() {
        String str;
        String strA0Q;
        int length;
        Uri.Builder builderPath;
        String strTrimmedOrNull;
        String str2 = this.action;
        if (str2 == null) {
            return null;
        }
        int iHashCode = str2.hashCode();
        if (iHashCode == -1423461112) {
            if (!str2.equals(PairingLauncherPresentationJsonKt.ACTION_ACCEPT) || (str = this.invitation_url) == null || (strA0Q = C7BY.A0Q(str, "", '#')) == null || (length = strA0Q.length()) <= 0) {
                return null;
            }
            int i = 0;
            while (isFragmentChar(strA0Q.charAt(i))) {
                i++;
                if (i >= length) {
                    return FGI.A0M(PairingLauncherPresentationJsonKt.PAIRING_LAUNCHER_ACCEPT_PREFIX, strA0Q);
                }
            }
            return null;
        }
        if (iHashCode != -1183699191) {
            if (iHashCode != 951117504 || !str2.equals(PairingLauncherPresentationJsonKt.ACTION_CONFIRM) || (strTrimmedOrNull = trimmedOrNull(this.muse_id)) == null) {
                return null;
            }
            builderPath = new Uri.Builder().scheme("hatch").authority("pairs").path("/contact").appendQueryParameter("muse_id", strTrimmedOrNull);
        } else {
            if (!str2.equals("invite")) {
                return null;
            }
            builderPath = new Uri.Builder().scheme("hatch").authority("pairs").path("/invite");
            String strTrimmedOrNull2 = trimmedOrNull(this.person_name);
            if (strTrimmedOrNull2 != null) {
                builderPath.appendQueryParameter("name", strTrimmedOrNull2);
            }
            String strTrimmedOrNull3 = trimmedOrNull(this.level);
            if (strTrimmedOrNull3 != null) {
                builderPath.appendQueryParameter("level", strTrimmedOrNull3);
            }
        }
        return builderPath.build().toString();
    }

    public final Integer component1() {
        return this.version;
    }

    public final String component2() {
        return this.action;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.body;
    }

    public final String component5() {
        return this.button_label;
    }

    public final String component6() {
        return this.person_name;
    }

    public final String component7() {
        return this.level;
    }

    public final String component8() {
        return this.invitation_url;
    }

    public final String component9() {
        return this.muse_id;
    }

    public final PairingLauncherPresentationJson copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new PairingLauncherPresentationJson(num, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getButton_label() {
        return this.button_label;
    }

    public final String getInvitation_url() {
        return this.invitation_url;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final String getPerson_name() {
        return this.person_name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((AnonymousClass006.A0D(this.version) * 31) + AnonymousClass006.A0G(this.action)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.body)) * 31) + AnonymousClass006.A0G(this.button_label)) * 31) + AnonymousClass006.A0G(this.person_name)) * 31) + AnonymousClass006.A0G(this.level)) * 31) + AnonymousClass006.A0G(this.invitation_url)) * 31) + AnonymousClass005.A0H(this.muse_id);
    }

    public final TextWithButtonPresentation toDomain() {
        String strTrimmedOrNull;
        String strRoute;
        String str;
        TextWithButtonHeader textWithButtonHeader;
        Integer num = this.version;
        if (num == null || num.intValue() != 1 || (strTrimmedOrNull = trimmedOrNull(this.button_label)) == null || (strRoute = route()) == null) {
            return null;
        }
        String strTrimmedOrNull2 = trimmedOrNull(this.title);
        String strTrimmedOrNull3 = trimmedOrNull(this.body);
        if (strTrimmedOrNull3 != null) {
            str = strTrimmedOrNull3;
        } else {
            if (strTrimmedOrNull2 == null) {
                return null;
            }
            str = strTrimmedOrNull2;
        }
        int i = TextWithButtonPresentation.$stable;
        TextWithButtonCtaStyle textWithButtonCtaStyle = TextWithButtonCtaStyle.SECONDARY;
        if (strTrimmedOrNull2 == null || strTrimmedOrNull3 == null) {
            textWithButtonHeader = null;
        } else {
            int i2 = TextWithButtonHeader.$stable;
            textWithButtonHeader = new TextWithButtonHeader(strTrimmedOrNull2, strTrimmedOrNull3, null, TextWithButtonHeaderTypography.BODY);
        }
        return new TextWithButtonPresentation(str, TextWithButtonTextFormat.PLAIN, strTrimmedOrNull, strRoute, textWithButtonCtaStyle, false, C0881AGi.A00, textWithButtonHeader);
    }

    public PairingLauncherPresentationJson(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.version = num;
        this.action = str;
        this.title = str2;
        this.body = str3;
        this.button_label = str4;
        this.person_name = str5;
        this.level = str6;
        this.invitation_url = str7;
        this.muse_id = str8;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairingLauncherPresentationJson(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    public /* synthetic */ PairingLauncherPresentationJson(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = str;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.body = null;
        } else {
            this.body = str3;
        }
        if ((i & 16) == 0) {
            this.button_label = null;
        } else {
            this.button_label = str4;
        }
        if ((i & 32) == 0) {
            this.person_name = null;
        } else {
            this.person_name = str5;
        }
        if ((i & 64) == 0) {
            this.level = null;
        } else {
            this.level = str6;
        }
        if ((i & 128) == 0) {
            this.invitation_url = null;
        } else {
            this.invitation_url = str7;
        }
        if ((i & 256) == 0) {
            this.muse_id = null;
        } else {
            this.muse_id = str8;
        }
    }

    public PairingLauncherPresentationJson() {
        this(null, null, null, null, null, null, null, null, null);
    }
}
