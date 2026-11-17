package androidx.recyclerview.widget;

import X.C10638I0i;
import X.C60O;
import X.C8j3;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new C10638I0i(22);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FullSpanItem{mPosition=");
        sbA0x.append(this.A01);
        sbA0x.append(", mGapDir=");
        sbA0x.append(this.A00);
        sbA0x.append(", mHasUnwantedGapAfter=");
        sbA0x.append(this.A02);
        sbA0x.append(", mGapPerSpan=");
        sbA0x.append(Arrays.toString(this.A03));
        return C8j3.A15(sbA0x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(length);
            parcel.writeIntArray(this.A03);
        }
    }
}
