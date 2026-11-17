package com.facebook.aura.checkout.ui;

import X.AHD;
import X.AbstractC06907md;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchFormRow extends C06G {
    public static final int $stable = 0;
    public final AHD<HatchFormField> fields;

    public HatchFormRow(AHD<HatchFormField> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.fields = ahd;
    }

    public final HatchFormRow copy(AHD<HatchFormField> ahd) {
        C7384Etj.A0Y(ahd, 0);
        return new HatchFormRow(ahd);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchFormRow) && C7384Etj.areEqual(this.fields, ((HatchFormRow) obj).fields));
    }

    public static /* synthetic */ HatchFormRow copy$default(HatchFormRow hatchFormRow, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchFormRow.fields;
        }
        C7384Etj.A0Y(ahd, 0);
        return new HatchFormRow(ahd);
    }

    public final AHD<HatchFormField> component1() {
        return this.fields;
    }

    public final AHD<HatchFormField> getFields() {
        return this.fields;
    }

    public final String getId() {
        return AbstractC06907md.A01("+", this.fields, HatchFormRow$id$1.INSTANCE);
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
