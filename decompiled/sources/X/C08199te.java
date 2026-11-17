package X;

import java.util.Arrays;

/* renamed from: X.9te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08199te extends C9tZ<C9314GDq, C9tP, C08339tt> implements C9hr<C9tP> {
    public static final C08199te A00 = new C08199te();

    public C08199te() {
        super(C07849iy.A01);
    }

    @Override // X.C9tX, X.C9tY
    public final /* bridge */ /* synthetic */ void A07(Object obj, C9j4 c9j4, int i, boolean z) {
        C08339tt c08339tt = (C08339tt) obj;
        AnonymousClass003.A0v(c9j4, c08339tt);
        long jA8W = c9j4.A8S(((C9tZ) this).A00, i).A8W();
        int iA00 = c08339tt.A00() + 1;
        long[] jArrCopyOf = c08339tt.A01;
        int length = jArrCopyOf.length;
        if (length < iA00) {
            int i2 = length * 2;
            if (iA00 < i2) {
                iA00 = i2;
            }
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, iA00);
            C7384Etj.A0U(jArrCopyOf);
            c08339tt.A01 = jArrCopyOf;
        }
        int i3 = c08339tt.A00;
        c08339tt.A00 = i3 + 1;
        jArrCopyOf[i3] = jA8W;
    }
}
