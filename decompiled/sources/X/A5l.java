package X;

import android.os.Bundle;
import android.util.Size;

/* loaded from: classes4.dex */
public final class A5l implements C9hr<Size> {
    public static final A5l A00 = new A5l();
    public static final C9iZ A01 = C9iY.A00("android.util.Size");

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        if (!(interfaceC07829iw instanceof A5Y)) {
            throw C9iZ.A00(A01, interfaceC07829iw);
        }
        A5Y a5y = (A5Y) interfaceC07829iw;
        Bundle bundle = a5y.A02;
        String strA01 = C9jF.A01(a5y, bundle);
        Size size = bundle.getSize(strA01);
        if (size != null) {
            return size;
        }
        A5q.A00(strA01);
        throw F60.createAndThrow();
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        Size size = (Size) obj;
        C60P.A1Y(interfaceC07789is, size);
        if (!(interfaceC07789is instanceof A5Z)) {
            throw C9iZ.A01(A01, interfaceC07789is);
        }
        A5Z a5z = (A5Z) interfaceC07789is;
        Bundle bundle = a5z.A01;
        bundle.putSize(C9jJ.A00(a5z, bundle), size);
    }
}
