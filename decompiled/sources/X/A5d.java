package X;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class A5d implements C9hr<Bundle> {
    public static final A5d A00 = new A5d();
    public static final C9iZ A01 = C9iY.A00("androidx.savedstate.SavedState");

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        String strA01;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        if (!(interfaceC07829iw instanceof A5Y)) {
            throw C9iZ.A00(A01, interfaceC07829iw);
        }
        A5Y a5y = (A5Y) interfaceC07829iw;
        boolean zA1Q = C3cH.A1Q(a5y.A00);
        Bundle bundle = a5y.A02;
        if (zA1Q || (bundle = bundle.getBundle((strA01 = C9jF.A01(a5y, bundle)))) != null) {
            return bundle;
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
        Bundle bundle = (Bundle) obj;
        C60P.A1Y(interfaceC07789is, bundle);
        if (!(interfaceC07789is instanceof A5Z)) {
            throw C9iZ.A01(A01, interfaceC07789is);
        }
        A5Z a5z = (A5Z) interfaceC07789is;
        boolean zA1Q = C3cH.A1Q(a5z.A00);
        Bundle bundle2 = a5z.A01;
        if (!zA1Q) {
            bundle2.putBundle(C9jJ.A00(a5z, bundle2), bundle);
        } else {
            C7384Etj.A0Y(bundle2, 0);
            bundle2.putAll(bundle);
        }
    }
}
