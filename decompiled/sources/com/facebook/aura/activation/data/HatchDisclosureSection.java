package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchDisclosureSection extends C06G {
    public final String description;
    public final String icon;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDisclosureSection) {
                HatchDisclosureSection hatchDisclosureSection = (HatchDisclosureSection) obj;
                if (!C7384Etj.areEqual(this.title, hatchDisclosureSection.title) || !C7384Etj.areEqual(this.description, hatchDisclosureSection.description) || !C7384Etj.areEqual(this.icon, hatchDisclosureSection.icon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchDisclosureSection copy$default(HatchDisclosureSection hatchDisclosureSection, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchDisclosureSection.title;
        }
        if ((i & 2) != 0) {
            str2 = hatchDisclosureSection.description;
        }
        if ((i & 4) != 0) {
            str3 = hatchDisclosureSection.icon;
        }
        return hatchDisclosureSection.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.icon;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.description, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.icon);
    }

    public HatchDisclosureSection(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.description = str2;
        this.icon = str3;
    }

    public final HatchDisclosureSection copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new HatchDisclosureSection(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchDisclosureSection(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
