package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchInfoSheetSection extends C06G {
    public final HatchDisclosureText body;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchInfoSheetSection) {
                HatchInfoSheetSection hatchInfoSheetSection = (HatchInfoSheetSection) obj;
                if (!C7384Etj.areEqual(this.title, hatchInfoSheetSection.title) || !C7384Etj.areEqual(this.body, hatchInfoSheetSection.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchInfoSheetSection copy$default(HatchInfoSheetSection hatchInfoSheetSection, String str, HatchDisclosureText hatchDisclosureText, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchInfoSheetSection.title;
        }
        if ((i & 2) != 0) {
            hatchDisclosureText = hatchInfoSheetSection.body;
        }
        AnonymousClass003.A0u(str, hatchDisclosureText);
        return new HatchInfoSheetSection(str, hatchDisclosureText);
    }

    public final String component1() {
        return this.title;
    }

    public final HatchDisclosureText component2() {
        return this.body;
    }

    public final HatchDisclosureText getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.body, AnonymousClass001.A0G(this.title));
    }

    public HatchInfoSheetSection(String str, HatchDisclosureText hatchDisclosureText) {
        AnonymousClass003.A0u(str, hatchDisclosureText);
        this.title = str;
        this.body = hatchDisclosureText;
    }

    public final HatchInfoSheetSection copy(String str, HatchDisclosureText hatchDisclosureText) {
        AnonymousClass003.A0u(str, hatchDisclosureText);
        return new HatchInfoSheetSection(str, hatchDisclosureText);
    }

    public String toString() {
        return super.toString();
    }
}
