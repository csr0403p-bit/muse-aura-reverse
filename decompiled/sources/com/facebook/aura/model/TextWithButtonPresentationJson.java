package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TextWithButtonPresentationJson extends C06G {
    public static final int $stable = 8;
    public final TextWithButtonButtonJson button;
    public final TextWithButtonHeaderJson header;
    public final List<TextWithButtonButtonJson> secondary_buttons;
    public final String text;
    public final String text_format;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, TextWithButtonPresentationJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<TextWithButtonPresentationJson> serializer() {
            return TextWithButtonPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TextWithButtonPresentationJson(int i, String str, String str2, TextWithButtonButtonJson textWithButtonButtonJson, List<TextWithButtonButtonJson> list, TextWithButtonHeaderJson textWithButtonHeaderJson) {
        AnonymousClass002.A1C(str, 1, list);
        this.version = i;
        this.text = str;
        this.text_format = str2;
        this.button = textWithButtonButtonJson;
        this.secondary_buttons = list;
        this.header = textWithButtonHeaderJson;
    }

    public final TextWithButtonPresentationJson copy(int i, String str, String str2, TextWithButtonButtonJson textWithButtonButtonJson, List<TextWithButtonButtonJson> list, TextWithButtonHeaderJson textWithButtonHeaderJson) {
        AnonymousClass002.A1C(str, 1, list);
        return new TextWithButtonPresentationJson(i, str, str2, textWithButtonButtonJson, list, textWithButtonHeaderJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithButtonPresentationJson) {
                TextWithButtonPresentationJson textWithButtonPresentationJson = (TextWithButtonPresentationJson) obj;
                if (this.version != textWithButtonPresentationJson.version || !C7384Etj.areEqual(this.text, textWithButtonPresentationJson.text) || !C7384Etj.areEqual(this.text_format, textWithButtonPresentationJson.text_format) || !C7384Etj.areEqual(this.button, textWithButtonPresentationJson.button) || !C7384Etj.areEqual(this.secondary_buttons, textWithButtonPresentationJson.secondary_buttons) || !C7384Etj.areEqual(this.header, textWithButtonPresentationJson.header)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextWithButtonPresentationJson copy$default(TextWithButtonPresentationJson textWithButtonPresentationJson, int i, String str, String str2, TextWithButtonButtonJson textWithButtonButtonJson, List list, TextWithButtonHeaderJson textWithButtonHeaderJson, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textWithButtonPresentationJson.version;
        }
        if ((i2 & 2) != 0) {
            str = textWithButtonPresentationJson.text;
        }
        if ((i2 & 4) != 0) {
            str2 = textWithButtonPresentationJson.text_format;
        }
        if ((i2 & 8) != 0) {
            textWithButtonButtonJson = textWithButtonPresentationJson.button;
        }
        if ((i2 & 16) != 0) {
            list = textWithButtonPresentationJson.secondary_buttons;
        }
        if ((i2 & 32) != 0) {
            textWithButtonHeaderJson = textWithButtonPresentationJson.header;
        }
        return textWithButtonPresentationJson.copy(i, str, str2, textWithButtonButtonJson, list, textWithButtonHeaderJson);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(com.facebook.aura.model.TextWithButtonPresentationJson r5, X.C9j5 r6, X.C9iZ r7) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r3 = com.facebook.aura.model.TextWithButtonPresentationJson.$childSerializers
            r2 = 0
            boolean r4 = r6.AfR()
            r1 = 1
            if (r4 != 0) goto Le
            int r0 = r5.version
            if (r0 == r1) goto L59
        Le:
            int r0 = r5.version
            r6.AAK(r7, r2, r0)
            if (r4 == 0) goto L59
        L15:
            java.lang.String r0 = r5.text
            r6.AAV(r0, r7, r1)
        L1a:
            r2 = 2
            if (r4 != 0) goto L21
            java.lang.String r0 = r5.text_format
            if (r0 == 0) goto L28
        L21:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r5.text_format
            r6.AAP(r0, r1, r7, r2)
        L28:
            r2 = 3
            if (r4 != 0) goto L2f
            com.facebook.aura.model.TextWithButtonButtonJson r0 = r5.button
            if (r0 == 0) goto L36
        L2f:
            com.facebook.aura.model.TextWithButtonButtonJson$$serializer r1 = com.facebook.aura.model.TextWithButtonButtonJson$$serializer.INSTANCE
            com.facebook.aura.model.TextWithButtonButtonJson r0 = r5.button
            r6.AAP(r0, r1, r7, r2)
        L36:
            r2 = 4
            if (r4 != 0) goto L41
            java.util.List<com.facebook.aura.model.TextWithButtonButtonJson> r0 = r5.secondary_buttons
            boolean r0 = X.C3cG.A1L(r0)
            if (r0 != 0) goto L4a
        L41:
            X.9hv r1 = X.C3cH.A15(r3, r2)
            java.util.List<com.facebook.aura.model.TextWithButtonButtonJson> r0 = r5.secondary_buttons
            r6.AAQ(r0, r1, r7, r2)
        L4a:
            r2 = 5
            if (r4 != 0) goto L51
            com.facebook.aura.model.TextWithButtonHeaderJson r0 = r5.header
            if (r0 == 0) goto L58
        L51:
            com.facebook.aura.model.TextWithButtonHeaderJson$$serializer r1 = com.facebook.aura.model.TextWithButtonHeaderJson$$serializer.INSTANCE
            com.facebook.aura.model.TextWithButtonHeaderJson r0 = r5.header
            r6.AAP(r0, r1, r7, r2)
        L58:
            return
        L59:
            java.lang.String r0 = r5.text
            boolean r0 = X.C3cH.A1Q(r0)
            if (r0 != 0) goto L1a
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.TextWithButtonPresentationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(com.facebook.aura.model.TextWithButtonPresentationJson, X.9j5, X.9iZ):void");
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.text_format;
    }

    public final TextWithButtonButtonJson component4() {
        return this.button;
    }

    public final List<TextWithButtonButtonJson> component5() {
        return this.secondary_buttons;
    }

    public final TextWithButtonHeaderJson component6() {
        return this.header;
    }

    public final TextWithButtonButtonJson getButton() {
        return this.button;
    }

    public final TextWithButtonHeaderJson getHeader() {
        return this.header;
    }

    public final List<TextWithButtonButtonJson> getSecondary_buttons() {
        return this.secondary_buttons;
    }

    public final String getText() {
        return this.text;
    }

    public final String getText_format() {
        return this.text_format;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.secondary_buttons, (((AnonymousClass005.A0I(this.text, this.version * 31) + AnonymousClass006.A0G(this.text_format)) * 31) + AnonymousClass006.A0D(this.button)) * 31) + C3cH.A02(this.header);
    }

    public final TextWithButtonPresentation toDomain() {
        TextWithButtonButtonJson textWithButtonButtonJson;
        TextWithButtonCta domain;
        if (this.version == 1) {
            String strA0l = AnonymousClass002.A0l(this.text);
            if (strA0l.length() > 0 && (textWithButtonButtonJson = this.button) != null && (domain = textWithButtonButtonJson.toDomain()) != null) {
                TextWithButtonTextFormat textWithButtonTextFormatFromWire = TextWithButtonTextFormat.Companion.fromWire(this.text_format);
                String str = domain.label;
                String str2 = domain.url;
                TextWithButtonCtaStyle textWithButtonCtaStyle = domain.style;
                boolean z = domain.disabled;
                List<TextWithButtonButtonJson> list = this.secondary_buttons;
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<TextWithButtonButtonJson> it = list.iterator();
                while (it.hasNext()) {
                    TextWithButtonCta domain2 = it.next().toDomain();
                    if (domain2 != null) {
                        arrayListA0h.add(domain2);
                    }
                }
                TextWithButtonHeaderJson textWithButtonHeaderJson = this.header;
                return new TextWithButtonPresentation(strA0l, textWithButtonTextFormatFromWire, str, str2, textWithButtonCtaStyle, z, arrayListA0h, textWithButtonHeaderJson != null ? textWithButtonHeaderJson.toDomain() : null);
            }
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TextWithButtonPresentationJson(int i, String str, String str2, TextWithButtonButtonJson textWithButtonButtonJson, List list, TextWithButtonHeaderJson textWithButtonHeaderJson, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : textWithButtonButtonJson, (i2 & 16) != 0 ? C0881AGi.A00 : list, (i2 & 32) != 0 ? null : textWithButtonHeaderJson);
    }

    public /* synthetic */ TextWithButtonPresentationJson(int i, int i2, String str, String str2, TextWithButtonButtonJson textWithButtonButtonJson, List list, TextWithButtonHeaderJson textWithButtonHeaderJson, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
        if ((i & 4) == 0) {
            this.text_format = null;
        } else {
            this.text_format = str2;
        }
        if ((i & 8) == 0) {
            this.button = null;
        } else {
            this.button = textWithButtonButtonJson;
        }
        if ((i & 16) == 0) {
            this.secondary_buttons = C0881AGi.A00;
        } else {
            this.secondary_buttons = list;
        }
        if ((i & 32) == 0) {
            this.header = null;
        } else {
            this.header = textWithButtonHeaderJson;
        }
    }

    public TextWithButtonPresentationJson() {
        this(1, "", null, null, C0881AGi.A00, null);
    }
}
