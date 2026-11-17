package X;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class Cpe {
    public static final ClassLoader A00 = Cpe.class.getClassLoader();

    public static void A01(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void A00(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C60P.A1O("Parcel data not fully consumed, unread size: ", BV4.A0p(BV7.A03(iDataAvail) + 45), iDataAvail));
        }
    }
}
