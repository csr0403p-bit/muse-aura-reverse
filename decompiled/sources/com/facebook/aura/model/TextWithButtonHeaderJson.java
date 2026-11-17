package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TextWithButtonHeaderJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String icon;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<TextWithButtonHeaderJson> serializer() {
            return TextWithButtonHeaderJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(TextWithButtonHeaderJson textWithButtonHeaderJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(textWithButtonHeaderJson.title, c9iZ, 0);
        c9j5.AAV(textWithButtonHeaderJson.subtitle, c9iZ, 1);
        if (c9j5.AfR() || textWithButtonHeaderJson.icon != null) {
            c9j5.AAP(textWithButtonHeaderJson.icon, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithButtonHeaderJson) {
                TextWithButtonHeaderJson textWithButtonHeaderJson = (TextWithButtonHeaderJson) obj;
                if (!C7384Etj.areEqual(this.title, textWithButtonHeaderJson.title) || !C7384Etj.areEqual(this.subtitle, textWithButtonHeaderJson.subtitle) || !C7384Etj.areEqual(this.icon, textWithButtonHeaderJson.icon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TextWithButtonHeaderJson copy$default(TextWithButtonHeaderJson textWithButtonHeaderJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textWithButtonHeaderJson.title;
        }
        if ((i & 2) != 0) {
            str2 = textWithButtonHeaderJson.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = textWithButtonHeaderJson.icon;
        }
        return textWithButtonHeaderJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.icon;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.subtitle, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.icon);
    }

    public final TextWithButtonHeader toDomain() {
        int i = TextWithButtonHeader.$stable;
        return new TextWithButtonHeader(this.title, this.subtitle, TextWithButtonHeaderIcon.Companion.fromWire(this.icon), TextWithButtonHeaderTypography.COMPACT);
    }

    public TextWithButtonHeaderJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.subtitle = str2;
        this.icon = str3;
    }

    public final TextWithButtonHeaderJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new TextWithButtonHeaderJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TextWithButtonHeaderJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(TextWithButtonHeaderJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.title = str;
        this.subtitle = str2;
        this.icon = C3cI.A0W(i, str3);
    }

    public /* synthetic */ TextWithButtonHeaderJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
