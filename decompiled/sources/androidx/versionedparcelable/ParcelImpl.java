package androidx.versionedparcelable;

import X.C6563EFe;
import X.C7580F4t;
import X.E1K;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C7580F4t(13);
    public final E1K A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        new C6563EFe(parcel).A08(this.A00);
    }

    public ParcelImpl(Parcel parcel) {
        this.A00 = new C6563EFe(parcel).A04();
    }

    public ParcelImpl(E1K e1k) {
        this.A00 = e1k;
    }
}
