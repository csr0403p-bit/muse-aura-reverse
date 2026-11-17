package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.A5h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0850A5h implements C9hr<SparseArray<Parcelable>> {
    public static final C9iZ A00 = C9iY.A00("android.util.SparseArray<android.os.Parcelable>");

    public static final SparseArray<Parcelable> A00(InterfaceC07829iw interfaceC07829iw) {
        if (!(interfaceC07829iw instanceof A5Y)) {
            throw C9iZ.A00(A00, interfaceC07829iw);
        }
        A5Y a5y = (A5Y) interfaceC07829iw;
        Bundle bundle = a5y.A02;
        C7384Etj.A0Y(bundle, 0);
        String str = a5y.A00;
        SparseArray<Parcelable> sparseArrayA00 = Build.VERSION.SDK_INT >= 34 ? A5n.A00(bundle, C9uT.A00(Parcelable.class, str), str) : bundle.getSparseParcelableArray(str);
        if (sparseArrayA00 != null) {
            return sparseArrayA00;
        }
        A5q.A00(str);
        throw F60.createAndThrow();
    }
}
