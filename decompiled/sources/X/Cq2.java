package X;

import android.os.Parcel;

/* loaded from: classes5.dex */
public final class Cq2 {
    public static final ClassLoader A00 = Cq2.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw BV8.A0U(iDataAvail);
        }
    }
}
