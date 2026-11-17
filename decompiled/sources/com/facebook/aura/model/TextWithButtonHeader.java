package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TextWithButtonHeader extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final TextWithButtonHeaderIcon icon;
    public final String subtitle;
    public final String title;
    public final TextWithButtonHeaderTypography typography;

    public final class Companion {
        public final C9hr<TextWithButtonHeader> serializer() {
            return TextWithButtonHeader$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, null, null, AbstractC5321DgF.A02(num, TextWithButtonHeader$Companion$$childSerializers$1.INSTANCE), TextWithButtonHeader$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithButtonHeader) {
                TextWithButtonHeader textWithButtonHeader = (TextWithButtonHeader) obj;
                if (!C7384Etj.areEqual(this.title, textWithButtonHeader.title) || !C7384Etj.areEqual(this.subtitle, textWithButtonHeader.subtitle) || this.icon != textWithButtonHeader.icon || this.typography != textWithButtonHeader.typography) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ TextWithButtonHeader(int i, String str, String str2, TextWithButtonHeaderIcon textWithButtonHeaderIcon, TextWithButtonHeaderTypography textWithButtonHeaderTypography, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(TextWithButtonHeader$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.title = str;
        this.subtitle = str2;
        this.icon = (i & 4) == 0 ? null : textWithButtonHeaderIcon;
        if ((i & 8) == 0) {
            this.typography = TextWithButtonHeaderTypography.COMPACT;
        } else {
            this.typography = textWithButtonHeaderTypography;
        }
    }

    public static /* synthetic */ TextWithButtonHeader copy$default(TextWithButtonHeader textWithButtonHeader, String str, String str2, TextWithButtonHeaderIcon textWithButtonHeaderIcon, TextWithButtonHeaderTypography textWithButtonHeaderTypography, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textWithButtonHeader.title;
        }
        if ((i & 2) != 0) {
            str2 = textWithButtonHeader.subtitle;
        }
        if ((i & 4) != 0) {
            textWithButtonHeaderIcon = textWithButtonHeader.icon;
        }
        if ((i & 8) != 0) {
            textWithButtonHeaderTypography = textWithButtonHeader.typography;
        }
        AnonymousClass005.A0y(str, str2, textWithButtonHeaderTypography);
        return new TextWithButtonHeader(str, str2, textWithButtonHeaderIcon, textWithButtonHeaderTypography);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(TextWithButtonHeader textWithButtonHeader, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(textWithButtonHeader.title, c9iZ, 0);
        c9j5.AAV(textWithButtonHeader.subtitle, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || textWithButtonHeader.icon != null) {
            c9j5.AAP(textWithButtonHeader.icon, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || textWithButtonHeader.typography != TextWithButtonHeaderTypography.COMPACT) {
            c9j5.AAQ(textWithButtonHeader.typography, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final TextWithButtonHeaderIcon component3() {
        return this.icon;
    }

    public final TextWithButtonHeaderTypography component4() {
        return this.typography;
    }

    public final TextWithButtonHeaderIcon getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TextWithButtonHeaderTypography getTypography() {
        return this.typography;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.typography, (AnonymousClass005.A0I(this.subtitle, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0D(this.icon)) * 31);
    }

    public final TextWithButtonHeader copy(String str, String str2, TextWithButtonHeaderIcon textWithButtonHeaderIcon, TextWithButtonHeaderTypography textWithButtonHeaderTypography) {
        AnonymousClass005.A0y(str, str2, textWithButtonHeaderTypography);
        return new TextWithButtonHeader(str, str2, textWithButtonHeaderIcon, textWithButtonHeaderTypography);
    }

    public String toString() {
        return super.toString();
    }

    public TextWithButtonHeader(String str, String str2, TextWithButtonHeaderIcon textWithButtonHeaderIcon, TextWithButtonHeaderTypography textWithButtonHeaderTypography) {
        AnonymousClass005.A0y(str, str2, textWithButtonHeaderTypography);
        this.title = str;
        this.subtitle = str2;
        this.icon = textWithButtonHeaderIcon;
        this.typography = textWithButtonHeaderTypography;
    }

    public /* synthetic */ TextWithButtonHeader(String str, String str2, TextWithButtonHeaderIcon textWithButtonHeaderIcon, TextWithButtonHeaderTypography textWithButtonHeaderTypography, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : textWithButtonHeaderIcon, (i & 8) != 0 ? TextWithButtonHeaderTypography.COMPACT : textWithButtonHeaderTypography);
    }
}
