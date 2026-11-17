package X;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class CMZ {
    public static final ClassLoader A00 = CMZ.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw BV8.A0U(iDataAvail);
        }
    }

    public static void A01(Parcel parcel, Parcelable.Creator creator) {
        BV8.A0V(parcel, creator);
    }
}
