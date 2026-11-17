package X;

import android.os.Parcel;

/* renamed from: X.CMa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3415CMa {
    public static final ClassLoader A00 = C3415CMa.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw BV8.A0U(iDataAvail);
        }
    }
}
