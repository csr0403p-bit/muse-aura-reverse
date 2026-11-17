package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TextWithButtonButtonJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean disabled;
    public final String label;
    public final String style;
    public final String url;

    public final class Companion {
        public final C9hr<TextWithButtonButtonJson> serializer() {
            return TextWithButtonButtonJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(TextWithButtonButtonJson textWithButtonButtonJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(textWithButtonButtonJson.label)) {
            c9j5.AAV(textWithButtonButtonJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(textWithButtonButtonJson.url)) {
            c9j5.AAV(textWithButtonButtonJson.url, c9iZ, 1);
        }
        if (zAfR || !"".equals(textWithButtonButtonJson.style)) {
            c9j5.AAV(textWithButtonButtonJson.style, c9iZ, 2);
        }
        if (zAfR || textWithButtonButtonJson.disabled) {
            c9j5.AA7(c9iZ, 3, textWithButtonButtonJson.disabled);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithButtonButtonJson) {
                TextWithButtonButtonJson textWithButtonButtonJson = (TextWithButtonButtonJson) obj;
                if (!C7384Etj.areEqual(this.label, textWithButtonButtonJson.label) || !C7384Etj.areEqual(this.url, textWithButtonButtonJson.url) || !C7384Etj.areEqual(this.style, textWithButtonButtonJson.style) || this.disabled != textWithButtonButtonJson.disabled) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TextWithButtonButtonJson copy$default(TextWithButtonButtonJson textWithButtonButtonJson, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textWithButtonButtonJson.label;
        }
        if ((i & 2) != 0) {
            str2 = textWithButtonButtonJson.url;
        }
        if ((i & 4) != 0) {
            str3 = textWithButtonButtonJson.style;
        }
        if ((i & 8) != 0) {
            z = textWithButtonButtonJson.disabled;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new TextWithButtonButtonJson(str, str2, str3, z);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.style;
    }

    public final boolean component4() {
        return this.disabled;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.style, AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.label))), this.disabled);
    }

    public final TextWithButtonCta toDomain() {
        String strA0l = AnonymousClass002.A0l(this.label);
        if (strA0l.length() <= 0) {
            return null;
        }
        String strA0l2 = AnonymousClass002.A0l(this.url);
        String str = strA0l2.length() > 0 ? strA0l2 : null;
        String strA0l3 = AnonymousClass002.A0l(this.style);
        return new TextWithButtonCta(strA0l, str, (strA0l3 == null || !strA0l3.equalsIgnoreCase(TextWithButtonPresentationJsonKt.TEXT_WITH_BUTTON_STYLE_PRIMARY)) ? TextWithButtonCtaStyle.SECONDARY : TextWithButtonCtaStyle.PRIMARY, this.disabled);
    }

    public /* synthetic */ TextWithButtonButtonJson(int i, String str, String str2, String str3, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.style = "";
        } else {
            this.style = str3;
        }
        if ((i & 8) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z;
        }
    }

    public final TextWithButtonButtonJson copy(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        return new TextWithButtonButtonJson(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public TextWithButtonButtonJson(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        this.label = str;
        this.url = str2;
        this.style = str3;
        this.disabled = z;
    }

    public /* synthetic */ TextWithButtonButtonJson(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, AnonymousClass005.A1P(i, z));
    }

    public TextWithButtonButtonJson() {
        this("", "", "", false);
    }
}
