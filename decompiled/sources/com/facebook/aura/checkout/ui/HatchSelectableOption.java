package com.facebook.aura.checkout.ui;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchSelectableOption extends C06G {
    public static final int $stable = 0;
    public final String id;
    public final boolean isEnabled;
    public final boolean isLoading;
    public final Integer leadingIcon;
    public final HatchSelectableLeadingIconStyle leadingIconStyle;
    public final String subtitle;
    public final boolean tintLeadingIcon;
    public final String title;
    public final String trailingText;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSelectableOption) {
                HatchSelectableOption hatchSelectableOption = (HatchSelectableOption) obj;
                if (!C7384Etj.areEqual(this.id, hatchSelectableOption.id) || !C7384Etj.areEqual(this.title, hatchSelectableOption.title) || !C7384Etj.areEqual(this.subtitle, hatchSelectableOption.subtitle) || !C7384Etj.areEqual(this.leadingIcon, hatchSelectableOption.leadingIcon) || !C7384Etj.areEqual(this.trailingText, hatchSelectableOption.trailingText) || this.isEnabled != hatchSelectableOption.isEnabled || this.tintLeadingIcon != hatchSelectableOption.tintLeadingIcon || this.leadingIconStyle != hatchSelectableOption.leadingIconStyle || this.isLoading != hatchSelectableOption.isLoading) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchSelectableOption(String str, String str2, String str3, Integer num, String str4, boolean z, boolean z2, HatchSelectableLeadingIconStyle hatchSelectableLeadingIconStyle, boolean z3, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? true : z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? HatchSelectableLeadingIconStyle.DEFAULT : hatchSelectableLeadingIconStyle, C3cG.A1K(i & 256, z3));
    }

    public static /* synthetic */ HatchSelectableOption copy$default(HatchSelectableOption hatchSelectableOption, String str, String str2, String str3, Integer num, String str4, boolean z, boolean z2, HatchSelectableLeadingIconStyle hatchSelectableLeadingIconStyle, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSelectableOption.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchSelectableOption.title;
        }
        if ((i & 4) != 0) {
            str3 = hatchSelectableOption.subtitle;
        }
        if ((i & 8) != 0) {
            num = hatchSelectableOption.leadingIcon;
        }
        if ((i & 16) != 0) {
            str4 = hatchSelectableOption.trailingText;
        }
        if ((i & 32) != 0) {
            z = hatchSelectableOption.isEnabled;
        }
        if ((i & 64) != 0) {
            z2 = hatchSelectableOption.tintLeadingIcon;
        }
        if ((i & 128) != 0) {
            hatchSelectableLeadingIconStyle = hatchSelectableOption.leadingIconStyle;
        }
        if ((i & 256) != 0) {
            z3 = hatchSelectableOption.isLoading;
        }
        return hatchSelectableOption.copy(str, str2, str3, num, str4, z, z2, hatchSelectableLeadingIconStyle, z3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final Integer component4() {
        return this.leadingIcon;
    }

    public final String component5() {
        return this.trailingText;
    }

    public final boolean component6() {
        return this.isEnabled;
    }

    public final boolean component7() {
        return this.tintLeadingIcon;
    }

    public final HatchSelectableLeadingIconStyle component8() {
        return this.leadingIconStyle;
    }

    public final boolean component9() {
        return this.isLoading;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getLeadingIcon() {
        return this.leadingIcon;
    }

    public final HatchSelectableLeadingIconStyle getLeadingIconStyle() {
        return this.leadingIconStyle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getTintLeadingIcon() {
        return this.tintLeadingIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrailingText() {
        return this.trailingText;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.leadingIconStyle, C0KA.A01(C0KA.A01((((((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0D(this.leadingIcon)) * 31) + AnonymousClass005.A0H(this.trailingText)) * 31, this.isEnabled), this.tintLeadingIcon)), this.isLoading);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final HatchSelectableOption copy(String str, String str2, String str3, Integer num, String str4, boolean z, boolean z2, HatchSelectableLeadingIconStyle hatchSelectableLeadingIconStyle, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(hatchSelectableLeadingIconStyle, 7);
        return new HatchSelectableOption(str, str2, str3, num, str4, z, z2, hatchSelectableLeadingIconStyle, z3);
    }

    public String toString() {
        return super.toString();
    }

    public HatchSelectableOption(String str, String str2, String str3, Integer num, String str4, boolean z, boolean z2, HatchSelectableLeadingIconStyle hatchSelectableLeadingIconStyle, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(hatchSelectableLeadingIconStyle, 7);
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.leadingIcon = num;
        this.trailingText = str4;
        this.isEnabled = z;
        this.tintLeadingIcon = z2;
        this.leadingIconStyle = hatchSelectableLeadingIconStyle;
        this.isLoading = z3;
    }
}
