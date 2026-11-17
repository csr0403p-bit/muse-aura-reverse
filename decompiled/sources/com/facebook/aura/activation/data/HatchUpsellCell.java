package com.facebook.aura.activation.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchUpsellCell extends C06G {
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchUpsellCell) {
                HatchUpsellCell hatchUpsellCell = (HatchUpsellCell) obj;
                if (!C7384Etj.areEqual(this.title, hatchUpsellCell.title) || !C7384Etj.areEqual(this.subtitle, hatchUpsellCell.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchUpsellCell copy$default(HatchUpsellCell hatchUpsellCell, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchUpsellCell.title;
        }
        if ((i & 2) != 0) {
            str2 = hatchUpsellCell.subtitle;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchUpsellCell(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.subtitle, AnonymousClass001.A0G(this.title));
    }

    public HatchUpsellCell(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.subtitle = str2;
    }

    public final HatchUpsellCell copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchUpsellCell(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
