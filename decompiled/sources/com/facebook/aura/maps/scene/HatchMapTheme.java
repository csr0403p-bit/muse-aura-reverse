package com.facebook.aura.maps.scene;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchMapTheme extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final int DEFAULT_DARK_BACKGROUND_COLOR = -12824483;
    public static final String DEFAULT_DARK_STYLE_URL = "https://www.facebook.com/maps/vt/style/dark/";
    public static final int DEFAULT_LIGHT_BACKGROUND_COLOR = -527635;
    public static final String DEFAULT_LIGHT_STYLE_URL = "https://www.facebook.com/maps/vt/style/canterbury_1_0/";
    public static final int DEFAULT_PIN_LABEL_COLOR = -15392473;
    public static final int DEFAULT_PIN_LABEL_COLOR_DARK = -1;
    public final int darkBackgroundColor;
    public final String darkStyleUrl;
    public final int lightBackgroundColor;
    public final String lightStyleUrl;
    public final int pinLabelColor;
    public final int pinLabelColorDark;

    public static /* synthetic */ HatchMapTheme copy$default(HatchMapTheme hatchMapTheme, String str, String str2, int i, int i2, int i3, int i4, int i5, Object obj) {
        String str3 = str;
        String str4 = str2;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if ((i5 & 1) != 0) {
            str3 = hatchMapTheme.lightStyleUrl;
        }
        if ((i5 & 2) != 0) {
            str4 = hatchMapTheme.darkStyleUrl;
        }
        if ((i5 & 4) != 0) {
            i6 = hatchMapTheme.lightBackgroundColor;
        }
        if ((i5 & 8) != 0) {
            i7 = hatchMapTheme.darkBackgroundColor;
        }
        if ((i5 & 16) != 0) {
            i8 = hatchMapTheme.pinLabelColor;
        }
        if ((i5 & 32) != 0) {
            i9 = hatchMapTheme.pinLabelColorDark;
        }
        AnonymousClass003.A0u(str3, str4);
        return new HatchMapTheme(str3, str4, i6, i7, i8, i9);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMapTheme) {
                HatchMapTheme hatchMapTheme = (HatchMapTheme) obj;
                if (!C7384Etj.areEqual(this.lightStyleUrl, hatchMapTheme.lightStyleUrl) || !C7384Etj.areEqual(this.darkStyleUrl, hatchMapTheme.darkStyleUrl) || this.lightBackgroundColor != hatchMapTheme.lightBackgroundColor || this.darkBackgroundColor != hatchMapTheme.darkBackgroundColor || this.pinLabelColor != hatchMapTheme.pinLabelColor || this.pinLabelColorDark != hatchMapTheme.pinLabelColorDark) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchMapTheme(String str, String str2, int i, int i2, int i3, int i4, int i5, C06H c06h) {
        this((i5 & 1) != 0 ? DEFAULT_LIGHT_STYLE_URL : str, (i5 & 2) != 0 ? DEFAULT_DARK_STYLE_URL : str2, (i5 & 4) != 0 ? DEFAULT_LIGHT_BACKGROUND_COLOR : i, (i5 & 8) != 0 ? DEFAULT_DARK_BACKGROUND_COLOR : i2, (i5 & 16) != 0 ? DEFAULT_PIN_LABEL_COLOR : i3, (i5 & 32) != 0 ? -1 : i4);
    }

    public final String component1() {
        return this.lightStyleUrl;
    }

    public final String component2() {
        return this.darkStyleUrl;
    }

    public final int component3() {
        return this.lightBackgroundColor;
    }

    public final int component4() {
        return this.darkBackgroundColor;
    }

    public final int component5() {
        return this.pinLabelColor;
    }

    public final int component6() {
        return this.pinLabelColorDark;
    }

    public final int getDarkBackgroundColor() {
        return this.darkBackgroundColor;
    }

    public final String getDarkStyleUrl() {
        return this.darkStyleUrl;
    }

    public final int getLightBackgroundColor() {
        return this.lightBackgroundColor;
    }

    public final String getLightStyleUrl() {
        return this.lightStyleUrl;
    }

    public final int getPinLabelColor() {
        return this.pinLabelColor;
    }

    public final int getPinLabelColorDark() {
        return this.pinLabelColorDark;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.darkStyleUrl, AnonymousClass001.A0G(this.lightStyleUrl)) + this.lightBackgroundColor) * 31) + this.darkBackgroundColor) * 31) + this.pinLabelColor) * 31) + this.pinLabelColorDark;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchMapTheme copy(String str, String str2, int i, int i2, int i3, int i4) {
        AnonymousClass003.A0u(str, str2);
        return new HatchMapTheme(str, str2, i, i2, i3, i4);
    }

    public String toString() {
        return super.toString();
    }

    public HatchMapTheme(String str, String str2, int i, int i2, int i3, int i4) {
        AnonymousClass003.A0u(str, str2);
        this.lightStyleUrl = str;
        this.darkStyleUrl = str2;
        this.lightBackgroundColor = i;
        this.darkBackgroundColor = i2;
        this.pinLabelColor = i3;
        this.pinLabelColorDark = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapTheme() {
        int i = 0;
        this(null, 0 == true ? 1 : 0, i, i, i, i, 63, 0 == true ? 1 : 0);
    }
}
