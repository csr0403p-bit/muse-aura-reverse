package com.meta.maps.fancypins;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class OwnedPartMeasurement {
    public static final Companion Companion = new Companion();
    public final double height;
    public final String id;
    public final double width;

    public OwnedPartMeasurement(String str, double d, double d2) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.width = d;
        this.height = d2;
    }

    public final class Companion {
        public final OwnedPartMeasurement from(PartMeasurement partMeasurement) {
            C7384Etj.A0Y(partMeasurement, 0);
            return new OwnedPartMeasurement(partMeasurement.id, partMeasurement.width, partMeasurement.height);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final PartMeasurement materialize() {
        return new PartMeasurement(this.id, this.width, this.height);
    }
}
