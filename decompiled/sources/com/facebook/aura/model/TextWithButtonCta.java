package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TextWithButtonCta extends C06G {
    public static final int $stable = 0;
    public final boolean disabled;
    public final String label;
    public final TextWithButtonCtaStyle style;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, TextWithButtonCta$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<TextWithButtonCta> serializer() {
            return TextWithButtonCta$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithButtonCta) {
                TextWithButtonCta textWithButtonCta = (TextWithButtonCta) obj;
                if (!C7384Etj.areEqual(this.label, textWithButtonCta.label) || !C7384Etj.areEqual(this.url, textWithButtonCta.url) || this.style != textWithButtonCta.style || this.disabled != textWithButtonCta.disabled) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ TextWithButtonCta(int i, String str, String str2, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(TextWithButtonCta$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.label = str;
        this.url = str2;
        this.style = (i & 4) == 0 ? TextWithButtonCtaStyle.SECONDARY : textWithButtonCtaStyle;
        if ((i & 8) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z;
        }
    }

    public static /* synthetic */ TextWithButtonCta copy$default(TextWithButtonCta textWithButtonCta, String str, String str2, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textWithButtonCta.label;
        }
        if ((i & 2) != 0) {
            str2 = textWithButtonCta.url;
        }
        if ((i & 4) != 0) {
            textWithButtonCtaStyle = textWithButtonCta.style;
        }
        if ((i & 8) != 0) {
            z = textWithButtonCta.disabled;
        }
        AnonymousClass003.A0v(str, textWithButtonCtaStyle);
        return new TextWithButtonCta(str, str2, textWithButtonCtaStyle, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(TextWithButtonCta textWithButtonCta, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(textWithButtonCta.label, c9iZ, 0);
        c9j5.AAP(textWithButtonCta.url, C07779iq.A01, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || textWithButtonCta.style != TextWithButtonCtaStyle.SECONDARY) {
            c9j5.AAQ(textWithButtonCta.style, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || textWithButtonCta.disabled) {
            c9j5.AA7(c9iZ, 3, textWithButtonCta.disabled);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final TextWithButtonCtaStyle component3() {
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

    public final TextWithButtonCtaStyle getStyle() {
        return this.style;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.style, (AnonymousClass001.A0G(this.label) + AnonymousClass006.A0G(this.url)) * 31), this.disabled);
    }

    public final TextWithButtonCta copy(String str, String str2, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z) {
        AnonymousClass003.A0v(str, textWithButtonCtaStyle);
        return new TextWithButtonCta(str, str2, textWithButtonCtaStyle, z);
    }

    public String toString() {
        return super.toString();
    }

    public TextWithButtonCta(String str, String str2, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z) {
        AnonymousClass003.A0v(str, textWithButtonCtaStyle);
        this.label = str;
        this.url = str2;
        this.style = textWithButtonCtaStyle;
        this.disabled = z;
    }

    public /* synthetic */ TextWithButtonCta(String str, String str2, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? TextWithButtonCtaStyle.SECONDARY : textWithButtonCtaStyle, AnonymousClass005.A1P(i, z));
    }
}
