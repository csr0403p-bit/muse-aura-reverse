package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class A5j implements C9hr<Parcelable[]> {
    public static final C9iZ A00 = C9iY.A00("kotlin.Array<android.os.Parcelable>");

    public static final Parcelable[] A00(InterfaceC07829iw interfaceC07829iw) {
        if (!(interfaceC07829iw instanceof A5Y)) {
            throw C9iZ.A00(A00, interfaceC07829iw);
        }
        A5Y a5y = (A5Y) interfaceC07829iw;
        Bundle bundle = a5y.A02;
        C7384Etj.A0Y(bundle, 0);
        String str = a5y.A00;
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) A5n.A04(bundle, C9uT.A00(Parcelable.class, str), str) : bundle.getParcelableArray(str);
        if (parcelableArray != null) {
            return parcelableArray;
        }
        A5q.A00(str);
        throw F60.createAndThrow();
    }
}
