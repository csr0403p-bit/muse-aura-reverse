package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchInfoBanner extends C06G {
    public final String closeText;
    public final List<HatchInfoSheetSection> sections;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchInfoBanner) {
                HatchInfoBanner hatchInfoBanner = (HatchInfoBanner) obj;
                if (!C7384Etj.areEqual(this.text, hatchInfoBanner.text) || !C7384Etj.areEqual(this.sections, hatchInfoBanner.sections) || !C7384Etj.areEqual(this.closeText, hatchInfoBanner.closeText)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchInfoBanner copy$default(HatchInfoBanner hatchInfoBanner, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchInfoBanner.text;
        }
        if ((i & 2) != 0) {
            list = hatchInfoBanner.sections;
        }
        if ((i & 4) != 0) {
            str2 = hatchInfoBanner.closeText;
        }
        return hatchInfoBanner.copy(str, list, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final List<HatchInfoSheetSection> component2() {
        return this.sections;
    }

    public final String component3() {
        return this.closeText;
    }

    public final String getCloseText() {
        return this.closeText;
    }

    public final List<HatchInfoSheetSection> getSections() {
        return this.sections;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.closeText, AnonymousClass005.A0F(this.sections, AnonymousClass001.A0G(this.text)));
    }

    public HatchInfoBanner(String str, List<HatchInfoSheetSection> list, String str2) {
        AnonymousClass005.A0x(str, list, str2);
        this.text = str;
        this.sections = list;
        this.closeText = str2;
    }

    public final HatchInfoBanner copy(String str, List<HatchInfoSheetSection> list, String str2) {
        AnonymousClass005.A0x(str, list, str2);
        return new HatchInfoBanner(str, list, str2);
    }

    public String toString() {
        return super.toString();
    }
}
