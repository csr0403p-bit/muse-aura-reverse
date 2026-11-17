package X;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;

/* renamed from: X.9px, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9px {
    public static final C07959pz A00;

    static {
        C9py c9py = new C9py();
        C9py.A01(C3cG.A0x(Bundle.class), new C9q1(A5d.A00), c9py);
        C9py.A01(C3cG.A0x(BLG.class), new C9q0(new C2276BSc(33)), c9py);
        C07959pz c07959pzA02 = c9py.A02();
        C9py c9py2 = new C9py();
        C9py.A01(C3cG.A0x(Size.class), new C9q1(A5l.A00), c9py2);
        C9py.A01(C3cG.A0x(SizeF.class), new C9q1(A5m.A00), c9py2);
        C9py.A01(C3cG.A0x(SparseArray.class), new C9q0(new C2276BSc(34)), c9py2);
        C07959pz c07959pzA022 = c9py2.A02();
        C9py c9py3 = new C9py();
        c9py3.A03(c07959pzA02);
        c9py3.A03(c07959pzA022);
        A00 = c9py3.A02();
    }
}
