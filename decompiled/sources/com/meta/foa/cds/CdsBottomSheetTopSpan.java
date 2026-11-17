package com.meta.foa.cds;

import X.C4157CoC;
import X.C7384Etj;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public abstract class CdsBottomSheetTopSpan implements Parcelable {

    public final class Dp extends CdsBottomSheetTopSpan {
        public static final Parcelable.Creator<Dp> CREATOR = new C4157CoC(67);
        public final int A00;

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof Dp) && this.A00 == ((Dp) obj).A00);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C7384Etj.A0Y(parcel, 0);
            parcel.writeInt(this.A00);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            return this.A00;
        }

        public final String toString() {
            return FGI.A0I("Dp(dp=", this.A00, ")");
        }

        public Dp(int i) {
            this.A00 = i;
        }
    }

    public final class ScreenPercent extends CdsBottomSheetTopSpan {
        public static final Parcelable.Creator<ScreenPercent> CREATOR = new C4157CoC(68);
        public final float A00;

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof ScreenPercent) && Float.compare(this.A00, ((ScreenPercent) obj).A00) == 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C7384Etj.A0Y(parcel, 0);
            parcel.writeFloat(this.A00);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.A00);
        }

        public final String toString() {
            return FGI.A0R("ScreenPercent(percent=", ")", this.A00);
        }

        public ScreenPercent(float f) {
            this.A00 = f;
        }
    }
}
