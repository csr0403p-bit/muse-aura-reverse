package com.meta.foa.cds;

import X.C4157CoC;
import X.C7384Etj;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public abstract class CdsBottomSheetDimmingBehaviour implements Parcelable {

    public final class Default extends CdsBottomSheetDimmingBehaviour {
        public static final Default A00 = new Default();
        public static final Parcelable.Creator<Default> CREATOR = new C4157CoC(65);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C7384Etj.A0Y(parcel, 0);
            parcel.writeInt(1);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Default";
        }

        public final int hashCode() {
            return -1522220413;
        }
    }

    public final class FixedAlpha extends CdsBottomSheetDimmingBehaviour {
        public static final Parcelable.Creator<FixedAlpha> CREATOR = new C4157CoC(66);
        public final float A00;

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof FixedAlpha) && Float.compare(this.A00, ((FixedAlpha) obj).A00) == 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C7384Etj.A0Y(parcel, 0);
            parcel.writeFloat(this.A00);
        }

        public FixedAlpha() {
            this(0.5f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.A00);
        }

        public final String toString() {
            return FGI.A0R("FixedAlpha(alpha=", ")", this.A00);
        }

        public FixedAlpha(float f) {
            this.A00 = f;
        }
    }
}
