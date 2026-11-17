package com.facebook.aura.model;

import X.AII;
import X.AIM;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class TextWithButtonPresentation extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final boolean buttonDisabled;
    public final String buttonLabel;
    public final TextWithButtonCtaStyle buttonStyle;
    public final String buttonUrl;
    public final TextWithButtonHeader header;
    public final List<TextWithButtonCta> secondaryButtons;
    public final String text;
    public final TextWithButtonTextFormat textFormat;

    public final class Companion {
        public final C9hr<TextWithButtonPresentation> serializer() {
            return TextWithButtonPresentation$$serializer.INSTANCE;
        }

        public final TextWithButtonPresentation fromJson(JsonElement jsonElement) {
            return TextWithButtonPresentationJsonKt.parseTextWithButtonPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, TextWithButtonPresentation$Companion$$childSerializers$1.INSTANCE), null, null, AbstractC5321DgF.A02(num, TextWithButtonPresentation$Companion$$childSerializers$2.INSTANCE), null, AbstractC5321DgF.A02(num, TextWithButtonPresentation$Companion$$childSerializers$3.INSTANCE), null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithButtonPresentation) {
                TextWithButtonPresentation textWithButtonPresentation = (TextWithButtonPresentation) obj;
                if (!C7384Etj.areEqual(this.text, textWithButtonPresentation.text) || this.textFormat != textWithButtonPresentation.textFormat || !C7384Etj.areEqual(this.buttonLabel, textWithButtonPresentation.buttonLabel) || !C7384Etj.areEqual(this.buttonUrl, textWithButtonPresentation.buttonUrl) || this.buttonStyle != textWithButtonPresentation.buttonStyle || this.buttonDisabled != textWithButtonPresentation.buttonDisabled || !C7384Etj.areEqual(this.secondaryButtons, textWithButtonPresentation.secondaryButtons) || !C7384Etj.areEqual(this.header, textWithButtonPresentation.header)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextWithButtonPresentation copy$default(TextWithButtonPresentation textWithButtonPresentation, String str, TextWithButtonTextFormat textWithButtonTextFormat, String str2, String str3, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z, List list, TextWithButtonHeader textWithButtonHeader, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textWithButtonPresentation.text;
        }
        if ((i & 2) != 0) {
            textWithButtonTextFormat = textWithButtonPresentation.textFormat;
        }
        if ((i & 4) != 0) {
            str2 = textWithButtonPresentation.buttonLabel;
        }
        if ((i & 8) != 0) {
            str3 = textWithButtonPresentation.buttonUrl;
        }
        if ((i & 16) != 0) {
            textWithButtonCtaStyle = textWithButtonPresentation.buttonStyle;
        }
        if ((i & 32) != 0) {
            z = textWithButtonPresentation.buttonDisabled;
        }
        if ((i & 64) != 0) {
            list = textWithButtonPresentation.secondaryButtons;
        }
        if ((i & 128) != 0) {
            textWithButtonHeader = textWithButtonPresentation.header;
        }
        return textWithButtonPresentation.copy(str, textWithButtonTextFormat, str2, str3, textWithButtonCtaStyle, z, list, textWithButtonHeader);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(TextWithButtonPresentation textWithButtonPresentation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(textWithButtonPresentation.text, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || textWithButtonPresentation.textFormat != TextWithButtonTextFormat.PLAIN) {
            c9j5.AAQ(textWithButtonPresentation.textFormat, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        c9j5.AAV(textWithButtonPresentation.buttonLabel, c9iZ, 2);
        c9j5.AAP(textWithButtonPresentation.buttonUrl, C07779iq.A01, c9iZ, 3);
        if (zAfR || textWithButtonPresentation.buttonStyle != TextWithButtonCtaStyle.SECONDARY) {
            c9j5.AAQ(textWithButtonPresentation.buttonStyle, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || textWithButtonPresentation.buttonDisabled) {
            c9j5.AA7(c9iZ, 5, textWithButtonPresentation.buttonDisabled);
        }
        if (zAfR || !C3cG.A1L(textWithButtonPresentation.secondaryButtons)) {
            c9j5.AAQ(textWithButtonPresentation.secondaryButtons, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || textWithButtonPresentation.header != null) {
            c9j5.AAP(textWithButtonPresentation.header, TextWithButtonHeader$$serializer.INSTANCE, c9iZ, 7);
        }
    }

    public final String component1() {
        return this.text;
    }

    public final TextWithButtonTextFormat component2() {
        return this.textFormat;
    }

    public final String component3() {
        return this.buttonLabel;
    }

    public final String component4() {
        return this.buttonUrl;
    }

    public final TextWithButtonCtaStyle component5() {
        return this.buttonStyle;
    }

    public final boolean component6() {
        return this.buttonDisabled;
    }

    public final List<TextWithButtonCta> component7() {
        return this.secondaryButtons;
    }

    public final TextWithButtonHeader component8() {
        return this.header;
    }

    public final boolean getButtonDisabled() {
        return this.buttonDisabled;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final TextWithButtonCtaStyle getButtonStyle() {
        return this.buttonStyle;
    }

    public final String getButtonUrl() {
        return this.buttonUrl;
    }

    public final TextWithButtonHeader getHeader() {
        return this.header;
    }

    public final List<TextWithButtonCta> getSecondaryButtons() {
        return this.secondaryButtons;
    }

    public final String getText() {
        return this.text;
    }

    public final TextWithButtonTextFormat getTextFormat() {
        return this.textFormat;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.secondaryButtons, C0KA.A01(AnonymousClass005.A0F(this.buttonStyle, (AnonymousClass005.A0I(this.buttonLabel, AnonymousClass005.A0F(this.textFormat, AnonymousClass001.A0G(this.text))) + AnonymousClass006.A0G(this.buttonUrl)) * 31), this.buttonDisabled)) + C3cH.A02(this.header);
    }

    public TextWithButtonPresentation(String str, TextWithButtonTextFormat textWithButtonTextFormat, String str2, String str3, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z, List<TextWithButtonCta> list, TextWithButtonHeader textWithButtonHeader) {
        AnonymousClass005.A0x(str, textWithButtonTextFormat, str2);
        AnonymousClass002.A1E(textWithButtonCtaStyle, 4, list);
        this.text = str;
        this.textFormat = textWithButtonTextFormat;
        this.buttonLabel = str2;
        this.buttonUrl = str3;
        this.buttonStyle = textWithButtonCtaStyle;
        this.buttonDisabled = z;
        this.secondaryButtons = list;
        this.header = textWithButtonHeader;
    }

    public final TextWithButtonPresentation copy(String str, TextWithButtonTextFormat textWithButtonTextFormat, String str2, String str3, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z, List<TextWithButtonCta> list, TextWithButtonHeader textWithButtonHeader) {
        AnonymousClass005.A0x(str, textWithButtonTextFormat, str2);
        AnonymousClass002.A1E(textWithButtonCtaStyle, 4, list);
        return new TextWithButtonPresentation(str, textWithButtonTextFormat, str2, str3, textWithButtonCtaStyle, z, list, textWithButtonHeader);
    }

    public final List<TextWithButtonCta> getButtons() {
        AII aiiA17 = AIM.A17();
        aiiA17.add(new TextWithButtonCta(this.buttonLabel, this.buttonUrl, this.buttonStyle, this.buttonDisabled));
        aiiA17.addAll(this.secondaryButtons);
        return AIM.A18(aiiA17);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TextWithButtonPresentation(String str, TextWithButtonTextFormat textWithButtonTextFormat, String str2, String str3, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z, List list, TextWithButtonHeader textWithButtonHeader, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? TextWithButtonTextFormat.PLAIN : textWithButtonTextFormat, str2, str3, (i & 16) != 0 ? TextWithButtonCtaStyle.SECONDARY : textWithButtonCtaStyle, AnonymousClass002.A1R(i, z), (i & 64) != 0 ? C0881AGi.A00 : list, (i & 128) != 0 ? null : textWithButtonHeader);
    }

    public /* synthetic */ TextWithButtonPresentation(int i, String str, TextWithButtonTextFormat textWithButtonTextFormat, String str2, String str3, TextWithButtonCtaStyle textWithButtonCtaStyle, boolean z, List list, TextWithButtonHeader textWithButtonHeader, C2hx c2hx) {
        if (13 != (i & 13)) {
            C9iI.A00(TextWithButtonPresentation$$serializer.descriptor, i, 13);
            throw F60.createAndThrow();
        }
        this.text = str;
        this.textFormat = (i & 2) == 0 ? TextWithButtonTextFormat.PLAIN : textWithButtonTextFormat;
        this.buttonLabel = str2;
        this.buttonUrl = str3;
        if ((i & 16) == 0) {
            this.buttonStyle = TextWithButtonCtaStyle.SECONDARY;
        } else {
            this.buttonStyle = textWithButtonCtaStyle;
        }
        if ((i & 32) == 0) {
            this.buttonDisabled = false;
        } else {
            this.buttonDisabled = z;
        }
        if ((i & 64) == 0) {
            this.secondaryButtons = C0881AGi.A00;
        } else {
            this.secondaryButtons = list;
        }
        if ((i & 128) == 0) {
            this.header = null;
        } else {
            this.header = textWithButtonHeader;
        }
    }
}
